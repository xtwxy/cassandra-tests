package org.anarres.ipmi.client.netty;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

import javax.annotation.Nonnull;

import org.anarres.ipmi.protocol.client.session.IpmiPacketContext;
import org.anarres.ipmi.protocol.codec.IpmiPacketDecoder;
import org.anarres.ipmi.protocol.packet.rmcp.Packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.ReferenceCountUtil;

@ChannelHandler.Sharable
public class IpmiCodec extends ChannelDuplexHandler {

    private final IpmiPacketContext context;
    private final IpmiPacketDecoder decoder;

    public IpmiCodec(IpmiPacketContext context) {
        this.context = context;
        this.decoder = new IpmiPacketDecoder(context);
    }

    @Nonnull
    public Packet decode(@Nonnull ChannelHandlerContext ctx, @Nonnull DatagramPacket packet) throws Exception {
        return decoder.decode(packet.sender(), packet.content().nioBuffer());
    }

    @Nonnull
    public DatagramPacket encode(@Nonnull ChannelHandlerContext ctx, @Nonnull Packet packet) throws Exception {
        ByteBuf buf = ctx.alloc().buffer(packet.getWireLength(context));
        ByteBuffer buffer = buf.nioBuffer(buf.writerIndex(), buf.writableBytes());
        packet.toWire(context, buffer);
        buffer.flip();
        buf.writerIndex(buf.writerIndex() + buffer.remaining());
        return new DatagramPacket(buf, (InetSocketAddress) packet.getRemoteAddress());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            ctx.fireChannelRead(decode(ctx, (DatagramPacket) msg));
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        try {
            ctx.write(encode(ctx, (Packet) msg), promise);
        } catch (Throwable e) {
            promise.tryFailure(e);
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }
}
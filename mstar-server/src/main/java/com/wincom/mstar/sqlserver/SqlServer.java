package com.wincom.mstar.sqlserver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
public class SqlServer {
	private String JDBCDriver="net.sourceforge.jtds.jdbc.Driver";//驱动程序字符串
	private String JDBCConnection;
	public Connection conn=null;//数据库连接对象
	private static ReadProperties rPro=new ReadProperties();
	private String dbUser;
	private String dbPwd;
	private String dbName;
	private String dbIp;
	private int type;
	public SqlServer(int type)
	{
		this.type=type;
		if(type==0||type==2)
		{
			dbIp=rPro.getDbIpAddres(type);
			dbUser=rPro.getDbUserName(type);
			dbPwd=rPro.getDbPassWord(type);
			dbName=rPro.getDbName(type);
			JDBCConnection="jdbc:jtds:sqlserver://"+dbIp+":1433/"+dbName;
			System.out.println(JDBCConnection);
		}
		try
		{
			Class.forName(JDBCDriver);//加载驱动程序
		}
		catch(ClassNotFoundException e)
		{
			System.err.println("Dbconnection():"+e.getMessage());
		}
	}
	public SqlServer(String DbName,int type)
	{
		dbUser=rPro.getDbUserName(type);
		dbPwd=rPro.getDbPassWord(type);
		JDBCConnection="jdbc:jtds:sqlserver://"+rPro.getDbIpAddres(type)+":1433/"+DbName;
		try
		{
			Class.forName(JDBCDriver);//加载驱动程序
		}
		catch(ClassNotFoundException e)
		{
			System.err.println("Dbconnection():"+e.getMessage());
		}
	}
	public Connection connect()
	{
		try
		{
			conn=DriverManager.getConnection(JDBCConnection,dbUser,dbPwd);//开始连接数据库
		}
		catch(SQLException ex)
		{
			System.err.println("connection():"+ex.getMessage());
			conn= null;
		}
		return conn;
	}
	public Connection connect(String DbUserName,String DbPwd)
	{
		try
		{
			conn=DriverManager.getConnection(JDBCConnection,DbUserName,DbPwd);//开始连接数据库
		}
		catch(SQLException ex)
		{
			System.err.println("connection():"+ex.getMessage());
			conn= null;
		}
		return conn;
	}
	public void close()
	{
		try
		{
			if(this.conn==null)
			{
				return;
			}
			if(!this.conn.isClosed())
			{
				this.conn.close();//关闭数据库连接
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			this.conn=null;
		}
	}
	public ResultSet executeQuery(String sql,ResultSet rs)
	{
		Statement stmt;
		try
		{
			if(conn!=null)
			{
				stmt=this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);//创建Statement对象
				rs=stmt.executeQuery(sql);//执行sql语句，并返回一个结果集
				
			}
			else
			{
				return null;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		return rs;
	}
	public int executeUpdate(String sql)
	{
		int rev=0;
		Statement stmt;
		try
		{
			if(conn!=null)
			{
				stmt=this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);//创建Statement对象
				rev=stmt.executeUpdate(sql);
			}
			else
			{
				return -1;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return -1;
		}
		return rev;
	}
	
}

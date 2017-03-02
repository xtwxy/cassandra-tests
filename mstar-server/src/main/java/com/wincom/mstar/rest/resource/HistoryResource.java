package com.wincom.mstar.rest.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Energy!responseHisData")
public class HistoryResource {
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response post(
			@FormParam("serial") String dataObjectIds, 
			@FormParam("startTime") Date startTime,
			@FormParam("endTime") Date endTime, 
			@FormParam("type") Integer periodType) {
		
		List<Integer> dataObjectIdList = new ArrayList<>();
		if(dataObjectIds != null) {
			String[] ids = dataObjectIds.split(",");
			for(String s: ids) {
				dataObjectIdList.add(Integer.valueOf(s.trim()));
			}
		}
		return Response.noContent().build();
	}
}

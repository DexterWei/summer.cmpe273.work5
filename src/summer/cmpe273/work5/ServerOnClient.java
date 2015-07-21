package summer.cmpe273.work5;

import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

@Path("/")
public class ServerOnClient{
	/*
	 * read
	 * write
	 * discover
	 * 
	 * execute
	 * create
	 * delete
	 * 
	 * write attribute
	 * observe
	 * cancel observe
	 */
	
	//Server on clients receive operations from Client On Server
	@Path("read")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Read(String objString) throws UnknownHostException, JSONException {
		JSONObject operation = new JSONObject(objString);
		String operator = operation.getString("operator");
		MongoDAO dao = new MongoDAO();
		MongoDAO.Connect();
		return Response.status(201).entity("Registration Done").build();
	}
	
	@Path("write")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Write(String objString) throws UnknownHostException, JSONException {
		JSONObject operation = new JSONObject(objString);
		String operator = operation.getString("operator");
		MongoDAO dao = new MongoDAO();
		MongoDAO.Connect();
		//hello world
		return Response.status(201).entity("Registration Done").build();
	
	}
}

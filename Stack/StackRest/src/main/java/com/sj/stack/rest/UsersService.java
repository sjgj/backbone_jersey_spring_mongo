/**
 * 
 */
package com.sj.stack.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sj.model.Users;
import com.sj.stack.core.IUsers;

/**
 * @author SJ
 * 
 */

@Component
@Path("/users")
public class UsersService {

    @Autowired
    IUsers iUsers;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/check/{username}")
    public Response getUser(@PathParam("username") String username) {
	// System.out.println("UserName"+username);
	Users users = iUsers.getUser(username, "");
	return Response.status(200).entity(users).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list")
    public Response listUsers() {
	System.out.println("List Called");
	List<Users> users = iUsers.findAllUsers();
	return Response.status(200).entity(users).build();
    }

}

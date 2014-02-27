/**
 * 
 */
package com.sj.stack.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sj.model.Articles;
import com.sj.stack.core.IArticle;

/**
 * @author SJ
 * 
 */
@Component
@Path("/articles")
public class ArticleService {

    @Autowired
    IArticle iArticle;

    @GET
    @Path("/heartbeat")
    public Response getTest() {
	String result = "stack service running !";
	return Response.status(200).entity(result).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listArticles() {
	System.out.println("List Called");
	List<Articles> articles = iArticle.findAllArticles();
	return Response.status(200).entity(articles).build();
    }

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveArticle(Articles articles) {
	// System.out.println("Save Called"+articles.getTitle());
	iArticle.saveArticle(articles);
	return Response.status(200).entity(articles).build();
    }

    @GET
    @Path("{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response findById(@PathParam("id") String id) {
	System.out.println("findById " + id);
	Articles articles = iArticle.getArticle(id);
	return Response.status(200).entity(articles).build();
    }

    @PUT
    @Path("{id}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Articles update(Articles articles) {
	System.out.println("Updating Articles: " + articles.getTitle());
	iArticle.saveArticle(articles);
	return articles;
    }


}


package com.demo;

import com.demo.util.LogUtil;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

@Path("/hello")
public class HelloResource {
    private List<User> users = new ArrayList();

    @GET
    @Path("add/{name}/{age}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name, @PathParam("age") int age) {
        LogUtil.log(Level.WARNING, "--->HelloResource<---");
        if (age < 0) {
            throw new IllegalArgumentException("too young!!!");
        }
        User user = new User(name, age);
        users.add(user);
        return user.toString();
    }

    @GET
    @Path("users")
    @Produces(MediaType.TEXT_PLAIN)
    public String users() {
        StringBuilder builder = new StringBuilder();
        for (User u : users) {
            builder.append(u);
        }
        return builder.toString();
    }
}

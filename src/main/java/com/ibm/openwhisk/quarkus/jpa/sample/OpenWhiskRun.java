package com.ibm.openwhisk.quarkus.jpa.sample;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/run")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OpenWhiskRun {

    @POST
    @Transactional
    public Input save(InputValue inputValue) {
        BlogArticle blogArticle = new BlogArticle();
        blogArticle.author = "prpatel";
        blogArticle.image = "TEST IMAGE";
        blogArticle.published = false;
        blogArticle.title = "Quarkus TITLE TEST";
        blogArticle.body = "Quarkus BODY TEST";
        blogArticle.persist();


        if(blogArticle.isPersistent()){
            // delete it
            System.out.println("SAVED");
        }

        System.out.println("Number of blogArticles: " + BlogArticle.count());
        return inputValue.getValue();
    }
}

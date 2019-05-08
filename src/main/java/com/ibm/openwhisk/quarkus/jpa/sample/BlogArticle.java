package com.ibm.openwhisk.quarkus.jpa.sample;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class BlogArticle extends PanacheEntity {

    public String title;

    public String body;

    public String author;

    public String image;

    public String tags;

    public boolean published = false;

    public static BlogArticle findByAuthor(String author){
        return find("author", author).firstResult();
    }


}

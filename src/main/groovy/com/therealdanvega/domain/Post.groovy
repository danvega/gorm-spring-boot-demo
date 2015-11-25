package com.therealdanvega.domain

import grails.persistence.Entity

@Entity
class Post {

    String title
    String body
    String teaser
    String slug
    Date postedOn

    static mapping = {
        version false
        body type: 'text'
        teaser type: 'text'
    }

}

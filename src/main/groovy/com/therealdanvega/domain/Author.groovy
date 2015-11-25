package com.therealdanvega.domain

import grails.persistence.Entity

//@Entity
class Author {

    String firstName
    String lastName
    String email

    //static hasMany = [posts:Post]

    static mapping = {
        //table 'authors'
        version false
        posts sort: 'postedOn', order: 'desc'
    }

}

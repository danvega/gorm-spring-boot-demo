package com.therealdanvega.controller

import com.therealdanvega.service.PostService
import com.therealdanvega.service.PostServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts")
class PostController {

    PostService postService

    @Autowired
    PostController(PostService postService) {
        this.postService = postService
    }

    @RequestMapping("/")
    public String list(){
        postService.list()
    }

    @RequestMapping("/{id}")
    public String get(@PathVariable(value = "id") int id){
        postService.get(id)
    }

}

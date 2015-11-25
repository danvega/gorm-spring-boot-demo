package com.therealdanvega.service

import com.therealdanvega.domain.Post

interface PostService {

    ArrayList<Post> list()

    Post read(int id)
}
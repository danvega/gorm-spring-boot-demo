package com.therealdanvega.service

import com.therealdanvega.domain.Post
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service('postService')
@Transactional
class PostServiceImpl implements PostService {

    @Override
    ArrayList<Post> list() {
        Post.list()
    }

    @Override
    Post read(int id) {
        Post.get(id)
    }

}

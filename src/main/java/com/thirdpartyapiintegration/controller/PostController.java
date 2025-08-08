package com.thirdpartyapiintegration.controller;

import com.thirdpartyapiintegration.postservice.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

        //GET: /api/posts
    @GetMapping
    public List<Map<String, Object>> getPosts() {
        return postService.getPosts();
    }

    //GET: /api/post/{id}
    @GetMapping("/{id}")
    public Map<String, Object> getPost(@PathVariable int id) {
        return postService.getPostById(id);
    }
}

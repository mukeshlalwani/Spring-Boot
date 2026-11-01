package com.lilawat.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping({"/api/dummy/users/{userId}/posts/{postId}", "/api/dummy/users/{userId}"})
    public String SearchUserPostWithMultiPathVariables(@PathVariable Long userId, @PathVariable(required = false) Long postId) {
        String response;
        if (postId == null) {
            response = "Fetched user with id : " + userId;
        } else{
            response = "Fetched user with id : " + userId + " and post id : " + postId;
        }
        return response;
    }

//    @GetMapping("/api/dummy/users/{userId}/posts/{postId}")
//    public String SearchUserPostWithMultiPathVariables(@PathVariable Long userId, @PathVariable(required = false) Long postId) {
//        return "Fetch user with id : " + userId + " and post id : " + postId;
//    }
}

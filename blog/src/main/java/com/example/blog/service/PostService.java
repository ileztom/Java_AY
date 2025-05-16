package com.example.blog.service;

import com.example.blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final List<Post> posts = new ArrayList<>();

    // Получение всех постов
    public List<Post> getAllPosts() {
        return posts;
    }

    // Получение одного поста по индексу
    public Post getPost(int index) {
        if (index >= 0 && index < posts.size()) {
            return posts.get(index);
        }
        return null;
    }

    // Добавление нового поста
    public void addPost(Post post) {
        posts.add(post);
    }

    // Обновление существующего поста
    public void updatePost(int index, Post updatedPost) {
        if (index >= 0 && index < posts.size()) {
            posts.set(index, updatedPost);
        }
    }

    // Удаление поста
    public void deletePost(int index) {
        if (index >= 0 && index < posts.size()) {
            posts.remove(index);
        }
    }
}

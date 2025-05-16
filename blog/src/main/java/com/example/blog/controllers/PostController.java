package com.example.blog.controllers;

import com.example.blog.model.Post;
import com.example.blog.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // Главная страница
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "index";
    }

    // Форма создания поста
    @GetMapping("/create")
    public String createPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "create";
    }

    // Обработка формы создания
    @PostMapping("/create")
    public String createPost(@ModelAttribute Post post) {
        post.setDate(LocalDateTime.now());
        postService.addPost(post);
        return "redirect:/";
    }

    // Форма редактирования
    @GetMapping("/edit/{index}")
    public String editPostForm(@PathVariable int index, Model model) {
        Post post = postService.getPost(index);
        if (post != null) {
            model.addAttribute("post", post);
            model.addAttribute("index", index); // <--- ключевой момент
            return "edit";
        }
        return "redirect:/";
    }

    // Обработка редактирования
    @PostMapping("/edit/{index}")
    public String editPost(@PathVariable int index, @ModelAttribute Post post) {
        post.setDate(LocalDateTime.now());
        postService.updatePost(index, post);
        return "redirect:/";
    }


    // Форма создания текстового поста
    @GetMapping("/create-text")
    public String createTextPostForm(Model model) {
        Post post = new Post();
        model.addAttribute("post", post);
        return "create-text";
    }

    // Обработка формы текстового поста
    @PostMapping("/create-text")
    public String createTextPost(@ModelAttribute Post post) {
        post.setDate(LocalDateTime.now());
        // Важно: в текстовом посте только текст, остальное оставляем пустым
        post.setDescription(null);
        post.setLocation(null);
        post.setImageUrl(null);
        postService.addPost(post);
        return "redirect:/";
    }

    // Удаление поста
    @GetMapping("/delete/{index}")
    public String deletePost(@PathVariable int index) {
        postService.deletePost(index);
        return "redirect:/";
    }
}

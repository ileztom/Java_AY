package com.example.reviewaggregator.controller;

import com.example.reviewaggregator.model.Category;
import com.example.reviewaggregator.model.Review;
import com.example.reviewaggregator.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    // Получить все отзывы по категории
    @GetMapping("/{category}")
    public List<Review> getReviewsByCategory(@PathVariable String category) {
        return reviewService.getReviewsByCategory(Category.valueOf(category.toUpperCase()));
    }

    // Создать новый отзыв
    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    // Получить отзыв по ID
    @GetMapping("/id/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Обновить отзыв
    @PutMapping("/{id}")
    public Review updateReview(@PathVariable Long id, @RequestBody Review review) {
        return reviewService.updateReview(id, review);
    }

    // Удалить отзыв
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return ResponseEntity.ok().build();
    }
}
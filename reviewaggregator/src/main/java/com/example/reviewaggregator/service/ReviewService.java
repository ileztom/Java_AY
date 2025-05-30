package com.example.reviewaggregator.service;

import com.example.reviewaggregator.model.Category;
import com.example.reviewaggregator.model.Review;
import com.example.reviewaggregator.repository.InMemoryReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private final InMemoryReviewRepository repository;

    public ReviewService(InMemoryReviewRepository repository) {
        this.repository = repository;
    }

    public Review createReview(Review review) {
        return repository.save(review);
    }

    public List<Review> getReviewsByCategory(Category category) {
        return repository.findAllByCategory(category);
    }

    public Optional<Review> getReviewById(Long id) {
        return repository.findById(id);
    }

    public Review updateReview(Long id, Review updatedReview) {
        updatedReview.setId(id);
        return repository.save(updatedReview);
    }

    public void deleteReview(Long id) {
        repository.deleteById(id);
    }
}
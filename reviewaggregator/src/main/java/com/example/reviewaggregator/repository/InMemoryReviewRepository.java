package com.example.reviewaggregator.repository;

import com.example.reviewaggregator.model.Category;
import com.example.reviewaggregator.model.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class InMemoryReviewRepository {
    private final List<Review> reviews = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public Review save(Review review) {
        if (review.getId() == null) {
            review.setId(idGenerator.getAndIncrement());
            reviews.add(review);
        } else {
            reviews.removeIf(r -> r.getId().equals(review.getId()));
            reviews.add(review);
        }
        return review;
    }

    public List<Review> findAllByCategory(Category category) {
        return reviews.stream()
                .filter(review -> review.getCategory() == category)
                .collect(Collectors.toList());
    }

    public Optional<Review> findById(Long id) {
        return reviews.stream()
                .filter(review -> review.getId().equals(id))
                .findFirst();
    }

    public void deleteById(Long id) {
        reviews.removeIf(review -> review.getId().equals(id));
    }
}
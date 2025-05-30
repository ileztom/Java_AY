package com.example.reviewaggregator.model;

public class Review {
    private Long id;
    private String name; // Название (например, название ресторана или фильма)
    private String description;
    private int rating; // 1-5 звёзд
    private String recommendation;
    private Category category;

    // Конструкторы
    public Review() {}

    public Review(Long id, String name, String description, int rating, String recommendation, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.recommendation = recommendation;
        this.category = category;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
}
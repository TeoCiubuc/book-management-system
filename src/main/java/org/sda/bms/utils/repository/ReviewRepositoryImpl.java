package org.sda.bms.utils.repository;

import org.sda.bms.model.Review;

public class ReviewRepositoryImpl extends BaseRepositoryImpl<Review> implements ReviewRepository {
    public ReviewRepositoryImpl() {
        super(Review.class);
    }
}
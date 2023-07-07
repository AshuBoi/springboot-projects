package com.AshuBoi.shoutreview.controller;

import com.AshuBoi.shoutreview.domain.Review;
import com.AshuBoi.shoutreview.service.ReviewService;
import com.AshuBoi.shoutreview.service.request.ReviewRequest;
import com.AshuBoi.shoutreview.service.response.ReviewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public void addReview(@RequestBody ReviewRequest reviewRequest){
        reviewService.addReview(reviewRequest.toReview());
    }

    @GetMapping("/find")
    public ReviewResponse getReview(@RequestParam Long reviewId){
        return reviewService.getReviewById(reviewId);
    }
}
package dev.ryanwebster.reviews_site;

import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class RepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "review two name", "url","cat", "description");
    private Review reviewTwo = new Review(2L, "review two name", "url","cat", "description");

    @Test
    public void  shouldFindRevieweOne(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void  shouldFindReviewTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReview = underTest.findAll();
        assertThat(foundReview).contains(reviewOne, reviewTwo);
    }
    @Test
    public void  shouldFindAllReviews() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}

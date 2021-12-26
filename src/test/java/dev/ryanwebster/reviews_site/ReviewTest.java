package dev.ryanwebster.reviews_site;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {

private Review underTest;
    private Long id = 1L;
    private String title = "title";
    private String imgUrl = "imgUrl";
    private String category = "category";
    private String content = "content";

  @BeforeEach
    public void setUp(){
        underTest = new Review(1L, "title", "imgUrl", "category", "content");
    }

    @Test
    public void shouldReturnId() {
        Long testReview = underTest.getId();
        assertEquals(1L, testReview);
    }

    @Test
    public void shouldReturnTitle() {
        String testReview = underTest.getTitle();
        assertEquals("title", testReview);
    }

    @Test
    public void shouldReturnImgUrl() {
        String testReview = underTest.getImgUrl();
        assertEquals("imgUrl", testReview);
    }

    @Test
    public void shouldReturnCategory() {
        String testReview = underTest.getCategory();
        assertEquals("category", testReview);
    }

    @Test
    public void shouldReturnContent() {
        String testReview = underTest.getContent();
        assertEquals("content", testReview);
    }
}

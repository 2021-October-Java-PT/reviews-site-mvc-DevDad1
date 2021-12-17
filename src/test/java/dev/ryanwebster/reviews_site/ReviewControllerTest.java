package dev.ryanwebster.reviews_site;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(ReviewController.class)
public class ReviewControllerTest {

    @Autowired
    private MockMvc mockMVC;

    @Mock
    private Review one;

    @Mock
    private  Review two;

    @MockBean
    private ReviewRepository reviewRepo;


    @Test
    public void ShouldFindAllReviews() throws Exception {
        Collection<Review> allReviews =Arrays.asList(one,two);
        when(reviewRepo.findAll()).thenReturn((allReviews));
        mockMVC.perform(get("/reviews")).andExpect(model().attribute("reviewsModel", allReviews));
    }

    @Test
    public void shouldFindReviewOne() throws Exception {
        Long idOne = 1L;
        when(reviewRepo.findOne(idOne)).thenReturn(one);
        mockMVC.perform(get("/review?id=1")).andExpect(model().attribute("reviewModel", one));
    }
}

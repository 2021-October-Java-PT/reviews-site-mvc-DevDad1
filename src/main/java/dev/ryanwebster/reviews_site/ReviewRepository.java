package dev.ryanwebster.reviews_site;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {

        Review one = new Review(1L, "VertaGear PL6000", "images/PL6000-BlackWhite-min_ver2_400x400.png"
                , "Office Chair", "This is the best chair I have ever owned. I spend a lot of time sitting in front of a desk. The Vertagear " +
                "PL-6000 allows me to stay at my desk in comfort. I am going to have to buy another one now that my wife" +
                " has claimed mine for her own.a");
        Review two = new Review(2L, "Family", "images/PXL_20211016_191459651.MP.jpg", "Fun", "There is nothing quite like family");
        Review three = new Review(3L, "Snow", "images/IMG_20210220_134453.jpg", "Weather", "Snow is great unless you have to plow it");
        Review four = new Review(4L, "Java", "images/IMG_20190713_105152.jpg", "Drink, Programing language", "Can't do one without the other");
        Review five = new Review(5L, "Flexispot EC9", "images/flexispot_e6_hero.jpg", "Standing Desk", "Standing desks are better for you");

        reviewList.put(one.getId(), one);
        reviewList.put(two.getId(), two);
        reviewList.put(three.getId(), three);
        reviewList.put(four.getId(), four);
        reviewList.put(five.getId(), five);
    }

    public ReviewRepository(Review ...reviewToAdd) {
        for (Review review : reviewToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}



package dev.ryanwebster.reviews_site;

public class Review {

    private Long id;
    private String title;
    private String imgUrl;
    private String category;
    private String content;

    public Review(Long id, String title, String imgUrl, String category, String content) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        this.category = category;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }
}


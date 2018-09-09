package academy.learnprogramming.top10downloader;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FeedEntry {

    private String name;
    private String artist;
    private String releaseDate;
    @ToString.Exclude
    private String summary;
    private String imageUrl;

}

package mx.com.bwl.marvel_api.vo.marvel;

import java.util.List;

public class CharacterResponseVO {
    private Long id;
    private String name;
    private String description;
    private String modified;
    private ThumbnailVO thumbnail;
    private String resourceURI;
    private ComicVO comics;
    private ComicVO series;
    private StoryVO stories;
    private ComicVO events;
    private List<UrlVO> urls;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public ThumbnailVO getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(ThumbnailVO thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public ComicVO getComics() {
        return comics;
    }

    public void setComics(ComicVO comics) {
        this.comics = comics;
    }

    public ComicVO getSeries() {
        return series;
    }

    public void setSeries(ComicVO series) {
        this.series = series;
    }

    public StoryVO getStories() {
        return stories;
    }

    public void setStories(StoryVO stories) {
        this.stories = stories;
    }

    public ComicVO getEvents() {
        return events;
    }

    public void setEvents(ComicVO events) {
        this.events = events;
    }

    public List<UrlVO> getUrls() {
        return urls;
    }

    public void setUrls(List<UrlVO> urls) {
        this.urls = urls;
    }
}

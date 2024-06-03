package mx.com.bwl.marvel_api.vo.marvel;

import java.util.List;

public class StoryVO {
    private Long available;
    private String collectionURI;
    private List<StoryItemVO> items;
    private Long returned;

    public Long getAvailable() {
        return available;
    }

    public void setAvailable(Long available) {
        this.available = available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<StoryItemVO> getItems() {
        return items;
    }

    public void setItems(List<StoryItemVO> items) {
        this.items = items;
    }

    public Long getReturned() {
        return returned;
    }

    public void setReturned(Long returned) {
        this.returned = returned;
    }
}

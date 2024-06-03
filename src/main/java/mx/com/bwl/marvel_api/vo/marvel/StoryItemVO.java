package mx.com.bwl.marvel_api.vo.marvel;

public class StoryItemVO {
    private String resourceURI;
    private String name;
    private ItemTypeVO type;

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemTypeVO getType() {
        return type;
    }

    public void setType(ItemTypeVO type) {
        this.type = type;
    }
}

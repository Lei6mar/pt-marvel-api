package mx.com.bwl.marvel_api.vo.marvel;

public class ThumbnailVO {
    private String path;
    private ExtensionVO extension;


    public ExtensionVO getExtension() {
        return extension;
    }

    public void setExtension(ExtensionVO extension) {
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

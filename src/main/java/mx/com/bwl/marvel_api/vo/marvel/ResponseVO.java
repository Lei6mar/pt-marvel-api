package mx.com.bwl.marvel_api.vo.marvel;

public class ResponseVO {
    private Long code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private String etag;
    private DataResponseVO data;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public DataResponseVO getData() {
        return data;
    }

    public void setData(DataResponseVO data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO [code=" + code + ", status=" + status + ", copyright=" + copyright + ", attributionText="
                + attributionText + ", etag=" + etag + ", data=" + data + "]";
    }
}

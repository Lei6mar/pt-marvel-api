package mx.com.bwl.marvel_api.vo.marvel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum UrlTypeVO {
    COMICLINK, DETAIL, WIKI;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMICLINK: return "comiclink";
            case DETAIL: return "detail";
            case WIKI: return "wiki";
        }
        return null;
    }

    @JsonCreator
    public static UrlTypeVO forValue(String value) throws IOException {
        if (value.equals("comiclink")) return COMICLINK;
        if (value.equals("detail")) return DETAIL;
        if (value.equals("wiki")) return WIKI;
        throw new IOException("Cannot deserialize URLType");
    }
}

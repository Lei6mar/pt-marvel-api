package mx.com.bwl.marvel_api.vo.marvel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ItemTypeVO {
    COVER, EMPTY, INTERIOR_STORY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COVER: return "cover";
            case EMPTY: return "";
            case INTERIOR_STORY: return "interiorStory";
        }
        return null;
    }

    @JsonCreator
    public static ItemTypeVO forValue(String value) throws IOException {
        if (value.equals("cover")) return COVER;
        if (value.equals("")) return EMPTY;
        if (value.equals("interiorStory")) return INTERIOR_STORY;
        throw new IOException("Cannot deserialize ItemType");
    }
}
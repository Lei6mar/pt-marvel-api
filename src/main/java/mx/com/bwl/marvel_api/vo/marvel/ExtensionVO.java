package mx.com.bwl.marvel_api.vo.marvel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ExtensionVO {

    GIF, JPG;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GIF: return "gif";
            case JPG: return "jpg";
        }
        return null;
    }

    @JsonCreator
    public static ExtensionVO forValue(String value) throws IOException {
        if (value.equals("gif")) return GIF;
        if (value.equals("jpg")) return JPG;
        throw new IOException("Cannot deserialize Extension");
    }
}

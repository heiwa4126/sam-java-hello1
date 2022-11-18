package helloworld;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Message {
    public String message;
    public String location;

    public Message() {}

    public Message(String message, String location) {
        this.message = message;
        this.location = location;
    }

    @Override
    public String toString() {
        return "{" + " message='" + message + "'" + ", location='" + location + "'" + "}";
    }

    /**
     * MessageをJSON文字列に変換する。本当は別クラスにするべき
     *
     * @return JSON文字列
     * @throws IOException
     */
    public String toJsonString() throws IOException {
        var mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}

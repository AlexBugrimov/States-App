package dev.bug.simpleservlet.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.Data;

import java.util.List;

@Data
public class JsonService {

    private final Gson gson;

    public JsonService() {
        gson = new GsonBuilder().create();
    }

    public <T> String convertToJson(String property, List<T> list) {
        final JsonObject object = new JsonObject();
        object.add(property, gson.toJsonTree(list).getAsJsonArray());
        return object.toString();
    }
}

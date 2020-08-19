package com.edu.jewelry.responses;
/*
 * @author Kateryna Basova
 * @version 19.08.2020
 */

public class JsonResponse {
    private Object json;

    public JsonResponse(Object json) {
        this.json = json;
    }

    public Object getJson() {
        return json;
    }

    public void setJson(Object json) {
        this.json = json;
    }
}

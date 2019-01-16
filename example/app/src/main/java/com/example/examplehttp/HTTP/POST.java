package com.example.examplehttp.HTTP;

public class POST extends Request {

    private String data;

    public POST(String url, String data) {
        super(url);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

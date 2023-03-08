package com.boomi.designpattrens;

public class HttpsApiConnection implements ApiConnection {
    private String apiUrl;

    public HttpsApiConnection(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @Override
    public void connect() {
        // logic to connect using HTTPS
    }

    @Override
    public void disconnect() {
        // logic to disconnect using HTTPS
    }
}

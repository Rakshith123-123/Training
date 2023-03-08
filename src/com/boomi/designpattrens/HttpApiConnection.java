package com.boomi.designpattrens;

public class HttpApiConnection implements ApiConnection {
    private String apiUrl;

    public HttpApiConnection(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @Override
    public void connect() {
        // logic to connect using HTTP
    }

    @Override
    public void disconnect() {
        // logic to disconnect using HTTP
    }
}

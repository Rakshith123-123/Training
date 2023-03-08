package com.boomi.designpattrens;

public class ApiClient {
    public static ApiConnection createConnection(String url) {
        AppConfig config = AppConfig.getInstance();
        config.setApiUrl(url);
        String apiUrl = config.getApiUrl();

        if(apiUrl.startsWith("http://")) {
            return new HttpApiConnection(apiUrl);
        } else if(apiUrl.startsWith("https://")) {
            return new HttpsApiConnection(apiUrl);
        } else {
            return null;
        }
    }
}
package com.boomi.designpattrens;

public class AppConfig {
    private static AppConfig instance;
    private String apiUrl;

    private AppConfig() {

    }

    public static AppConfig getInstance() {
        if(instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }
}
// this is singleton pattern
//because application configuration should be done once.

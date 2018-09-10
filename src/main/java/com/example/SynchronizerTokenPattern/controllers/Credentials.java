package com.example.SynchronizerTokenPattern.controllers;

import com.example.SynchronizerTokenPattern.models.UserDataModel;

import java.util.HashMap;

public class Credentials {

    private static Credentials instance = null;
    private HashMap<String, UserDataModel> userDataSet = new HashMap<>();

    private Credentials() {
    }

    public static synchronized Credentials getInstance() {
        if (instance == null) {
            instance = new Credentials();
        }
        return instance;
    }

    public String getCSRF(String sessionId) {

        String csrf = userDataSet.get(sessionId).getCsrf();
        return csrf;
    }

    public String getUserName(String sessionId) {

        String userName = userDataSet.get(sessionId).getUsername();
        return userName;
    }

    public void addCredentials(UserDataModel model) {
        userDataSet.put(model.getSessionId(), model);
    }

    public void removeCredentials(String sessionId) {
        userDataSet.remove(sessionId);
    }

}

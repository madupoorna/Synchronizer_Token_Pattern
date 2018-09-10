package com.example.SynchronizerTokenPattern.controllers;

import com.example.SynchronizerTokenPattern.models.LoginDataModel;

import java.util.Random;

public class Processes {

    public boolean validateUserCredentials(LoginDataModel credentials) {

        boolean validity = false;

        String passsword = "abc123";
        String username = "john";

        if (credentials.getUserName().equals(username) && credentials.getPassword().equals(passsword)) {
            validity = true;
        }

        return validity;
    }

    public String generateRandomValue() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 30) {
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0, 30);
    }


}

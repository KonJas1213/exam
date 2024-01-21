package com.example.zaliczenie.domain.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.zaliczenie.MyApp;

import java.util.Optional;

public class LoginController {
    public void loginByName(String login) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(MyApp.getContext());
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("login", login);
        editor.commit();
    }
    public String getCurrentLogin() {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(MyApp.getContext());
        Optional<String> login = Optional.ofNullable(sharedPref.getString("login", null));
        if (login.isPresent()) {
            return login.get();
        } else {
            return null;
        }
    }
}

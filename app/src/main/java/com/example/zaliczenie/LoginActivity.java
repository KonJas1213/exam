package com.example.zaliczenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.zaliczenie.domain.login.LoginController;

import org.apache.commons.lang3.StringUtils;



public class LoginActivity extends AppCompatActivity {

    private LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginController = new LoginController();

    }

    public void onLoginClick(View view) {
        EditText editText = (EditText)findViewById(R.id.editTextText);
        String loginText = editText.getText().toString();
        if (StringUtils.isNotBlank(loginText)) {
            loginController.loginByName(loginText);
            Intent mainActivity = new Intent(this,MainActivity.class);
            mainActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            MyApp.getContext().startActivity(mainActivity);
        }

    }

}
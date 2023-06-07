package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button btn = findViewById(R.id.login_btn);
        btn.setEnabled(false);
        EditText mail = findViewById(R.id.email_input);
        mail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().contains("@")){
                    btn.setEnabled(true);
                }else{
                    btn.setEnabled(false);
                }
            }
        });
    }

    public void login_click(View v){
        Intent loginB = new Intent(login.this, code_email.class);
        login.this.startActivity(loginB);
        //login.this.finish();
    }
}

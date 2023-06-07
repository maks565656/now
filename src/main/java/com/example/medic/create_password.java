package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class create_password extends AppCompatActivity {

    Button pass_btn1;
    String password = "";
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_password);


        /*pass_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setPassword(1);
            fi
            }
        });*/
    }

    public void num_click(View view) {
        switch (view.getTag().toString()){
            case "0":
                setPassword(0);
                break;
            case "2":
                setPassword(2);
                break;
            case "3":
                setPassword(3);
                break;
            case "4":
                setPassword(4);
                break;
            case "5":
                setPassword(5);
                break;
            case "6":
                setPassword(6);
                break;
            case "7":
                setPassword(7);
                break;
            case "8":
                setPassword(8);
                break;
            case "9":
                setPassword(9);
                break;
            case "1":
                setPassword(1);
                break;
            case "dlt":
                dltPassword();
                break;
        }
    }

    public void dltPassword(){
        if(password.length() != 0){
            switch (password.length()) {
                case 1:
                    ImageView dot = findViewById(R.id.dot_0);
                    dot.setImageResource(R.drawable.dot_0);
                    break;
                case 2:
                    ImageView dot1 = findViewById(R.id.dot_1);
                    dot1.setImageResource(R.drawable.dot_0);
                    break;
                case 3:
                    ImageView dot2 = findViewById(R.id.dot_2);
                    dot2.setImageResource(R.drawable.dot_0);
                    break;
                case 4:
                    ImageView dot3 = findViewById(R.id.dot_3);
                    dot3.setImageResource(R.drawable.dot_0);
                    break;
            }
            password = password.substring(0,password.length()-1);
        }
        Toast toast = Toast.makeText(getApplicationContext(),
                password, Toast.LENGTH_SHORT);
        toast.show();

    }



        public void setPassword ( int num){
            password += num;
            Toast toast = Toast.makeText(getApplicationContext(),
                    password, Toast.LENGTH_SHORT);
            toast.show();
            if (password.length() == 4) {
                Intent pass = new Intent(create_password.this, create_client.class);
                create_password.this.startActivity(pass);
                create_password.this.finish();
            }
            switch (password.length()) {
                case 1:
                    ImageView dot = findViewById(R.id.dot_0);
                    dot.setImageResource(R.drawable.dot);
                    break;
                case 2:
                    ImageView dot1 = findViewById(R.id.dot_1);
                    dot1.setImageResource(R.drawable.dot);
                    break;
                case 3:
                    ImageView dot2 = findViewById(R.id.dot_2);
                    dot2.setImageResource(R.drawable.dot);
                    break;
                case 4:
                    ImageView dot3 = findViewById(R.id.dot_3);
                    dot3.setImageResource(R.drawable.dot);
                    break;
            }
        }

    }


package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class create_client extends AppCompatActivity {

    Calendar dateAndTime=Calendar.getInstance();
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_client);


        Button cbutt = findViewById(R.id.cbutton);
        //Button cbutt = findViewById(R.id.cbutt);
        cbutt.setEnabled(false);
        EditText c_name = findViewById(R.id.c_name);
        setTextEv(c_name);
        setTextEv(findViewById(R.id.c_otch));
        setTextEv(findViewById(R.id.c_fam));
        setTextEv(findViewById(R.id.c_birth));
        //Spinner spin = findViewById(R.id.c_pol);

    }


    public void setTextEv(EditText ed){
        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!s.toString().equals("")){
                    a++;
                }else{
                    a--;
                }
                if(a == 4){
                    Button cbutt = findViewById(R.id.cbutton);
                    cbutt.setEnabled(true);
                }else{
                    Button cbutt = findViewById(R.id.cbutton);
                    cbutt.setEnabled(false);
                }
            }
        });
    }
    public void setDate(View v) {
        new DatePickerDialog(create_client.this,d,
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_MONTH))
                .show();
    }

    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            dateAndTime.set(Calendar.YEAR, year);
            dateAndTime.set(Calendar.MONTH, monthOfYear);
            dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            EditText birth = findViewById(R.id.c_birth);
            birth.setText(dayOfMonth+"."+monthOfYear+"."+year);
        }
    };
}
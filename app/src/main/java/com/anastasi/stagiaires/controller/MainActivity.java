package com.anastasi.stagiaires.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.anastasi.stagiaires.R;

public class MainActivity extends AppCompatActivity {

    private TextView mGreetingText;
    private EditText mUserInput;
    private EditText mPasswordInput;
    private Button mConnexionButton;

    public static final int LIST_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
        mUserInput = (EditText) findViewById(R.id.activity_main_user_input);
        mPasswordInput = (EditText) findViewById(R.id.activity_main_password_input);
        mConnexionButton = (Button) findViewById(R.id.activity_main_connexion_btn);

        mConnexionButton.setEnabled(false);

        mPasswordInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mConnexionButton.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mConnexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivityIntent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(listActivityIntent);
            }
        });
    }
}

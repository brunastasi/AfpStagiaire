package com.anastasi.stagiaires.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.anastasi.stagiaires.R;
import com.anastasi.stagiaires.model.UserAccount;

public class DetailsActivity extends AppCompatActivity {

    // J'initialise mes variables
    private TextView firstName;
    private TextView lastName;
    private TextView address;
    private TextView city;
    private TextView email;
    private TextView tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Je récupère les informations de mon stagiaire depuis l'activité précédente
        Intent intent = this.getIntent();
        UserAccount stagiaireDetails = (UserAccount) intent.getSerializableExtra("STAGIAIRE_DETAILS");

        // Je récupère la structure de mon layout
        firstName = (TextView) findViewById(R.id.activity_details_firstname_txt);
        lastName = (TextView) findViewById(R.id.activity_details_lastname_txt);
        address = (TextView) findViewById(R.id.activity_details_address_txt);
        city = (TextView) findViewById(R.id.activity_details_city_txt);
        email = (TextView) findViewById(R.id.activity_details_email_txt);
        tel = (TextView) findViewById(R.id.activity_details_tel_txt);

        // J'affiche les données de mon stagiaire
        firstName.setText("Prénom : " + stagiaireDetails.getFirstName());
        lastName.setText("Nom : " + stagiaireDetails.getLastName());
        address.setText("Adresse: " + stagiaireDetails.getAddress());
        city.setText("Ville: " + stagiaireDetails.getCity());
        email.setText("Email: " + stagiaireDetails.getEmail());
        tel.setText("Téléphone: " + stagiaireDetails.getTel());
    }
}

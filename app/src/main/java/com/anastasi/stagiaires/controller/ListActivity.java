package com.anastasi.stagiaires.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.anastasi.stagiaires.R;
import com.anastasi.stagiaires.model.UserAccount;

import java.io.Serializable;

public class ListActivity extends AppCompatActivity implements Serializable {

    // J'initialise mes variables
    ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Je récupère la structure de mon layout
        final ListView listView = (ListView)findViewById(R.id.listView);

        // Je crée mes stagiaires
        UserAccount bruno = new UserAccount("Bruno", "ANASTASI", " 5 Place Charles Béraudier, 69003", "Lyon", "bruno@anastasi.fr", "02.00.70.77.67");
        UserAccount maxime = new UserAccount("Maxime", "ROGOGINE", "39, rue Pierre De Coubertin, 31100", "Toulouse", "maxime@rogogine.fr", "05.83.23.97.13");
        UserAccount jd = new UserAccount("John-David", "DEHI", "2, rue des lieutemants Thomazo, 39100", "Dole", "jd@dehi.fr", "03.59.50.06.90");
        UserAccount arnaud = new UserAccount("Arnaud", "TORIS", "26, Avenue Millies Lacroix, 59640", "Dunkerque", "arnaud@toris.fr", "03.28.54.13.37");
        UserAccount gaelle = new UserAccount("Gaelle", "DUCROCQ", "70, avenue Voltaire, 92240", "Malakoff", "gaelle@ducrocq.fr", "01.96.25.81.62");


        // Je met mes stagiaires dans une liste
        UserAccount[] users = new UserAccount[]{bruno, maxime, jd, arnaud, gaelle};

        // J'initialise mes stagiaires dans un tableau pour mon ListView
        final ArrayAdapter<UserAccount> arrayAdapter = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_checked, users);
        listView.setAdapter(arrayAdapter);

        // Lors-ce qu'on clique sur le stagiaire, l'on se rend sur la page d'information du stagiaire
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // J'initialise mon activité
                Intent DetailsActivity = new Intent(ListActivity.this, DetailsActivity.class);

                // Je récupère les informations de mon stagiaire sélectionné de mon tableau
                UserAccount stagiaireDetails = (UserAccount) listView.getItemAtPosition( position );
                DetailsActivity.putExtra("STAGIAIRE_DETAILS", stagiaireDetails);

                // Je lance ma nouvelle activité
                startActivity(DetailsActivity);
            }
        });

    }


}


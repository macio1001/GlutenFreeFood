package com.example.inzynierka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.ads.MobileAds;

public class Main3Activity extends AppCompatActivity{
    public static int country,region;
    public boolean gosc;
    Spinner panstwaspinner,regionspinner;
    Button szukajbutton;
    FirebaseAuth firebaseAuth;
    FloatingActionButton wyloguj;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

                //Baner reklamowy-początek//
        MobileAds.initialize(this,"ca-app-pub-2923905637074345~5215153728");
        mAdView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
                //Baner reklamowy-koniec//

        panstwaspinner = findViewById(R.id.KrajSpinner);
        regionspinner = findViewById(R.id.SpinnerRegion);
        szukajbutton = findViewById(R.id.SzukajButton);
        firebaseAuth = FirebaseAuth.getInstance();
        wyloguj = findViewById(R.id.WylogujButton);

        Intent mintent = getIntent();
        gosc = mintent.getBooleanExtra("Gosc", false);

        String panstwa[] = {getString(R.string.wybierzkraj), getString(R.string.andora), getString(R.string.austria), getString(R.string.belgia), getString(R.string.grecja),
                getString(R.string.hiszpania), getString(R.string.luksemburg), getString(R.string.niemcy), getString(R.string.polska), getString(R.string.szwajcaria), getString(R.string.wlochy)};
        String jednostka[] = {getString(R.string.jednostkaadministracyjna)};
        String andora[] = {getString(R.string.lamassana)};
        String austria[] = {getString(R.string.karyntia), getString(R.string.salzburg), getString(R.string.tyrol), getString(R.string.wieden)};
        String belgia[] = {getString(R.string.flamandzki), getString(R.string.stolecznybrukseli)};
        String grecja[] = {getString(R.string.wysparodos), getString(R.string.wyspakreta)};
        String hiszpania[] = {getString(R.string.andaluzja)};
        String luksemburg[] = {getString(R.string.luksemburg1), getString(R.string.remich)};
        String niemcy[] = {getString(R.string.berlin), getString(R.string.hesja), getString(R.string.saksonia)};
        String polska[] = {getString(R.string.dolnoskaskie), getString(R.string.kujawskopomorskie), getString(R.string.lubelskie), getString(R.string.mazowieckie), getString(R.string.malopolskie),
                getString(R.string.podkarpackie), getString(R.string.podlaskie), getString(R.string.pomorskie), getString(R.string.wielkopolskie), getString(R.string.zachodniopomorskie),
                getString(R.string.lodzkie), getString(R.string.slaskie), getString(R.string.swietokrzyskie), getString(R.string.lubuskie)};
        String szwajcaria[] = {getString(R.string.berno)};
        String wlochy[] = {getString(R.string.abruzja), getString(R.string.basilicata), getString(R.string.kalabria), getString(R.string.kampania), getString(R.string.emiliaromania), getString(R.string.fruliwenecja),
                getString(R.string.lacjum), getString(R.string.liguria), getString(R.string.lombardia), getString(R.string.marche), getString(R.string.molise), getString(R.string.piemont), getString(R.string.apulia),
                getString(R.string.sardynia), getString(R.string.sycylia), getString(R.string.toskania), getString(R.string.trydent), getString(R.string.umbria), getString(R.string.dolinaaosty), getString(R.string.wenecja)};

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_spinner_dropdown_item, panstwa);
            panstwaspinner.setAdapter(adapter);
            panstwaspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(Main3Activity.this,
                                android.R.layout.simple_spinner_dropdown_item, jednostka);
                        regionspinner.setAdapter(adapter11);
                    }
                    if (position == 1) {
                        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(Main3Activity.this,
                                android.R.layout.simple_spinner_dropdown_item, andora);
                        regionspinner.setAdapter(adapter1);
                    }
                    if (position == 2) {
                        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, austria);
                        regionspinner.setAdapter(adapter2);
                    }
                    if (position == 3) {
                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, belgia);
                        regionspinner.setAdapter(adapter3);
                    }
                    if (position == 4) {
                        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, grecja);
                        regionspinner.setAdapter(adapter4);
                    }
                    if (position == 5) {
                        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, hiszpania);
                        regionspinner.setAdapter(adapter5);
                    }
                    if (position == 6) {
                        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, luksemburg);
                        regionspinner.setAdapter(adapter6);
                    }
                    if (position == 7) {
                        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, niemcy);
                        regionspinner.setAdapter(adapter7);
                    }
                    if (position == 8) {
                        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, polska);
                        regionspinner.setAdapter(adapter8);
                    }
                    if (position == 9) {
                        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_spinner_dropdown_item, szwajcaria);
                        regionspinner.setAdapter(adapter9);
                    }
                    if (position == 10) {
                        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(Main3Activity.this,
                                android.R.layout.simple_spinner_dropdown_item, wlochy);
                        regionspinner.setAdapter(adapter10);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });


                szukajbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        country = panstwaspinner.getSelectedItemPosition();
                        region = regionspinner.getSelectedItemPosition();
                        if (country == 0 && region == 0) {
                            Toast.makeText(Main3Activity.this, getString(R.string.Noselection), Toast.LENGTH_LONG).show();
                        } else {
                            Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                            intent.putExtra("Państwo", country);
                            intent.putExtra("Region", region);
                            startActivity(intent);
                        }
                        //startActivity(new Intent(Main3Activity.this,Main4Activity.class));
                    }
                });
    }
    public void Wyloguj(View view){
        firebaseAuth.signOut();
        Intent intent=new Intent(Main3Activity.this,MainActivity.class);
        intent.putExtra("finish",true);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}

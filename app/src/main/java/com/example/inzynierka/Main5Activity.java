package com.example.inzynierka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.GestureDescription;
import android.content.Intent;
import android.graphics.Region;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.annotation.Nullable;


public class Main5Activity extends AppCompatActivity {

    private TextView NazwaText,UlicaText,MiastoText,RegionText,ProwincjaText,WynikRating;
    private ImageView gwiazdka;
    public float rating;
    public RatingBar Ocena;
    public String Nazwa,Region,wynik;
    public Map<String,Object> ocena=new HashMap<>();
    public FirebaseFirestore firebaseFirestore;
    public static final String TAG="FireLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        firebaseFirestore=FirebaseFirestore.getInstance();

        Obiekt obiekt= (Obiekt) getIntent().getSerializableExtra("obiekt");

        NazwaText=findViewById(R.id.textView5);
        UlicaText=findViewById(R.id.textView6);
        MiastoText=findViewById(R.id.textView7);
        RegionText=findViewById(R.id.textView9);
        ProwincjaText=findViewById(R.id.textView12);
        gwiazdka=findViewById(R.id.imageView5);
        WynikRating=findViewById(R.id.textView18);
        Ocena=findViewById(R.id.ratingBar);

        Andora andora=new Andora();
        Austria austria=new Austria();
        Belgia belgia=new Belgia();
        Grecja grecja=new Grecja();
        Hiszpania hiszpania=new Hiszpania();
        Luksemburg luksemburg=new Luksemburg();
        Niemcy niemcy=new Niemcy();
        Polska polska=new Polska();
        Szwajcaria szwajcaria=new Szwajcaria();
        WlochyCenter wlochyCenter=new WlochyCenter();
        WlochyNord wlochyNord=new WlochyNord();
        WlochySouth wlochySouth=new WlochySouth();
        Campania campania=new Campania();
        Piemonte piemonte=new Piemonte();
        Toscana toscana=new Toscana();

        if(Main3Activity.country==1){
            NazwaText.setText(obiekt.getNazwa());
            MiastoText.setText(obiekt.getMiasto());
            UlicaText.setText(obiekt.getUlica());
            RegionText.setText(obiekt.getParafia());
            ProwincjaText.setText(obiekt.getKod());
        }else if(Main3Activity.country==2 || Main3Activity.country==7){
            NazwaText.setText(obiekt.getNazwa());
            MiastoText.setText(obiekt.getMiasto());
            UlicaText.setText(obiekt.getUlica());
            RegionText.setText(obiekt.getLand());
            ProwincjaText.setText(obiekt.getKod());
        }else if(Main3Activity.country==3 || Main3Activity.country==4){
            NazwaText.setText(obiekt.getNazwa());
            MiastoText.setText(obiekt.getMiasto());
            UlicaText.setText(obiekt.getUlica());
            RegionText.setText(obiekt.getRegion());
            ProwincjaText.setText(obiekt.getKod());
        }else if(Main3Activity.country==5 || Main3Activity.country==10){
            NazwaText.setText(obiekt.getNazwa());
            MiastoText.setText(obiekt.getMiasto());
            UlicaText.setText(obiekt.getUlica());
            RegionText.setText(obiekt.getRegion());
            ProwincjaText.setText(obiekt.getProwincja());
        }else if(Main3Activity.country==6 || Main3Activity.country==9){
            NazwaText.setText(obiekt.getNazwa());
            MiastoText.setText(obiekt.getMiasto());
            UlicaText.setText(obiekt.getUlica());
            RegionText.setText(obiekt.getKanton());
            ProwincjaText.setText(obiekt.getKod());
        }else if(Main3Activity.country==8){
            NazwaText.setText(obiekt.getNazwa());
            MiastoText.setText(obiekt.getMiasto());
            UlicaText.setText(obiekt.getUlica());
            RegionText.setText(obiekt.getWojewództwo());
            ProwincjaText.setText(obiekt.getKod());
        }
        Nazwa=NazwaText.getText().toString();
        Region=RegionText.getText().toString();

        gwiazdka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating=Ocena.getRating();
                ocena.put("Ocena",rating);
                ocena.put("Data",new Timestamp(new Date()));
                wynik=String.valueOf(rating);
                WynikRating.setText(wynik);
                if(Main3Activity.country==1){
                    andora.dodajOcene();
                }
                /*else if(Main3Activity.country==2){
                    austria.dodajOcene(Nazwa,Region);
                }
                else if(Main3Activity.country==3){
                    belgia.dodajOcene();
                }
                else if(Main3Activity.country==4){
                    grecja.dodajOcene();
                }
                else if(Main3Activity.country==5){
                    hiszpania.dodajOcene();
                }
                else if(Main3Activity.country==6){
                    luksemburg.dodajOcene();
                }
                else if(Main3Activity.country==7){
                    niemcy.dodajOcene();
                }
                else if(Main3Activity.country==8){
                    polska.dodajOcene();
                }
                else if(Main3Activity.country==9){
                    szwajcaria.dodajOcene();
                }
                else if(Main3Activity.country==10){
                    if(Nazwa.equals("Sicilia") || Nazwa.equals("Calabria") || Nazwa.equals("Basilicata") || Nazwa.equals("Puglia") || Nazwa.equals("Molise")){
                        wlochySouth.dodajOcene();
                    }
                    else if(Nazwa.equals("Campania")){
                        campania.dodajOcene();
                    }
                    else if(Nazwa.equals("Lazio") || Nazwa.equals("Abruzzo") || Nazwa.equals("Umbria") || Nazwa.equals("Marche") || Nazwa.equals("Sardegna") || Nazwa.equals("Emilia Romagna")){
                        wlochyCenter.dodajOcene();
                    }
                    else if(Nazwa.equals("Toscana")){
                        toscana.dodajOcene();
                    }
                    else if(Nazwa.equals("Liguria") || Nazwa.equals("Valle D'Aosta") || Nazwa.equals("Lombardia") || Nazwa.equals("Friuli Venezia Giulia") || Nazwa.equals("Veneto") || Nazwa.equals("Trentino Alto Adige")){
                        wlochyNord.dodajOcene();
                    }
                    else if(Nazwa.equals("Piemonte")){
                        piemonte.dodajOcene();
                    }
                }*/
            }
        });
    }
}
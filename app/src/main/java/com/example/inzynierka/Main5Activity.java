package com.example.inzynierka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class Main5Activity extends AppCompatActivity {

    private TextView NazwaText,UlicaText,MiastoText,RegionText,ProwincjaText,WynikRating;
    private ImageView gwiazdka;
    public float rating;
    public RatingBar Ocena;
    public String Nazwa,Region,Miasto,wynik;
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
        ShowRatingAndora showRatingAndora=new ShowRatingAndora();
        Austria austria=new Austria();
        ShowRatingAustria showRatingAustria=new ShowRatingAustria();
        Belgia belgia=new Belgia();
        ShowRatingBelgia showRatingBelgia=new ShowRatingBelgia();
        Grecja grecja=new Grecja();
        ShowRatingGrecja showRatingGrecja=new ShowRatingGrecja();
        Hiszpania hiszpania=new Hiszpania();
        ShowRatingHiszpania showRatingHiszpania=new ShowRatingHiszpania();
        Luksemburg luksemburg=new Luksemburg();
        ShowRatingLuksemburg showRatingLuksemburg=new ShowRatingLuksemburg();
        Niemcy niemcy=new Niemcy();
        ShowRatingNiemcy showRatingNiemcy=new ShowRatingNiemcy();
        Polska polska=new Polska();
        ShowRatingPolska showRatingPolska=new ShowRatingPolska();
        Szwajcaria szwajcaria=new Szwajcaria();
        ShowRatingSzwajcaria showRatingSzwajcaria=new ShowRatingSzwajcaria();
        WlochyCenter wlochyCenter=new WlochyCenter();
        ShowRatingLazio showRatingLazio=new ShowRatingLazio();
        ShowRatingAbruzzoandUmbria showRatingAbruzzoandUmbria=new ShowRatingAbruzzoandUmbria();
        ShowRatingMarche showRatingMarche=new ShowRatingMarche();
        ShowRatingEmilia showRatingEmilia=new ShowRatingEmilia();
        WlochyNord wlochyNord=new WlochyNord();
        ShowRatingLiguriaandFriuli showRatingLiguriaandFriuli=new ShowRatingLiguriaandFriuli();
        ShowRatingLombardia showRatingLombardia=new ShowRatingLombardia();
        ShowRatingVenetoandTrentino showRatingVenetoandTrentino =new ShowRatingVenetoandTrentino();
        WlochySouth wlochySouth=new WlochySouth();
        ShowRatingPuglia showRatingPuglia=new ShowRatingPuglia();
        ShowRatingCalabria showRatingCalabria=new ShowRatingCalabria();
        ShowRatingSicilia showRatingSicilia=new ShowRatingSicilia();
        ShowRatingWlochy showRatingWlochy=new ShowRatingWlochy();
        Campania campania=new Campania();
        ShowRatingCampania showRatingCampania=new ShowRatingCampania();
        Piemonte piemonte=new Piemonte();
        ShowRatingPiemonte showRatingPiemonte=new ShowRatingPiemonte();
        Toscana toscana=new Toscana();
        ShowRatingToscanapart1 showRatingToscanapart1=new ShowRatingToscanapart1();
        ShowRatingToscanapart2 showRatingToscanapart2=new ShowRatingToscanapart2();

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
        Miasto=MiastoText.getText().toString();

        if(Main3Activity.country==1) {
            showRatingAndora.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==2){
            showRatingAustria.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==3){
            showRatingBelgia.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==4){
            showRatingGrecja.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==5){
            showRatingHiszpania.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==6){
            showRatingLuksemburg.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==7){
            showRatingNiemcy.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==8){
            showRatingPolska.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==9){
            showRatingSzwajcaria.pokazOcene(Nazwa,Region,WynikRating);
        }else if(Main3Activity.country==10){
            if(Region.equals("Campania")){
                showRatingCampania.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Piemonte")){
                showRatingPiemonte.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Puglia")){
                showRatingPuglia.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Calabria")){
                showRatingCalabria.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Sicilia")){
                showRatingSicilia.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Basilicata") || Region.equals("Molise") || Region.equals("Valle D'Aosta") || Region.equals("Sardegna")){
                showRatingWlochy.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Liguria") || Region.equals("Friuli Venezia Giulia")){
                showRatingLiguriaandFriuli.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Lombardia")){
                showRatingLombardia.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Veneto") || Region.equals("Trentino Alto Adige")){
                showRatingVenetoandTrentino.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Abruzzo") || Region.equals("Umbria")){
                showRatingAbruzzoandUmbria.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Lazio")){
                showRatingLazio.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Marche")){
                showRatingMarche.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Emilia Romagna")){
                showRatingEmilia.pokazOcene(Nazwa,Region,WynikRating);
            }else if(Region.equals("Toscana")){
                showRatingToscanapart1.pokazOcene(Nazwa,Region,WynikRating);
                showRatingToscanapart2.pokazOcene(Nazwa,Region,WynikRating);
            }
        }

        gwiazdka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating=Ocena.getRating();
                if(rating==0){
                    Toast.makeText(Main5Activity.this,getString(R.string.ratingrestaurant),Toast.LENGTH_LONG).show();
                }else {
                    if (Main3Activity.country == 1) {
                        andora.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 2) {
                        austria.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 3) {
                        belgia.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 4) {
                        grecja.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 5) {
                        hiszpania.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 6) {
                        luksemburg.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 7) {
                        niemcy.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 8) {
                        polska.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 9) {
                        szwajcaria.dodajOcene(rating, Region, Nazwa);
                    } else if (Main3Activity.country == 10) {
                        if (Region.equals("Sicilia") || Region.equals("Calabria") || Region.equals("Molise") || Region.equals("Basilicata") || Region.equals("Puglia")) {
                            wlochySouth.dodajOcene(rating, Region, Nazwa);
                        } else if (Region.equals("Campania")) {
                            campania.dodajOcene(rating, Region, Nazwa);
                        } else if (Region.equals("Lazio") || Region.equals("Abruzzo") || Region.equals("Umbria") || Region.equals("Marche") || Region.equals("Sardegna") || Region.equals("Emilia Romagna")) {
                            wlochyCenter.dodajOcene(rating, Region, Nazwa);
                        } else if (Region.equals("Toscana")) {
                            toscana.dodajOcene(rating, Region, Nazwa);
                        } else if (Region.equals("Liguria") || Region.equals("Valle D'Aosta") || Region.equals("Lombardia") || Region.equals("Friuli Venezia Giulia") || Region.equals("Veneto") || Region.equals("Trentino Alto Adige")) {
                            wlochyNord.dodajOcene(rating, Region, Nazwa, Miasto);
                        } else if (Region.equals("Piemonte")) {
                            piemonte.dodajOcene(rating, Region, Nazwa);
                        }
                    }
                }
            }
        });
    }
}
package com.example.inzynierka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.opencensus.tags.Tag;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;


public class Main4Activity extends AppCompatActivity {

    private static final String TAG="FireLog";
    private RecyclerView obiektView;
    private FirebaseFirestore firebaseFirestore;
    private ObiektAdapter obiektAdapter;
    private List<Obiekt> obiektList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent mintent=getIntent();
        int country1 = mintent.getIntExtra("Państwo", 0);
        int region1=mintent.getIntExtra("Region",0);
        boolean gosc=mintent.getBooleanExtra("Region",false);
        obiektList=new ArrayList<>();
        obiektAdapter=new ObiektAdapter(this,obiektList);
        obiektView=(RecyclerView) findViewById(R.id.ObiektView);
        obiektView.setHasFixedSize(true);
        obiektView.setLayoutManager(new LinearLayoutManager(this));
        obiektView.setAdapter(obiektAdapter);
        this.firebaseFirestore=FirebaseFirestore.getInstance();

            if(country1==1 && region1==0) {
                showAndoraLaMassana();
            }else if(country1==2 && region1==0){
                showAustriaKaryntia();
            }else if(country1==2 && region1==1){
                showAustriaSalzburg();
            }else if(country1==2 && region1==2){
                showAustriaTyrol();
            }else if(country1==2 && region1==3){
                showAustriaWien();
            }else if(country1==3 && region1==0){
                showBelgiaFlamandzki();
            }else if(country1==3 && region1==1){
                showBelgiaBruksela();
            }else if(country1==4&& region1==0){
                showGrecjaRodos();
            }else if(country1==4&& region1==1){
                showGrecjaKreta();
            }else if(country1==5 && region1==0){
                showHiszpaniaAndaluzja();
            }else if(country1==6 && region1==0){
                showLuksemburgLuksemburg();
            }else if(country1==6 && region1==1){
                showLuksemburgRemich();
            }else if(country1==7 && region1==0){
                showNiemcyBerlin();
            }else if(country1==7 && region1==1){
                showNiemcyHesja();
            }else if(country1==7 && region1==2){
                showNiemcySaksonia();
            }else if(country1==8 && region1==0){
                showPolskaDolnoslaskie();
            }else if(country1==8 && region1==1){
                showPolskaKujawskopomorskie();
            }else if(country1==8 && region1==2){
                showPolskaLubelskie();
            }else if(country1==8 && region1==3){
                showPolskaMazowieckie();
            }else if(country1==8 && region1==4){
                showPolskaMalopolskie();
            }else if(country1==8 && region1==5){
                showPolskaPodkarpackie();
            }else if(country1==8 && region1==6){
                showPolskaPodlaskie();
            }else if(country1==8 && region1==7){
                showPolskaPomorskie();
            }else if(country1==8 && region1==8){
                showPolskaWielkopolskie();
            }else if(country1==8 && region1==9){
                showPolskaZachodniopomorskie();
            }else if(country1==8 && region1==10){
                showPolskaLodzkie();
            }else if(country1==8 && region1==11){
                showPolskaSlaskie();
            }else if(country1==8 && region1==12) {
                showPolskaSwietokrzyskie();
            }else if(country1==8 && region1==13){
                showPolskaLubuskie();
            }else if(country1==9 && region1==0){
                showSzwajcariaBerno();
            }else if(country1==10 && region1==0){
                showWlochyAbruzja();
            }else if(country1==10 && region1==1){
                showWlochyBasilicata();
            }else if(country1==10 && region1==2){
                showWlochyKalabria();
            }else if(country1==10 && region1==3){
                showWlochyKampania();
            }else if(country1==10 && region1==4){
                showWlochyEmiliaRom();
            }else if(country1==10 && region1==5){
                showWlochyFruli();
            }else if(country1==10 && region1==6){
                showWlochyLacjum();
            }else if(country1==10 && region1==7){
                showWlochyLiguria();
            }else if(country1==10 && region1==8){
                showWlochyLombardia();
            }else if(country1==10 && region1==9){
                showWlochyMarche();
            }else if(country1==10 && region1==10){
                showWlochyMolise();
            }else if(country1==10 && region1==11){
                showWlochyPiemont();
            }else if(country1==10 && region1==12){
                showWlochyApulia();
            }else if(country1==10 && region1==13){
                showWlochySardynia();
            }else if(country1==10 && region1==14){
                showWLochySycylia();
            }else if(country1==10 && region1==15){
                showWlochyToskania();
            }else if(country1==10 && region1==16){
                showWlochyTrydent();
            }else if(country1==10 && region1==17){
                showWlochyUmbria();
            }else if(country1==10 && region1==18){
                showWlochyAosta();
            }else if(country1==10 && region1==19) {
                showWlochyWenecja();
            }
    }

    private void showPolskaLubuskie() {
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Lubuskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }

    public void showAndoraLaMassana(){
        firebaseFirestore.collection("Andora").whereEqualTo("Parafia","La Massana").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showAustriaKaryntia(){
        firebaseFirestore.collection("Austria").whereEqualTo("Land","Kärnten").
                addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showAustriaSalzburg(){
        firebaseFirestore.collection("Austria").whereEqualTo("Land","Salzburg").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showAustriaTyrol(){
        firebaseFirestore.collection("Austria").whereEqualTo("Land","Tyrol").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showAustriaWien(){
        firebaseFirestore.collection("Austria").whereEqualTo("Land","Wien").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showBelgiaFlamandzki(){
        firebaseFirestore.collection("Belgia").whereEqualTo("Region","Vlaams Gewest").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showBelgiaBruksela() {
        firebaseFirestore.collection("Belgia").whereEqualTo("Region", "Région de Bruxelles-Capitale").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if (e != null) {
                    Log.d(TAG, "Error:" + e.getMessage());

                } else {
                    for (DocumentChange doc : queryDocumentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Obiekt obiekt = doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showGrecjaRodos(){
        firebaseFirestore.collection("Grecja").whereEqualTo("Region","Rodos Island").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showGrecjaKreta(){
        firebaseFirestore.collection("Grecja").whereEqualTo("Region","Kreta Island").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showHiszpaniaAndaluzja(){
        firebaseFirestore.collection("Hiszpania").whereEqualTo("Region","Andalucía").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showLuksemburgLuksemburg(){
        firebaseFirestore.collection("Luksemburg").whereEqualTo("Kanton","Luxembourg").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showLuksemburgRemich(){
        firebaseFirestore.collection("Luksemburg").whereEqualTo("Kanton","Remich").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showNiemcyBerlin(){
        firebaseFirestore.collection("Niemcy").whereEqualTo("Land","Berlin").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showNiemcyHesja(){
        firebaseFirestore.collection("Niemcy").whereEqualTo("Land","Hessen").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showNiemcySaksonia(){
        firebaseFirestore.collection("Niemcy").whereEqualTo("Land","Sachsen").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaPomorskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Pomorskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaDolnoslaskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Dolnośląskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaKujawskopomorskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Kujawsko-pomorskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaLubelskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Lubelskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaMazowieckie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Mazowieckie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaMalopolskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Małopolskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaPodkarpackie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Podkarpackie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaPodlaskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Podlaskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaWielkopolskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Wielkopolskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaZachodniopomorskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Zachodniopomorskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaLodzkie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Łódzkie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaSlaskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Śląskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showPolskaSwietokrzyskie(){
        firebaseFirestore.collection("Polska").whereEqualTo("Województwo","Świętokrzyskie").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showSzwajcariaBerno(){
        firebaseFirestore.collection("Szwajcaria").whereEqualTo("Kanton","Bern").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyAbruzja(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Abruzzo").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyBasilicata(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Basilicata").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyKalabria(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Calabria").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyKampania(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Campania").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyEmiliaRom(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Emilia Romagna").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyFruli(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Friuli Venezia Giulia").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyLacjum(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Lazio").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyLiguria(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Liguria").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyLombardia(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Lombardia").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyMarche(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Marche").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyMolise(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Molise").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyPiemont(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Piemonte").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyApulia(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Puglia").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochySardynia(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Sardegna").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWLochySycylia(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Sicilia").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyToskania(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Toscana").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyTrydent(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Trentino Alto Adige").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyUmbria(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Umbria").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyAosta(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Valle D'Aosta").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
    public void showWlochyWenecja(){
        firebaseFirestore.collection("Włochy").whereEqualTo("Region","Veneto").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null){
                    Log.d(TAG,"Error:"+e.getMessage());

                }
                else{
                    for(DocumentChange doc: queryDocumentSnapshots.getDocumentChanges()){
                        if(doc.getType()== DocumentChange.Type.ADDED){
                            Obiekt obiekt=doc.getDocument().toObject(Obiekt.class);
                            obiektList.add(obiekt);

                            obiektAdapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        });
    }
}
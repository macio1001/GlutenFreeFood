package com.example.inzynierka;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import androidx.annotation.NonNull;

public class Belgia extends Main5Activity {
    Main5Activity main7Activity;
    public void dodajOcene(){
        if(Nazwa.equals("Charlie's Antwerpen") && Region.equals("Vlaams Gewest")){
            firebaseFirestore.collection("Belgia").document("Charlie's Antwerpen").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
        else if(Nazwa.equals("De  Broers Van Julienne") && Region.equals("Vlaams Gewest")){
            firebaseFirestore.collection("Belgia").document("De  Broers Van Julienne").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
        else if(Nazwa.equals("Gust") && Region.equals("Vlaams Gewest")){
            firebaseFirestore.collection("Belgia").document("Gust").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
        else if(Nazwa.equals("Italia in Tavola") && Region.equals("Région de Bruxelles-Capitale")){
            firebaseFirestore.collection("Belgia").document("Italia in Tavola").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
        else if(Nazwa.equals("Juliette") && Region.equals("Vlaams Gewest")){
            firebaseFirestore.collection("Belgia").document("Juliette").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
        else if(Nazwa.equals("Le Botaniste") && Region.equals("Vlaams Gewest")){
            firebaseFirestore.collection("Belgia").document("Le Botaniste").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
        else if(Nazwa.equals("ORSO - Pizzeria") && Region.equals("Vlaams Gewest")){
            firebaseFirestore.collection("Belgia").document("ORSO - Pizzeria").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
        else if(Nazwa.equals("Per Bacco") && Region.equals("Vlaams Gewest")){
            firebaseFirestore.collection("Belgia").document("Per Bacco").collection("Ocena").document().set(ocena)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(main7Activity, "Rating" + rating, Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(main7Activity, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
    }
}

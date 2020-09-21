package com.example.inzynierka;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

import androidx.annotation.NonNull;

public class Niemcy extends Main5Activity {
    Main5Activity main7Activity;
    public void dodajOcene(){
        if(Nazwa.equals("BLOCK HOUSE Am Alexanderplatz - SteakHouse") && Region.equals("Berlin")){
            firebaseFirestore.collection("Niemcy").document("BLOCK HOUSE Am Alexanderplatz - SteakHouse").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("BLOCK HOUSE Franfurt Westend") && Region.equals("Hessen")){
            firebaseFirestore.collection("Niemcy").document("BLOCK HOUSE Franfurt Westend").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Landhotel Dresden") && Region.equals("Sachsen")){
            firebaseFirestore.collection("Niemcy").document("Landhotel Dresden").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("MAREDO SteakHouse") && Region.equals("Hessen")){
            firebaseFirestore.collection("Niemcy").document("MAREDO SteakHouse").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Mongo's Restaurant") && Region.equals("Hessen")){
            firebaseFirestore.collection("Niemcy").document("Mongo's Restaurant").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Cielo di Berlino") && Region.equals("Berlin")){
            firebaseFirestore.collection("Niemcy").document("Pizzeria Cielo di Berlino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Sicilia") && Region.equals("Hessen")){
            firebaseFirestore.collection("Niemcy").document("Pizzeria Sicilia").collection("Ocena").document().set(ocena)
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

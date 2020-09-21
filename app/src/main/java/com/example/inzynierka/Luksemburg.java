package com.example.inzynierka;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

import androidx.annotation.NonNull;

public class Luksemburg extends Main5Activity {
    Main5Activity main7Activity;
    public void dodajOcene(){
        if(Nazwa.equals("La Commedia Dell'arte S.a R.l.") && Region.equals("Luxembourg")){
            firebaseFirestore.collection("Luksemburg").document("La Commedia Dell'arte S.a R.l.").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria-Restaurant DOLCE VITA") && Region.equals("Remich")){
            firebaseFirestore.collection("Luksemburg").document("Pizzeria-Restaurant DOLCE VITA").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Restaurant Dal Notaro") && Region.equals("Luxembourg")){
            firebaseFirestore.collection("Luksemburg").document("Restaurant Dal Notaro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Restaurant-Pizzeria FARINELLA") && Region.equals("Luxembourg")){
            firebaseFirestore.collection("Luksemburg").document("Restaurant-Pizzeria FARINELLA").collection("Ocena").document().set(ocena)
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

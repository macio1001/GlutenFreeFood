package com.example.inzynierka;

import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;

public class Austria extends Main5Activity{
    public Map<String,Object> ocena=new HashMap<>();
    public void dodajOcene(float rating,String Region,String Nazwa){
        ocena.put("Ocena",rating);
        ocena.put("Data",new Timestamp(new Date()));
        firebaseFirestore=FirebaseFirestore.getInstance();
        if(Region.equals("Kärnten") && Nazwa.equals("**** Hotel Kaiser Franz Josef")) {
            firebaseFirestore.collection("Austria").document("**** Hotel Kaiser Franz Josef").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("BOSEK'S Salt & Sugar")) {
            firebaseFirestore.collection("Austria").document("BOSEK'S Salt & Sugar").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Gasthof Thanner")){
            firebaseFirestore.collection("Austria").document("Gasthof Thanner").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Hotel Kitzhof Mountain Design Resort ****")){
            firebaseFirestore.collection("Austria").document("Hotel Kitzhof Mountain Design Resort ****").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Hotel Berner Zell am See ****")){
            firebaseFirestore.collection("Austria").document("Hotel Berner Zell am See ****").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Hotel Goldener Adler ****")){
            firebaseFirestore.collection("Austria").document("Hotel Goldener Adler ****").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Hotel LAMARK")){
            firebaseFirestore.collection("Austria").document("Hotel LAMARK").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Kärnten") && Nazwa.equals("Hotel SONNALM")){
            firebaseFirestore.collection("Austria").document("Hotel SONNALM").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Hotel Stadt Wien")){
            firebaseFirestore.collection("Austria").document("Hotel Stadt Wien").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Naturhotel Forsthofgut")){
            firebaseFirestore.collection("Austria").document("Naturhotel Forsthofgut").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Wien") && Nazwa.equals("Ristorante Pizzeria Scarabocchio")){
            firebaseFirestore.collection("Austria").document("Ristorante Pizzeria Scarabocchio").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Steakhaus Schusterhaeusl Restaurant")){
            firebaseFirestore.collection("Austria").document("Steakhaus Schusterhaeusl Restaurant").collection("Ocena").add(ocena)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Log.d(TAG, "DocumentSnapshot written withID: " + documentReference.get());
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding document", e);
                        }
                    });
        }

    }
}

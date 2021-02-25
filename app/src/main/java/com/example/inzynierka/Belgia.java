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

public class Belgia extends Main5Activity {
    public Map<String,Object> ocena=new HashMap<>();
    public void dodajOcene(float rating,String Region,String Nazwa){
        ocena.put("Ocena",rating);
        ocena.put("Data",new Timestamp(new Date()));
        firebaseFirestore=FirebaseFirestore.getInstance();
        if(Region.equals("Vlaams Gewest") && Nazwa.equals("Charlie's Antwerpen")){
            firebaseFirestore.collection("Belgia").document("Charlie's Antwerpen").collection("Ocena").add(ocena)
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
        else if(Region.equals("Vlaams Gewest") && Nazwa.equals("De  Broers Van Julienne")){
            firebaseFirestore.collection("Belgia").document("De  Broers Van Julienne").collection("Ocena").add(ocena)
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
        else if(Region.equals("Vlaams Gewest") && Nazwa.equals("Gust")){
            firebaseFirestore.collection("Belgia").document("Gust").collection("Ocena").add(ocena)
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
        else if(Region.equals("Région de Bruxelles-Capitale") && Nazwa.equals("Italia in Tavola")){
            firebaseFirestore.collection("Belgia").document("Italia in Tavola").collection("Ocena").add(ocena)
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
        else if(Region.equals("Vlaams Gewest") && Nazwa.equals("Juliette")){
            firebaseFirestore.collection("Belgia").document("Juliette").collection("Ocena").add(ocena)
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
        else if(Region.equals("Vlaams Gewest") && Nazwa.equals("Le Botaniste")){
            firebaseFirestore.collection("Belgia").document("Le Botaniste").collection("Ocena").add(ocena)
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
        else if(Region.equals("Vlaams Gewest") && Nazwa.equals("ORSO - Pizzeria")){
            firebaseFirestore.collection("Belgia").document("ORSO - Pizzeria").collection("Ocena").add(ocena)
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
        else if(Region.equals("Vlaams Gewest") && Nazwa.equals("Per Bacco")){
            firebaseFirestore.collection("Belgia").document("Per Bacco").collection("Ocena").add(ocena)
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

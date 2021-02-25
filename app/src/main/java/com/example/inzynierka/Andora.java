package com.example.inzynierka;
import android.content.Intent;
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

public class Andora extends Main5Activity {
    public Map<String,Object> ocena=new HashMap<>();
    public void dodajOcene(Float rating,String Region,String Nazwa){
        ocena.put("Ocena",rating);
        ocena.put("Data",new Timestamp(new Date()));
        firebaseFirestore=FirebaseFirestore.getInstance();
        if(Region.equals("La Massana") && Nazwa.equals("Restaurant Moli dels Fanals")){
            firebaseFirestore.collection("Andora").document("Restaurant Molí dels Fanals").collection("Ocena").add(ocena)
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

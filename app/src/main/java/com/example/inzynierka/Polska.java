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

public class Polska extends Main5Activity {
    public Map<String,Object> ocena=new HashMap<>();
    public void dodajOcene(float rating,String Region,String Nazwa){
        ocena.put("Ocena",rating);
        ocena.put("Data",new Timestamp(new Date()));
        firebaseFirestore= FirebaseFirestore.getInstance();
        if(Region.equals("Małopolskie") && Nazwa.equals("BEZ Piekarnia Bezglutenowa")){
            firebaseFirestore.collection("Polska").document("BEZ Piekarnia Bezglutenowa").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("BEZ Piekarnia Bezglutenowa")){
            firebaseFirestore.collection("Polska").document("BEZ Piekarnia Bezglutenowa Poznań").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Bar Dobrze")){
            firebaseFirestore.collection("Polska").document("Bar Dobrze").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Bar Obiadomek")){
            firebaseFirestore.collection("Polska").document("Bar Obiadomek").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Bar-Restauracja Manufaktura Bezglutenowa")){
            firebaseFirestore.collection("Polska").document("Bar-Restauracja Manufaktura Bezglutenowa").collection("Ocena").add(ocena)
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
        else if(Region.equals("Pomorskie") && Nazwa.equals("Bistro & Delikatesy ATELIER SMAKU")){
            firebaseFirestore.collection("Polska").document("Bistro & Delikatesy ATELIER SMAKU").collection("Ocena").add(ocena)
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
        else if(Nazwa.equals("Bistro Jaglana") && Region.equals("Zachodniopomorskie")){
            firebaseFirestore.collection("Polska").document("Bistro Jaglana").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Bistro Słony")){
            firebaseFirestore.collection("Polska").document("Bistro Słony").collection("Ocena").add(ocena)
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
        else if(Region.equals("Świętokrzyskie") && Nazwa.equals("Calimero Cafe")){
            firebaseFirestore.collection("Polska").document("Calimero Cafe").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Carpe Diem")){
            firebaseFirestore.collection("Polska").document("Carpe Diem").collection("Ocena").add(ocena)
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
        else if(Region.equals("Łódzkie") && Nazwa.equals("Centrum Konferencyjno-Rekreacyjne MOLO")){
            firebaseFirestore.collection("Polska").document("Centrum Konferencyjno-Rekreacyjne MOLO").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Ciuciu Cukier Artist - Manufaktura Cukierków")){
            firebaseFirestore.collection("Polska").document("Ciuciu Cukier Artist - Manufaktura Cukierków").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Ciuciu Cukier Artist-Manufaktura Cukierków")){
            firebaseFirestore.collection("Polska").document("Ciuciu Cukier Artist-Manufaktura Cukierków").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Cukiernia Podwieczorek")){
            firebaseFirestore.collection("Polska").document("Cukiernia Podwieczorek").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Cukiernia Słodkie Bez Cukru")){
            firebaseFirestore.collection("Polska").document("Cukiernia Słodkie Bez Cukru").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Gospoda u Wiedżmy")){
            firebaseFirestore.collection("Polska").document("Gospoda u Wiedżmy").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Groole-pieczone ziemniaki")){
            firebaseFirestore.collection("Polska").document("Groole-pieczone ziemniaki").collection("Ocena").add(ocena)
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
        else if(Region.equals("Łódzkie") && Nazwa.equals("Hotel Magellan")){
            firebaseFirestore.collection("Polska").document("Hotel Magellan").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Hotel Restauracja Kaukaska")){
            firebaseFirestore.collection("Polska").document("Hotel Restauracja Kaukaska").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Hotel Restauracja Patio")){
            firebaseFirestore.collection("Polska").document("Hotel Restauracja Patio").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Kanapkarnia Freshpoint Pasaż Grunwaldzki")){
            firebaseFirestore.collection("Polska").document("Kanapkarnia Freshpoint Pasaż Grunwaldzki").collection("Ocena").add(ocena)
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
        else if(Region.equals("Lubelskie") && Nazwa.equals("Kanapki i Dodatki")){
            firebaseFirestore.collection("Polska").document("Kanapki i Dodatki").collection("Ocena").add(ocena)
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
        else if(Region.equals("Lubuskie") && Nazwa.equals("Kawiarnia MASKA Coffee & Sweet")){
            firebaseFirestore.collection("Polska").document("Kawiarnia MASKA Coffee & Sweet").collection("Ocena").add(ocena)
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
        else if(Region.equals("Podlaskie") && Nazwa.equals("Kawiarnia Restauracja Bella Vita")){
            firebaseFirestore.collection("Polska").document("Kawiarnia Restauracja Bella Vita").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Kawiarnia Sorrir Superfood Poznań")){
            firebaseFirestore.collection("Polska").document("Kawiarnia Sorrir Superfood Poznań").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Kawiarnia Sorrir Superfood Wrocław")){
            firebaseFirestore.collection("Polska").document("Kawiarnia Sorrir Superfood Wrocław").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Kawiarnia Zdrowe Ciacho")){
            firebaseFirestore.collection("Polska").document("Kawiarnia Zdrowe Ciacho").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("La Cantina")){
            firebaseFirestore.collection("Polska").document("La Cantina").collection("Ocena").add(ocena)
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
        else if(Region.equals("Świętokrzyskie") && Nazwa.equals("Lemon Tree")){
            firebaseFirestore.collection("Polska").document("Lemon Tree").collection("Ocena").add(ocena)
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
        else if(Region.equals("Kujawsko-pomorskie") && Nazwa.equals("Manufaktura Cukierków ")){
            firebaseFirestore.collection("Polska").document("Manufaktura Cukierków ").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Lodziarnia Kawiarnia IL MIJO")){
            firebaseFirestore.collection("Polska").document("Lodziarnia Kawiarnia IL MIJO").collection("Ocena").add(ocena)
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
        else if(Region.equals("Świętokrzyskie") && Nazwa.equals("Manufaktura Słodyczy & Kawiarnia Magia Karmelu")){
            firebaseFirestore.collection("Polska").document("Manufaktura Słodyczy & Kawiarnia Magia Karmelu").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Mommo good food")){
            firebaseFirestore.collection("Polska").document("Mommo good food").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Park Rekreacyjno-Biznesowy Las Woda")){
            firebaseFirestore.collection("Polska").document("Park Rekreacyjno-Biznesowy Las Woda").collection("Ocena").add(ocena)
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
        else if(Region.equals("Lubelskie") && Nazwa.equals("Pensjonat Lublinowe Wzgórze")){
            firebaseFirestore.collection("Polska").document("Pensjonat Lublinowe Wzgórze").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Pensjonat Restauracja Tajemniczy Ogród")){
            firebaseFirestore.collection("Polska").document("Pensjonat Restauracja Tajemniczy Ogród").collection("Ocena").add(ocena)
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
        else if(Region.equals("Lubelskie") && Nazwa.equals("Piekarnia Bezglutenowe domowe")){
            firebaseFirestore.collection("Polska").document("Piekarnia Bezglutenowe domowe").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Piekarnia POCHLEB")){
            firebaseFirestore.collection("Polska").document("Piekarnia POCHLEB").collection("Ocena").add(ocena)
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
        else if(Region.equals("Podlaskie") && Nazwa.equals("Pizzeria La Bella")){
            firebaseFirestore.collection("Polska").document("Pizzeria La Bella").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Pizzeria Pizza Naturalna")){
            firebaseFirestore.collection("Polska").document("Pizzeria Pizza Naturalna").collection("Ocena").add(ocena)
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
        else if(Region.equals("Śląskie") && Nazwa.equals("Placek plackarnio-naleśnikarnia")){
            firebaseFirestore.collection("Polska").document("Placek plackarnio-naleśnikarnia").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Restauracja Hotel & Spa Greno")){
            firebaseFirestore.collection("Polska").document("Restauracja Hotel & Spa Greno").collection("Ocena").add(ocena)
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
        else if(Region.equals("Podkarpackie") && Nazwa.equals("Restauracja Hotel Ambasadorski")){
            firebaseFirestore.collection("Polska").document("Restauracja Hotel Ambasadorski").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Restauracja Hotel Gościniec Sucholeski")){
            firebaseFirestore.collection("Polska").document("Restauracja Hotel Gościniec Sucholeski").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Restauracja Hotel Uroczysko Siedmiu Stawów")){
            firebaseFirestore.collection("Polska").document("Restauracja Hotel Uroczysko Siedmiu Stawów").collection("Ocena").add(ocena)
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
        else if(Region.equals("Śląskie") && Nazwa.equals("Restauracja Hurry Curry 1")){
            firebaseFirestore.collection("Polska").document("Restauracja Hurry Curry 1").collection("Ocena").add(ocena)
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
        else if(Region.equals("Śląskie") && Nazwa.equals("Restauracja Hurry Curry 2")){
            firebaseFirestore.collection("Polska").document("Restauracja Hurry Curry 2").collection("Ocena").add(ocena)
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
        else if(Region.equals("Śląskie") && Nazwa.equals("Restauracja Kassandra")){
            firebaseFirestore.collection("Polska").document("Restauracja Kassandra").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Restauracja Kochanówka")){
            firebaseFirestore.collection("Polska").document("Restauracja Kochanówka").collection("Ocena").add(ocena)
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
        else if(Region.equals("Podkarpackie") && Nazwa.equals("Restauracja Kulisy")){
            firebaseFirestore.collection("Polska").document("Restauracja Kulisy").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Restauracja La Calma")){
            firebaseFirestore.collection("Polska").document("Restauracja La Calma").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Restauracja La Maddalena")){
            firebaseFirestore.collection("Polska").document("Restauracja La Maddalena").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Restauracja Lemon")){
            firebaseFirestore.collection("Polska").document("Restauracja Lemon").collection("Ocena").add(ocena)
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
        else if(Region.equals("Zachodniopomorskie") && Nazwa.equals("Restauracja Mesa")){
            firebaseFirestore.collection("Polska").document("Restauracja Mesa").collection("Ocena").add(ocena)
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
        else if(Region.equals("Świętokrzyskie") && Nazwa.equals("Restauracja Mr.Potato")){
            firebaseFirestore.collection("Polska").document("Restauracja Mr.Potato").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Restauracja Oberża pod Drzwonkiem")){
            firebaseFirestore.collection("Polska").document("Restauracja Oberża pod Drzwonkiem").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Restauracja Patio")){
            firebaseFirestore.collection("Polska").document("Restauracja Patio").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Restauracja Pod Baranem")){
            firebaseFirestore.collection("Polska").document("Restauracja Pod Baranem").collection("Ocena").add(ocena)
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
        else if(Region.equals("Zachodniopomorskie") && Nazwa.equals("Restauracja Qchnia")){
            firebaseFirestore.collection("Polska").document("Restauracja Qchnia").collection("Ocena").add(ocena)
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
        else if(Region.equals("Podkarpackie") && Nazwa.equals("Restauracja Rejtana 1")){
            firebaseFirestore.collection("Polska").document("Restauracja Rejtana 1").collection("Ocena").add(ocena)
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
        else if(Region.equals("Dolnośląskie") && Nazwa.equals("Restauracja Rukola")){
            firebaseFirestore.collection("Polska").document("Restauracja Rukola").collection("Ocena").add(ocena)
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
        else if(Region.equals("Śląskie") && Nazwa.equals("Restauracja Taaka Ryba")){
            firebaseFirestore.collection("Polska").document("Restauracja Taaka Ryba").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Restauracja Vernus")){
            firebaseFirestore.collection("Polska").document("Restauracja Vernus").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Restauracja WieloPole 3")){
            firebaseFirestore.collection("Polska").document("Restauracja WieloPole 3").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Restauracja Wiesz co wiesz")){
            firebaseFirestore.collection("Polska").document("Restauracja Wiesz co wiesz").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Restauracja Zapiecek")){
            firebaseFirestore.collection("Polska").document("Restauracja Zapiecek").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Sklep Manufaktura Cukierków")){
            firebaseFirestore.collection("Polska").document("Sklep Manufaktura Cukierków").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Sklep Manufaktura cukierków")){
            firebaseFirestore.collection("Polska").document("Sklep Manufaktura cukierków").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Sushi Bar Miseczka Oshin")){
            firebaseFirestore.collection("Polska").document("Sushi Bar Miseczka Oshin").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("Sushi Wesola")){
            firebaseFirestore.collection("Polska").document("Sushi Wesola").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Też Można")){
            firebaseFirestore.collection("Polska").document("Też Mozna").collection("Ocena").add(ocena)
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
        else if(Region.equals("Mazowieckie") && Nazwa.equals("The Chef House")){
            firebaseFirestore.collection("Polska").document("The Chef House").collection("Ocena").add(ocena)
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
        else if(Region.equals("Wielkopolskie") && Nazwa.equals("Tinta Bar")){
            firebaseFirestore.collection("Polska").document("Tinta Bar").collection("Ocena").add(ocena)
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
        else if(Region.equals("Łódzkie") && Nazwa.equals("To&Owo Bezglutenowo")){
            firebaseFirestore.collection("Polska").document("To&Owo Bezglutenowo").collection("Ocena").add(ocena)
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
        else if(Region.equals("Śląskie") && Nazwa.equals("Tu i Teraz Burger & Cake")){
            firebaseFirestore.collection("Polska").document("Tu i Teraz Burger & Cake").collection("Ocena").add(ocena)
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
        else if(Region.equals("Małopolskie") && Nazwa.equals("Zakręcona Kawiarenka")){
            firebaseFirestore.collection("Polska").document("Zakręcona Kawiarenka").collection("Ocena").add(ocena)
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
        else if(Region.equals("Podlaskie") && Nazwa.equals("Zdrowa Micha - Bar Bistro")){
            firebaseFirestore.collection("Polska").document("Zdrowa Micha - Bar Bistro").collection("Ocena").add(ocena)
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

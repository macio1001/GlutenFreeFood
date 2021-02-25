package com.example.inzynierka;

import android.util.Log;
import android.widget.TextView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ShowRatingEmilia extends Main5Activity {
    List<Object> ocena = new ArrayList<>();
    float suma,wynik;
    public void pokazOcene(String Nazwa, String Region, TextView WynikRating) {
        firebaseFirestore = FirebaseFirestore.getInstance();
        if (Nazwa.equals("Ai Pioppi") && Region.equals("Emilia Romagna")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ai Pioppi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Al Cenacolo") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Cenacolo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Al Ciocco *** - Albergo Ristorante") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Ciocco *** - Albergo Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Al Petito") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Petito").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Al Poggio *** Hotel Ristorante") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Poggio *** Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Albergo K2 *** - Hotel Ristorante Bar") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Albergo K2 *** - Hotel Ristorante Bar").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Amarcord") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Amarcord").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("America Graffiti") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "America Graffiti").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("America Graffiti Country Dinner") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "America Graffiti Country Dinner").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Bodeguita-Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Bodeguita-Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("America Graffiti Fast Food") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "America Graffiti Fast Food").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("American Graffiti - Paninoteca") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "American Graffiti - Paninoteca").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("American Graffiti Dinner") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "American Graffiti Dinner").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("American Graffiti Fast Food c/o CinemaCity") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "American Graffiti Fast Food c/o CinemaCity").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Andrea's - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Andrea's - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Antica Pieve") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Antica Pieve").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Aragosta - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Aragosta - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Art Cafe") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Art Cafe").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bacio del Cimone - Prosciutteria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bacio del Cimone - Prosciutteria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bagno Astra - Ristorante Bar") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bagno Astra - Ristorante Bar").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bagno Malaika") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bagno Malaika").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bagno Vela") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bagno Vela").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bar Centrale") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bar Centrale").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Baraccone - Osteria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Baraccone - Osteria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bed And Breakfast 22 Garibaldi Home") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bed And Breakfast 22 Garibaldi Home").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bel Sit") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bel Sit").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Bella Napoli - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bella Napoli - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Borgo Novo - Albergo Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Borgo Novo - Albergo Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Caffe Con Te") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Caffe Con Te").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Caffe Pat 4") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Caffe Pat 4").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Capitan Bagati") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Capitan Bagati").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Casa Minelli - Agriturismo B&B") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Casa Minelli - Agriturismo B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Da Martino") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Da Martino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("De Risto-globo") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "De Risto-globo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Del Corso - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Del Corso - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Due Fratelli - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Due Fratelli - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Due Lune - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Due Lune - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Eric Catering Organization") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Eric Catering Organization").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Family Hotel Savini ****") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Family Hotel Savini ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Fricando Il Ristolocale") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Fricando Il Ristolocale").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Fusurari Cibi & Viaggi") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Fusurari Cibi & Viaggi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Gastronomia Dalla Manu") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Gastronomia Dalla Manu").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Gianni - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Gianni - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Guado - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Guado - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Harlow - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Harlow - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Ambra ***") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Ambra ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Cadiz ***") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Cadiz ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Corallo ***") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Corallo ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Mirage ***") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Mirage ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Napoleon Beach ***") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Napoleon Beach ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Nervia ***") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Nervia ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Nordic ***") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Nordic ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Hotel Ristorante Pizzeria Rossi") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Ristorante Pizzeria Rossi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("I Girasoli - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "I Girasoli - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("I Muretti - Agriturismo B&B") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "I Muretti - Agriturismo B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Il Caminetto - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Caminetto - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Il Cortile") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Cortile").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Il Delfino - Pizzeria e tavola calda") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Delfino - Pizzeria e tavola calda").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Il Forno di Roby - Gastronomia") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Forno di Roby - Gastronomia").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Il Mulino di Sopra") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Mulino di Sopra").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Il Poggiolo - Agriturismo B&B") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Poggiolo - Agriturismo B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Il Portico") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Portico").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Jack - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Jack - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("L'Anfora") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "L'Anfora").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("L'Angelo Azzurro") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Cenacolo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Barattina") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Cenacolo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Bodeguita - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Bodeguita - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Bottega Del Chisodino") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Bottega Del Chisodino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Dama Rossa gluten free") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Dama Rossa gluten free").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Dispensa Alternativa") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Dispensa Alternativa").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Fattoria Dama - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Fattoria Dama - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Grattugia") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Grattugia").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Locanda Gazzola") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Locanda Gazzola").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Mandragola") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Mandragola").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Noche - Freccia 92") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Noche - Freccia 92").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Nuobo Parco dei Ciliegi") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nuobo Parco dei Ciliegi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Pantera Rosa - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Pantera Rosa - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Pergola - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Pergola - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Razza - Agriturismo B&B") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Razza - Agriturismo B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Regina del Mercato") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Regina del Mercato").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Rocchetta - Agriturismo") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Rocchetta - Agriturismo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Roncole - Rstorante B&B") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Roncole - Rstorante B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Susheria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Susheria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("La Taverna Agriturismo") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Taverna Agriturismo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Lo Chalet - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Chalet - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Locanda Del Parco") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Del Parco").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Locanda San Fiorenza") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda San Fiorenza").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Locanda Vecchiacanala - Ristorante B&B") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Vecchiacanala - Ristorante B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Locanda del Parco a Villafreto") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda del Parco a Villafreto").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Los Locos - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Los Locos - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Mangiolino - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Mangiolino - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Matiss - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Matiss - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Mille Voglie - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Mille Voglie - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Molto Pizza - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Molto Pizza - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Osteria Pizzeria Da Biagio") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Pizzeria Da Biagio").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Osteria Stallo del Pomodoro - Ristorante Enoteca") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Stallo del Pomodoro - Ristorante Enoteca").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Osteria dei Golosi") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria dei Golosi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Osteria del Tempo Perso - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria del Tempo Perso - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pantera Rosa 1") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pantera Rosa 1").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pantera Rosa 2") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pantera Rosa 2").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pi Stop - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pi Stop - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pizz'Osteria da Mazza") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizz'Osteria da Mazza").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pizza Matta") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizza Matta").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pizzeria Itaca - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Itaca - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pizzeria Milana") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Milana").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pizzeria Osteria De Sgrazjid") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Osteria De Sgrazjid").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Podere Elisa") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Podere Elisa").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ponte Giorgi - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ponte Giorgi - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ponte di Ferro") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ponte di Ferro").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Pub Master Beer") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pub Master Beer").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Qi Sushi Lovers") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Qi Sushi Lovers").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ranch") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ranch").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Raphael Cafe") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Raphael Cafe").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Re Sale e Regina Salina") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Re Sale e Regina Salina").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Relais Cascina Scottina - Hotel RIstorante") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Relais Cascina Scottina - Hotel RIstorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Rios 2 Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Rios 2 Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Al 45") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Al 45").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Il Toscano") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Il Toscano").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Piedigrotta 2") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Piedigrotta 2").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Pizzeria Dribbling") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria Dribbling").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Pizzeria Le Quattro Rose") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria Le Quattro Rose").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Pizzeria Minelli") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria Minelli").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Pizzeria Spingarda") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria Spingarda").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Pizzeria del Firenze") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria del Firenze").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Ristorante Tennis Villa Carpena") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Tennis Villa Carpena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Sirena") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Sirena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Starbene Senza Glutine Cafe") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Starbene Senza Glutine Cafe").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Taverna Da Bruno - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Taverna Da Bruno - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Trattoria Pizzeria Vecchio Mercato") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria Pizzeria Vecchio Mercato").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Trattoria del Borgo") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria del Borgo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Trattoria del Campazzo") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria del Campazzo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if(Nazwa.equals("Twiga - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Twiga - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }
    }
}

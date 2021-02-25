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

public class ShowRatingPuglia extends Main5Activity {
    List<Object> ocena = new ArrayList<>();
    float suma,wynik;
    public void pokazOcene(String Nazwa, String Region, TextView WynikRating) {
        firebaseFirestore = FirebaseFirestore.getInstance();
        if(Region.equals("Puglia") && Nazwa.equals("Acapulco 2 - Ristorante Pizzeria")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Acapulco 2 - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Agriturismo Al Celone") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Agriturismo Al Celone").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Agriturismo Bernardi - Museo della Civilta Contadina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Agriturismo Bernardi - Museo della Civilta Contadina").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Al Borgo Antico B&B") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Borgo Antico B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Al Caminetto - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Caminetto - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Al Canale") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Canale").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Al Cantagallo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Acapulco 2 - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Al Capriccio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Capriccio - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Al Duomo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Duomo - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Al Porticiolo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Porticiolo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Al Primo Piano") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Primo Piano").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Al Vecchio Frantoio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Al Vecchio Frantoio - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Alex Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Alex Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Alighieri Eventi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Alighieri Eventi").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Alogne Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Alogne Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Altamarea") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Altamarea").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Altri Tempi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Altri Tempi").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Amadeus - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Amadeus - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Amadeus 95 L'Alternativa - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Amadeus 95 L'Alternativa - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Antica Cucina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Antica Cucina").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Antica Osterie - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Antica Osterie - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Antica Tenuta Cornacchia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Antica Tenuta Cornacchia").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Antichi Sapori") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Antichi Sapori ").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Antico Melograno") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Antico Melograno").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("B&B Villa Carla") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "B&B Villa Carla").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Bacco Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bacco Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Barna") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Barna").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Bella Capri - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bella Capri - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Benservito - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Benservito - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Best Western Hotel dei Cavalieri - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Best Western Hotel dei Cavalieri - Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Biffy - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Biffy - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Bonsai - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bonsai - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Borgo Antico - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Borgo Antico - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Box 19") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Box 19").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Bufi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Bufi").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Canneto Beach 2 - Ristorante Pizzeria Enoteca B&B") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Canneto Beach 2 - Ristorante Pizzeria Enoteca B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Cantina Don Carlo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Cantina Don Carlo - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Casa Salcone") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Casa Salcone").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Chrysalis - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Chrysalis - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Cibus Mazzini Lounge Bar Restaurant") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Cibus Mazzini Lounge Bar Restaurant").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Cool Garden - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Cool Garden - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Come Una Volta - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Come Una Volta - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Corte Corona - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Corte Corona - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Corte degli Aranci - Sala ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Corte degli Aranci - Sala ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Corte di Torrelonga - Sala ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Corte di Torrelonga - Sala ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Costa del Salento Village ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Costa del Salento Village ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Da Biagione - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Da Biagione - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Da Liberato") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Da Liberato").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Da Peppino - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Da Peppino - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Da Sciali") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Da Sciali").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Dalis Pizza & Wine - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Dalis Pizza & Wine - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Delicatesse - Ristorante Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Delicatesse - Ristorante Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Delicatesse - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Delicatesse - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Dentro le Mura") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Dentro le Mura").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Desiree - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Desiree - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Donna Gina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Donna Gina").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("El Bario Latino Beach - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "El Bario Latino Beach - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Est con Vineria e Cucina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Est con Vineria e Cucina").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Estia Ristorante Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Estia Ristorante Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Fiori di Zucca - Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Fiori di Zucca - Trattoria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Fondaco De'Guelfi Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Fondaco De'Guelfi Agriturismo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Food Center Ristore") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Food Center Ristore").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Funghi e Tartufi della Puglia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Funghi e Tartufi della Puglia").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Garden Plaza - Ristorante Pizzeria Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nazwa.equals(\"Garden Plaza - Ristorante Pizzeria Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ginevra") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ginevra").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Giubilo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Giubilo - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Gizero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Gizero").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Gluten Free Shop - Bar tavola calda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Gluten Free Shop - Bar tavola calda").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Grand Hotel Masseria Santa Lucia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Grand Hotel Masseria Santa Lucia").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Grand Hotel Terme") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Grand Hotel Terme").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Grand Hotel Tiziano e dei Congressi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Grand Hotel Tiziano e dei Congressi").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Green Elf - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Green Elf - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hakuna Osteria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hakuna Osteria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hilton Garden Inn**** - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hilton Garden Inn**** - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hosteria del Pardo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hosteria del Pardo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Al Faro") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Al Faro").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Bel Sit - Ristorante La Nuova Mandragora") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Bel Sit - Ristorante La Nuova Mandragora").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Corona ***") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Corona ***").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Il Quadrifoglio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Il Quadrifoglio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Le Muse - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Le Muse - Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Mille Pini ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Mille Pini ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Mirador") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Mirador").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Palace ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Palace ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Rondinelle") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Rondinelle").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel Sollievo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel Sollievo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel degli Aranci **** - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel degli Aranci **** - Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Hotel dei Bizantini - Ristorante Villaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Hotel dei Bizantini - Ristorante Villaggio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("I Melograni e Villaggio Baia degli Aranci ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "I Melograni e Villaggio Baia degli Aranci ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("I Nuovi Sapori - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "I Nuovi Sapori - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Balconcino") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Balconcino").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Banchetto degli Dei - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Banchetto degli Dei - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Botteghino - Pizzeria Tavola Calda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Botteghino - Pizzeria Tavola Calda").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Bracere") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Bracere").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Brigantino - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Brigantino - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Carbonaio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Carbonaio - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Cenacolo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Cenacolo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Forno di Cristo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Forno di Cristo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Grillo *** - Hotel RIstorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Grillo *** - Hotel RIstorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Guazzetto Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Guazzetto Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Melograno") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Melograno").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Piatto Fumante - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Piatto Fumante - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Sapore Perfetto") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Sapore Perfetto").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Timone - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Timone - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Tramonto - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Tramonto - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Vecchio Gazebo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Vecchio Gazebo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Veliero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Veliero").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Il Ventaglio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Ventaglio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("In Fiera - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "In Fiera - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("International - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "International - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Isola Verde - Hotel Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Isola Verde - Hotel Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("L'Angolo Nascosto") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "L'Angolo Nascosto").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("L'Oasi di Claire - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "L'Oasi di Claire - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("L'Orsa Maggiore - RIstorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "L'Orsa Maggiore - RIstorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("L'Osteria in Piazza") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "L'Osteria in Piazza").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Buca dei 13 - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Buca dei 13 - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Buona Luna - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Buona Luna - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Campina de Don Paulu - Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Campina de Don Paulu - Agriturismo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Cascina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Cascina").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Chiusa di Chiestri **** - Hotel Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Chiusa di Chiestri **** - Hotel Ristorante Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Dolce Vita - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Dolce Vita - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Foggia - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Il Guazzetto Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Laterna - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Laterna - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Locanda di Hansel") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Locanda di Hansel").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Piazzetta") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Piazzetta").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Piccola Botte - Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Piccola Botte - Trattoria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Puglia in Tavola") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Puglia in Tavola").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Rotonda Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Rotonda Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Selva - Ristorante Pizzeria Paninoteca") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Selva - Ristorante Pizzeria Paninoteca").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Tradizione Cucina Casalinga - Osteria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Tradizione Cucina Casalinga - Osteria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Valle di Pietra Luna - Sala ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Valle di Pietra Luna - Sala ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("La Villa di Lucullo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Villa di Lucullo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Lama San Giorgio - Agriturismo Ristorante Hotel") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lama San Giorgio - Agriturismo Ristorante Hotel").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Lanternella Pub - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lanternella Pub - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Le Arcate") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Le Arcate").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Le Diomedee - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Le Diomedee - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Le Veneri") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Le Veneri").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Lido S.Francesco alla Rena - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lido S.Francesco alla Rena - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Lo Scacciapensieri **** - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Scacciapensieri **** - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Lo Scrigno") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Scrigno").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Lo Smeraldo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Smeraldo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Lo Sturno Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Sturno Trattoria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Locanda Riccomaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Riccomaggio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Marc'Aurelio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Marc'Aurelio - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Masseria La Grottella - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Masseria La Grottella - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Masseria Protomastro") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Masseria Protomastro").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Masseria Sant'Oronzo - Hotel Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Masseria Sant'Oronzo - Hotel Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Melficta") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Melficta").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Mercure Villa Romanazzi Carducci **** - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Mercure Villa Romanazzi Carducci **** - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Mezzopieno") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Mezzopieno").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Miramonte Party - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Miramonte Party - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Montevicoli - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Montevicoli - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Nettuno Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nettuno Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("New Lions Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "New Lions Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("New Palace Sempione - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "New Palace Sempione - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Nuova Sala Paradiso - Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nuova Sala Paradiso - Ristorante Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Nuovo Centaro") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nuovo Centaro").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Nuovo Gabbiano - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nuovo Gabbiano - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Nymphaeum - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nymphaeum - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Oltre L'Arco - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Oltre L'Arco - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Osteria La Giara") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria La Giara").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Osteria del Pero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria del Pero").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Osteria della Divina Provvidenza") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria della Divina Provvidenza").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Pagoda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pagoda").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Palazzo D'Auria Secondo - Ristorante Pizzeria B&B") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Palazzo D'Auria Secondo - Ristorante Pizzeria B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Pan D'Oro New - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pan D'Oro New - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Panoramico **** - Hotel Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Panoramico **** - Hotel Ristorante Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Parco Serrone - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Parco Serrone - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Park Hotel La Grave") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Park Hotel La Grave").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Park Hotel Villa Americana") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Park Hotel Villa Americana").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Penny") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Penny").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Petit Roy Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Petit Roy Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Pic Nic - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pic Nic - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Pietra Antica - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pietra Antica - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Pino Giorgio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pino Giorgio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Pizzeria Capri - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Capri - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Poesia di Pasta - Tavola Calda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Poesia di Pasta - Tavola Calda").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Posta Bassi - Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Posta Bassi - Agriturismo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Premiata Pizzeria - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Premiata Pizzeria - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Prima o Poi - RIstorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Prima o Poi - RIstorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Primo - Bar Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Primo - Bar Trattoria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Relais Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Relais Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Residence Calalunga") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Residence Calalunga").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Regio Hotel Manfredi - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Regio Hotel Manfredi - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Albergo L'Antico Frantoio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Albergo L'Antico Frantoio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Castello Monaci") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Castello Monaci").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Gizero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Gizero").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante La Villetta") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante La Villetta").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Le Cese") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Le Cese").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Modo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Modo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Pizzeria Calici di Bacco") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria Calici di Bacco").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Pizzeria De Amicis") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria De Amicis").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Ristorante Pizzeria Santa Lucia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria Santa Lucia").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Riva Marina Resort - Villaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Riva Marina Resort - Villaggio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Riva del Sole - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Riva del Sole - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Riviera Hotel-Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Riviera Hotel-Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("San Domenico - Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "San Domenico - Trattoria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("San Tommaso - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "San Tommaso - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Saracino Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Saracino Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Sciarabba - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Sciarabba - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Selva Reale - Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Selva Reale - Agriturismo").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Sheraton Nicolaus Hotel **** - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Sheraton Nicolaus Hotel **** - Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Specchia Sant'Oronzo - Ristorante Pizzeria Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Specchia Sant'Oronzo - Ristorante Pizzeria Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Spiaggia Lunga - Ristorante Villaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Spiaggia Lunga - Ristorante Villaggio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Stuzzicami Vero Salentino - Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Stuzzicami Vero Salentino - Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Sud Hotel - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Sud Hotel - Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Taverna Brancaleone") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Taverna Brancaleone").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Taverna Pane e Vino") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Taverna Pane e Vino").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Tenuta Calivello") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tenuta Calivello").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Tenuta Donna Lavinio - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tenuta Donna Lavinio - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Tenuta San Francesco - Hotel Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tenuta San Francesco - Hotel Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Torre Giulia - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Torre Giulia - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Traetta - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Traetta - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Trattoria Il Buongustaio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria Il Buongustaio").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Trattoria Sole e Luna") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria Sole e Luna").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Tre Archi - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tre Archi - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Tre Tulli - Albergo Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tre Tulli - Albergo Ristorante Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Twins") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Twins").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("U.p.e.p.i.d.d.e") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "U.p.e.p.i.d.d.e").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Una Hotel Resigna") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Una Hotel Resigna").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Upendi - Pizzeria Osteria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Upendi - Pizzeria Osteria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Bianchi - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Bianchi - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Carafa - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Carafa - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Carmine - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Carmine - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Degli Aranci - Ristorante Pizzeria Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Degli Aranci - Ristorante Pizzeria Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Dei Fiori - Ristorante Pizzeria Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Dei Fiori - Ristorante Pizzeria Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Dei Gourmets *** - Hotel Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Dei Gourmets *** - Hotel Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Demetra - B&B Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Demetra - B&B Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Jamele - Sala Ricevimento") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Jamele - Sala Ricevimento").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Villa Maria - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Maria - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Maria - Sala Ricevimenti Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Maria - Sala Ricevimenti Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villa Petruscio - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Petruscio - Sala Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villaggio Camping 5 Stelle") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villaggio Camping 5 Stelle").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Villaggio S.Giovanni - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villaggio S.Giovanni - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Vittoria Parc Hotel") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Vittoria Parc Hotel").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Volo Restaurant") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Volo Restaurant").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        else if(Nazwa.equals("Vox Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Vox Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
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
        }else if(Nazwa.equals("Zonno Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Zonno Ricevimenti").addSnapshotListener(new EventListener<QuerySnapshot>() {
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

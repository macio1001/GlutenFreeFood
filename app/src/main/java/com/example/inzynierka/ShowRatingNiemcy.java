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

public class ShowRatingNiemcy extends Main5Activity {
    List<Object> ocena=new ArrayList<>();
    float suma;
    float wynik;
    public void pokazOcene(String Nazwa, String Region, TextView WynikRating) {
        firebaseFirestore = FirebaseFirestore.getInstance();
        if(Region.equals("Berlin") && Nazwa.equals("BLOCK HOUSE Am Alexanderplatz - SteakHouse")){
            firebaseFirestore.collection("Niemcy").whereEqualTo("Nazwa", "BLOCK HOUSE Am Alexanderplatz - SteakHouse").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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
        else if(Region.equals("Hessen") && Nazwa.equals("BLOCK HOUSE Franfurt Westend")){
            firebaseFirestore.collection("Niemcy").whereEqualTo("Nazwa", "BLOCK HOUSE Franfurt Westend").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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
        else if(Region.equals("Sachsen") && Nazwa.equals("Landhotel Dresden")){
            firebaseFirestore.collection("Niemcy").whereEqualTo("Nazwa", "Landhotel Dresden").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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
        else if(Region.equals("Hessen") && Nazwa.equals("MAREDO SteakHouse")){
            firebaseFirestore.collection("Niemcy").whereEqualTo("Nazwa", "MAREDO SteakHouse").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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
        else if(Region.equals("Hessen") && Nazwa.equals("Mongo's Restaurant")){
            firebaseFirestore.collection("Niemcy").whereEqualTo("Nazwa", "Mongo's Restaurant").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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
        else if(Region.equals("Berlin") && Nazwa.equals("Pizzeria Cielo di Berlino")){
            firebaseFirestore.collection("Niemcy").whereEqualTo("Nazwa", "Pizzeria Cielo di Berlino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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
        else if(Region.equals("Hessen") && Nazwa.equals("Pizzeria Sicilia")){
            firebaseFirestore.collection("Niemcy").whereEqualTo("Nazwa", "Pizzeria Sicilia").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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

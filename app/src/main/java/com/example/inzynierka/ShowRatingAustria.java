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

public class ShowRatingAustria extends Main5Activity {
    List<Object> ocena=new ArrayList<>();
    float suma;
    float wynik;
    public void pokazOcene(String Nazwa, String Region, TextView WynikRating) {
        firebaseFirestore= FirebaseFirestore.getInstance();
        if(Region.equals("Kärnten") && Nazwa.equals("**** Hotel Kaiser Franz Josef")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","**** Hotel Kaiser Franz Josef").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("BOSEK'S Salt & Sugar")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","BOSEK'S Salt & Sugar").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Gasthof Thanner")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Gasthof Thanner").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Hotel Kitzhof Mountain Design Resort ****")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Hotel Kitzhof Mountain Design Resort ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Hotel Berner Zell am See ****")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Hotel Berner Zell am See ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Hotel Goldener Adler ****")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Hotel Goldener Adler ****").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Tyrol") && Nazwa.equals("Hotel LAMARK")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Hotel LAMARK").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Kärnten") && Nazwa.equals("Hotel SONNALM")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Hotel SONNALM").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Hotel Stadt Wien")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Hotel Stadt Wien").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Naturhotel Forsthofgut")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Naturhotel Forsthofgut").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Wien") && Nazwa.equals("Ristorante Pizzeria Scarabocchio")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Ristorante Pizzeria Scarabocchio").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
        else if(Region.equals("Salzburg") && Nazwa.equals("Steakhaus Schusterhaeusl Restaurant")){
            firebaseFirestore.collection("Austria").whereEqualTo("Nazwa","Steakhaus Schusterhaeusl Restaurant").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma+=doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG,"Ocena: "+ocena+"Suma: "+suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }});
        }
    }
}

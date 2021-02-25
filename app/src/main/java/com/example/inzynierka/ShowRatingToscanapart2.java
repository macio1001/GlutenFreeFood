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

public class ShowRatingToscanapart2 extends Main5Activity {
    List<Object> ocena = new ArrayList<>();
    float suma,wynik;
    public void pokazOcene(String Nazwa, String Region, TextView WynikRating) {
        firebaseFirestore = FirebaseFirestore.getInstance();
        if (Nazwa.equals("La Torre di Gargonza - Hotel Ristorante") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Torre di Gargonza - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("La Torricella") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Torricella").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("La Tufa - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Tufa - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("La Vecchia Lira - Enoteca Osteria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Vecchia Lira - Enoteca Osteria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("La Vecchia Oliviera - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Vecchia Oliviera - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("La Ventola - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Ventola - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("La Viola  - Travola Fredda") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Viola  - Travola Fredda").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("La Volpe e L'Uva - Osteria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "La Volpe e L'Uva - Osteria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Lanternina 2 di Palmieri") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lanternina 2 di Palmieri").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Le Fontanelle Albergo Ristorante") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Le Fontanelle Albergo Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Le Lance") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Le Lance").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Le Scuderie de l'Antinoro - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Le Scuderie de l'Antinoro - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Le Vecchie Mura B&B") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Le Vecchie Mura B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Leonardo Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Leonardo Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Lo Scoglietto") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Scoglietto").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Lo Scricciolo") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Scricciolo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Lo Scrigno") && Region.equals("Toscana")) {
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
        }else if (Nazwa.equals("Lo Spigo - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Spigo - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Lo Strettorio - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lo Strettorio - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Locanda Buatino") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Buatino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Locanda Pandivia - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Pandivia - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Locanda Toscani da Sempre") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Toscani da Sempre").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Locanda del Boccio") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda del Boccio").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Locanda Milu") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Milu").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Lowengrube Pub") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Lowengrube Pub").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Luigi's Burger & Burritos") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Luigi's Burger & Burritos").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Magica Pizza City") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Magica Pizza City").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Mamey Firenze Ovest") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Mamey Firenze Ovest").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Mangiar Bene Tavola Calda Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Mangiar Bene Tavola Calda Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Marechiaro - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Marechiaro - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Martina Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Martina Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Millevoglie senza glutine - Paninoteca") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Millevoglie senza glutine - Paninoteca").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Minerva **** Hotel") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Minerva **** Hotel").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Miva Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Miva Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Miva di Piu - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Miva di Piu - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Monte di Rose") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Monte di Rose").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Nappino") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Nappino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("New Age Cafe - Tavola Calda") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "New Age Cafe - Tavola Calda").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Non Solo Caffe - Tavola Calda Bar") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Non Solo Caffe - Tavola Calda Bar").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Nuobo Parco dei Ciliegi") && Region.equals("Toscana")) {
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
        }else if (Nazwa.equals("Oasi Al Lago") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Oasi Al Lago").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Oasi Spondone") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Oasi Spondone").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ombra della Sera") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ombra della Sera").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ostella Foresteria Santa Maria dei Servi") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ostella Foresteria Santa Maria dei Servi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria De Nichi") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria De Nichi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria Il Giardino di Piero") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Il Giardino di Piero").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria La Vecchia Fornace") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria La Vecchia Fornace").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria Locanda Il Casolare") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Locanda Il Casolare").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria Nero di Seppia") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Nero di Seppia").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria Pian di Laura") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Pian di Laura").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria Piansa") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Piansa").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria Ristorante Cinque di Vino") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Ristorante Cinque di Vino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Locanda Milu") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Locanda Milu").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria Vecchio Mulino") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria Vecchio Mulino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria da Mangiafoco - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria da Mangiafoco - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria dell'Arancia") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria dell'Arancia").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria di Rendola") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria di Rendola").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Osteria la Gramola - Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Osteria la Gramola - Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Panino Vegano") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Panino Vegano").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Paninoteca Lo Scirocco") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Paninoteca Lo Scirocco").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Passepartout Il Ristorante") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Passepartout Il Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pepe Nero") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pepe Nero").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Perbacco Risorante") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Perbacco Risorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Petit Hotel - Ristorante Piattofondo") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Petit Hotel - Ristorante Piattofondo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Piadineria The Roll") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Piadineria The Roll").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Piazza del Vino - Enoteca") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Piazza del Vino - Enoteca").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Piccola Oasi - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Piccola Oasi - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizza Man - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizza Man - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizza Man - Ristorante Pizzeria ") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizza Man - Ristorante Pizzeria ").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizzeria - Trattoria Toscana") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria - Trattoria Toscana").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizzeria Felice - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Felice - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizzeria Man - Doctor Pizza - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Man - Doctor Pizza - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizzeria Pasquale - Ristorante") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Pasquale - Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizzeria Ristorante Happyland") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Ristorante Happyland").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pizzeria Ristorante I Tarocchi") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pizzeria Ristorante I Tarocchi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Podere Pendolino By Albatros B&B") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Podere Pendolino By Albatros B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pomodoro Pachino - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pomodoro Pachino - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ps Ristorante Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ps Ristorante Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Pubblius") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Pubblius").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Renaissance Tuscany Il Ciocco Resort & Spa") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Renaissance Tuscany Il Ciocco Resort & Spa").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristopizza Continental") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristopizza Continental").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Albergaccio di Castellina") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Albergaccio di Castellina").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Babette") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Babette").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Ca'Del Moro") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Ca'Del Moro").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Celide") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Celide").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Club Pennone") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Club Pennone").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Da Diva") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Da Diva").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Da Mirko") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Da Mirko").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Gallo Nero") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Gallo Nero").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Giglio") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Giglio").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante I Cinque Sensi") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante I Cinque Sensi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante I Tre Rioni B&B") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante I Tre Rioni B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Il Poggetto") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Il Poggetto").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Il Tiramestoli") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Il Tiramestoli").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Ivana e Daniela") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Ivana e Daniela").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante La 16") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante La 16").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante La Fortezza") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante La Fortezza").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Lupo Cantero") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Lupo Cantero").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Nonna Rosa - Hotel Rosati") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Nonna Rosa - Hotel Rosati").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Pantagruel") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pantagruel").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Pizza In da Franco") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizza In da Franco").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Pizzeria L'Acquapazza") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria L'Acquapazza").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Pizzeria La Cantina") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria La Cantina").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Pizzeria La Mareggiata") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria La Mareggiata").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Pizzeria Matam") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Pizzeria Matam").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Poggiocavallo") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Poggiocavallo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante Sabatini") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante Sabatini").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante da Mordicchio") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante da Mordicchio").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Ristorante del Campeggio Le Esperidi") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Ristorante del Campeggio Le Esperidi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Sabrina - Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Sabrina - Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("San Ranieri Hotel") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "San Ranieri Hotel").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Santarpia Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Santarpia Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Sapori Senza Glutine - Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Sapori Senza Glutine - Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Scaraboci") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Scaraboci").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Silvio La Storia a Tavola") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Silvio La Storia a Tavola").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Sinatra - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Sinatra - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Star Bene Senza Glutine") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Star Bene Senza Glutine").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Succo D'Uva Enoteca") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Succo D'Uva Enoteca").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Tapinassi Bar Tavola Calda e Fredda") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tapinassi Bar Tavola Calda e Fredda").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Tavola Calda e Fredda Bar Baraonda") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tavola Calda e Fredda Bar Baraonda").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Tenuta dei Cabalieri") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tenuta dei Cabalieri").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Terzotempo") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Terzotempo").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("The Club House") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "The Club House").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Tiffany - Hotel Ristorante") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Tiffany - Hotel Ristorante").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Trattoria Mamma Rosa") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria Mamma Rosa").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Trattoria Pizzeria La Capanna") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria Pizzeria La Capanna").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Trattoria da Garibaldi") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Trattoria da Garibaldi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Vicolo Dei Golosi") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Vicolo Dei Golosi").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Villa Barberino") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Barberino").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Villa Edera B&B") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Edera B&B").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Villa Le Rondini") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Le Rondini").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Villa Palagione centro interculturale") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa Palagione centro interculturale").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Villa delle Mimose") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villa delle Mimose").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Villaggio Capalbio") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Villaggio Capalbio").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Walter Redaelli") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Walter Redaelli").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Wellness Center Casanova") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Wellness Center Casanova").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Yabadabaduu - Ristorante Pizzeria") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Yabadabaduu - Ristorante Pizzeria").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Zenzero - Catering") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Zenzero - Catering").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
                                    wynik=Math.round(wynik);
                                    wynik/=100;
                                    WynikRating.setText(String.valueOf(wynik));
                                }
                            });
                        }

                    }
                }
            });
        }else if (Nazwa.equals("Zero") && Region.equals("Toscana")) {
            firebaseFirestore.collection("Włochy").whereEqualTo("Nazwa", "Zero").addSnapshotListener(new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        Log.d("", "Error : " + e.getMessage());
                    }
                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                        if (doc.getType() == DocumentChange.Type.ADDED) {
                            Log.d(TAG, doc.getDocument().getId());
                            doc.getDocument().getReference().collection("Ocena").orderBy("Ocena").addSnapshotListener(new EventListener<QuerySnapshot>() {
                                @Override
                                public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                                    if (e != null) {
                                        Log.d("", "Error : " + e.getMessage());
                                    }

                                    for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {
                                        if (doc.getType() == DocumentChange.Type.ADDED) {
                                            ocena.add(doc.getDocument().get("Ocena"));
                                            suma += doc.getDocument().getDouble("Ocena");

                                        }
                                    }
                                    Log.d(TAG, "Ocena: " + ocena + "Suma: " + suma);
                                    wynik=suma/ocena.size();
                                    wynik*=100;
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

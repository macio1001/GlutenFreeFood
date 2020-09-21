package com.example.inzynierka;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

import androidx.annotation.NonNull;

public class Piemonte extends Main5Activity {
    Main5Activity main7Activity;
    public void dodajOcene(){
        if(Nazwa.equals("20 Regioni - Bar Cucina Shop") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("20 Regioni - Bar Cucina Shop").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agriturismo Al Pum Rus") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Agriturismo Al Pum Rus").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agriturismo Oryza") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Agriturismo Oryza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agriturismo Suri") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Agriturismo Suri").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Binario 20") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Al Binario 20").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Buon Ricordo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Al Buon Ricordo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Ghiottone") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Al Ghiottone").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Grassi") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Al Grassi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Gufo Nero") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Al Gufo Nero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Rustico") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Al Rustico").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Setaccio") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Al Setaccio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Albergo Ristorante La Corte") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Albergo Ristorante La Corte").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Albergo S.Giovanni - Ristorante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Albergo S.Giovanni - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Alfredo Cucina & Vino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Alfredo Cucina & Vino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Alpigrill") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Alpigrill").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("America Graffiti") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("America Graffiti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("America Graffiti") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("America Graffiti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Amici di Pentola") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Amici di Pentola").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antica Osteria Il Monte Rosso") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Antica Osteria Il Monte Rosso").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antica Piazza Delle Grida") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Antica Piazza Delle Grida").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antica Trattoria con Calma") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Antica Trattoria con Calma").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antico Ca' d'Gamba") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Antico Ca' d'Gamba").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Arcimboldo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Arcimboldo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Banqueting Catering") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Banqueting Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bar di Soto - Tavola Calda") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Bar di Soto - Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bargiglio Rosso") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Bargiglio Rosso").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Belvedere Resort") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Belvedere Resort").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Billy Bau") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Billy Bau").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Caffe Alessandrino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Caffe Alessandrino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Caffe Ristorante Albergo Stazione") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Caffe Ristorante Albergo Stazione").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Caffe del Chiostro") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Caffe del Chiostro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Caffetteria del Corso - Tavola Calda") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Caffetteria del Corso - Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Campagna Verde") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Campagna Verde").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Campanaro") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Campanaro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cascina Pianborga - Agriturismo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Cascina Pianborga - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cascina Vrona - Agriturismo B&B") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Cascina Vrona - Agriturismo B&B").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Castello dei Solaro Ristorante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Castello dei Solaro Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Chez Toi") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Chez Toi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Curryzone Ristorante Indiano Pakistano") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Curryzone Ristorante Indiano Pakistano").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Frankino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Da Frankino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Zio - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Da Zio - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Dalla Padella alla Brace") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Dalla Padella alla Brace").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("De Kip Braserie") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("De Kip Braserie").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Domus - Hotel Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Domus - Hotel Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Duca 102 Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Duca 102 Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Due Lanterne") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Due Lanterne").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Edenatura") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Edenatura").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Enoteca Caffa Roma") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Enoteca Caffa Roma").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Enoteca Caffe Rocca Costantino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Enoteca Caffe Rocca Costantino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Eremo della Gasprina") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Eremo della Gasprina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Etable Ristorante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Etable Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Farenheit 451 - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Farenheit 451 - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fattoria delle Rose - Agriturismo Trattoria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Fattoria delle Rose - Agriturismo Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fior di Zucca - Agriturismo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Fior di Zucca - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("FlyFood") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("FlyFood").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fungo Reale") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Fungo Reale").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gli Amici") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Gli Amici").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gran Balta - Hotel Ristorante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Gran Balta - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hosteria Alpina") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Hosteria Alpina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hosteria La Ciau") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Hosteria La Ciau").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Atlantic - Ristorante Il Rubino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Hotel Atlantic - Ristorante Il Rubino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Bel Verde") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Hotel Bel Verde").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Chelsea *** - Ristorante La Campana") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Hotel Chelsea *** - Ristorante La Campana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Il Convento - Ristorante Massimo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Hotel Il Convento - Ristorante Massimo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Ristorante I Castelli") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Hotel Ristorante I Castelli").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("I Sapori - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("I Sapori - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Canonico - Catering") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Canonico - Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Drago e la Fata") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Drago e la Fata").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Faggio - Catering") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Faggio - Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Giardino Pensile") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Giardino Pensile").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Giardino dei Sapori") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Giardino dei Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Girone dei Golosi") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Girone dei Golosi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Gusto di Camilla") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Gusto di Camilla").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Melograno") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Melograno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Mondo in Valle B&B") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Mondo in Valle B&B").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Mulino di Mattie") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Mulino di Mattie").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Pianeta 2000") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Pianeta 2000").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Pithosforo - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Pithosforo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Provenzale - Ristorante Pizzeria Catering") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Provenzale - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Sagittario Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Sagittario Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Valdichiesa da Enzo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Valdichiesa da Enzo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Valentino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Valentino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Vicolo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Vicolo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Io e Luna") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Io e Luna").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Isola Felice - Agriturismo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Isola Felice - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Kipling Restaurant") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Kipling Restaurant").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Angolo di Rosina") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("L'Angolo di Rosina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Escalier - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("L'Escalier - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Ormeggio") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("L'Ormeggio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Orologio") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("L'Orologio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Osteria di Mario") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("L'Osteria di Mario").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Ultima Spiaggia") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("L'Ultima Spiaggia c/o Aquarium").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("LA.TI.MI.DA. - Agriturismo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("LA.TI.MI.DA. - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Barique") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Barique").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Barrique") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Barrique").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Borsarella - Ristorante Enotea") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Borsarella - Ristorante Enotea").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Botte - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Botte - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Bussola - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Bussola - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cantina in Collina - Agriturismo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Cantina in Collina - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cascata") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Cascata").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cascinetta") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Cascinetta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Gallina Bionda") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Gallina Bionda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Greppia") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Greppia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Lantena") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Lantena").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Lenza") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Lenza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Loanda dei Narcisi - Catering") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Loanda dei Narcisi - Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Marenda Sinoira") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Marenda Sinoira").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Medusa - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Medusa - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Pace - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Pace - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Panoramica - Trattoria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Panoramica - Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Pigna - Ristorante Hotel") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Pigna - Ristorante Hotel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Piola") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Piola").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Piramide - Trattoria Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Piramide - Trattoria Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Raviola Galante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Raviola Galante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Romantica") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Romantica").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Rosa dei Vini") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Rosa dei Vini").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Rustica - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Rustica - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Salimera") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Salimera").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Stella Polare - Agriturismo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Stella Polare - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Tagliata") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Tagliata").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Tavola del Chiostro") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Tavola del Chiostro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Terrazza") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Terrazza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Torre") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Torre").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Torre") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("La Torre").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Las Rosas - Cucina Messicana") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Las Rosas - Cucina Messicana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Las Rosas Restaurante - Cucina Messicana") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Las Rosas Restaurante - Cucina Messicana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Quattro Stagioni d'Italia - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Le Quattro Stagioni d'Italia - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Specialita - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Le Specialita - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Les Gourmas") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Les Gourmas").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lievito Madre e Puro Latte") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Lievito Madre e Puro Latte").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lo Scoglio - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Lo Scoglio - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda Del Terzo Tempo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Locanda Del Terzo Tempo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda Pane e Vino B&B") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Locanda Pane e Vino B&B").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda San Roch") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Locanda San Roch").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda Vecchio Novecento") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Locanda Vecchio Novecento").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda del Pentegallo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Locanda del Pentegallo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lou Lindal") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Lou Lindal").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("M**Bun") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("M**Bun").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("M**Bun") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("M**Bun ").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Mediterraneo = Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Mediterraneo = Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Mondo Bio - Tavola Calda") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Mondo Bio - Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Monferrato Resort") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Monferrato Resort").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Monte Cimolo - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Monte Cimolo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nazionale") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Nazionale").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nero Seppia") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Nero Seppia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("New Dinamo - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("New Dinamo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Noe - Ristorante Pizzeria - Gelateria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Noe - Ristorante Pizzeria - Gelateria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nonsolovino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Nonsolovino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nouvo Monarca") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Nouvo Monarca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Novotel Torino - Novotel Cafe **** - Hotel Ristorante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Novotel Torino - Novotel Cafe **** - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nuova Gandolfi") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Nuova Gandolfi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("ORCHIDEA") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("ORCHIDEA").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Oasi - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Oasi - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Oasi dello Chef") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Oasi dello Chef").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Orchidea") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Orchidea").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Osteria del Musicante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Osteria del Musicante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pamperfocaccia") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pamperfocaccia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Panta Rei") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Panta Rei").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Park Hotel Ristorante Villa Nasi") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Park Hotel Ristorante Villa Nasi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Perbacco") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Perbacco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Piemonte Catering") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Piemonte Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pinocchio") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pinocchio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizza Konnection") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pizza Konnection").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Da Michi") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Da Michi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Ristoro Queendici") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Ristoro Queendici").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Settimo Cielo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Settimo Cielo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Stella") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Stella").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Capriccio di Tiziana") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Il Capriccio di Tiziana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pontida Trattoria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Pontida Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Prima Dolci") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Prima Dolci").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Relais Ristorante La Corte") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Relais Ristorante La Corte").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Rifugio Jumarre") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Rifugio Jumarre").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristopizza Nuovi Sapori") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristopizza Nuovi Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Al Gottardo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Al Gottardo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Boschetto") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Boschetto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Campana") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Campana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Crea") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Crea").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Equin'ozio") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Equin'ozio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Hotel Celestino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Hotel Celestino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Novarello") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Novarello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Palazzo Boglietti") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Palazzo Boglietti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Dell'Olmo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Dell'Olmo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Eporediese") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Eporediese").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria I Due Forni") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria I Due Forni").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria La Fenice") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria La Fenice").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Laura") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Laura").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Napoli") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Napoli").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Sorbole") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Sorbole").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Ranch") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Ranch").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Rene") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Rene").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Sushi Bar Long Jin di Yunana") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Sushi Bar Long Jin di Yunana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Tanti") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Tanti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Vecchia Brenta") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante Vecchia Brenta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante del Castello") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Ristorante del Castello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Roma - Ristorante Pizzeria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Roma - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("S. Rocco - Hotel Ristorante") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("S. Rocco - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("S.Antonio") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("S.Antonio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Saluteria") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Saluteria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Saperlo") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Saperlo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sapordivino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Sapordivino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sayuri Sushi Bar") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Sayuri Sushi Bar").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Self Service Il Chiostro") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Self Service Il Chiostro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Soup & Go") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Soup & Go").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Statuto da Carmen") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Statuto da Carmen").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tenuta Carretta") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Tenuta Carretta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Torino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Torino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tosa Restaurant House") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Tosa Restaurant House").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria Cavallino Bianco") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria Cavallino Bianco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria La Terrazza") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria La Terrazza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria Pizzeria Piazza Grande") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria Pizzeria Piazza Grande").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria Raffaello 5") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria Raffaello 5").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria Risorgimento") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria Risorgimento").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria del Bivio B&B") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria del Bivio B&B").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria del Freisa") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria del Freisa").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria del Porto") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria del Porto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria del Roero") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Trattoria del Roero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio Gofree") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Villaggio Gofree").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Vineria Angolo Divino") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Vineria Angolo Divino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Wild River") && Region.equals("Piemonte")){
            firebaseFirestore.collection("Włochy").document("Wild River").collection("Ocena").document().set(ocena)
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

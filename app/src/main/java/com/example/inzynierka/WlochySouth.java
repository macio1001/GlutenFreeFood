package com.example.inzynierka;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

import androidx.annotation.NonNull;

public class WlochySouth extends Main5Activity {
    Main5Activity main7Activity;
    public void dodajOcene(){
        if(Nazwa.equals("A Regola D'Arte") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("A Regola D'Arte").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Acquapark Conte - Paninoteca") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Acquapark Conte - Paninoteca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agostiniana Hotel ****") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Agostiniana Hotel ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ai Vecchietti - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ai Vecchietti - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Girasole - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Al Girasole - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Nord Est - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Al Nord Est - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Nuovo Muretto - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Al Nuovo Muretto - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Pantanelli - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Al Pantanelli - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Ponte") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Al Ponte").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Ritrovo Hotel e Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Al Ritrovo Hotel e Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Vecchio Manero - Ristorante Pizzeria Catering") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Al Vecchio Manero - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Algila Ortigia Charmel Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Algila Ortigia Charmel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antico Baglio - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Antico Baglio - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Armony Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Armony Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Azienda Agrituristica il Pescheto") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Azienda Agrituristica il Pescheto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Azienda Di Turismo Rur. Belvedere") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Azienda Di Turismo Rur. Belvedere").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Baby Luna - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Baby Luna - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bar di Maggio - Tavola Calda") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Bar di Maggio - Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bar tavola calda Al Canale") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Bar tavola calda Al Canale").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Barbecue - Ristorante Catering") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Barbecue - Ristorante Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bellavista - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Bellavista - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bottega Gastronomica") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Bottega Gastronomica").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("C'e Pizza per Te") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("C'e Pizza per Te").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Caffe Lanzoni") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Caffe Lanzoni").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Casale Drinzi") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Casale Drinzi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Case Perrotta") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Case Perrotta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Contino Ristorazione") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Contino Ristorazione").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cozzeria Solemare") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Cozzeria Solemare").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cuccagna In - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Cuccagna In - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cuccania 5 - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Cuccania 5 - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Natale - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Da Natale - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Peppe - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Da Peppe - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Tonino - Ristorante Pizzeria Creperia") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Da Tonino - Ristorante Pizzeria Creperia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("De Paris - Trattoria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("De Paris - Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Diana Catering") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Diana Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Divini Restaurant - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Divini Restaurant - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Don Carmelo - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Don Carmelo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Don Guto Cucina Brasiliana") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Don Guto Cucina Brasiliana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Due Palme - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Due Palme - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Eurialo e Niso") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Eurialo e Niso").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Faro dei Corsari - Sala Ricevimenti") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Faro dei Corsari - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fattoria Fabio") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Fattoria Fabio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Feudo Delizia") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Feudo Delizia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fontana Murata - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Fontana Murata - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fud Sud Gruop c/o Sicily Outlet") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Fud Sud Gruop").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("G&B - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("G&B - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Giardini di Noto - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Giardini di Noto - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Giardino di Bacco") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Giardino di Bacco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gna' Sara - Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Gna' Sara - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gran Caffe del Duomo - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Gran Caffe del Duomo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gulliver - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Gulliver - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Haiku") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Haiku").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hostaria del Vicolo") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Hostaria del Vicolo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Noto Marina ***") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Hotel Noto Marina ***").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("I Giardini di Noto") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("I Giardini di Noto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("I Marchesi S.Barbara") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("I Marchesi S.Barbara").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("5 Gradini") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("5 Gradini").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("A Cannarutia - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("A Cannarutia - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("A Tijana") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("A Tijana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("A Ruga") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("A.Ruga").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agriturismo Feudo Gagliardi") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Agriturismo Feudo Gagliardi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agriturismo Villa Santa Caterina") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Agriturismo Villa Santa Caterina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Favaloro - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Al Favaloro - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Mangiar Sano") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Al Mangiar Sano").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Mulino") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Al Mulino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Vicoletto") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Al Vicoletto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Albatros") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Albatros").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Albergo Residence Villa Brazzano") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Albergo Residence Villa Brazzano").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antichi Sapori") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Antichi Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antico Rustico") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Antico Rustico").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Arca di Joli") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Arca di Joli").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Armaca") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Armaca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Associazione Accademia della pizza Italiana La Brace") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Associazione Accademia della pizza Italiana La Brace").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("B&B Musolino - La Civetta") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("B&B Musolino - La Civetta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bacchus") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Bacchus").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Baia Degli Dei - Beach Resort & Spa") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Baia Degli Dei - Beach Resort & Spa").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Baia Dei Greci") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Baia Dei Greci").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Baia del Capo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Baia del Capo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Baia dell'Est") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Baia dell'Est").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Baylik") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Baylik").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Birreria Tato's") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Birreria Tato's").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Black Bar") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Black Bar").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bram Hotel") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Bram Hotel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Brillo Parlante") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Brillo Parlante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Calipso") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Calipso").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cardel ***") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Cardel ***").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Catering Center - Catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Catering Center - Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Catering La Bottega del Senza Glutine") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Catering La Bottega del Senza Glutine").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Circolo Ricreativo Villeggiante") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Circolo Ricreativo Villeggiante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Convivio di Hera - Hotel Ristorante Agriturismo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Convivio di Hera - Hotel Ristorante Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Costaraba") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Costaraba").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Elia - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Da Elia - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Torino - tavola calda e catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Da Torino - tavola calda e catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("De La Ville *** Hotel Ristorante") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("De La Ville *** Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Eat and Drink - Pizzeria e Catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Eat and Drink - Pizzeria e Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Excalibur") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Excalibur").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Feudo degli Ulivi") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Feudo degli Ulivi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Free Time") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Free Time").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gambero Rosso") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Gambero Rosso (RC)").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gio Celiachia") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Gio Celiachia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Glut Word") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Glut Word").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Grand H. Paradiso") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Grand H. Paradiso").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Happy Pizza") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Happy Pizza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hostaria Antico Borgo - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hostaria Antico Borgo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hostaria dei Campi") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hostaria dei Campi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Biafora") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Biafora").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Club Poseidon") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Club Poseidon").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Cristina ***") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Cristina ***").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Duchessa Della Sila ****") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Duchessa Della Sila ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Europa") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Europa").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel La Tonnara") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel La Tonnara").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Lido degli Scogli") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Lido degli Scogli").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Presidente - Hotel Ristorante") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Presidente - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Regina - Hotel Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Regina - Hotel Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Ristorante Le Fate dei Fiori") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Ristorante Le Fate dei Fiori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Ristorante Sagapo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Ristorante Sagapo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Torino") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Hotel Torino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Borgo del Principe ****") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Borgo del Principe ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antica Villa") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Antica Villa").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fior di Pizza Italiana") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Fior di Pizza Italiana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fontanili") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Fontanili").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gambero Rosso") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Gambero Rosso").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("H. Park Grumentum") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("H. Park Grumentum").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Heraclea Hotel Residence ****") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Heraclea Hotel Residence ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Ristorante Miramonti") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Hotel Ristorante Miramonti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hurricane") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Hurricane").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("I sapori senza glutine") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("I sapori senza glutine").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Acapulco 2 - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Acapulco 2 - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agriturismo Al Celone") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Agriturismo Al Celone").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Agriturismo Bernardi - Museo della Civilta Contadina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Agriturismo Bernardi - Museo della Civilta Contadina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Borgo Antico B&B") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Borgo Antico B&B").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Caminetto - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Caminetto - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Canale") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Canale").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Cantagallo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Cantagallo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Capriccio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Capriccio - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Duomo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Duomo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Porticiolo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Porticiolo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Primo Piano") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Primo Piano").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Vecchio Frantoio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Al Vecchio Frantoio - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Alex Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Alex Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Alighieri Eventi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Alighieri Eventi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Alogne Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Alogne Ristorante").collection("Ocena").document().set(ocena)
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

        else if(Nazwa.equals("Altamarea") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Altamarea").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Altri Tempi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Altri Tempi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Amadeus - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Amadeus - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Amadeus 95 L'Alternativa - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Amadeus 95 L'Alternativa - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antica Cucina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Antica Cucina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antica Osterie - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Antica Osterie - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antica Tenuta Cornacchia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Antica Tenuta Cornacchia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antichi Sapori") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Antichi Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Antico Melograno") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Antico Melograno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("B&B Villa Carla") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("B&B Villa Carla").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bacco Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Bacco Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Barna") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Barna").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bella Capri - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Bella Capri - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Benservito - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Benservito - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Best Western Hotel dei Cavalieri - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Best Western Hotel dei Cavalieri - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Biffy - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Biffy - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bonsai - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Bonsai - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Borgo Antico - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Borgo Antico - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Box 19") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Box 19").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Bufi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Bufi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Canneto Beach 2 - Ristorante Pizzeria Enoteca B&B") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Canneto Beach 2 - Ristorante Pizzeria Enoteca B&B").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cantina Don Carlo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Cantina Don Carlo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Casa Salcone") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Casa Salcone").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Chrysalis - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Chrysalis - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cibus Mazzini Lounge Bar Restaurant") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Cibus Mazzini Lounge Bar Restaurant").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Cool Garden - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Cool Garden - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Corte Corona - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Corte Corona - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Corte degli Aranci - Sala ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Corte degli Aranci - Sala ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Corte di Torrelonga - Sala ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Corte di Torrelonga - Sala ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Costa del Salento Village ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Costa del Salento Village ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Biagione - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Da Biagione - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Liberato") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Da Liberato").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Peppino - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Da Peppino - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Sciali") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Da Sciali").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Dalis Pizza & Wine - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Dalis Pizza & Wine - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Delicatesse - Ristorante Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Delicatesse - Ristorante Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Delicatesse - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Delicatesse - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Dentro le Mura") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Dentro le Mura").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Desiree - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Desiree - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Donna Gina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Donna Gina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("El Bario Latino Beach - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("El Bario Latino Beach - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Est con Vineria e Cucina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Est con Vineria e Cucina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Estia Ristorante Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Estia Ristorante Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fiori di Zucca - Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Fiori di Zucca - Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Fondaco De'Guelfi Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Fondaco De'Guelfi Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Food Center Ristore") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Food Center Ristore").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Funghi e Tartufi della Puglia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Funghi e Tartufi della Puglia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Garden Plaza - Ristorante Pizzeria Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Garden Plaza - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ginevra") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ginevra").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Giubilo - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Giubilo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gizero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Gizero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Gluten Free Shop - Bar tavola calda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Gluten Free Shop - Bar tavola calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Grand Hotel Masseria Santa Lucia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Grand Hotel Masseria Santa Lucia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Grand Hotel Terme") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Grand Hotel Terme").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Grand Hotel Tiziano e dei Congressi") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Grand Hotel Tiziano e dei Congressi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Green Elf - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Green Elf - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hakuna Osteria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hakuna Osteria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hilton Garden Inn**** - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hilton Garden Inn**** - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hosteria del Pardo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hosteria del Pardo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Al Faro") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Al Faro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Bel Sit - Ristorante La Nuova Mandragora") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Bel Sit - Ristorante La Nuova Mandragora").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Corona ***") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Corona ***").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Il Quadrifoglio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Il Quadrifoglio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Le Muse - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Le Muse - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Mille Pini ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Mille Pini ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Mirador") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Mirador").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Palace ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Palace ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Rondinelle") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Rondinelle").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Sollievo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel Sollievo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel degli Aranci **** - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel degli Aranci **** - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel dei Bizantini - Ristorante Villaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Hotel dei Bizantini - Ristorante Villaggio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("I Melograni e Villaggio Baia degli Aranci ****") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("I Melograni e Villaggio Baia degli Aranci ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("I Nuovi Sapori - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("I Nuovi Sapori - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Balconcino") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Balconcino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Banchetto degli Dei - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Banchetto degli Dei - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Botteghino - Pizzeria Tavola Calda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Botteghino - Pizzeria Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Bracere") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Bracere").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Brigantino - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Brigantino - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Al Ghiottone") && Region.equals("Molise")){
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
        else if(Nazwa.equals("Da Giulio") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Da Giulio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Da Torino") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Da Torino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Evergreen - Ristorante Pizzeria") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Evergreen - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Grand Hotel Europa") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Grand Hotel Europa").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Holiday - Hotel Ristorante") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Holiday - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Donguglielmo") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Hotel Donguglielmo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Hotel Ristorante Parco delle Stelle") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Hotel Ristorante Parco delle Stelle").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Binario dei Sapori") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Il Binario dei Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Capriccio") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Capriccio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Carbonaio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Carbonaio - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Carpaccio") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Carpaccio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Casale Osteria Tipica") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Casale Osteria Tipica").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Castello Di Bacco - Ristorante Enoteca") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Il Castello Di Bacco - Ristorante Enoteca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Cenacolo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Cenacolo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Drago") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Drago").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Faro") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Faro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Fedino - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Il Fedino - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Forno di Cristo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Forno di Cristo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Furano") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Furano").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Gallo d'Oro") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Gallo d'Oro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Gazebo") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Il Gazebo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Ghiottone") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Ghiottone").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Giardinetto del Volturno") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Il Giardinetto del Volturno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Giardino dei Sensi") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Giardino dei Sensi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Grillo *** - Hotel RIstorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Grillo *** - Hotel RIstorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Guazzetto Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Guazzetto Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Gufo - Paninoteca") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Gufo - Paninoteca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Gusto") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Gusto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Melograno") && Region.equals("Puglia")){
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
        else if(Nazwa.equals("Il Palazzo Catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Palazzo Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Parco degli Ulivi") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Il Parco degli Ulivi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Piatto Fumante - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Piatto Fumante - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Podere **** Hotel Spa Restaurant") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Il Podere **** Hotel Spa Restaurant").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Porto") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Porto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Ristoro del Milionario") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Il Ristoro del Milionario").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Ritrovo - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Ritrovo - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Rombo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Rombo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Sapore Perfetto") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Sapore Perfetto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Sombrero") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Sombrero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Sombrero") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Sombrero (Amantea)").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il South - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Il South - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Timone - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Timone - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Torrente - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Il Torrente - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Tramonto - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Tramonto - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Vecchio Detto - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Vecchio Detto - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Vecchio Frantoio") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Vecchio Frantoio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Vecchio Gazebo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Vecchio Gazebo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Vecchio Mulino - Ristorante Pizzeria") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Il Vecchio Mulino - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Veliero") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Il Veliero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Veliero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Veliero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Il Ventaglio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Il Ventaglio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("In Fiera - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("In Fiera - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("International - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("International - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Isola Verde - Hotel Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Isola Verde - Hotel Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Jaluk - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Jaluk - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("King - Trattoria Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("King - Trattoria Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Krataiis - Hotel Ristorante Sala Ricevimenti") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Krataiis - Hotel Ristorante Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Abbuffata - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("L'Abbuffata - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Accademia") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Accademia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Acquolina in Boca - Tavola Calda Paninoteca") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("L'Acquolina in Boca - Tavola Calda Paninoteca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Angelo Biondo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Angelo Biondo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Angolo Nascosto") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("L'Angolo Nascosto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Antica Ciambra") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Antica Ciambra").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Antico Casale - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Antico Casale - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Arancino D'oro") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("L'Arancino D'oro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Arcipelago del Gusto") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Arcipelago del Gusto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Atmosphere") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Atmosphere").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Elfo") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("L'Elfo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Etoile - Catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Etoile - Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Europa - Ristorante Pizzeria Catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Europa - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Icontro - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("L'Icontro - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Oasi") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Oasi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Oasi di Claire - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("L'Oasi di Claire - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Orsa Maggiore - RIstorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("L'Orsa Maggiore - RIstorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Orso Cattivo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("L'Orso Cattivo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Ossidiana - Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("L'Ossidiana - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("L'Osteria in Piazza") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("L'Osteria in Piazza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Altre Farine del Mulino") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Altre Farine del Mulino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Baia di Caminia") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Baia di Caminia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Bodeguita - Ristorante Pizzeria") && Region.equals("Emilia Romagna")){
            firebaseFirestore.collection("Włochy").document("La Bodeguita - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Brace") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Brace").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Buca dei 13 - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Buca dei 13 - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Buona Luna - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Buona Luna - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cabana - Europark") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Cabana - Europark").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Campina de Don Paulu - Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Campina de Don Paulu - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cantina di Emilio") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Cantina di Emilio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cantina di Rosapepe") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("La Cantina di Rosapepe").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cascina") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Cascina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cascina - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Cascina - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cascina - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Cascina - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Caverna del Mastro Birraio") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Caverna del Mastro Birraio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Chinta - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Chinta - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Chiusa di Chiestri **** - Hotel Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Chiusa di Chiestri **** - Hotel Ristorante Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Collina Verde") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Collina Verde").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Collina degli Ulivi") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Collina degli Ulivi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Collinetta - Ristorante Pizzeria Catering") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Collinetta - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Conchiglia") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Conchiglia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Corte - Trattoria Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Corte - Trattoria Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Corte dei Mangioni") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Corte dei Mangioni").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Corte dei Sapori") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Corte dei Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Corte di Eolo") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Corte di Eolo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Cucciarda - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Cucciarda - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Delizie - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Delizie - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Dolce Vita - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Dolce Vita - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Falconara") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Falconara").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Foggia - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Foggia - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Fontanella") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Fontanella").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Laterna - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Laterna - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Locanda") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("La Locanda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Locanda dei Frati") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Locanda dei Frati").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Locanda di Hansel") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Locanda di Hansel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Locanda di Marcello - Hotel Ristorante Sala Ricevimenti") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Locanda di Marcello - Hotel Ristorante Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Madonnina") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Madonnina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Madonnina - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Madonnina - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Mimosa - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Mimosa - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Napoletana") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Napoletana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Nuit") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("La Nuit").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Pergamena") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Pergamena").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Perla Jonica") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Perla Jonica").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Piazzetta") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Piazzetta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Piazzetta - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Piazzetta - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Piccola Botte - Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Piccola Botte - Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Pignanella") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Pignanella").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Pineta - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Pineta - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Polena") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Polena").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Puglia in Tavola") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Puglia in Tavola").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Rada") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Rada").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Rondine") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Rondine").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Rosa Dei Venti") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Rosa Dei Venti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Rotonda Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Rotonda Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Rupe - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Rupe - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Saracena") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Saracena").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Scogliera") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Scogliera").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Selva - Ristorante Pizzeria Paninoteca") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Selva - Ristorante Pizzeria Paninoteca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Taverna Di Bacco - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Taverna Di Bacco - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Tavernaccia - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Tavernaccia - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Tavola di Melusinda") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Tavola di Melusinda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Terrazza by Emilio") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("La Terrazza by Emilio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Tonnara - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Tonnara - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Torretta di Federico") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Torretta di Federico").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Tradizione Cucina Casalinga - Osteria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Tradizione Cucina Casalinga - Osteria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Trizzera - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("La Trizzera - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Valle di Pietra Luna - Sala ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Valle di Pietra Luna - Sala ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("La Villa di Lucullo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("La Villa di Lucullo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Labbro Rosso - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Labbro Rosso - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lago Grande") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Lago Grande").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lama San Giorgio - Agriturismo Ristorante Hotel") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Lama San Giorgio - Agriturismo Ristorante Hotel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lanternella Pub - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Lanternella Pub - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Arcate") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Le Arcate").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Caprice - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Le Caprice - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Cisterne - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Le Cisterne - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Diomedee - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Le Diomedee - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Giare - Hotel Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Le Giare - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Lanterne - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Le Lanterne - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Palme") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Le Palme").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Rose") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Le Rose").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Terrazze Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Le Terrazze Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Le Veneri") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Le Veneri").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Les Amis - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Les Amis - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Licchio's Bar Tavola Calda") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Licchio's Bar Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lido Dello Stretto") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Lido Dello Stretto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lido El Sombrero") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Lido El Sombrero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lido On The Beach") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Lido On The Beach").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lido S.Francesco alla Rena - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Lido S.Francesco alla Rena - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lido Sogno") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Lido Sogno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lo Scacciapensieri **** - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Lo Scacciapensieri **** - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lo Scrigno") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Lo Scrigno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lo Smeraldo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Lo Smeraldo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lo Sturno Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Lo Sturno Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda Mammi") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Locanda Mammi").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda Riccomaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Locanda Riccomaggio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Locanda al Giglio D'Oro") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Locanda al Giglio D'Oro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Lulu") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Lulu").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Marc'Aurelio - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Marc'Aurelio - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Masseria La Grottella - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Masseria La Grottella - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Masseria Monte Pizzi - Hotel Ristorante") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Masseria Monte Pizzi - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Masseria Protomastro") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Masseria Protomastro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Masseria Sant'Oronzo - Hotel Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Masseria Sant'Oronzo - Hotel Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Max - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Max - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Mediterraneo Palace Hotel") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Mediterraneo Palace Hotel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Melficta") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Melficta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Mercure Villa Romanazzi Carducci **** - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Mercure Villa Romanazzi Carducci **** - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Metro") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Metro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Metropolis - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Metropolis - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Mezzopieno") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Mezzopieno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Miramare") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Miramare (CZ)").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Miramonte Party - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Miramonte Party - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Mondo Pizza - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Mondo Pizza - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Montevicoli - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Montevicoli - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Morsi e Sorsi - Ristorante Pizzeria Paninoteca") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Morsi e Sorsi - Ristorante Pizzeria Paninoteca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Museum Center - Tavola Calda") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Museum Center - Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("My Dream") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("My Dream").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nabila - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Nabila - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Naif - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Naif - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Naif Pizzeria Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Naif Pizzeria Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nanni") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Nanni").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nero di Cenere") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Nero di Cenere").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nettuno") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Nettuno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nettuno Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Nettuno Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("New Dino's Hotel - Hotel Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("New Dino's Hotel - Hotel Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("New Lions Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("New Lions Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("New Palace Sempione - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("New Palace Sempione - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nonna Giulia - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Nonna Giulia - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Number One") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Number One").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nuova Sala Paradiso - Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Nuova Sala Paradiso - Ristorante Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nuovo Centaro") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Nuovo Centaro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nuovo Gabbiano - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Nuovo Gabbiano - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Nymphaeum - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Nymphaeum - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Olmicello") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Olmicello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Oltre L'Arco - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Oltre L'Arco - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Orto della Signora") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Orto della Signora").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Osteria La Giara") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Osteria La Giara").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Osteria Pane olio e sale") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Osteria Pane olio e sale").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Osteria del Pero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Osteria del Pero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Osteria del Vicolo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Osteria del Vicolo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Osteria della Divina Provvidenza") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Osteria della Divina Provvidenza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pagoda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Pagoda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Paladina") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Paladina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Palagarden") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Palagarden").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Palazzo D'Auria Secondo - Ristorante Pizzeria B&B") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Palazzo D'Auria Secondo - Ristorante Pizzeria B&B").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pan D'Oro New - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Pan D'Oro New - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Paninoteca Cala") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Paninoteca Cala").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Paninoteca Malvasia") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Paninoteca Malvasia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Panoramico **** - Hotel Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Panoramico **** - Hotel Ristorante Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Panoramik") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Panoramik").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Parco Attrezzato L'Abete Bianco") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Parco Attrezzato L'Abete Bianco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Parco Attrezzato Monte Covello") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Parco Attrezzato Monte Covello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Parco Serrone - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Parco Serrone - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Parco degli Ulivi Rume - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Parco degli Ulivi Rume - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Parco dei Principi - Sala Ricevimento") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Parco dei Principi - Sala Ricevimento").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Park H. Mirabeau") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Park H. Mirabeau").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Park Hotel") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Park Hotel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Park Hotel La Grave") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Park Hotel La Grave").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Park Hotel Villa Americana") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Park Hotel Villa Americana").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pascia") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Pascia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Penny") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Penny").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pepper Jam Cafe") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Pepper Jam Cafe").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Per Bacco") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Per Bacco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Petit Roy Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Petit Roy Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pic Nic - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Pic Nic - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pietra Antica - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Pietra Antica - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pietrabianca") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Pietrabianca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pietre Nere Resort") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Pietre Nere Resort").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pino Giorgio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Pino Giorgio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizza New - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Pizza New - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizza Taxi - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Pizza Taxi - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizza Time") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Pizza Time").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizza d'Autore") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Pizza d'Autore").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Capri - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Capri - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Da Paride") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Da Paride").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Milano - Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Milano - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Pizzeria Ristorante Mentirosa") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Pizzeria Ristorante Mentirosa").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Poesia di Pasta - Tavola Calda") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Poesia di Pasta - Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Poggio del Sole **** - Hotel Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Poggio del Sole **** - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Poggio del Tempo Perduto - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Poggio del Tempo Perduto - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Popilia Country Resort ****") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Popilia Country Resort ****").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Porta d'Accesso del Parco") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Porta d'Accesso del Parco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Posta Bassi - Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Posta Bassi - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Premiata Pizzeria - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Premiata Pizzeria - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Prima o Poi - RIstorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Prima o Poi - RIstorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Prima o Pol") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Prima o Pol").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Primo - Bar Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Primo - Bar Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Primopiano - Ristorante Pizzeria Catering Sala Ricevimenti") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Primopiano - Ristorante Pizzeria Catering Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Punto Ics - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Punto Ics - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Il Genio dei Sapori") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("RIstorante Il Genio dei Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ranch Sound - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ranch Sound - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Regent Hotel - Ristorante Pizzeria Catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Regent Hotel - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Regio Hotel Manfredi - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Regio Hotel Manfredi - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Relais Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Relais Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Residence Calalunga") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Residence Calalunga").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Residence Paradise") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Residence Paradise").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Rewind") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Rewind").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Rifugio Husky - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Rifugio Husky - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Rigoletto") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Rigoletto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Rist Dragut / H.La Fortezza - Hotel Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Rist Dragut / H.La Fortezza - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Albergo L'Antico Frantoio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Albergo L'Antico Frantoio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Bella Blu") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Bella Blu").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Borgo Murauto - Catering") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Borgo Murauto - Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Castello Monaci") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Castello Monaci").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Gizero") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Gizero").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Il Fornello") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Il Fornello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Il Saraceno") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Il Saraceno").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante L'Affresco") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Ristorante L'Affresco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante L'a Gourmet") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante L'a Gourmet").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante La Villetta") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante La Villetta").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Le Cese") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Le Cese").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Modo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Modo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Al Terrazzo") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Al Terrazzo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Calici di Bacco") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Calici di Bacco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Da Rocco") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Da Rocco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria De Amicis") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria De Amicis").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Duetto") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Duetto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Il Cantastorie") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Il Cantastorie").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria La Pirainella") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria La Pirainella").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria La Terrazza") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria La Terrazza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Netser") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Netser").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Santa Lucia") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Santa Lucia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Pizzeria Scacco Matto") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Pizzeria Scacco Matto").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Stella Marina") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante Stella Marina").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante Via Roma Vecchia") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ristorante Via Roma Vecchia").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante dal Cozzaro") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ristorante dal Cozzaro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante l'Oasi del Gabbiano") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante l'Oasi del Gabbiano").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristorante pizzeria Da Paura") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Ristorante pizzeria Da Paura").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ristoro Saluto Pizzeria Tavola Calda") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Ristoro Saluto Pizzeria Tavola Calda").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Riva Marina Resort - Villaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Riva Marina Resort - Villaggio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Riva del Sole - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Riva del Sole - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Riviera Hotel - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Riviera Hotel - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Rosa Blu - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Rosa Blu - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Rossana - Ristorante Pizzeria") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Rossana - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("S.Martino de Kamerata") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("S.Martino de Kamerata").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sa Nicolo - Osteria Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Sa Nicolo - Osteria Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sachsenhausen - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Sachsenhausen - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sala Garden") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Sala Garden").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("San Domenico - Trattoria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("San Domenico - Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("San Leonardo Resort **** - Hotel Ristorante") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("San Leonardo Resort **** - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("San Marco") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("San Marco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("San Tommaso - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("San Tommaso - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sancho Panza - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Sancho Panza - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Santo's") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Santo's").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sapere e Sapori") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Sapere e Sapori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Saracino Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Saracino Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sciarabba - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Sciarabba - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Scuderie La Rana - Agriturismo") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Scuderie La Rana - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Selva Reale - Agriturismo") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Selva Reale - Agriturismo").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sheraton Catania Hotel") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Sheraton Catania Hotel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sheraton Nicolaus Hotel **** - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Sheraton Nicolaus Hotel **** - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sicilia Nostra") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Sicilia Nostra").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sir Damian - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Sir Damian - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sognadoro") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Sognadoro").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sole Mediterraneo Resort") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Sole Mediterraneo Resort").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sole di Mezzanotte") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Sole di Mezzanotte").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Solero Beach") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Solero Beach").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Specchia Sant'Oronzo - Ristorante Pizzeria Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Specchia Sant'Oronzo - Ristorante Pizzeria Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Spiaggia Lunga - Ristorante Villaggio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Spiaggia Lunga - Ristorante Villaggio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Stuzzicami Vero Salentino - Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Stuzzicami Vero Salentino - Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Sud Hotel - Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Sud Hotel - Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Talia Zucchero e Sale - Paninoteca") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Talia Zucchero e Sale - Paninoteca").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Taverna Brancaleone") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Taverna Brancaleone").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Taverna Pane e Vino") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Taverna Pane e Vino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Taverna Paradiso") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Taverna Paradiso").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tavola calda Da Beppe") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Tavola calda Da Beppe").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tenuta Calivello") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Tenuta Calivello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tenuta Calivello") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Tenuta Calivello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tenuta San Francesco - Hotel Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Tenuta San Francesco - Hotel Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tenuta Villa Dei Fiori") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Tenuta Villa Dei Fiori").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Terra & Mare - Trattoria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Terra & Mare - Trattoria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Terravecchia - Ristorante Pizzeria") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Terravecchia - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Torre Giulia - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Torre Giulia - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tortuga Pub") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Tortuga Pub").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Toto e Peppino") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Toto e Peppino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Traetta - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Traetta - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria Il Buongustaio") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Trattoria Il Buongustaio").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria Peccati di Gola") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Trattoria Peccati di Gola").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trattoria Sole e Luna") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Trattoria Sole e Luna").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tre Archi - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Tre Archi - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tre Tulli - Albergo Ristorante Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Tre Tulli - Albergo Ristorante Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Trinkhous - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Trinkhous - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Tropical") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Tropical").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Twins") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Twins").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("U' Cafisu") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("U' Cafisu").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("U.p.e.p.i.d.d.e") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("U.p.e.p.i.d.d.e").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Ulisse - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Ulisse - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Una Hotel Resigna") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Una Hotel Resigna").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Upendi - Pizzeria Osteria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Upendi - Pizzeria Osteria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Vagabunda - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Vagabunda - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Valle Di Mare Resort **** - Hotel Ristorante") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Valle Di Mare Resort **** - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Vecchia Taverna") && Region.equals("Molise")){
            firebaseFirestore.collection("Włochy").document("Vecchia Taverna").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Vila Rigoletto - Sala Ricevimenti") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Vila Rigoletto - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Bianchi - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Bianchi - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Carafa - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Carafa - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Carmine - Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Carmine - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Degli Aranci - Ristorante Pizzeria Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Degli Aranci - Ristorante Pizzeria Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Dei Fiori - Ristorante Pizzeria Catering") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Dei Fiori - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Dei Gourmets *** - Hotel Ristorante Pizzeria") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Dei Gourmets *** - Hotel Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Demetra - B&B Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Demetra - B&B Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Donna Mazza") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villa Donna Mazza").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Ermenegilda - B&B Ristorante") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villa Ermenegilda - B&B Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Jamele - Sala Ricevimento") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Jamele - Sala Ricevimento").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Maria - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Maria - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Maria - Sala Ricevimenti Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Maria - Sala Ricevimenti Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Mirador") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Villa Mirador").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Petruscio - Sala Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villa Petruscio - Sala Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villa Teresa - Ristorante Pizzeria") && Region.equals("Sicilia")){
            firebaseFirestore.collection("Włochy").document("Villa Teresa - Ristorante Pizzeria").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio Airone Resort") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villaggio Airone Resort").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio Camping 5 Stelle") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villaggio Camping 5 Stelle").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio Giardini d'Oriente") && Region.equals("Basilicata")){
            firebaseFirestore.collection("Włochy").document("Villaggio Giardini d'Oriente").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio Hotel Tonicello") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villaggio Hotel Tonicello").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio Pineta Petto Bianco") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villaggio Pineta Petto Bianco").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio Ristorante Scoglio della Galea") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villaggio Ristorante Scoglio della Galea").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villaggio S.Giovanni - Hotel Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Villaggio S.Giovanni - Hotel Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villagio Estella Club") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villagio Estella Club").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Villeggiante Da Ciccino") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Villeggiante Da Ciccino").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Vittoria Parc Hotel") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Vittoria Parc Hotel").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Volo Restaurant") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Volo Restaurant").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Vox Ristorante") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Vox Ristorante").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("White House") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("White House").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Windy Hill") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Windy Hill").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Winter Cactus - Ristorante Pizzeria Catering") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Winter Cactus - Ristorante Pizzeria Catering").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Zonno Ricevimenti") && Region.equals("Puglia")){
            firebaseFirestore.collection("Włochy").document("Zonno Ricevimenti").collection("Ocena").document().set(ocena)
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
        else if(Nazwa.equals("Zza Rosi") && Region.equals("Calabria")){
            firebaseFirestore.collection("Włochy").document("Zza Rosi").collection("Ocena").document().set(ocena)
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

package com.example.inzynierka;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextClock;
import android.widget.Toast;


import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.inzynierka.R.id.google_login;
import static com.example.inzynierka.R.id.start;


public class MainActivity extends AppCompatActivity {

    EditText email,haslo;
    Button login,logingoogle,loginfacebook;
    FirebaseAuth firebaseAuth;
    private int RC_SIGN_IN = 123;
    private int permissions=0;
    private GoogleSignInClient googleSignInClient;
    Boolean gosc=false;

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser uzytkownik = firebaseAuth.getCurrentUser();
        if(uzytkownik!=null){
            Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.emailLoginText);
        haslo = findViewById(R.id.hasloLoginText);
        login = findViewById(R.id.LoginButton);
        logingoogle = findViewById(R.id.google_login);
        loginfacebook=findViewById(R.id.facebook_login);

        firebaseAuth=FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String Email = email.getText().toString();
                String Haslo = haslo.getText().toString();
                if (!TextUtils.isEmpty(Email) && !TextUtils.isEmpty(Haslo)) {
                    firebaseAuth.signInWithEmailAndPassword(Email, Haslo)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        if (firebaseAuth.getCurrentUser().isEmailVerified()) {
                                            startActivity(new Intent(MainActivity.this, Main3Activity.class));
                                        } else {
                                            Toast.makeText(MainActivity.this, getString(R.string.verifyemail),
                                                    Toast.LENGTH_LONG).show();
                                        }
                                    } else {
                                        Toast.makeText(MainActivity.this, task.getException().getMessage(),
                                                Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                }
            }
        });
    }


    public void Rejestracja(View view){
          startActivity(new Intent(this, Main2Activity.class));
    }

    public void Przypomnij(View view){
         startActivity(new Intent(this, Main6Activity.class));
    }

    public void Gosc(View view) {
         startActivity(new Intent(this,Main3Activity.class));
    }
}

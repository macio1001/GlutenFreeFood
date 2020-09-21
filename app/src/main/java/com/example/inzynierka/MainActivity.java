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

        GoogleSignInOptions googleSignInOptions=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .requestIdToken(getString(R.string.default_web_client_id))
                .build();

        googleSignInClient=GoogleSignIn.getClient(this,googleSignInOptions);

        logingoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
    }

    private void signIn(){
        Intent signInIntent=googleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent,0);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                if (account != null) {
                    firebaseAuthWithGoogle(account);
                } else{
                    Log.w("AUTH", "Account is NULL");
                    Toast.makeText(MainActivity.this, "Sign-in failed, try again later.", Toast.LENGTH_LONG).show();
                }
            } catch (ApiException e) {
                Log.w("AUTH", "Google sign in failed", e);
                Toast.makeText(MainActivity.this, "Sign-in failed, try again later.", Toast.LENGTH_LONG).show();
            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        Log.d("AUTH", "firebaseAuthWithGoogle:" + acct.getId());
        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d("AUTH", "signInWithCredential:success");
                            startActivity(new Intent(MainActivity.this, Main3Activity.class));
                            Toast.makeText(MainActivity.this, "Sign-in successful!", Toast.LENGTH_LONG).show();
                        } else {
                            Log.w("AUTH", "signInWithCredential:failure", task.getException());
                            Toast.makeText(MainActivity.this, "Sign-in failed, try again later.", Toast.LENGTH_LONG).show();
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
}

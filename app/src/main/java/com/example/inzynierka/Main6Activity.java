package com.example.inzynierka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Main6Activity extends AppCompatActivity {

    EditText email;
    Button wyslij;

    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        email=findViewById(R.id.emailForgotText);
        wyslij=findViewById(R.id.WyslijButton);

        firebaseAuth=FirebaseAuth.getInstance();

        wyslij.setOnClickListener((view)-> {
            String Email=email.getText().toString();
            if(!TextUtils.isEmpty(Email)) {
                startActivity(new Intent(this, MainActivity.class));
                firebaseAuth.sendPasswordResetEmail(Email).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Main6Activity.this, getString(R.string.passwordsend),
                                    Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(Main6Activity.this, task.getException().getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }
}

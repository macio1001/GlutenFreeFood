package com.example.inzynierka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {

    EditText email,haslo;
    Button register;

    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email=findViewById(R.id.emailRegisterText);
        haslo=findViewById(R.id.emailRegisterText);
        register=findViewById(R.id.RegisterButton);

        firebaseAuth=FirebaseAuth.getInstance();

        register.setOnClickListener((view)-> {
            String Email=email.getText().toString();
            String Haslo=email.getText().toString();
            if(!TextUtils.isEmpty(Email) && !TextUtils.isEmpty(Haslo)) {
                firebaseAuth.createUserWithEmailAndPassword(Email, Haslo)
                        .addOnCompleteListener((task) -> {
                            if (task.isSuccessful()) {
                                startActivity(new Intent(this, MainActivity.class));
                                firebaseAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()) {
                                            Toast.makeText(Main2Activity.this, getString(R.string.success),
                                                    Toast.LENGTH_LONG).show();
                                            email.setText("");
                                            haslo.setText("");
                                        } else {
                                            Toast.makeText(Main2Activity.this, task.getException().getMessage(),
                                                    Toast.LENGTH_LONG).show();
                                        }
                                    }
                                });
                            } else {
                                Toast.makeText(Main2Activity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });
    }
}

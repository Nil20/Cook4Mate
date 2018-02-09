package com.example.user.Cook4Mate;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.ProgressDialog;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity implements  View.OnClickListener{
    private TextView signup;
    private EditText etEmail;
    private EditText name;
    private EditText etPassword;
    private Button register;
    private ProgressDialog progressBar;
    private TextView signUpLog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firebaseAuth = FirebaseAuth.getInstance();

        progressBar = new ProgressDialog(this);

        signup = (TextView)findViewById(R.id.signup_Signup);
        etEmail= (EditText) findViewById(R.id.signup_email);
        name = (EditText) findViewById(R.id.signup_name);
        etPassword =(EditText) findViewById(R.id.etPassword);
        register = (Button) findViewById(R.id.signup_register);
        signUpLog = (TextView)findViewById(R.id.signUpLogin);

        register.setOnClickListener(this);
        signUpLog.setOnClickListener(this);

    }

    private void registerUser(){
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "PLEASE ENTER EMAIL", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "PLEASE ENTER PASSWORD", Toast.LENGTH_SHORT).show();
            return;
        }

        progressBar.setMessage("Registering user...");
        progressBar.show();

        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            finish();
                            progressBar.dismiss();
                            Toast.makeText(SignUp.this, "Registration Succeeded", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),SearchCommunity.class));
                        }
                        else {
                            progressBar.dismiss();
                            Toast.makeText(SignUp.this, "could not register, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Override
    public void onClick(View view) {
        if (view == register) {
            registerUser();
        }
        if (view == signUpLog){
            Intent intent = new Intent(SignUp.this, LogIn.class);
            startActivity(intent);
        }
    }
}

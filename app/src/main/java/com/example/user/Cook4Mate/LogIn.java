package com.example.user.Cook4Mate;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class LogIn extends AppCompatActivity implements  View.OnClickListener{
    private EditText LoginMail;
    private EditText Password;
    private Button Login;
    private Button Signup;
    private ProgressDialog progressDialog;
    private TextView ForgotPassword;
    private TextView NoAccount;
    private ImageView Logo;
    private TextView text;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        firebaseAuth = FirebaseAuth.getInstance();


        LoginMail = (EditText) findViewById(R.id.etLoginEmail);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        Signup = (Button)findViewById(R.id.btnSignup);
        ForgotPassword = (TextView)findViewById(R.id.fogotPass);
        progressDialog = new ProgressDialog(this);

        Login.setOnClickListener(this);
        Signup.setOnClickListener(this);


    }

    private void logInUser(){
        String email = LoginMail.getText().toString().trim();
        String password = Password.getText().toString().trim();

        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "PLEASE ENTER EMAIL", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "PLEASE ENTER PASSWORD", Toast.LENGTH_SHORT).show();
            return;
        }


        progressDialog.setMessage("logging in...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            progressDialog.dismiss();
                            finish();
                            startActivity(new Intent(getApplicationContext(),Home.class));
                        }
                        else {
                            progressDialog.dismiss();
                            Toast.makeText(LogIn.this, "could not sign in, please try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


    @Override
    public void onClick(View view) {
        if(view == Login) {
            logInUser();
        }
        if(view == Signup) {
            Intent intent = new Intent(LogIn.this, SignUp.class);
            startActivity(intent);
        }
    }
}
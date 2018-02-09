package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


        Button FoodList;
        Button AddtoFoodList;
        Button Exchange;
        Button MyComm;
        Button MyList;
        Button adminpanel;
        Button logout;
        Button notifi;
        Button help;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home);


            FoodList = (Button) findViewById(R.id.buylist);
            AddtoFoodList = (Button) findViewById(R.id.addtobuy);
            Exchange = (Button) findViewById(R.id.exchange);
            MyComm = (Button) findViewById(R.id.myCommunity);
            MyList = (Button) findViewById(R.id.myList);
            adminpanel = (Button) findViewById(R.id.aadminpanel);
            logout = (Button) findViewById(R.id.sureto_leave_button1);
            notifi = (Button) findViewById(R.id.notification);
            help =  (Button) findViewById(R.id.helpp);




            FoodList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy1 = new Intent(Home.this, MainList.class);
                    startActivity(toy1);
                }


            });

            AddtoFoodList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, AddToFoodList1.class);
                    startActivity(toy2);
                }


            });

            Exchange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, Exchange1.class);
                    startActivity(toy2);
                }


            });

            MyComm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, MyCommunity.class);
                    startActivity(toy2);
                }


            });


            MyList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, MyList.class);
                    startActivity(toy2);
                }


            });


            adminpanel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, AdminPass.class);
                    startActivity(toy2);
                }


            });

            logout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, LogIn.class);
                    startActivity(toy2);
                }


            });

            notifi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, NotifiCation.class);
                    startActivity(toy2);
                }


            });

            help.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy2 = new Intent(Home.this, HeLp.class);
                    startActivity(toy2);
                }


            });
        }


    }

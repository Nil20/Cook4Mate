package com.example.user.Cook4Mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class AddToFoodList1 extends AppCompatActivity implements View.OnClickListener{

    private EditText nameOf;
    private EditText setPrice;
    private EditText forHowMany;
    private CheckBox availability;
    private EditText dateOfSale;
    private TextView crow;
    private Spinner spin;
    private ImageButton imgBtn;
    private EditText phone;
    private Button done;

    private FirebaseDatabase mRootRef;
    private DatabaseReference queue;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_to_food_list1);

        mRootRef = FirebaseDatabase.getInstance();
        queue = mRootRef.getReference();

        queue.child("Buy").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot ds : dataSnapshot.getChildren() ){
                    Data dataD = ds.getValue(Data.class);

                        Toast.makeText(getApplicationContext(), "Added in the Food List", Toast.LENGTH_SHORT).show();

                }



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        user = FirebaseAuth.getInstance().getCurrentUser();

        nameOf = (EditText) findViewById(R.id.nameOfItemToSell);
        setPrice = (EditText) findViewById(R.id.setPrice);
        forHowMany = (EditText) findViewById(R.id.forHowMany);
        availability = (CheckBox) findViewById(R.id.availability);
        dateOfSale = (EditText) findViewById(R.id.dateOfSale);
        crow = (TextView) findViewById(R.id.Crow);
        spin = (Spinner) findViewById(R.id.spinnerIICT);
        phone = (EditText)findViewById(R.id.phone);
        done = (Button) findViewById(R.id.doneBtn);


        done.setOnClickListener(this);

    }

    private void functionUser() {
        String name = nameOf.getText().toString().trim();
        String price = setPrice.getText().toString().trim();
        String quantity = forHowMany.getText().toString().trim();
        String date = dateOfSale.getText().toString().trim();
        String phoneNo = phone.getText().toString().trim();

        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "PLEASE ENTER THE FIELD NEEDED", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(price)) {
            Toast.makeText(this, "PLEASE ENTER THE FIELD NEEDED", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(quantity)) {
            Toast.makeText(this, "PLEASE ENTER THE FIELD NEEDED", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(date)) {
            Toast.makeText(this, "PLEASE ENTER THE FIELD NEEDED", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(phoneNo)) {
            Toast.makeText(this, "PLEASE ENTER THE FIELD NEEDED", Toast.LENGTH_SHORT).show();
            return;
        }

        Data data1 = new Data();
        data1.item = name;
        data1.price = price;
        data1.quantity = quantity;
        data1.date = date;
        data1.phoneNumber = phoneNo;

        String id=queue.child("Buy").push().getKey();
        queue.child("Buy").child(id).setValue(data1);


        Intent intent = new Intent(AddToFoodList1.this, Home.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if(view == done) {
            functionUser();
        }
    }
}


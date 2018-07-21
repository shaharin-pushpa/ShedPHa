package com.example.kowshick.dummyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailsAcitivity extends AppCompatActivity {
    private TextView nameTV,genericTV,indicatorTV,otherTV,declear,does,price,preparation;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details_acitivity);
        nameTV=findViewById(R.id.name);
        genericTV=findViewById(R.id.genericName);
        indicatorTV=findViewById(R.id.indicator);
        otherTV=findViewById(R.id.other);
        declear=findViewById(R.id.declaration);
        img=findViewById(R.id.img);
        does=findViewById(R.id.does);
        price=findViewById(R.id.price);
        preparation=findViewById(R.id.preparation);
        Intent intent=getIntent();
        Product pd= (Product) intent.getSerializableExtra("msg");
        nameTV.setText(pd.getProductName());
        img.setImageResource(pd.getProductImage());
        genericTV.setText(pd.getGenericName());
        indicatorTV.setText(pd.getIndication());
        otherTV.setText(pd.getOtherDetails());
        does.setText(pd.getDoses());
        price.setText(pd.getPrice());
        declear.setText(pd.getDeclaration());
        preparation.setText(pd.getPreparation());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.back_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.back:
                startActivity(new Intent(ProductDetailsAcitivity.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}

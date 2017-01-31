package com.droiddigger.realmexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Product product=new Product();
        product.setName("Shirt");
        product.setPrice("456");
        Realm realm = Realm.getDefaultInstance();
    }
}

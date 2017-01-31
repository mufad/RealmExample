package com.droiddigger.realmexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realm = Realm.getDefaultInstance();
        basicCRUD(realm);
    }
    
    private void basicCRUD(Realm realm){
        showStatus("BASIC CRUD OPERATION GOING ON");
         realm.executeTransaction(new Realm.Transaction() {
        @Override
        public void execute(Realm realm) {
                // Add a person
        
               Product product=new Product();
               product.setName("Shirt");
               product.setPrice("456");
 
        }
       });
        
        final Product product = realm.where(Product.class).findFirst();
        showStatus(product.getName()+" : "+product.getPrice());
        
        realm.executeTransaction(new Realm.Transaction(){
        
            @Override
            public void execute(Realm realm){
                product.setName("Jeans");
                product.setPrice("789");
            }
        });
        showStatus(product.getName()+" : "+product.getPrice());
        
    }
    
    private void showStatus(String text){
        Log.d("TAG", text);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}

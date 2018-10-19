package com.example.binarygadget.minibangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ContactsActivity extends AppCompatActivity {

    ListView simplelist5;
    String Namelist[]={"Emergency Numbers for Your Needs"};
    int flags[]={R.drawable.contact};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        simplelist5=(ListView) findViewById(R.id.idContactsList);
        CustomAddapter customAddapter =new CustomAddapter(getApplicationContext(),Namelist,flags);
        simplelist5.setAdapter(customAddapter);

        simplelist5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://whitepagesbd.com/enumbers.aspx"));
                    startActivity(myIntent);
                }

            }
        });
    }
}

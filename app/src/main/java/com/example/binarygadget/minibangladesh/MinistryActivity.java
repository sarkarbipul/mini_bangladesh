package com.example.binarygadget.minibangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MinistryActivity extends AppCompatActivity {

    ListView simplelist3;
    String Namelist[]={"Ministry of Information","Ministry of Posts, Telecommunication and Information Technology"};
    int flags[]={R.drawable.ministry,R.drawable.ministry};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ministry);

        simplelist3=(ListView) findViewById(R.id.idMinistryList);
        CustomAddapter customAddapter =new CustomAddapter(getApplicationContext(),Namelist,flags);
        simplelist3.setAdapter(customAddapter);

        simplelist3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://moi.gov.bd/"));
                    startActivity(myIntent);
                }else if (i==1){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://ptd.gov.bd/"));
                    startActivity(myIntent);
                }

            }
        });
    }
}

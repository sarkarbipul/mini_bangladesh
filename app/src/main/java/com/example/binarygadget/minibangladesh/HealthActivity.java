package com.example.binarygadget.minibangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class HealthActivity extends AppCompatActivity {

    ListView simplelist2;
    String Namelist[]={"Apollo Hospitals Dhaka","Labaid Specialized Hospital"};
    int flags[]={R.drawable.apollo,R.drawable.labaid};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        simplelist2=(ListView) findViewById(R.id.idHealthList);
        CustomAddapter customAddapter =new CustomAddapter(getApplicationContext(),Namelist,flags);
        simplelist2.setAdapter(customAddapter);

        simplelist2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://www.apollodhaka.com/make-appointment/"));
                    startActivity(myIntent);
                }else if (i==1){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://labaidgroup.com/specialized/appointment"));
                    startActivity(myIntent);
                }

            }
        });
    }
}

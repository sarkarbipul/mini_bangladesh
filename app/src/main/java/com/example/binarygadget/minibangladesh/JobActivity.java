package com.example.binarygadget.minibangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class JobActivity extends AppCompatActivity {

    ListView simplelist4;
    String Namelist[]={"bdjobs.com","Jobs77"};
    int flags[]={R.drawable.job,R.drawable.job};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        simplelist4=(ListView) findViewById(R.id.idJobList);
        CustomAddapter customAddapter =new CustomAddapter(getApplicationContext(),Namelist,flags);
        simplelist4.setAdapter(customAddapter);

        simplelist4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://www.bdjobs.com/"));
                    startActivity(myIntent);
                }else if (i==1){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://london.jobs77.com/"));
                    startActivity(myIntent);
                }

            }
        });
    }
}

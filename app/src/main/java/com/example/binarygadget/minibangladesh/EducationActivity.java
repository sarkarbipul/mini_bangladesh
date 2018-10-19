package com.example.binarygadget.minibangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EducationActivity extends AppCompatActivity {

    ListView simplelist1;
    String Namelist[]={"SSC/HSC Results","Board of Intermediate and Secondary Education, Dhaka","Du admission","JnU admission"};
    int flags[]={R.drawable.ministry,R.drawable.dhaka_education,R.drawable.du,R.drawable.ju};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        simplelist1=(ListView) findViewById(R.id.idEducationList);
        CustomAddapter customAddapter =new CustomAddapter(getApplicationContext(),Namelist,flags);
        simplelist1.setAdapter(customAddapter);

        simplelist1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://www.educationboardresults.gov.bd/"));
                    startActivity(myIntent);
                }else if (i==1){
                    Intent myIntent= new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://dhakaeducationboard.gov.bd/"));
                    startActivity(myIntent);
                }else if (i==2) {
                    Intent myIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://admission.eis.du.ac.bd/"));
                    startActivity(myIntent);
                }else if (i==3) {
                    Intent myIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://admissionjnu.info/"));
                    startActivity(myIntent);
                }
            }
        });
    }
}

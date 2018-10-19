package com.example.binarygadget.minibangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button button;

    ListView simplelist;
    String Namelist[] = {"Education","Health","Ministry","Job","Emergency Contacts"};
    int flags[] = {R.drawable.education,R.drawable.health,R.drawable.ministry,R.drawable.job,R.drawable.contact};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn);
        simplelist=(ListView) findViewById(R.id.idList);
        CustomAddapter customAddapter =new CustomAddapter(getApplicationContext(),Namelist,flags);
        simplelist.setAdapter(customAddapter);

        simplelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent intent = new Intent(view.getContext(), EducationActivity.class);
                    startActivity(intent);

                }else if (i==1){
                    Intent intent = new Intent(view.getContext(), HealthActivity.class);
                    startActivity(intent);
                }else if (i==2){
                    Intent intent = new Intent(view.getContext(), MinistryActivity.class);
                    startActivity(intent);
                }else if (i==3){
                    Intent intent = new Intent(view.getContext(), JobActivity.class);
                    startActivity(intent);
                }else if (i==4){
                    Intent intent = new Intent(view.getContext(), ContactsActivity.class);
                    startActivity(intent);
                }
                
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AboutActivity.class);
                startActivity(intent);            }
        });


    }
}

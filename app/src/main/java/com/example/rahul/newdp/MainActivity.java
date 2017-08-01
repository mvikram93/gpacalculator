package com.example.rahul.newdp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tool = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tool);
        tool.setLogo(R.drawable.ic_mood_black_24dp);
         tool.setTitle(R.string.title);
       // tool.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        Spinner spin = (Spinner) findViewById(R.id.sp1);
        Spinner spinnew = (Spinner) findViewById(R.id.spin2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.semester));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnew.setAdapter(adapter1);

        spin.setOnItemSelectedListener(this);
        spinnew.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner s = (Spinner) findViewById(R.id.sp1);
        Spinner s1 = (Spinner) findViewById(R.id.spin2);
        String dep = s.getSelectedItem().toString();

        String sem = s1.getSelectedItem().toString();
        Button b1 = (Button) findViewById(R.id.button1);
        final Bundle depsem = new Bundle();
        depsem.putString("dep", dep);
        depsem.putString("sem", sem);
        b1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      Intent i = new Intent(MainActivity.this, Main2Activity.class);
                                      i.putExtras(depsem);
                                      startActivity(i);
                                  }
                              }
        );

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
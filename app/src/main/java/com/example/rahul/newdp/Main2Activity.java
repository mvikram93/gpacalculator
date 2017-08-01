package com.example.rahul.newdp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {
    ArrayAdapter<String> adapter, subadapter, elecadap; //= new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
    ListView listview, listviewpop;
    ArrayList<String> al;
    List  points;
    FloatingActionButton btn;
    Map<String,Integer> sem_details = new HashMap<String, Integer>();
   // RadioGroup rg;
    int depsem;
    int eleno;
    //float gpa;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar tool = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tool);
        tool.setLogo(R.drawable.ic_mood_black_24dp);
        // tool.setTitle(R.string.actionBarName);
        tool.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
       /* Toolbar myToolbar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(myToolbar);*/
//ActionBar actionBar=getSupportActionBar();
     //   getSupportActionBar().setDisplayUseLogoEnabled(true);
      //  getSupportActionBar().setDisplayShowHomeEnabled(true);
       // getSupportActionBar().setIcon(R.mipmap.icon);


        String dep = getIntent().getStringExtra("dep");
        String sem = getIntent().getStringExtra("sem");
        int seminteger = Integer.parseInt(sem);

        listview = (ListView) findViewById(R.id.listView1);
      //  listview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, 48));
        listviewpop = (ListView) findViewById(R.id.listView2);

        btn = (FloatingActionButton) findViewById(R.id.button1);


        int subcode = showsubcode(dep);//department

       arrangedynamicsub(subcode,seminteger);
         }
public void arrangedynamicsub(int depinteger,int depsem) {
    String key = null;
    int elechoosedata = 0;
    int code = 0;
int uniq =0;
    ArrayList<Integer> count = new ArrayList<Integer>();
    switch (depinteger) {
        case 1:
            switch (depsem) {
                case 1:
                    sem_details.put("val", R.array.cse1);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 2:
                    sem_details.put("val", R.array.cse2);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 3:
                    sem_details.put("val", R.array.cse3);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 4:
                    sem_details.put("val", R.array.cse4);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 5:
                    sem_details.put("val", R.array.cse5);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 6:
                    uniq=1;
                    code=16;
                    sem_details.put("val", R.array.cse6);
                    key = "val";
                    count.add(5);
                    break;
                case 7:
                    uniq=1;
                    code=17;
                    sem_details.put("val", R.array.cse7);
                    key = "val";
                    count.add(4);
                    count.add(5);
                    break;

                case 8:
                    uniq=1;
                    code=18;
                    sem_details.put("val", R.array.cse8);
                    key = "val";
                    count.add(2);
                    count.add(3);
                    break;
            }
            break;
        case 2:
            switch (depsem) {
                case 1:
                    sem_details.put("val", R.array.cse1);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 2:
                    sem_details.put("val", R.array.eee2);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 3:
                    sem_details.put("val", R.array.eee3);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 4:
                    sem_details.put("val", R.array.eee4);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 5:
                    sem_details.put("val", R.array.eee5);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 6:
                    uniq=2;
                    code=26;
                    sem_details.put("val", R.array.eee6);
                    key = "val";
                    count.add(5);



                break;
                case 7:
                    uniq=2;
                    code=27;
                    sem_details.put("val", R.array.eee7);
                    key = "val";
                    count.add(4);
                    count.add(5);
                    break;
                case 8:
                    uniq=2;
                    code=28;
                    sem_details.put("val", R.array.eee8);
                    key = "val";
                    count.add(2);
                    count.add(3);
                    break;
            }
            break;
        case 3:
            switch (depsem) {
                case 1:
                    sem_details.put("val", R.array.cse1);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 2:
                    sem_details.put("val", R.array.ece2);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 3:
                    sem_details.put("val", R.array.ece3);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 4:
                    sem_details.put("val", R.array.ece4);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 5:
                    sem_details.put("val", R.array.ece5);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 6:
                    uniq=3;
                    code=36;
                    sem_details.put("val", R.array.ece6);
                    key = "val";
                    count.add(5);
                    break;
                case 7:
                    uniq=3;
                    code=37;
                    sem_details.put("val", R.array.ece7);
                    key = "val";
                    count.add(3);
                    count.add(4);
                    count.add(5);
                    break;
                case 8:
                    uniq=3;
                    code=38;
                    sem_details.put("val", R.array.ece8);
                    key = "val";
                    count.add(3);
                    count.add(4);
                    break;
            }
            break;
        case 4:
            switch (depsem) {
                case 1:
                    sem_details.put("val", R.array.cse1);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 2:
                    sem_details.put("val", R.array.mech2);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 3:
                    sem_details.put("val", R.array.mech3);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 4:
                    sem_details.put("val", R.array.mech4);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 5:
                    sem_details.put("val", R.array.mech5);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 6:
                uniq=4;
                code=46;
                sem_details.put("val", R.array.mech6);
                key = "val";
                count.add(5);
                break;
                case 7:
                    uniq=4;
                    code=47;
                    sem_details.put("val", R.array.mech7);
                    key = "val";
                    count.add(4);
                    count.add(5);
                    break;
                case 8:
                    uniq=4;
                    code=48;
                    sem_details.put("val", R.array.mech8);
                    key = "val";
                    count.add(2);
                    count.add(3);
                    break;
            }
            break;
        case 5:
            switch (depsem) {
                case 1:
                    sem_details.put("val", R.array.cse1);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 2:
                    sem_details.put("val", R.array.civil2);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 3:
                    sem_details.put("val", R.array.civil3);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 4:
                    sem_details.put("val", R.array.civil4);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 5:
                    sem_details.put("val", R.array.civil5);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 6:
                    uniq=5;
                    code=56;
                    sem_details.put("val", R.array.civil6);
                    key = "val";
                    count.add(5);
                    break;
                case 7:
                    uniq=5;
                    code=57;
                    sem_details.put("val", R.array.civil7);
                    key = "val";
                    count.add(4);
                    count.add(5);
                    break;
                case 8:
                    uniq=5;
                    code=58;
                    sem_details.put("val", R.array.civil8);
                    key = "val";
                    count.add(2);
                    count.add(3);
                    break;
            }
            break;
        case 6:
            switch (depsem) {
                case 1:
                    sem_details.put("val", R.array.cse1);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 2:
                    sem_details.put("val", R.array.cse2);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 3:
                    sem_details.put("val", R.array.cse3);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 4:
                    sem_details.put("val", R.array.it4);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 5:
                    sem_details.put("val", R.array.it5);
                    key = "val";
                    elechoosedata = 1;
                    break;
                case 6:
                 uniq=6;
                code=66;
                sem_details.put("val", R.array.it6);
                key = "val";
                count.add(5);
                break;
                case 7:
                    uniq=6;
                    code=67;
                    sem_details.put("val", R.array.it7);
                    key = "val";
                    count.add(4);
                    break;
                case 8:
                    uniq=6;
                    code=68;
                    sem_details.put("val", R.array.it8);
                    key = "val";
                    count.add(2);
                    count.add(3);
                    count.add(4);
                    break;
            }
            break;
    }

    if (elechoosedata == 1) {
        int data = sem_details.get(key);
        showcse1(data);
    } else {
        int data = sem_details.get(key);
        showcse6(data,count,code,uniq);
    }
}
    public void showcse1(int data) {
        depsem = 11;
        subadapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(data)){
            @NonNull
            public View getView(int position, View convertView,  ViewGroup parent) {
            /// Get the Item from ListView
            View view = super.getView(position, convertView, parent);

            TextView tv = (TextView) view.findViewById(android.R.id.text1);
                //tv.setBackgroundResource(R.color.tvcolo);
                //tv.setTypeface(Typeface.createFromFile("sans-serif-medium"));

            // Set the text size 25 dip for ListView each item
            tv.setTextSize(TypedValue.COMPLEX_UNIT_SP,17);
               // tv.setFon

            // Return the view
            return view;
        }
        };

        //listview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, 48));
        listview.setAdapter(subadapter);
        adapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.grades))
        {
            @NonNull
            public View getView(int position, View convertView,  @NonNull ViewGroup parent) {
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                //tv.setTextColor(getResources().getColor(R.style.color))
                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);

                // Return the view
                return view;
            }
        };
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        listviewpop.setAdapter(new CustomAdapter(this, listview));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<String> selections = new ArrayList<String>();
                for (int i = 0; i < listviewpop.getChildCount(); i++) {

                    // Get row's spinner
                    View listItem = listviewpop.getChildAt(i);
                    Spinner spinner = (Spinner) listItem.findViewById(R.id.spinner1);

                    // Get selection
                    String selection = (String) spinner.getSelectedItem();
                    //shows all grades selected
                    selections.add(selection);
                }

                points = calculateGradetoPoints(selections);
                s=calculateGPA(points, depsem);
                Bundle mark=new Bundle();
                mark.putString("gpa", s);
               Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtras(mark);
              startActivity(i);
            }

            // process selections
            //}
        });

    }


    public void showcse6(int data, final ArrayList<Integer> elepass, final int code, final int uniq) {
        depsem = 16;
        int n;
         final int size=elepass.size();
        //Toast.makeText(getApplicationContext(), "Your ELEC subject : " + size, Toast.LENGTH_LONG).show();

        listview = (ListView) findViewById(R.id.listView1);
        listviewpop = (ListView) findViewById(R.id.listView2);
       final String[] marr=getResources().getStringArray(data);
         al=new ArrayList(Arrays.asList(marr));
        subadapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(data))
        {

            public View getView(int position, View convertView,  @NonNull ViewGroup parent) {
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);

                // Return the view
                return view;
            }
        };
        listview.setAdapter(subadapter);
        adapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.grades))
                {
            public View getView(int position, View convertView,  @NonNull ViewGroup parent) {
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);

                // Return the view
                return view;
            }
        };
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        listviewpop.setAdapter(new CustomAdapter(this, listview));
        final int finalDepsem = depsem;
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                int n,p,q,r,eleno;
                if(size==1) {
                     n = elepass.get(0);
                    if (position == n) {
                        eleno=send(code,position);
                        showRadioButtonDialog(uniq,code,eleno, al, position, al);
                    }
                }
                else if(size==2)
                {
                    n=elepass.get(0);
                    p=elepass.get(1);
                    if (position == n||position==p) {
                        eleno=send(code,position);
                        showRadioButtonDialog(uniq,code,eleno, al, position, al);
                    }
                }
                else if(size==3)
                {
                    n=elepass.get(0);
                    p=elepass.get(1);
                    q=elepass.get(2);
                    if (position == n||position==p||position==q) {
                        eleno=send(code,position);
                        showRadioButtonDialog(uniq,code,eleno, al, position, al);
                    }
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<String> selections = new ArrayList<String>();
                for (int i = 0; i < listviewpop.getChildCount(); i++) {

                    // Get row's spinner
                    View listItem = listviewpop.getChildAt(i);
                    Spinner spinner = (Spinner) listItem.findViewById(R.id.spinner1);

                    // Get selection
                    String selection = (String) spinner.getSelectedItem();
                    //shows all grades selected
                    selections.add(selection);
                }

                points = calculateGradetoPoints(selections);
                calculateGPA(points, depsem);
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }

            // process selections
            //}
        });


    }

    public List calculateGradetoPoints(List selections) {
        int c;
        List<Integer> points = new ArrayList<Integer>();
        for (int i = 0; i < selections.size(); i++) {
            String s = (String) selections.get(i);
            if (s.equals("S")) {
                c = 10;
                points.add(c);
                // ar[i]=c;
            } else if (s.equals("A")) {
                c = 9;
                points.add(c);
            } else if (s.equals("B")) {
                c = 8;
                points.add(c);
            } else if (s.equals("C")) {
                c = 7;
                points.add(c);
            } else if (s.equals("D")) {
                c = 6;
                points.add(c);
            } else if (s.equals("E")) {
                c = 5;
                points.add(c);
            } else {
                c = 0;
                points.add(c);
            }
        }
        return points;
    }

    public String calculateGPA(List<Integer> points, int depsem) {
        int credits = 0;
        float gpa, sum = 0, p;
        int arr[] = new int[0];

        switch (depsem) {
            case 11:
                arr = getResources().getIntArray(R.array.cse1credits);
                break;

            case 12:

                arr = getResources().getIntArray(R.array.cse2credits);
                break;
            case 13:
                arr = getResources().getIntArray(R.array.cse3credits);
                break;
            case 14:
                arr = getResources().getIntArray(R.array.cse4credits);
                break;
            case 15:
                arr = getResources().getIntArray(R.array.cse5credits);
                break;
            case 16:
                arr = getResources().getIntArray(R.array.cse4credits);
                break;
            case 17:
                arr = getResources().getIntArray(R.array.cse7credits);
                break;
            case 18:
                arr = getResources().getIntArray(R.array.cse8credits);
                break;
            case 22:
                arr = getResources().getIntArray(R.array.eee2credits);
                break;
            case 23:
                arr = getResources().getIntArray(R.array.eee3credits);
                break;
            case 24:
                arr = getResources().getIntArray(R.array.eee4credits);
                break;
            case 25:
                arr = getResources().getIntArray(R.array.eee5credits);
                break;
            case 26:
                arr = getResources().getIntArray(R.array.eee6credits);
                break;
            case 27:
                arr = getResources().getIntArray(R.array.eee7credits);
                break;
            case 32:
                arr = getResources().getIntArray(R.array.ece2credits);
                break;
            case 33:
                arr = getResources().getIntArray(R.array.ece3credits);
                break;
            case 34:
                arr = getResources().getIntArray(R.array.ece4credits);
                break;
            case 35:
                arr = getResources().getIntArray(R.array.ece5credits);
                break;
            case 36:
                arr = getResources().getIntArray(R.array.ece6credits);
                break;
            case 37:
                arr = getResources().getIntArray(R.array.ece7credits);
                break;
            case 38:
                arr = getResources().getIntArray(R.array.ece8credits);
                break;
            case 42:
                arr = getResources().getIntArray(R.array.mech2credits);
                break;
            case 43:
                arr = getResources().getIntArray(R.array.mech3credits);
                break;
            case 44:
                arr = getResources().getIntArray(R.array.mech4credits);
                break;
            case 45:
                arr = getResources().getIntArray(R.array.mech5credits);
                break;
            case 47:
                arr = getResources().getIntArray(R.array.mech7credits);
                break;

            case 51:
                arr = getResources().getIntArray(R.array.cse1credits);
                break;
            case 52:
                arr = getResources().getIntArray(R.array.civil2credits);
                break;
            case 53:
                arr = getResources().getIntArray(R.array.civil3credits);
                break;
            case 54:
                arr = getResources().getIntArray(R.array.civil4credits);
                break;
            case 55:
                arr = getResources().getIntArray(R.array.civil5credits);
                break;
            case 56:
                arr = getResources().getIntArray(R.array.civil3credits);
                break;
            case 57:
                arr = getResources().getIntArray(R.array.civil7credits);
                break;
            case 64:
                arr = getResources().getIntArray(R.array.it4credits);
                break;
            case 65:
                arr = getResources().getIntArray(R.array.it5credits);
                break;
            case 66:
                arr = getResources().getIntArray(R.array.it6credits);
                break;
            case 67:
                arr = getResources().getIntArray(R.array.it7credits);
                break;

        }
//}

        for (int i = 0; i < points.size(); i++) {

            if (points.get(i) == 0) {
                arr[i] = 0;
                // continue;
            } else {
                p = points.get(i) * arr[i];//((int)gpacredits.get(i));
                sum = sum + p;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            credits = credits + arr[i];
        }
        gpa = (sum / credits);
         s=String.format("%.2f",gpa);
       // Toast.makeText(this, "gpa  : " + gpa, Toast.LENGTH_SHORT).show();
return s;

    }


    private class CustomAdapter extends BaseAdapter {
        LayoutInflater inflater;
        ListView lv;


        public CustomAdapter(Context context, ListView listview) {
            inflater = LayoutInflater.from(context);
            lv = listview;
        }

        public int getCount() {

            return lv.getCount();//  return 6;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int arg0, View convertview, ViewGroup arg2) {
            ViewHolder viewHolder;
            if (convertview == null) {
                convertview = inflater.inflate(R.layout.listrow, null);
                viewHolder = new ViewHolder();
                viewHolder.spinner = (Spinner) convertview.findViewById(R.id.spinner1);
               // viewHolder.spinner.s
                viewHolder.spinner.setAdapter(adapter);
                convertview.setTag(viewHolder);
            } //else {
              //  viewHolder = (ViewHolder) convertview.getTag();
           // }
            return convertview;
        }

        public class ViewHolder {
            Spinner spinner;
        }

    }


    public int showsubcode(String dep) {
        int code;
        if (dep.equals("CSE")) {
            code = 1;

        } else if (dep.equals("EEE")) {
            code = 2;
        } else if (dep.equals("ECE")) {
            code = 3;
        } else if (dep.equals("MECH")) {
            code = 4;
        } else if (dep.equals("CIVIL")) {
            code = 5;
        } else {
            code = 6;
        }
        return code;
    }

    public void showRadioButtonDialog(int dep, int depsem, int elenum, final ArrayList<String>al, final int position,ArrayList<String> marr) {
subadapter= new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, marr);
        final Dialog dialog = new Dialog(Main2Activity.this);
        //AlertDialog.Builder  = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom));
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.activity_main2);
        RadioGroup rg = (RadioGroup) dialog.findViewById(R.id.rg1);
        switch (dep) {
            case 1:
                if ((depsem == 16) && (elenum == 1)) {

                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cseele16));
                } else if ((depsem == 17) && (elenum == 2)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cseele172));
                } else if ((depsem == 17) && (elenum == 3)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cseele173));
                } else if ((depsem == 18) && (elenum == 4)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cseele184));
                } else if ((depsem == 18) && (elenum == 5)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cseele185));
                }
                break;
            case 2:
                if ((depsem == 26) && (elenum == 1)) {

                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eeeele261));
                } else if ((depsem == 27) && (elenum == 2)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eeeele272));
                } else if ((depsem == 27) && (elenum == 3)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eeeele273));
                } else if ((depsem == 28) && (elenum == 4)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eeeele284));

                } else if ((depsem == 28) && (elenum == 5)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eeeele285));
                }

                break;
            case 3:
                if ((depsem == 36) && (elenum == 1)) {

                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eceele361));
                } else if ((depsem == 37) && (elenum == 2)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eceele372));
                } else if ((depsem == 37) && (elenum == 3)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eceele373));
                } else if ((depsem == 37) && (elenum == 4)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eceele374));
                } else if ((depsem == 38) && (elenum == 5)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eceele385));
                } else if ((depsem == 38) && (elenum == 6)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.eceele386));
                }
                break;
            case 4:
                if ((depsem == 46) && (elenum == 1)) {

                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mechele461));
                } else if ((depsem == 47) && (elenum == 2)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mechele472));
                } else if ((depsem == 47) && (elenum == 3)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mechele473));
                } else if ((depsem == 48) && (elenum == 4)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mechele484));
                } else if ((depsem == 48) && (elenum == 5)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mechele485));
                }

                break;
            case 5:
                if ((depsem == 56) && (elenum == 1)) {

                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.civilele561));
                } else if ((depsem == 57) && (elenum == 2)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.civilele572));
                } else if ((depsem == 57) && (elenum == 3)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.civilele573));
                } else if ((depsem == 58) && (elenum == 4)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.civilele584));
                } else if ((depsem == 58) && (elenum == 5)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.civilele585));
                }
                break;
            case 6:
                if ((depsem == 66) && (elenum == 1)) {

                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.itele661));
                } else if ((depsem == 67) && (elenum == 2)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.itele672));
                } else if ((depsem == 68) && (elenum == 3)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.itele683));
                } else if ((depsem == 68) && (elenum == 4)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.itele684));
                } else if ((depsem == 68) && (elenum == 5)) {
                    elecadap = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.itele685));
                }
                break;
        }
        for (int i = 0; i < elecadap.getCount(); i++) {
            RadioButton rb = new RadioButton(Main2Activity.this); // dynamically creating RadioButton and adding to RadioGroup.
            rb.setText(elecadap.getItem(i));
            rg.addView(rb);
        }
        dialog.show();
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int childCount = group.getChildCount();
                for (int x = 0; x < childCount; x++) {
                    RadioButton btn = (RadioButton) group.getChildAt(x);
                    if (btn.getId() == checkedId) {
                        //Toast.makeText(getApplicationContext(), "Your ELEC subject : " + btn.getText().toString().toUpperCase(), Toast.LENGTH_LONG).show();
                        String ele=btn.getText().toString().toUpperCase();
                        al.set(position,ele);
                        subadapter.notifyDataSetChanged();
                        listview.setAdapter(subadapter);

                        //return ele;
                        //sendele(ele,marr,position);
                        dialog.dismiss();
                        //sendele(ele,marr,position);
                    }
                }
            }
        });
    }
    public int send(int code,int position)
    {
        if((code==16)&&(position==5))
            eleno = 1;

        else if((code==17)&&(position==4)) {
            eleno = 2;
        }
        else if((code==17)&&(position==5))
        eleno=3;
        else if((code==18)&&(position==2))
            eleno=4;
        else if((code==18)&&(position==3))
            eleno=5;
        else if((code==26)&&(position==5))
            eleno=1;
        else if((code==27)&&(position==4))
            eleno=2;
        else if((code==27)&&(position==5))
            eleno=3;
        else if((code==28)&&(position==2))
            eleno=4;
        else if((code==28)&&(position==3))
            eleno=5;
        else if((code==36)&&(position==5))
            eleno=1;
        else if((code==37)&&(position==3))
            eleno=2;
        else if((code==37)&&(position==4))
            eleno=3;
        else if((code==37)&&(position==5))
            eleno=4;
        else if((code==38)&&(position==3))
            eleno=5;
        else if((code==38)&&(position==4))
            eleno=6;
        else if((code==56)&&(position==5))
        eleno = 1;

        else if((code==57)&&(position==4)) {
        eleno = 2;
    }
    else if((code==57)&&(position==5))
        eleno=3;
    else if((code==58)&&(position==2))
        eleno=4;
    else if((code==58)&&(position==3))
        eleno=5;
        else if((code==46)&&(position==5))
            eleno = 1;

        else if((code==47)&&(position==4)) {
            eleno = 2;
        }
        else if((code==47)&&(position==5))
            eleno=3;
        else if((code==48)&&(position==2))
            eleno=4;
        else if((code==48)&&(position==3))
            eleno=5;
        else if((code==66)&&(position==5))
            eleno=1;
        else if((code==67)&&(position==4))
            eleno=2;
        else if((code==68)&&(position==2))
            eleno=3;
        else if((code==68)&&(position==3))
            eleno=4;
        else if((code==68)&&(position==4))
            eleno=5;
        return eleno;
    }
      }



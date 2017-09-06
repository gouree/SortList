package com.example.gouree.sortlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    //Listview and button objects
    ListView ls;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //store the respective values of listview and buttons
        ls =(ListView)findViewById(R.id.listView);
        b1 =(Button)findViewById(R.id.asc);
        b2 =(Button)findViewById(R.id.desc);



        //create a string of months to store the month names
        String[] months ={"January","February","March","April","May","June","July"};

        //creat a list for storing the months
        final List<String> month_names = new ArrayList<String>(Arrays.asList(months));



        //create an array adapter and set adapter for the list view
         final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,month_names);

        ls.setAdapter(arrayAdapter);




        //on click of button 1
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //sort list month_names in ascending order
                Collections.sort(month_names);
                arrayAdapter.notifyDataSetChanged();
            }

        });

        //on click of button 2
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ////sort list month_names in descending order
                Collections.sort(month_names);
                Collections.reverse(month_names);
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }
}




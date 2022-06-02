package sg.edu.rp.c346.id20022226.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et;
    EditText et2;
    Button bt;
    ListView lv;
    ArrayList<String> colours;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et);
        et2 = findViewById(R.id.et2);
        bt = findViewById(R.id.bt);
        lv = findViewById(R.id.lv);

        colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Orange");

        adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, colours);

        lv.setAdapter(adapter);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String color = et.getText().toString();
                int number = Integer.parseInt(et2.getText().toString());
                colours.add(number, color);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
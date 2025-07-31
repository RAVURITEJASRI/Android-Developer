package com.example.hellomessage;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = findViewById(R.id.l1);

        String[] items = {
                "TEJA", "SRI", "KAVYA", "VARSHITHA", "PURNIMA", "NIHARIKA", "LAKSHMI", "RAGHAVI", "RANI", "TULASI",
                "KUMARI", "SREELA", "KALAVATHI", "ROJA", "PRIYA", "PAVANI", "RAJEE", "NAJIMA", "AMEENE", "MANASA",
                "MEENA", "USHA", "PAVITHRA", "RESHMA", "LAVANYA", "JYOTHI", "ANUSHA", "BHAVANI", "GEETHA", "MOUNIKA"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );

        l.setAdapter(adapter);
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> itemsArrayList = new ArrayList<>();

      Items artist1 = new Items("Vincent Van Gogh",R.drawable.fanjpg,"Painted in June 1889");
      Items artist2 = new Items("Leonardo da Vinci",R.drawable.monaliza,"Painted in 1503 to 1506");
      Items artist3 = new Items("Rembrandt van Rijn",R.drawable.image5_4,"Painted in 1645 ");
      Items artist4 = new Items("Michelangelo",R.drawable.david_z,"Painted between 1501 and 1504");
      Items artist5 = new Items("Edvard Munch",R.drawable.edvard,"Painted in 1893");


      itemsArrayList.add(artist1);
      itemsArrayList.add(artist2);
      itemsArrayList.add(artist3);
      itemsArrayList.add(artist4);
      itemsArrayList.add(artist5);

      ItemAdapter itemAdapter = new ItemAdapter(this,0,itemsArrayList);


        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Items currentItem = itemsArrayList.get(i);
                Intent intent = new Intent(MainActivity.this,detailsActivity.class);
                intent.putExtra("Items", currentItem);
                startActivity(intent);








            }
        });

    }
}
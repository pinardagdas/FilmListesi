package com.pinardagdas.filmlistesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    private ListView filmListeObje;
    private String [] listeElemanlari;
    private String pozisyonAnahtari = "pozisyonAnahtari";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        filmListeObje = (ListView) findViewById(R.id.filmListe);


        listeElemanlari = new String[]{"12 Years a Slave(2013)", "Forrest Gump(1994)", "Ice Age Dawn of The Dinosaurs(2009)", "La La Land(2016)", "Les Misérables(2012)", "Me Before You(2016)", "Now You See Me(2013)", "Predestination(2014)", "Pride&Prejudice(2005)", "Saving Private Ryan(1998)", "Tangled(2010)", "The Boy in The Striped Pajamas(2008)", "The Phantom of The Opera(2004)", "The Sound of Music(1965)", "Zootopia(2016)"};



        ArrayAdapter<String> basitAdaptor = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id
                .text1, listeElemanlari);


        filmListeObje.setAdapter(basitAdaptor);


        filmListeObje.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, DetayActivity.class);
                intent.putExtra(pozisyonAnahtari, position);
                startActivity(intent);

            }
        });
    }
}

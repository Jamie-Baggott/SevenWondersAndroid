package com.example.SevenWonders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<WonderItem> wonderList = new ArrayList<>();
        wonderList.add(new WonderItem(R.drawable.china, "The Great Wall of China", "The Great Wall of China is an ancient wall in China. The wall is made of cement, rocks, bricks, and dirt. It was finished in 1878 and it was meant to protect the north of the empire of China from enemy attacks. It is the longest structure humans have ever built.", "https://bit.ly/3wGKNZG"));
        wonderList.add(new WonderItem(R.drawable.itza, "Chichen Itza", "Chichen Itza was a Mayan city on the Yucatan Peninsula in Mexico. Chichen Itza also is an active archeological site and an important tourist attraction. Chichen Itza was named a UNESCO World Heritage Site and it was voted in a global survey as one of the New Seven Wonders of the World.", "https://bit.ly/3CcXtZw"));
        wonderList.add(new WonderItem(R.drawable.petra, "Petra", "Petra is half-built, half-carved into the rock, and is surrounded by mountains riddled with passages and gorges. It is one of the world's most famous archaeological sites, where ancient Eastern traditions blend with Hellenistic architecture.", "https://bit.ly/3Dh6vG7"));
        wonderList.add(new WonderItem(R.drawable.machu, "Machu Picchu", "Machu Picchu is a 15th-century Inca site located on a ridge between the Huayna Picchu and Machu Picchu mountains in Peru. It sits 7,970 feet (2,430 meters) above sea level on the eastern slope of the Andes and overlooks the Urubamba River hundreds of feet below.", "https://bit.ly/3wIPySH"));
        wonderList.add(new WonderItem(R.drawable.redeemer, "Christ The Redeemer", "Christ the Redeemer is the largest art deco statue in the world. It is 98 feet tall (not including the 26 foot pedestal), and the arms stretch to 92 feet wide. The statue weighs approximately 635 tonnes. Christ the Redeemer is the 5th largest statue of Jesus.", "https://bit.ly/3CbwLjX"));
        wonderList.add(new WonderItem(R.drawable.rome, "Colosseum", "The Colosseum is an amphitheatre built in Rome under the Flavian emperors of the Roman Empire. It is also called the Flavian Amphitheatre. It is an elliptical structure made of stone, concrete, and tuff, and it stands four stories tall at its highest point.", "https://bit.ly/3C9NCDF"));
        wonderList.add(new WonderItem(R.drawable.taj, "Taj Mahal", "An immense mausoleum of white marble, built in Agra between 1631 and 1648 by order of the Mughal emperor Shah Jahan in memory of his favourite wife, the Taj Mahal is the jewel of Muslim art in India and one of the universally admired masterpieces of the world's heritage.", "https://bit.ly/3c5Dnpt"));

        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter mAdapter = new WondersAdapter(wonderList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    /*public void map(View view) {

        Intent china = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/3wGKNZG"));
        startActivity(china);

        Intent itza = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/3CcXtZw"));
        startActivity(itza);

        Intent petra = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/3Dh6vG7"));
        startActivity(petra);

        Intent machu = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/3wIPySH"));
        startActivity(machu);

        Intent redeemer = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/3CbwLjX"));
        startActivity(redeemer);

        Intent rome = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/3C9NCDF"));
        startActivity(rome);

        Intent taj = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/3c5Dnpt"));
        startActivity(taj);

    }*/
}
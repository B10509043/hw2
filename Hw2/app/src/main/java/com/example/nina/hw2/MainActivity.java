package com.example.nina.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> selectedItems=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView ch1=(ListView)findViewById(R.id.checkable_list);
        ch1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
         String[] items={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25",
                 "26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50",
                 "51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74",
                 "75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.rowlayout,R.id.txt_lan,items);
        ch1.setAdapter(adapter);
        ch1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem=((TextView)view).getText() .toString();
                if(selectedItems.contains(selectedItem)){
                    selectedItems.remove(selectedItem);//uncheck item
                }
                else
                    selectedItems.add(selectedItem);


            }
        });
    }
    public void  showselectedItems(View view){
        String items="";
        for(String item:selectedItems){
            items+=item+"\n";
        }
        Toast.makeText(this,"You selected \n"+items,Toast.LENGTH_LONG).show();
    }
}

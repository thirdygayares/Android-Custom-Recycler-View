package com.thirdydacoder.customrecylerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.thirdydacoder.customrecylerview.adapter.RecylerAdapter;
import com.thirdydacoder.customrecylerview.model.RecylerModel;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RecylerModel> recylerModel = new ArrayList<>();
    private RecylerAdapter recylerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_name);

        //create data on recyclermodel list
        recylerModel.add(new RecylerModel("July 23 2024", "My Memory Title 1", "Here is my description in my memories #1"));
        recylerModel.add(new RecylerModel("July 22 2024", "My Memory Title 2", "Here is my description in my memories #2"));
        recylerModel.add(new RecylerModel("July 21 2024", "My Memory Title 3", "Here is my description in my memories #3"));
        recylerModel.add(new RecylerModel("July 20 2024", "My Memory Title 4", "Here is my description in my memories #4"));
        recylerModel.add(new RecylerModel("July 19 2024", "My Memory Title 5", "Here is my description in my memories #5"));

        //call adapter
        recylerAdapter = new RecylerAdapter(this, recylerModel);


        //Set adapter on recyler view
        recyclerView.setAdapter(recylerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
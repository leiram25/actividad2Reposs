package com.example.a1login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclearEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclearEstudiante= findViewById(R.id.recyclearEstudiante);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclearEstudiante.setLayoutManager(layoutManager);

        final List<modelclass> modelClassList = new ArrayList<>();
        modelClassList.add(new modelclass(R.drawable.op,"Paulina Gómez ", "Gender: Female \nDate of Birth : 15/09/2000 \nStudy Career: Software \n Address:  Alma Rosa ll \nLatitud = 18.414758  \nLongitud = -69.923075 "));
        modelClassList.add(new modelclass(R.drawable.ts,"Roselyn Tirado", "Gender: Female \nDate of Birth : 29/03/1996 \nStudy Career: Arquitec \nAddress:  San Isidro \nLatitud = 18.517723  \nLongitud = -69.8789696 "));
        modelClassList.add(new modelclass(R.drawable.mi,"Hendrick Hernández", "Gender: Male \nDate of Birth : 20/03/1998 \nStudy Career: TIC \nAddress:  Gustavo Mejía \nLatitud = 18.548962  \nLongitud = -69.032145 "));


        adapter adapter = new adapter(modelClassList);
        recyclearEstudiante.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title, body;
                int image;
                // Toast.makeText(getApplicationContext(),
                //       "Seleccion: "+ modelClassList.get(recyclerView.getChildAdapterPosition(view)).getTitle(), Toast.LENGTH_SHORT).show();

                title=  modelClassList.get(recyclearEstudiante.getChildAdapterPosition(view)).getTitle();
                body=  modelClassList.get(recyclearEstudiante.getChildAdapterPosition(view)).getBody();
                image= modelClassList.get(recyclearEstudiante.getChildAdapterPosition(view)).getImageIcon();

                showInfo(title, body, image);
            }
        });
    }
    private void showInfo(String t, String b, int image){


        Intent window2 = new Intent(Main2Activity.this, information.class);
        window2.putExtra("Title", t);
        window2.putExtra("Body", b);
        window2.putExtra("Ima", image);

        startActivity(window2);



    }

}


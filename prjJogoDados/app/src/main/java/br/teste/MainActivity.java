package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgDados;
    Button btnSortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDados = findViewById(R.id.imgDados);
        btnSortear = findViewById(R.id.btnSortear);

        btnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //imgDados.setImageResource(R.drawable.dado6);
                int[] images = {R.drawable.dado1,R.drawable.dado2,R.drawable.dado3,R.drawable.dado4,R.drawable.dado5,R.drawable.dado6};
                Random rand = new Random();
                imgDados.setImageResource(images[rand.nextInt(images.length)]);
                //int n = int (5 * Math.random()) + 1;
                //if(n == 1)
                //{
                //  imgDados.setImageResource(R.drawable.dado1)
                //}
                //if(n == 2)
                //{
                //  imgDados.setImageResource(R.drawable.dado2)
                //}
                //if(n == 3)
                //{
                //  imgDados.setImageResource(R.drawable.dado3)
                //}
                //if(n == 4)
                //{
                //  imgDados.setImageResource(R.drawable.dado4)
                //}
                //if(n == 5)
                //{
                //  imgDados.setImageResource(R.drawable.dado5)
                //}
                //if(n == 6)
                //{
                //  imgDados.setImageResource(R.drawable.dado6)
                //}
            }
        });

    }
}
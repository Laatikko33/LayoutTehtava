package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton button1;
    private Button button2;
    private Button button3;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        image = findViewById(R.id.kuva);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.isChecked()){
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                }
                else{
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(image.getVisibility()== View.VISIBLE){
                    image.setVisibility(View.INVISIBLE);
                }
            }
        });

        button3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if(image.getVisibility()== View.INVISIBLE){
                    image.setVisibility(View.VISIBLE);
                }
                return false;

            }
        });
    }
}

package com.aquiles.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view) {
       // Toast.makeText(getApplicationContext(), "Açao realizada com sucesso", Toast.LENGTH_LONG).show();

        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(android.R.drawable.star_big_off);

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.color.purple_200);

        textView.setText("Ola toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);

        //toast.setView(image);
        toast.setView(textView);
        toast.show();
    }
}
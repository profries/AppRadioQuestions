package com.example.iossenac.appradioquestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void responderQuestao(View view){
        RadioGroup radioRespostas = (RadioGroup) findViewById(R.id.radioRespostas);

        if(radioRespostas.getCheckedRadioButtonId() == R.id.radioAndroid){
            Toast.makeText(this,"Você acertou!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Errou!", Toast.LENGTH_SHORT).show();
        }

    }
}

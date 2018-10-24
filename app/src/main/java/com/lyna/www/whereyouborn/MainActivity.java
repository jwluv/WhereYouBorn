package com.lyna.www.whereyouborn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button[] button = new Button[6];
    int[] button_id = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6};

    TextView textView_city2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i>button_id.length; i++)
            button[i] = findViewById(i);

        textView_city2 = findViewById(R.id.textView_city2);
    }

    public void onClickButtonCity(View view) {

        String text = "Your birth place is " + ((Button)view).getText().toString();

        textView_city2.setText(text);
    }
}

package com.example.tarea_07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Switch aSwitch;
    Button button;
    SeekBar seekBar;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView.setText(R.string.app_name);
        textView.setTextSize(36);
        textView.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));


        editText = findViewById(R.id.editText);
        editText.getText();
        //editText.addTextChangedListener(new TextWatcher() {
            //@Override
            //public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            //}

            //@Override
            //public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            //}

            //@Override
            //public void afterTextChanged(Editable editable) {
                //textView.setText(editable.toString());

            //}
        //});

        aSwitch = findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                button.setEnabled(b);

            }
        });

                button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        textView.setText(editText.getText());

                    }
                });

                textView =findViewById(R.id.textView);
                textView2 =findViewById(R.id.textView2);
                seekBar =findViewById(R.id.seekBar);
                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView2.setText("User Age: " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });





        Log.v("LISTENERS_ACTIVITY", editText.getText().toString());
    }


}

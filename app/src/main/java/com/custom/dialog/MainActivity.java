package com.custom.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button onlyText,oneButton,twoButtons,checkBoxBtn;
    protected CustomDialog customDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        onlyText = findViewById(R.id.onlyTxt);
        oneButton = findViewById(R.id.oneBtn);
        twoButtons = findViewById(R.id.twoBtn);
        checkBoxBtn = findViewById(R.id.checkBox);

        onlyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog = new CustomDialog(MainActivity.this,CustomDialogType.ONLY_TEXT);
                customDialog.show();
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog = new CustomDialog(MainActivity.this,CustomDialogType.ONE_BUTTON);
                customDialog.show();
            }
        });
        twoButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog = new CustomDialog(MainActivity.this,CustomDialogType.TWO_BUTTONS);
                customDialog.show();
            }
        });
        checkBoxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog = new CustomDialog(MainActivity.this,CustomDialogType.CHECK_BOX);
                customDialog.show();
            }
        });


    }
}
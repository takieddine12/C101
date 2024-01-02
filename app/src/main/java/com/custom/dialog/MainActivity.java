package com.custom.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.custom.dialog.Extras.DialogType;
import com.custom.dialog.Extras.Utils;
import com.custom.dialog.dialogs.CustomApprovalDialog;
import com.custom.dialog.dialogs.CustomBaseDialog;
import com.custom.dialog.dialogs.CustomButtonsDialog;
import com.custom.dialog.dialogs.CustomInfoDialog;
import com.custom.dialog.dialogs.CustomResetDialog;
import com.custom.dialog.test.TestCustomDialog;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button baseDialogBtn = findViewById(R.id.baseDialogBtn);
        Button infoDialogBtn = findViewById(R.id.infoDialogBtn);
        Button approvalDialogBtn = findViewById(R.id.approvalDialogBtn);
        Button resetDialogBtn = findViewById(R.id.resetDialogBtn);
        Button buttonsDialog = findViewById(R.id.buttonsDialog);

        baseDialogBtn.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this, DialogType.FIRST,"Title 1").show();
        });
        infoDialogBtn.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this, DialogType.SECOND,"Title 2").show();
        });
        approvalDialogBtn.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this, DialogType.THIRD,"Title 3").show();
        });
        resetDialogBtn.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this, DialogType.FOURTH,"Title 4").show();
        });
        buttonsDialog.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this, DialogType.FIFTH,"Title 5").show();
        });


    }

}

/*
 baseDialogBtn.setOnClickListener(v -> {
            new CustomBaseDialog(MainActivity.this).show();
            Utils.setTitle("This is Custom Base Dialog Title");
            Utils.setText("This is Custom Base Dialog Text");
        });
        infoDialogBtn.setOnClickListener(v -> {
            new CustomInfoDialog(MainActivity.this).show();
            Utils.setTitle("This is Custom Info Dialog Title");
            Utils.setText("This is Custom Info Dialog Text");
        });
        approvalDialogBtn.setOnClickListener(v -> {
            new CustomApprovalDialog(MainActivity.this).show();
            Utils.setTitle("This is Custom Approval Dialog Title");
            Utils.setText("This is Custom Approval Dialog Text");
        });
        resetDialogBtn.setOnClickListener(v -> {
            new CustomResetDialog(MainActivity.this).show();
            Utils.setTitle("This is Custom Reset Dialog Title");
            Utils.setText("This is Custom Reset Dialog Text");
        });
        buttonsDialog.setOnClickListener(v -> {
            new CustomButtonsDialog(MainActivity.this).show();
            Utils.setTitle("This is Custom Buttons Dialog Title");
            Utils.setText("This is Custom Buttons Dialog Text");
        });

 */
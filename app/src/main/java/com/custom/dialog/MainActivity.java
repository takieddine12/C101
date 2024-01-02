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
            new TestCustomDialog(MainActivity.this,
                    DialogType.FIRST,"Lorem Ipsum Title 1","Lorem Ipsum Header 1",null).show();
        });
        infoDialogBtn.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this,
                    DialogType.SECOND,"Lorem Ipsum Title 2","Lorem Ipsum Header 2",null).show();
        });
        approvalDialogBtn.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this,
                    DialogType.THIRD,"Lorem Ipsum Title 3","Lorem Ipsum Header 3",null).show();
        });
        resetDialogBtn.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this,
                    DialogType.FOURTH,"Lorem Ipsum Title 4","Lorem Ipsum Header 4","Reset Dialog CHECK BOX").show();
        });
        buttonsDialog.setOnClickListener(v -> {
            new TestCustomDialog(MainActivity.this,
                    DialogType.FIFTH,"Lorem Ipsum Title 5","Lorem Ipsum Header 5",null).show();
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
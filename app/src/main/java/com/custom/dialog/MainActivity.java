package com.custom.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.custom.dialog.dialogs.CustomApprovalDialog;
import com.custom.dialog.dialogs.CustomBaseDialog;
import com.custom.dialog.dialogs.CustomButtonsDialog;
import com.custom.dialog.dialogs.CustomInfoDialog;
import com.custom.dialog.dialogs.CustomResetDialog;

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
            new CustomBaseDialog(MainActivity.this).show();
        });
        infoDialogBtn.setOnClickListener(v -> {
            new CustomInfoDialog(MainActivity.this).show();
        });
        approvalDialogBtn.setOnClickListener(v -> {
            new CustomApprovalDialog(MainActivity.this).show();
        });
        resetDialogBtn.setOnClickListener(v -> {
            new CustomResetDialog(MainActivity.this).show();
        });
        buttonsDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CustomButtonsDialog(MainActivity.this).show();
            }
        });


    }

}
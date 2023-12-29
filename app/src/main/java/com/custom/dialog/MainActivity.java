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

    private Button baseDialogBtn, infoDialogBtn, approvalDialogBtn, resetDialogBtn,buttonsDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        baseDialogBtn = findViewById(R.id.baseDialogBtn);
        infoDialogBtn = findViewById(R.id.infoDialogBtn);
        approvalDialogBtn = findViewById(R.id.approvalDialogBtn);
        resetDialogBtn = findViewById(R.id.resetDialogBtn);
        buttonsDialog = findViewById(R.id.buttonsDialog);

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
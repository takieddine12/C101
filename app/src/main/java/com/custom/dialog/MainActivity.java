package com.custom.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.custom.dialog.dialogs.CustomApprovalDialog;
import com.custom.dialog.dialogs.CustomBaseDialog;
import com.custom.dialog.dialogs.CustomButtonsDialog;
import com.custom.dialog.dialogs.CustomInfoDialog;
import com.custom.dialog.dialogs.CustomResetDialog;

public class MainActivity extends AppCompatActivity {

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
            CustomBaseDialog customBaseDialog = new CustomResetDialog(MainActivity.this,
                    "Lorem Ipsum Title 1", "Lorem Ipsum Header 1", null);
            customBaseDialog.show();
        });
        infoDialogBtn.setOnClickListener(v -> {
            CustomInfoDialog customBaseDialog = new CustomInfoDialog(MainActivity.this,
                    "Lorem Ipsum Title 2", "Lorem Ipsum Header 2", null);
            customBaseDialog.show();
        });
        approvalDialogBtn.setOnClickListener(v -> {
            CustomApprovalDialog customApprovalDialog = new CustomApprovalDialog(MainActivity.this,
                    "Lorem Ipsum Title 3", "Lorem Ipsum Header 3", null
            );
            customApprovalDialog.show();
        });
        resetDialogBtn.setOnClickListener(v -> {
            CustomResetDialog customResetDialog = new CustomResetDialog(MainActivity.this,
                    "Lorem Ipsum Title 4", "Lorem Ipsum Header 4", "Reset Dialog CHECK BOX"
            );
            customResetDialog.show();
        });
        buttonsDialog.setOnClickListener(v -> {
            CustomButtonsDialog customButtonsDialog = new CustomButtonsDialog(
                    MainActivity.this,"Lorem Ipsum Title 5", "Lorem Ipsum Header 5", null
            );
            customButtonsDialog.show();
        });

    }

}
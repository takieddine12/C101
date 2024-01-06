package com.custom.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.custom.dialog.dialogs.CustomApprovalDialog;
import com.custom.dialog.dialogs.CustomBaseDialog;
import com.custom.dialog.dialogs.CustomDialog;
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
            CustomBaseDialog.Builder.newInstance(this)
                    .setHeader("Lorem Ipsum Header 1")
                    .setTitle("Lorem Ipsum Title 1")
                    .build()
                    .show();
        });
        infoDialogBtn.setOnClickListener(v -> {
            CustomInfoDialog.Builder.newInstance(this)
                    .setHeader("Lorem Ipsum Header 2")
                    .setTitle("Lorem Ipsum Title 2")
                    .setPositiveButtonText("Ok")
                    .build()
                    .show();
        });
        approvalDialogBtn.setOnClickListener(v -> {
            CustomApprovalDialog.Builder.newInstance(this)
                    .setHeader("Lorem Ipsum Title 3")
                    .setTitle("Lorem Ipsum Header 3")
                    .setPositiveButtonText("Ok")
                    .setNegativeButtonText("Cancel")
                    .build()
                    .show();
        });
        resetDialogBtn.setOnClickListener(v -> {
            CustomResetDialog.Builder.newInstance(this)
                    .setCbText("Reset Dialog CHECK BOX")
                    .setHeader("Lorem Ipsum Title 4")
                    .setTitle("Lorem Ipsum Header 4")
                    .setPositiveButtonText("Ok")
                    .setPositiveButtonText("Cancel")
                    .build()
                    .show();
        });
        buttonsDialog.setOnClickListener(v -> {
            CustomButtonsDialog.Builder.newInstance(this)
                    .setHeader("Lorem Ipsum Title 5")
                    .setTitle("Lorem Ipsum Header 5")
                    .setPositiveButtonText("Ok")
                    .setPositiveButtonText2("Ok2")
                    .setNegativeButtonText("Cancel")
                    .build()
                    .show();
        });

    }

}
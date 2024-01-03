package com.custom.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonClickListeners();
    }

    private void setButtonClickListeners() {
        setDialogButtonClickListener(R.id.baseDialogBtn, DialogType.FIRST, "Lorem Ipsum Title 1", "Lorem Ipsum Header 1", null);
        setDialogButtonClickListener(R.id.infoDialogBtn, DialogType.SECOND, "Lorem Ipsum Title 2", "Lorem Ipsum Header 2", null);
        setDialogButtonClickListener(R.id.approvalDialogBtn, DialogType.THIRD, "Lorem Ipsum Title 3", "Lorem Ipsum Header 3", null);
        setDialogButtonClickListener(R.id.resetDialogBtn, DialogType.FOURTH, "Lorem Ipsum Title 4", "Lorem Ipsum Header 4", "Reset Dialog CHECK BOX");
        setDialogButtonClickListener(R.id.buttonsDialog, DialogType.FIFTH, "Lorem Ipsum Title 5", "Lorem Ipsum Header 5", null);
    }

    private void setDialogButtonClickListener(int buttonId, DialogType dialogType, String title, String header, String checkboxText) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            new CustomDialog(MainActivity.this, dialogType, title, header, checkboxText).show();
        });
    }
}
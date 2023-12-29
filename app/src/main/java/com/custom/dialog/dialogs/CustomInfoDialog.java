package com.custom.dialog.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.custom.dialog.R;

import java.util.Objects;

public class CustomInfoDialog extends CustomBaseDialog {
    public CustomInfoDialog(@NonNull Context context) {
        super(context);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_info_dialog_layout);
        Objects.requireNonNull(getWindow()).setBackgroundDrawableResource(R.drawable.dialog_bg_shape);

        TextView messageTextView = findViewById(R.id.messageTextView);
        Button okButton = findViewById(R.id.okBtn);

        messageTextView.setText("This is a custom info dialog text");
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
                dismiss();
            }
        });


    }

}

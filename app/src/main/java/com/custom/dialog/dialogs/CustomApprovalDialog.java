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

import com.custom.dialog.Extras.Utils;
import com.custom.dialog.R;

import java.util.Objects;

public class CustomApprovalDialog extends CustomBaseDialog {


    public CustomApprovalDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_approval_dialog_layout);

        TextView messageTextView = findViewById(R.id.messageTextView);
        Button okButton = findViewById(R.id.okBtn);
        Button cancelButton = findViewById(R.id.cancelBtn);

        messageTextView.setText(Utils.getTitle());
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
                dismiss();
            }
        });
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
                dismiss();
            }
        });


    }


}

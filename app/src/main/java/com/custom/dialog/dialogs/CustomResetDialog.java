package com.custom.dialog.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.custom.dialog.R;

import java.util.Objects;

public class CustomResetDialog extends Dialog {
    public CustomResetDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_reset_dialog_layout);

        Objects.requireNonNull(getWindow()).setBackgroundDrawableResource(R.drawable.dialog_bg_shape);

        TextView messageTextView = findViewById(R.id.messageTextView);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Button okBtn = findViewById(R.id.okBtn);

        messageTextView.setText("This is a custom reset dialog text");
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getContext(),"Checked",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getContext(),"Unchecked",Toast.LENGTH_LONG).show();
                }
            }
        });
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
                dismiss();
            }
        });

        setDialogSize();
    }

    private void setDialogSize(){
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
            layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
            window.setAttributes(layoutParams);
        }
    }
}

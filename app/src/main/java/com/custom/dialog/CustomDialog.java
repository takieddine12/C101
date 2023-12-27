package com.custom.dialog;

import static com.custom.dialog.CustomDialogType.ONLY_TEXT;

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

public class CustomDialog  extends Dialog  {


    Dialog dialog;

    private CustomHelper customHelper;
    private CustomDialogType type;
    public CustomDialog(@NonNull Context context, CustomDialogType type) {
        super(context);
        this.type = type;
        customHelper = new CustomHelper();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_layout);

        TextView messageTextView = findViewById(R.id.messageTextView);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Button okButton = findViewById(R.id.okBtn);
        Button cancelButton = findViewById(R.id.cancelBtn);

        dialog = this;


        switch (type) {
            case ONLY_TEXT:
                messageTextView.setText(R.string.this_is_dialog_for_text_only);
                break;
            case ONE_BUTTON:
                messageTextView.setText(R.string.this_is_dialog_for_one_button);
                okButton.setVisibility(View.VISIBLE);
                break;
            case TWO_BUTTONS:
                messageTextView.setText(R.string.this_is_dialog_for_two_buttons);
                okButton.setVisibility(View.VISIBLE);
                cancelButton.setVisibility(View.VISIBLE);
                break;
            case CHECK_BOX:
                okButton.setVisibility(View.VISIBLE);
                cancelButton.setVisibility(View.VISIBLE);
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            Toast.makeText(getContext(), "Checked", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getContext(), "Unchecked", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                break;
        }
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (type) {
                    case ONLY_TEXT:
                        break;
                    case ONE_BUTTON:
                        customHelper.DismissDialog(dialog);
                        break;
                    case TWO_BUTTONS:
                        break;
                    case CHECK_BOX:
                        customHelper.ShowToast(getContext(),"SHOWING SOME DATA");
                        break;
                }
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

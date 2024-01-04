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

public class CustomResetDialog extends CustomBaseDialog {
    private final String cbText;
    private final String header;
    private final String title;
    public CustomResetDialog(@NonNull Context context,String title , String header , String cbText) {
        super(context,title,header,cbText);
        this.title = title;
        this.header = header;
        this.cbText = cbText;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView messageTextView = findViewById(R.id.messageTextView);
        Button okButton = findViewById(R.id.okBtn);
        TextView headerTextView = findViewById(R.id.headerTextView);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Button cancel = findViewById(R.id.cancelBtn);

        messageTextView.setText(title);
        headerTextView.setText(header);
        okButton.setVisibility(View.VISIBLE);
        checkBox.setVisibility(View.VISIBLE);
        cancel.setVisibility(View.VISIBLE);

        messageTextView.setText(title);
        checkBox.setText(cbText);

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
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
                dismiss();
            }
        });


    }

}

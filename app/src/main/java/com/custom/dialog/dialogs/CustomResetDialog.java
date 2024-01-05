package com.custom.dialog.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.custom.dialog.R;

public class CustomResetDialog extends CustomDialog {
    private final String cbText;
    private final String header;
    private final String title;
    public CustomResetDialog(@NonNull Context context,String title , String header , String cbText) {
        super(context);
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


        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                Toast.makeText(getContext(),"Checked",Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getContext(),"Unchecked",Toast.LENGTH_LONG).show();
            }
        });
        cancel.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
            dismiss();
        });
        okButton.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
            dismiss();
        });


    }

}

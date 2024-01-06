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

    private final String positiveButtonText;
    private final String negativeButtonText;
    private final String cbText;
    private final String header;
    private final String title;
    public CustomResetDialog(@NonNull Context context,Builder builder) {
        super(context);
        this.title = builder.title;
        this.header = builder.header;
        this.cbText = builder.cbText;
        this.positiveButtonText = builder.positiveButtonText;
        this.negativeButtonText = builder.negativeButtonText;

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
        okButton.setText(positiveButtonText);
        cancel.setText(negativeButtonText);


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

    public static class Builder {

        private String positiveButtonText;
        private String negativeButtonText;

        private String cbText;
        private String header;
        private String title;

        private Context context;
        public static Builder newInstance(Context context) {
            return new Builder(context);
        }

        private Builder(Context context) {
            this.context = context;
        }

        public Builder setCbText(String cbText) {
            this.cbText = cbText;
            return this;
        }

        public Builder setHeader(String header) {
            this.header = header;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setNegativeButtonText(String negativeButtonText) {
            this.negativeButtonText = negativeButtonText;
            return this;
        }

        public Builder setPositiveButtonText(String positiveButtonText) {
            this.positiveButtonText = positiveButtonText;
            return this;
        }

        public  CustomResetDialog build() {
            return new CustomResetDialog(context, this);
        }
    }

}

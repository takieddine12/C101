package com.custom.dialog.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.custom.dialog.R;


public class CustomButtonsDialog extends CustomDialog {

    private final String positiveButtonText;

    private final String positiveButtonText2;
    private final String negativeButtonText;
    private final String header;
    private final String title;
    public CustomButtonsDialog(@NonNull Context context,Builder builder) {
        super(context);
        this.title = builder.title;
        this.header = builder.header;
        this.positiveButtonText = builder.positiveButtonText;
        this.positiveButtonText2 = builder.positiveButtonText2;
        this.negativeButtonText = builder.negativeButtonText;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView messageTextView = findViewById(R.id.messageTextView);
        Button okButton = findViewById(R.id.okBtn);
        TextView headerTextView = findViewById(R.id.headerTextView);
        Button cancel = findViewById(R.id.cancelBtn);
        Button ok2 = findViewById(R.id.okBtn2);

        messageTextView.setText(title);
        headerTextView.setText(header);
        okButton.setVisibility(View.VISIBLE);
        cancel.setVisibility(View.VISIBLE);
        ok2.setVisibility(View.VISIBLE);

        okButton.setText(positiveButtonText);
        ok2.setText(positiveButtonText2);
        cancel.setText(negativeButtonText);


        cancel.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
            dismiss();
        });
        okButton.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
            dismiss();
        });
        ok2.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
            dismiss();
        });

    }


    public static class Builder {
        private String positiveButtonText;
        private String positiveButtonText2;
        private String negativeButtonText;
        private String header;
        private String title;

        private Context context;
        public static Builder newInstance(Context context) {
            return new Builder(context);
        }

        private Builder(Context context) {
            this.context = context;
        }

        public Builder setHeader(String header) {
            this.header = header;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPositiveButtonText(String positiveButtonText) {
            this.positiveButtonText = positiveButtonText;
            return this;
        }

        public Builder setPositiveButtonText2(String positiveButtonText2) {
            this.positiveButtonText2 = positiveButtonText2;
            return this;
        }

        public Builder setNegativeButtonText(String negativeButtonText) {
            this.negativeButtonText = negativeButtonText;
            return this;
        }

        public CustomButtonsDialog build() {
            return new CustomButtonsDialog(context, this);
        }
    }

}

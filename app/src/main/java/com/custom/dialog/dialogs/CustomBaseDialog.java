package com.custom.dialog.dialogs;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.custom.dialog.R;

import java.util.Objects;

public class CustomBaseDialog extends CustomDialog {

    private final String header;
    private final String title;
    public CustomBaseDialog(Context context, Builder builder) {
        super(context);
        this.title = builder.title;
        this.header = builder.header;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog_layout);

        Objects.requireNonNull(getWindow()).setBackgroundDrawableResource(R.drawable.dialog_insets);

        TextView messageTextView = findViewById(R.id.messageTextView);
        TextView headerTextView = findViewById(R.id.headerTextView);

        messageTextView.setText(title);
        headerTextView.setText(header);

        setDialogSize();

    }

    private void setDialogSize() {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
            layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
            window.setAttributes(layoutParams);
        }
    }

    public static class Builder {
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

        public CustomBaseDialog build() {
            return new CustomBaseDialog(context, this);
        }
    }
}
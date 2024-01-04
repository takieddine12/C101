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

public class CustomDialog extends Dialog {

    private final String cbText;
    private final String header;
    private final String title;

    public CustomDialog(@NonNull Context context, String title, String header, String cbText) {
        super(context);
        this.title = title;
        this.header = header;
        this.cbText = cbText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog_layout);

        Objects.requireNonNull(getWindow()).setBackgroundDrawableResource(R.drawable.dialog_insets);
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
}
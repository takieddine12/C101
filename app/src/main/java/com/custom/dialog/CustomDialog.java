//package com.custom.dialog;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.os.Bundle;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowManager;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//
//import java.util.Objects;
//
//public class CustomDialog extends Dialog {
//
//    private final String cbText;
//    private final String header;
//    private final String title;
//    private final DialogType dialogType;
//
//    public CustomDialog(@NonNull Context context, DialogType dialogType,
//                        String title , String header , String cbText) {
//        super(context);
//        this.dialogType = dialogType;
//        this.title = title;
//        this.header = header;
//        this.cbText = cbText;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.custom_dialog_layout);
//        Objects.requireNonNull(getWindow()).setBackgroundDrawableResource(R.drawable.dialog_insets);
//
//        TextView messageTextView = findViewById(R.id.messageTextView);
//        TextView headerTextView = findViewById(R.id.headerTextView);
//        CheckBox checkBox = findViewById(R.id.checkBox);
//        Button cancel = findViewById(R.id.cancelBtn);
//        Button ok = findViewById(R.id.okBtn);
//        Button ok2 = findViewById(R.id.okBtn2);
//
//        messageTextView.setText(title);
//        headerTextView.setText(header);
//        setButtonVisibility(checkBox,cancel,ok,ok2);
//
//        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            String message = isChecked ? "Checked" : "Unchecked";
//            Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
//        });
//        checkBox.setText(cbText);
//        ok.setOnClickListener(v -> showToastAndDismiss("TOAST 1"));
//        ok2.setOnClickListener(v -> showToastAndDismiss("TOAST 2"));
//        cancel.setOnClickListener(v -> showToastAndDismiss("TOAST 3"));
//
//        setDialogSize();
//
//    }
//
//    private void setButtonVisibility(CheckBox checkBox,Button cancel,Button ok,Button ok2) {
//        checkBox.setVisibility(dialogType == DialogType.FOURTH ? View.VISIBLE : View.GONE);
//        cancel.setVisibility(dialogType == DialogType.FIRST ? View.INVISIBLE : View.VISIBLE);
//        ok.setVisibility(dialogType == DialogType.FIRST || dialogType == DialogType.SECOND ? View.INVISIBLE : View.VISIBLE);
//        ok2.setVisibility(dialogType == DialogType.FIFTH ? View.VISIBLE : View.INVISIBLE);
//    }
//
//    private void showToastAndDismiss(String message) {
//        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
//        dismiss();
//    }
//
//    private void setDialogSize() {
//        Window window = getWindow();
//        if (window != null) {
//            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
//            layoutParams.copyFrom(window.getAttributes());
//            layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
//            layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
//            window.setAttributes(layoutParams);
//        }
//    }
//}

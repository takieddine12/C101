package com.custom.dialog.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.custom.dialog.R;

 public class CustomInfoDialog extends CustomDialog {

     private final String positiveButtonText;
    private final String header;
    private final String title;
    public CustomInfoDialog(@NonNull Context context,Builder builder) {
        super(context);
        this.title = builder.title;
        this.header = builder.header;
        this.positiveButtonText  = builder.positiveButtonText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView messageTextView = findViewById(R.id.messageTextView);
        Button okButton = findViewById(R.id.okBtn);
        TextView headerTextView = findViewById(R.id.headerTextView);

        messageTextView.setText(title);
        headerTextView.setText(header);
        okButton.setVisibility(View.VISIBLE);

        okButton.setText(positiveButtonText);


        okButton.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Simple Toast",Toast.LENGTH_LONG).show();
            dismiss();
        });


    }


     public static class Builder {

         private  String positiveButtonText;
         private String header;
         private String title;

         private Context context;
         public static CustomInfoDialog.Builder newInstance(Context context) {
             return new CustomInfoDialog.Builder(context);
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

         public CustomInfoDialog build() {
             return new CustomInfoDialog(context, this);
         }
     }


}

package com.custom.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class CustomOnClickListener implements View.OnClickListener {


    private Dialog dialog;
    private Context context;
    private final String value;
    CustomOnClickListener(Dialog dialog,Context context,String value){
        this.dialog  = dialog;
        this.context = context;
        this.value = value;
    }
    @Override
    public void onClick(View v) {
       if(dialog != null){
           dialog.dismiss();
       } else {
           Toast.makeText(context,value,Toast.LENGTH_LONG).show();
       }
    }
}

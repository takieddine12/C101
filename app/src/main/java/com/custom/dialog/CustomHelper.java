package com.custom.dialog;

import android.app.Dialog;
import android.content.Context;
import android.widget.Toast;

public class CustomHelper  {


    void ShowToast(Context context,String value){
        Toast.makeText(context,value,Toast.LENGTH_LONG).show();
    }
    void DismissDialog(Dialog dialog){
        dialog.dismiss();
    }
    void method3(){}
    void method4(){}


}

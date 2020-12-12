package com.example.eva2_2_action_sento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

EditText edtTxtTel,edtTxtMen;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxtTel = findViewById(R.id.edtTxtTel);
        edtTxtMen = findViewById(R.id.edtTxtMen);



    }
    public void onClick (View view){
        String sTel ="smsto:"+edtTxtTel.getText().toString();
        String sMensaje = edtTxtMen.getText().toString();
        intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        intent.putExtra("sms_body",sMensaje);
        startActivity(intent);

    }
}
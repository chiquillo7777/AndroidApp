package jotajotavm.android.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ThirdActivity extends AppCompatActivity {

    private EditText editTextPhone;
    private EditText editTextWeb;
    private ImageButton imageBtnPhone;
    private ImageButton imageBtnWeb;
    private ImageButton imageBtnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        editTextPhone = findViewById(R.id.editTextPhone);
        editTextWeb = findViewById(R.id.editTextWeb);
        imageBtnPhone = findViewById(R.id.imageButtonPhone);
        imageBtnWeb = findViewById(R.id.imageButtonWeb);
        imageBtnCamera = findViewById(R.id.imageButtonCamera);

        imageBtnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = editTextPhone.getText().toString();
                if(phoneNumber != null){
                    Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                    startActivity(intentCall);
                }
            }
        });
    }
}

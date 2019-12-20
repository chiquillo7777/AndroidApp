package jotajotavm.android.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String GREETER = "Hello from the other side";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the second activity and send a string value
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("greeter2", GREETER);
                startActivity(intent);
            }
        });
    }
}

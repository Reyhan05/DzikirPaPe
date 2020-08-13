package reyhan.com.dzikirpape;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Button btnPetang, btnPagi;
    Toolbar toolDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolDetail = findViewById(R.id.toolDetail);
        btnPagi = findViewById(R.id.btn_DzikirPagi);
        btnPetang = findViewById(R.id.btn_DzikirPetang);

        btnPagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DzikirPagiActivity.class));
            }
        });

        setSupportActionBar(toolDetail);

        btnPetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DzikirPetangActivity.class));
            }
        });
    }
}

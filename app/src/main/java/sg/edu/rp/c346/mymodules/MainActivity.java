package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346, tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.tvC346);
        tvC349 = findViewById(R.id.tvC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C346");
                i.putExtra("name", "Android Programming");
                i.putExtra("year", "2018 ");
                i.putExtra("semester", "1");
                i.putExtra("credit", "4");
                i.putExtra("class1", "W66M");
                startActivity(i);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C349");
                i.putExtra("name", "iPad Programming");
                i.putExtra("year", "2018 ");
                i.putExtra("semester", "2");
                i.putExtra("credit", "4");
                i.putExtra("class1", "W66E");
                startActivity(i);
            }
        });
    }
}

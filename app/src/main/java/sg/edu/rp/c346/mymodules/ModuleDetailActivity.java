package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView code, name, year, semester, credit, class1;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        code = findViewById(R.id.code);
        name = findViewById(R.id.name);
        year = findViewById(R.id.year);
        semester = findViewById(R.id.semester);
        credit = findViewById(R.id.credit);
        class1 = findViewById(R.id.class1);
        btnBack = findViewById(R.id.btnBack);
        
        code.setText("Module Code " + getIntent().getStringExtra("code"));
        name.setText("Module Name " + getIntent().getStringExtra("name"));
        year.setText("Academic Year " + getIntent().getStringExtra("year"));
        semester.setText("Semester " + getIntent().getStringExtra("semester"));
        credit.setText("Module Credit " + getIntent().getStringExtra("credit"));
        class1.setText("Venue " + getIntent().getStringExtra("class1"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}

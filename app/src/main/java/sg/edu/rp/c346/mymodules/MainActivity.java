package sg.edu.rp.c346.mymodules;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView android;
    TextView ipad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.C346);
        ipad = findViewById(R.id.C349);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),SecondActivity.class);
                intent.putExtra("Module Code: ","C346");
                intent.putExtra("Module Name: ", "Android Programming");
                intent.putExtra("Academic Year: ","2018");
                intent.putExtra("Semester: ","1");
                intent.putExtra("Module Credit: ","4");
                intent.putExtra("Venue: ","W66M");
                startActivity(intent);
            }
        });
        ipad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getBaseContext(),SecondActivity.class);
                intent.putExtra("Module Code: ","C349");
                intent.putExtra("Module Name: ", "iPad Programming");
                intent.putExtra("Academic Year: ","2018");
                intent.putExtra("Semester: ","1");
                intent.putExtra("Module Credit: ","4");
                intent.putExtra("Venue: ","W66M");
                startActivity(intent);
            }
        });
            }
        }




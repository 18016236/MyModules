package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer=findViewById(R.id.textView);
        tvAnswer2=findViewById(R.id.textView);
        Intent intentReceived=getIntent();

        if (intentReceived.equals("c346")){

            String value1 = intentReceived.getStringExtra("Module Code");
            String value2= intentReceived.getStringExtra("Module Name");
            String value3= intentReceived.getStringExtra("Academic Year");
            String value4= intentReceived.getStringExtra("Semester");
            String value5= intentReceived.getStringExtra("Module Credit");
            String value6= intentReceived.getStringExtra("Venue");

            tvAnswer.setText("Module Code: "+ value1 + "\n Module Name: " + value2 + "\n Academic Year: "+value3+" \n Semester: "+value4+" \n Module Credit: "+value5+" \n Venue: "+value6);

        }else{

            String value1= intentReceived.getStringExtra("Module Code");
            String value2= intentReceived.getStringExtra("Module Name");
            String value3= intentReceived.getStringExtra("Academic Year");
            String value4= intentReceived.getStringExtra("Semester");
            String value5= intentReceived.getStringExtra("Module Credit");
            String value6= intentReceived.getStringExtra("Venue");

            tvAnswer2.setText("Module Code: "+ value1 + "\nModule Name: " + value2 + "\nAcademic Year: "+value3+" \nSemester: "+value4+" \nModule Credit: "+value5+" \nVenue: "+value6);

        }

    }
}

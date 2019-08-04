package HelpAll.org;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LessonActivity extends AppCompatActivity {
    public static int user_input;
    public static String str_num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textViewLessonId = (TextView) findViewById(R.id.textViewLessonId);



        if(getIntent().hasExtra("HelpAll.key.number")){
            str_num = getIntent().getExtras().getString("HelpAll.key.number");
            System.out.println(str_num);
            user_input = Integer.parseInt(str_num);
            textViewLessonId.setText("table of "+user_input);
            textViewLessonId.append("\n");
            for(int i = 1; i < 11; i++){
                textViewLessonId.append(user_input+" X "+i+" = "+i*user_input);
                textViewLessonId.append("\n");
            }

        }

        Button buttonStartId = (Button) findViewById(R.id.buttonStartId);


        buttonStartId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStart = new Intent(getApplicationContext(), PracticeActivity.class);
                intentStart.putExtra("HelpAll.key.StartPractice", str_num);
                startActivity(intentStart);
            }
        });
    }
}

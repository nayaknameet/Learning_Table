package HelpAll.org;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textViewLessonId = (TextView) findViewById(R.id.textViewLessonId);
        

        if(getIntent().hasExtra("HelpAll.key.number")){
            int user_input = Integer.parseInt(getIntent().getExtras().getString("HelpAll.key.number"));
            textViewLessonId.setText("table of "+user_input);
            textViewLessonId.append("\n");
            for(int i = 1; i < 11; i++){
                textViewLessonId.append(user_input+" X "+i+" = "+i*user_input);
                textViewLessonId.append("\n");
            }

        }
    }
}

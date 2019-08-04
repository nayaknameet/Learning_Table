package HelpAll.org;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonLessonId = (Button) findViewById(R.id.buttonLessonId);



        ButtonLessonId.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String str_num = getStr_num();
                openLessonActivity(str_num);
            }
        });

        Button ButtonStartId = (Button) findViewById(R.id.buttonStartId);


        ButtonStartId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_num = getStr_num();
                Intent intentStart = new Intent(getApplicationContext(), PracticeActivity.class);
                intentStart.putExtra("HelpAll.key.StartPractice", str_num);
                startActivity(intentStart);
            }
        });


    }

    public void openLessonActivity(String str_num){
        Intent intentLesson = new Intent(getApplicationContext(), LessonActivity.class);
        // Passing the value to LessonActivity
        intentLesson.putExtra("HelpAll.key.number", str_num);
        startActivity(intentLesson);
    }

    public String getStr_num() {
        EditText EditTextNumberId = (EditText) findViewById(R.id.editTextNumberId);
        String str_num = EditTextNumberId.getText().toString();
        return str_num;
    }

}

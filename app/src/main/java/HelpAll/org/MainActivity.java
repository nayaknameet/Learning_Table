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
                EditText EditTextNumberId = (EditText) findViewById(R.id.editTextNumberId);
                String str_num = EditTextNumberId.getText().toString();
                openLessonActivity(str_num);
            }
        });

    }

    public void openLessonActivity(String str_num){
        Intent intentLesson = new Intent(getApplicationContext(), LessonActivity.class);
        // Passing the value to LessonActivity
        intentLesson.putExtra("HelpAll.key.number", str_num);
        startActivity(intentLesson);
    }
}

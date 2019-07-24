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
                int num = Integer.parseInt(EditTextNumberId.getText().toString());
                System.out.println(num);
                openLessonActivity();
            }
        });

    }

    public void openLessonActivity(){
        Intent intendLesson = new Intent(this, LessonActivity.class);
        startActivity(intendLesson);
    }
}

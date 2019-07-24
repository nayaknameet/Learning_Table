package HelpAll.org;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

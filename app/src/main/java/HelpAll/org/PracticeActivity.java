package HelpAll.org;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PracticeActivity extends AppCompatActivity {
    TextView textViewTableId, textPreviousAnsId;
    int i = 1;
    String str_num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        final TextView textViewAnwserId = (TextView) findViewById(R.id.textViewAnswer);
        textPreviousAnsId = (TextView) findViewById(R.id.textPreviousAnsId);

        textViewTableId = (TextView) findViewById(R.id.textViewTableId);
        if(getIntent().hasExtra("HelpAll.key.StartPractice")){
            str_num = getIntent().getExtras().getString("HelpAll.key.StartPractice");
            ChangeTextView(str_num, 1);
        }


        Button buttonNextId = (Button) findViewById(R.id.buttonNext);
        buttonNextId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewAnwserId.setText("Answer");
                if(i==10){
                    return;
                }
                ChangeTextView(str_num, ++i);
            }
        });

        Button buttonPreviousId = (Button) findViewById(R.id.buttonPrevious);
        buttonPreviousId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewAnwserId.setText("Answer");
                if(i == 1){
                    return;
                }
                ChangeTextView(str_num, --i);
            }
        });


        textViewAnwserId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans = Integer.parseInt(str_num);
                textViewAnwserId.setText(""+ans*i);
            }
        });




    }

    public void ChangeTextView(String str_num, int incr_num){
        textViewTableId.setText(str_num+" X "+incr_num+":");
        textPreviousAnsId.setText(""+Integer.parseInt(str_num)*(incr_num - 1));

    }

}

package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exercise extends AppCompatActivity {

    private Button AddWorkout1;
    private Button AddWorkout2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        AddWorkout1=(Button) findViewById(R.id.AddWorkButton1);
        AddWorkout2=(Button) findViewById(R.id.AddWorkoutButton2);

        AddWorkout1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AddToMain();
            }
        });

        AddWorkout2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AddToMain();
            }
        });
    }

    public void AddToMain()
    {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }

    public void OpenAccount(View view)
    {
        Intent intent = new Intent(this , ViewAccount.class);
        startActivity(intent);
    }

    public void OpenHome(View view)
    {
        Intent intent = new Intent(this , MainPage.class);
        startActivity(intent);
    }

    public void OpenProgress(View view) {
        Intent intent = new Intent(this, ViewProgress.class);
        startActivity(intent);
    }

    public void OpenLearn(View view) {
        Intent intent = new Intent(this, Learn.class);
        startActivity(intent);
    }

    public void Initialize()
    {
        String[] textArray={"one","two","asdasasdf asdf dsdaa"};
        int length=textArray.length;
        ConstraintLayout layout = new ConstraintLayout(this);

        for(int i=0;i<length;i++){
            ConstraintLayout.LayoutParams constParam = new ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            TextView tv=new TextView(getApplicationContext());
            tv.setText(textArray[i]);
            constParam.addRule(ConstraintLayout.BELOW, tv.getId());
            layout.addView(tv, relativeParams);
        }
    }


}
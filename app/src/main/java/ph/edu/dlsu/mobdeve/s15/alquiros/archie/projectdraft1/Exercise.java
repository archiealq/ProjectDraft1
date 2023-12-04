package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
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

        Initialize();

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

    @SuppressLint("ResourceAsColor")
    public void Initialize()
    {
        System.out.println("in");
        String[] textArray={"one","two","asdasasdf asdf dsdaa"};
        int length=textArray.length;
        ConstraintLayout layout =(ConstraintLayout) findViewById(R.id.ConstLay);
        ConstraintSet constSet = new ConstraintSet();
        View lastView = findViewById(R.id.excerciseCalBurnt);

        for(int i=0;i<length;i++){
            System.out.println("in");
            TextView tv=new TextView(this);
            tv.setText(textArray[i]);
            tv.setTextColor(Color.parseColor("#FFFFFF"));
            tv.setId(View.generateViewId());
            layout.addView(tv, 0);
            constSet.clone(layout);
            constSet.connect(tv.getId(), ConstraintSet.TOP, lastView.getId(), ConstraintSet.BOTTOM, 1);
            constSet.connect(tv.getId(), ConstraintSet.LEFT, lastView.getId(), ConstraintSet.LEFT, 1);
            constSet.applyTo(layout);
            lastView=tv;
        }


    }


}
package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
}
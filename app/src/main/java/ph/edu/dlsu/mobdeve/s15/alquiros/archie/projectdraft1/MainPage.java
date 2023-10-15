package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    private Button breakfast;
    private Button lunch;

    private Button dinner;
    private Button snack;

    private Button exercise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        breakfast = (Button) findViewById(R.id.AddBreakfast);
        lunch = (Button) findViewById(R.id.AddLunch);
        dinner = (Button) findViewById(R.id.AddDinner);
        snack = (Button) findViewById(R.id.AddSnack);
        exercise = (Button) findViewById(R.id.AddExercise);

        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenBreakfast();
            }
        });

        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenLunch();
            }
        });

        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDinner();
            }
        });

        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSnack();
            }
        });

        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenExercise();
            }
        });

    }

    public void OpenBreakfast()
    {
        Intent intent = new Intent(this , SearchItem.class);
        intent.putExtra("type", "breakfast");
        startActivity(intent);
    }

    public void OpenLunch()
    {
        Intent intent = new Intent(this , SearchItem.class);
        intent.putExtra("type", "lunch");
        startActivity(intent);
    }

    public void OpenDinner()
    {
        Intent intent = new Intent(this , SearchItem.class);
        intent.putExtra("type", "dinner");
        startActivity(intent);
    }

    public void OpenSnack()
    {
        Intent intent = new Intent(this , SearchItem.class);
        intent.putExtra("type", "snack");
        startActivity(intent);
    }

    public void OpenExercise()
    {
        Intent intent = new Intent(this , SearchItem.class);
        intent.putExtra("type", "exercise");
        startActivity(intent);
    }

}
package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SearchItem extends AppCompatActivity {
    String searchtype;

    TextView searchsource;

    TextView calories;

    TextView name;

    private Button FoodButton1;
    private Button FoodButton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item);

        FoodButton1=(Button) findViewById(R.id.AddButtonFood1);
        FoodButton2=(Button) findViewById(R.id.AddButtonFood2);

        FoodButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                BackToMain();
            }
        });

        FoodButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                BackToMain();
            }
        });

        Intent intent = getIntent();
        searchtype=intent.getStringExtra("type");

    }

    public void BackToMain()
    {
        Intent intent = new Intent (this, MainPage.class);
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

    public void OpenProgress(View view)
    {
        Intent intent = new Intent(this , ViewProgress.class);
        startActivity(intent);
    }

    public void OpenLearn(View view)
    {
        Intent intent = new Intent(this , Learn.class);
        startActivity(intent);
    }


}
package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViewAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_account);
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

}
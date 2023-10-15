package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    private Button create;
    private Button backtologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        create = (Button) findViewById(R.id.CreateAccountButton);
        backtologin = (Button) findViewById(R.id.BackToLoginButton);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });

        backtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backLogin();
            }
        });
    }

    public void openMain()
    {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }

    public void backLogin()
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
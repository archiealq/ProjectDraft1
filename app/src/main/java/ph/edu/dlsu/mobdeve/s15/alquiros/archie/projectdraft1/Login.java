package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button login;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.loginbutton);
        register = (Button) findViewById(R.id.registerbutton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMain();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRegister();
            }
        });

    }

    public void OpenMain()
    {
        Intent intent = new Intent(this , MainPage.class);
        startActivity(intent);
    }

    public void OpenRegister()
    {
        Intent intent = new Intent(this , Register.class);
        startActivity(intent);
    }
}
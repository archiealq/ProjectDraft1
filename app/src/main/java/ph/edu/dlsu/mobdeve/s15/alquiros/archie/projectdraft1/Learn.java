package ph.edu.dlsu.mobdeve.s15.alquiros.archie.projectdraft1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


public class Learn extends AppCompatActivity {
    private WebView calories;
    private WebView macros;
    private WebView muscle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        calories=(WebView)  findViewById(R.id.caloriesVideo);
        String caloriesYT="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/VEQaH4LruUo?si=UHIDigs2GHPa4wXy\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        calories.loadData(caloriesYT, "text/html", "utf-8");
        calories.getSettings().setJavaScriptEnabled(true);
        calories.setWebChromeClient(new WebChromeClient());

        macros=(WebView)  findViewById(R.id.macrosVideo);
        String macrosYT="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/smPR215SRzM?si=pVo1ZtzQuUrah4ug\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        macros.loadData(macrosYT, "text/html", "utf-8");
        macros.getSettings().setJavaScriptEnabled(true);
        macros.setWebChromeClient(new WebChromeClient());

        muscle=(WebView)  findViewById(R.id.muscleVideo);
        String muscleYT="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nuzT2iJESFA?si=gVEZoySZI51-MO8Y\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        muscle.loadData(muscleYT, "text/html", "utf-8");
        muscle.getSettings().setJavaScriptEnabled(true);
        muscle.setWebChromeClient(new WebChromeClient());

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
}
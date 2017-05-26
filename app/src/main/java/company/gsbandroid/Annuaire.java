package company.gsbandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by sylvain on 24/05/2017.
 */

public class Annuaire extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annuaire);

        Button boutonRetour = (Button)findViewById(R.id.boutonRetourA);
        boutonRetour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                finish();
            }
        });

        Button boutonGithub = (Button)findViewById(R.id.buttonGithub);
        Button boutonGoogle = (Button)findViewById(R.id.buttonGoogle);

        boutonGithub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                Intent intent = new Intent(Annuaire.this, GithubListActivity.class);
                startActivity(intent);
            }
        });

        boutonGoogle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                Intent intent = new Intent(Annuaire.this, GoogleListActivity.class);
                startActivity(intent);
            }
        });
    }
}

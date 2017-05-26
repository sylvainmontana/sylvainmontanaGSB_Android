package company.gsbandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boutonAnnuaire = (Button)findViewById(R.id.boutonAnnuaire);
        Button boutonDetente = (Button)findViewById(R.id.boutonDetente);
        Button boutonCalculatrice = (Button)findViewById(R.id.boutonCalculatrice);

        boutonAnnuaire.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                Intent intent = new Intent(MainActivity.this, Annuaire.class);
                startActivity(intent);
            }
        });

        boutonDetente.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                Intent intent = new Intent(MainActivity.this, Detente.class);
                startActivity(intent);
            }
        });

        boutonCalculatrice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                Intent intent = new Intent(MainActivity.this, Calculatrice.class);
                startActivity(intent);
            }
        });

    }
}

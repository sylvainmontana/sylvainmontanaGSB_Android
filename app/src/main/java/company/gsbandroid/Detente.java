package company.gsbandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by sylvain on 24/05/2017.
 */

public class Detente extends AppCompatActivity
{
    private ImageView pc;
    private TextView resultat;
    private TextView re;
    private int scoreJ = 0;
    private int scorePC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detente);

        Button boutonRetour = (Button)findViewById(R.id.boutonRetourD);
        boutonRetour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                finish();
            }
        });

        ImageButton boutonPapier = (ImageButton)findViewById(R.id.imageButtonPapier);
        ImageButton boutonCaillou = (ImageButton)findViewById(R.id.imageButtonCaillou);
        ImageButton boutonCiseaux = (ImageButton)findViewById(R.id.imageButtonCiseaux);
        pc = (ImageView)findViewById(R.id.imageViewChargement);
        resultat = (TextView)findViewById(R.id.Resultat);
        re = (TextView)findViewById(R.id.textViewR);

        boutonPapier.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                jouer(0);
            }
        });

        boutonCaillou.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                jouer(1);
            }
        });

        boutonCiseaux.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                jouer(2);
            }
        });
    }

    public void jouer(int coup)
    {
        Random r = new Random();
        int valeur = r.nextInt(3 - 0);
        if(valeur == 0)
        {
            pc.setImageResource(R.drawable.papier);
            if(coup == 2)
            {
                scoreJ += 1;
                re.setText(R.string.gagne);
            }
            else if(coup == 1)
            {
                scorePC += 1;
                re.setText(R.string.perdu);
            }
            else
            {
                re.setText(R.string.nul);
            }
        }
        else if(valeur == 1)
        {
            pc.setImageResource(R.drawable.pierre);
            if(coup == 0)
            {
                scoreJ += 1;
                re.setText(R.string.gagne);
            }
            else if(coup == 2)
            {
                scorePC += 1;
                re.setText(R.string.perdu);
            }
            else
            {
                re.setText(R.string.nul);
            }
        }
        else
        {
            pc.setImageResource(R.drawable.ciseaux);
            if(coup == 0)
            {
                scorePC += 1;
                re.setText(R.string.perdu);
            }
            else if(coup == 1)
            {
                scoreJ += 1;
                re.setText(R.string.gagne);
            }
            else
            {
                re.setText(R.string.nul);
            }
        }
        resultat.setText(scoreJ + " - " + scorePC);
    }
}
package company.gsbandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sylvain on 24/05/2017.
 */

public class Calculatrice extends AppCompatActivity
{
    private EditText editTextResultat;
    private String leCalcul;
    private String lesOperations;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatrice);

        Button boutonRetour = (Button)findViewById(R.id.boutonRetourC);
        boutonRetour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                finish();
            }
        });

        Button bouton1 = (Button)findViewById(R.id.button1);
        Button bouton2 = (Button)findViewById(R.id.button2);
        Button bouton3 = (Button)findViewById(R.id.button3);
        Button bouton4 = (Button)findViewById(R.id.button4);
        Button bouton5 = (Button)findViewById(R.id.button5);
        Button bouton6 = (Button)findViewById(R.id.button6);
        Button bouton7 = (Button)findViewById(R.id.button7);
        Button bouton8 = (Button)findViewById(R.id.button8);
        Button bouton9 = (Button)findViewById(R.id.button9);
        Button bouton0 = (Button)findViewById(R.id.button0);

        Button boutonEgal = (Button)findViewById(R.id.buttonEgal);
        Button boutonC = (Button)findViewById(R.id.buttonC);

        Button boutonPlus = (Button)findViewById(R.id.buttonPlus);
        Button boutonMoins = (Button)findViewById(R.id.buttonMoins);
        Button boutonFois = (Button)findViewById(R.id.buttonFois);
        Button boutonDiviser = (Button)findViewById(R.id.buttonDiviser);
        Button boutonPoint = (Button)findViewById(R.id.buttonPoint);
        Button boutonLeMoins = (Button)findViewById(R.id.buttonLeMoins);

        editTextResultat = (EditText)findViewById(R.id.editTextResultat);
        leCalcul = "";
        lesOperations = "";

        boutonC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText("");
                leCalcul = "";
                lesOperations = "";
            }
        });

        boutonLeMoins.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "-");
                leCalcul += "-";
            }
        });

        bouton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "1");
                leCalcul += "1";
            }
        });

        bouton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "2");
                leCalcul += "2";
            }
        });

        bouton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "3");
                leCalcul += "3";
            }
        });

        bouton4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "4");
                leCalcul += "4";
            }
        });

        bouton5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "5");
                leCalcul += "5";
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "6");
                leCalcul += "6";
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "7");
                leCalcul += "7";
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "8");
                leCalcul += "8";
            }
        });

        bouton9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "9");
                leCalcul += "9";
            }
        });

        bouton0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "0");
                leCalcul += "0";
            }
        });

        boutonPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "+");

                if(leCalcul.isEmpty())
                {
                    leCalcul = "0";
                }
                lesOperations += "+";
                leCalcul += ";";
            }
        });

        boutonMoins.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "-");

                if(leCalcul.isEmpty())
                {
                    leCalcul = "0";
                }
                lesOperations += "-";
                leCalcul += ";";
            }
        });

        boutonFois.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "x");

                if(leCalcul.isEmpty())
                {
                    leCalcul = "0";
                }
                lesOperations += "x";
                leCalcul += ";";
            }
        });

        boutonDiviser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + "/");

                if(leCalcul.isEmpty())
                {
                    leCalcul = "0";
                }
                lesOperations += "/";
                leCalcul += ";";
            }
        });

        boutonPoint.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                editTextResultat.setText(editTextResultat.getText() + ".");
                leCalcul += ".";
            }
        });

        boutonEgal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                if(leCalcul != "")
                {
                    calcul();
                }
            }
        });
    }

    public void calcul()
    {
        String[] nombres = leCalcul.split(";");
        double resultat = Double.parseDouble(nombres[0]);

        for(int i = 1 ; i < nombres.length ; i++)
        {
            if(lesOperations.charAt(i-1) == '+')
            {
                resultat += Double.parseDouble(nombres[i]);
            }
            else if(lesOperations.charAt(i-1) == '-')
            {
                resultat -= Double.parseDouble(nombres[i]);
            }
            else if(lesOperations.charAt(i-1) == 'x')
            {
                resultat *= Double.parseDouble(nombres[i]);
            }
            else if(lesOperations.charAt(i-1) == '/' && Double.parseDouble(nombres[i]) != 0.0)
            {
                resultat /= Double.parseDouble(nombres[i]);
            }
        }

        editTextResultat.setText(Double.toString(resultat));
        leCalcul = Double.toString(resultat);
        lesOperations = "";
    }

    public EditText getEditTextResultat() {
        return editTextResultat;
    }

    public String getLeCalcul() {
        return leCalcul;
    }

    public String getLesOperations() {
        return lesOperations;
    }
}
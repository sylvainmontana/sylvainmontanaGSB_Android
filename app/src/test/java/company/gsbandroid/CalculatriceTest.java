package company.gsbandroid;

import android.content.Context;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sylvain on 25/05/2017.
 */
public class CalculatriceTest
{
    Calculatrice calculatrice;

    @Before
    public void setUp() throws Exception
    {
        calculatrice = new Calculatrice();
    }

    @Test
    public void getEditTextResultat() throws Exception
    {
        EditText editText = calculatrice.getEditTextResultat();
        assertEquals(calculatrice.getEditTextResultat(), editText);
    }

    @Test
    public void getLeCalcul() throws Exception
    {
        String string = calculatrice.getLeCalcul();
        assertEquals(null, string);
    }

    @Test
    public void getLesOperations() throws Exception
    {
        String string = calculatrice.getLesOperations();
        assertEquals(null, string);
    }
}
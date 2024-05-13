package ar.edu.utn.frbb.tup;

import ar.edu.utn.frbb.tup.Inputs.MenuIngreso;
import ar.edu.utn.frbb.tup.Modelos.Banco;



public class App 
{
    public static void main( String[] args )
    {
        MenuIngreso menu = new MenuIngreso();
        Banco banco = new Banco();
    
        menu.ingresarDatos(banco);
        

    }
}

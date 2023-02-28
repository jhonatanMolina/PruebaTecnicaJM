
import java.util.Scanner;
import java.util.random;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    String jugador1 = "";
    String jugador2 = "";
      jugarSet (j1, j2, 3);


    while (jugador1.isEmpty () || jugador2.isEmpty ())
      {
	System.out.println ("ingrese el nombre del jugador 1: ");
	jugador1 = sc.nextLine ();
	System.out.println (" ingrese el nombre del jugador 2: ");
	jugador2 = sc.nextLine ();
      }

    System.out.println ("");
    System.out.println ("El juego iniciara");

    static boolean jugarEljuego (String jugador1, String jugador2)
    {
      random rnd = new Random ();
      int marcadorJugador1 = 0;
      int marcadorJugador2 = 0;
      String puntosJugador1 = 0;
      String puntosJugador2 = 0;
      boolean ganador = true;
      boolean finalDelJuego = false;

      while (finalDelJuego != true)
	{
	  int Random = rnd.nextInt (2);
	  String marcadorPuntos = "";

	  if (random == 0)
	    {
	      marcadorJugador1++;
	      if ((marcadorJugador1 > 3)
		  && (Math.abs (marcadorJugador1 - marcadorJugador2) > 1))
		{
		  System.out.println ("");
		  System.out.println (j1 + "gana el juego");
		  System.out.println ("");
		  marcadorJugador1 = 0;
		  marcadorJugador2 = 0;
		  ganador = true;
		  finalDelJuego = true;
		}
	    }
	  if (random == 1)
	    {
	      marcadorJugador2++;
	      if ((marcadorJugador2 > 3)
		  && (Math.abs (marcadorJugador2 - marcadorJugador1) > 1))
		{
		  System.out.println ("");
		  System.out.println (j2 + "gana el juego");
		  System.out.println ("");
		  marcadorJugador1 = 0;
		  marcadorJugador2 = 0;
		  ganador = false;
		  finalDelJuego = true;
		}
	    }
	  if (marcadorJugador1 == 1)
	    {
	      puntosJugador1 = 15;
	      marcadorPuntos = puntosJugador1 + " - " + puntosJugador2;


	    }
	  if (marcadorJugador1 == 2)
	    {
	      puntosJugador1 = 30;
	      marcadorPuntos = puntosJugador1 + " - " + puntosJugador2;


	    }
	  if (marcadorJugador1 == 3)
	    {
	      puntosJugador1 = 40;
	      marcadorPuntos = puntosJugador1 + " - " + puntosJugador2;


	    }
	  if (marcadorJugador2 == 1)
	    {
	      puntosJugador2 = 15;
	      marcadorPuntos = puntosJugador1 + " - " + puntosJugador2;


	    }
	  if (marcadorJugador2 == 2)
	    {
	      puntosJugador2 = 30;
	      marcadorPuntos = puntosJugador1 + " - " + puntosJugador2;


	    }
	  if (marcadorJugador2 == 3)
	    {
	      puntosJugador2 = 40;
	      marcadorPuntos = puntosJugador1 + " - " + puntosJugador2;


	    }
	  if (marcadorJugador1 > 3 && marcadorJugador2 > 3
	      && marcadorJugador1 == marcadorJugador2)
	    {

	      marcadorPuntos = "deuce";


	    }
	  if (marcadorJugador1 > 3 && marcadorJugador1 > marcadorJugador2)
	    {
	      puntosJugdor1 = "";
	      puntosJugador2 = "";
	      marcadorPuntos = "ventaja" + j1;


	    }
	  if (marcadorJugador2 > 3 && marcadorJugador2 > marcadorJugador1)
	    {
	      puntosJugador1 = "";
	      puntosJugador2 = "";
	      marcadorPuntos = "ventaja" + j2;

	    }
	  System.out.println ("");
	  System.out.println (marcadorPuntos);
	}

      return ganador;
    }

    static void jugarSet (String j1, String j2, float sets)
    {
      int juegosJugador1 = 0;
      int juegosJugador2 = 0;
      int setjugador1 = 0;
      int setjugador2 = 0;
      float set1 = (sets / 2);
      double set = set1 + 0.5;
      boolean finaldelpartido = false;

      while (!finaldelpartido)
	{
	  boolean resultadojuego = jugarEljuego (j1, j2);
	  if (resultadojuego)
	    {
	      juegosJugador1++;
	    }
	  else
	    {
	      juegosJugador2++;
	    }
	  if (juegosJugador1 >= 6
	      && (Math.abs (juegosJugador1 - juegosJugador2) > 1)
	      || juegosJugador1 == 7 && juegosJugador2 == 6)
	    {
	      setjugador1++;
	      System.out.println (j1 + " gana el set por " + juegosJugador1 +
				  " a " + juegosJugador2);
	      System.out.println ("");
	      juegosJugador1 = 0;
	      juegosJugador2 = 0;
	      if (setjugador1 == set && setjugador1 > setjugador2)
		{
		  System.out.println (j1 + " gana el partido por " +
				      setjugador1 + " sets a " + setjugador2);
		  finaldelpartido = true;
		}
	    }
	  if (juegosJugador2 >= 6
	      && (Math.abs (juegosJugador2 - juegosJugador1) > 1)
	      || juegosJugador2 == 7 && juegosJugador1 == 6)
	    {
	      setjugador2++;
	      System.out.println (j2 + " gana el set por " + juegosJugador2 +
				  " a " + juegosJugador1);
	      System.out.println ("");
	      juegosJugador1 = 0;
	      juegosJugador2 = 0;
	      if (setjugador2 == set && setjugador2 > setjugador1)
		{
		  System.out.println (j2 + " gana el partido por " +
				      setjugador2 + " sets a " + setjugador1);
		  finaldelpartido = true;
		}
	    }

	}


    }
  }

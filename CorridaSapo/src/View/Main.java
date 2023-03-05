package View;

import controller.*;

public class Main 
{
	public static void main (String args[])
	{
		int Distancia = 100;
		Construtor[] C = new Construtor[5];

		for(int J =0;J<5;J++)
		{
			C[J] = new Construtor();
		}
		
		for (int J=1;J<=5;J++)
		{
			Sapos S = new Sapos(Distancia,J,C);
			S.start();
		}
	}
}

package controller;
import java.math.*;
import controller.*;

public class Sapos extends Thread 
{
	private int Dist;
	private int N;
	private Construtor[] c;
	public Sapos (int Dist, int N, Construtor[] c)
	{
		this.Dist = Dist;
		this.N = N;
		this.c = c;
	}

	public void run()
	{
		Corrida();
	}
	public void Corrida()
	{
		int Salto = 0, SA;
		
		while (Salto < Dist)
		{
			SA = (int) (Math.random()*11);
			Salto = SA + Salto;
			if (Salto < Dist)
			{
				System.out.println("O Sapo Nº"+N+" deu um salto de "+SA+"m percorrendo um total de: "+Salto+"m.");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("O Sapo Nº"+N+" deu um salto de "+SA +"m, Cruzando a linha de chegada.");
				int J=0;
				while (J != 5)
				{
					if (c[J].Col == 0)
					{
						c[J].Col = J+1;
						c[J].N = N;	
						if (J!= 4)
						{
							J = 5;
						}
						if (J == 4)
						{
							for(int K=0; K<5;K++)
							{
								System.out.println(c[K].Col+"º colocado foi o sapo Nº"+c[K].N);
							}
						}
					}
					else
					{
						J= J+1;
					}
				}
			}
		}

	}
}

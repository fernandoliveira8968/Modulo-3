package RaizesQuadradas;

import java.util.Scanner;

public class RaizesQuadradas {

	static void RaizesQuadradas (int Linf, int Lsup) 
	{
		Scanner LerS=new Scanner (System.in);
			
			System.out.print("Qual o valor mínimo?");
			Linf = LerS.nextInt();
			System.out.print("Qual o valor máximo?");
			Lsup = LerS.nextInt();
	
			for( int I=Linf; I<=Lsup ; I++)
		
				System.out.println(String.format("%5.1f",Math.sqrt(I)));
	}

	public static void main(String[] args) 
	{
		
		int Linf = 0 , Lsup = 0;
		//RaizesQuadradas(25,36);
		//RaizesQuadradas(100,120);

		RaizesQuadradas(Linf,Lsup);
		
		
	}

}

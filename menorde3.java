package menorde3;

import java.util.Scanner;

public class menorde3 {

	static int menorde3 (int x,int y,int z)
	{if (x>y)
	x=y;
	if (x>z)
	x=z;
	return x;
	}
	
	public static void main(String[] args) {
		{int x,y,z;
		 Scanner LerS= new Scanner (System.in);
		System.out.print("Digite o primeiro valor");
		x = LerS.nextInt();
		System.out.print("Digite o segundo n�mero");
		y = LerS.nextInt();
		System.out.print("Digite o terceiro n�mero");
		z = LerS.nextInt();
		System.out.println ("Menor=" +menorde3(x,y,z));

	}

}}

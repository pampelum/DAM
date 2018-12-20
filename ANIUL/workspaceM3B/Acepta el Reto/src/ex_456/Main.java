package ex_456;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t, w, h, q;
		int total_tauleta;
		float div = 0;
		
		t = sc.nextInt();
		
		for(int i = 0; i < t; i++)
		{
			div = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			q = sc.nextInt();
			
			
			total_tauleta = w * h;
			
			if(total_tauleta != 0 && q != 0)
			{
				div = ((float)q / (float)total_tauleta);
				
			}
			
			div = (float) Math.ceil(div);		
			System.out.println((int)div);
			
		}
		

	}

}

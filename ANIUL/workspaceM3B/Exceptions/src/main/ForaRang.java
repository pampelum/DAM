package main;
import java.io.*;

public class ForaRang extends Exception {
	
	private int num;
	
	public ForaRang(int n)
	{
		this.num = n;
	}
	
	public int getNum()
	{
		return num;
	}
	
}

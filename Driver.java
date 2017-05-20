package home;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Driver {
	static int insert = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Coc> ft = new ArrayList<>();
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		ft.add(new Coc("Irhaz", "power", "50", "100"));
		
		ArrayList<Coc> fkip = new ArrayList<>();
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		fkip.add(new Coc("Riki", "power", "37", "60"));
		
		ArrayList<Coc> fikes = new ArrayList<>();
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		fikes.add(new Coc("Nanda", "power", "36", "78"));
		
		Stack<Coc> clan = new Stack<>();
		
		Show method = new Show();
		method.show();
		do {
			insert = scan.nextInt();
			if(insert == 1) {
				System.out.println();
				System.out.println("Daftar Player FT");
				System.out.println("Name   Rank  Level  Score");
				for(Coc c:ft)
					System.out.println(c.getName()+"  "+c.getRank()+"  "+c.getLevel()+"  "+c.getScore());
			}
			else if(insert == 2){
				System.out.println();
				System.out.println("Daftar Player FKIP");
				System.out.println("Name   Rank  Level  Score");
				for(Coc c:fkip)
					System.out.println(c.getName()+"  "+c.getRank()+"  "+c.getLevel()+"  "+c.getScore());
			}
			else if(insert == 3) {
				System.out.println();
				System.out.println("Daftar Player FIKES");
				System.out.println("Name   Rank  Level  Score");
				for(Coc c:fikes)
					System.out.println(c.getName()+"  "+c.getRank()+"  "+c.getLevel()+"  "+c.getScore());
			
			}
			else
				System.out.println("Not found!");
			
			System.out.println();
			method.nameClan();
		} while (insert !=0);	
	}
}

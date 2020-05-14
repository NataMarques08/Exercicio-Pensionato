package pensao;

import java.util.Scanner;
import quartos.Hospedes;

public class recepcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Hospedes[] vect = new Hospedes[10];
		int aluguel = 0;
		
		System.out.print("How many rooms will be rented:");
		aluguel = sc.nextInt();
		int room = 0;
		for(int i=0;i<aluguel;i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #"+(i+1));
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room:");
			room = sc.nextInt();
			vect[room] = new Hospedes(name,email);
		}
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i]!=null) {
				System.out.println(i+": "+vect[i].getHospede()+", "+vect[i].getEmail());
			}
		}
		
		sc.close();
	}

}

package com.uverwolf.password;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Password> contrase�as = new ArrayList<Password>();
		ArrayList<Boolean> booleanos = new ArrayList<Boolean>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean repetir = true;
		do {
			System.out.println("Ingrese cantidad de contrase�as a crear");
			int arrayTama�o=scan.nextInt();
			System.out.println("Ingrese longitud de las contrase�as");
			int longitud=scan.nextInt();
			
			
			for(int i=0;i<arrayTama�o;i++) {
				Password x=new Password();
				x.generarPass(longitud);
				contrase�as.add(x);
				if(x.esFuerte()){
					
					booleanos.add(true);
				}else {
					booleanos.add(false);
				}
			}
			for (int i = 0; i < contrase�as.size(); i++) {
			    System.out.println(contrase�as.get(i).getContrase�a()+ " "+ booleanos.get(i));
			}
			contrase�as.get(0).esFuerte();
		} while (repetir);

	}

}

package com.uverwolf.password;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Password> contraseñas = new ArrayList<Password>();
		ArrayList<Boolean> booleanos = new ArrayList<Boolean>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean repetir = true;
		do {
			System.out.println("Ingrese cantidad de contraseñas a crear");
			int arrayTamaño=scan.nextInt();
			System.out.println("Ingrese longitud de las contraseñas");
			int longitud=scan.nextInt();
			
			
			for(int i=0;i<arrayTamaño;i++) {
				Password x=new Password();
				x.generarPass(longitud);
				contraseñas.add(x);
				if(x.esFuerte()){
					
					booleanos.add(true);
				}else {
					booleanos.add(false);
				}
			}
			for (int i = 0; i < contraseñas.size(); i++) {
			    System.out.println(contraseñas.get(i).getContraseña()+ " "+ booleanos.get(i));
			}
			contraseñas.get(0).esFuerte();
		} while (repetir);

	}

}

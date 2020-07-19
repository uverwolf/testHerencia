package com.uverwolf.videoclub;
import java.util.Date;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		Date fechaA=new Date();
		Date fechaE =new Date();
		Listado juegos= new Listado();
		Listado series =new Listado();
//		Serie serie1 = new Serie("Casablcscanca",2,"Romance","Michael Curtiz",fechaA,fechaE);
//		Serie serie2 = new Serie("Excalibur",95,"Romance","Michael Curtiz",fechaA,fechaE);
//		Serie serie3 = new Serie("Casablacssncsa",25,"Romance","Michael Curtiz",fechaA,fechaE);
//		Serie serie4 = new Serie("Casablancas",3,"Romance","Michael Curtiz",fechaA,fechaE);
//		
//		VideoJuego e = new VideoJuego("Megaman",50,"Plataforma","Capcom",fechaA,fechaE);
//		VideoJuego e2 = new VideoJuego("ccan",55,"Plataforma","Capcom",fechaA,fechaE);
//		VideoJuego e3 = new VideoJuego("donki",111,"Plataforma","Capcom",fechaA,fechaE);
//		VideoJuego e4 = new VideoJuego("Megamcccdasdan",5000,"Plataforma","Capcom",fechaA,fechaE);
//		VideoJuego e5 = new VideoJuego("Mario",350,"Plataforma","Capcom",fechaA,fechaE);
////		VideoJuego e6 = new VideoJuego("Megamccasdacan",6,"Plataforma","Capcom",fechaA,fechaE);
//		juegos.agregar(e);
//		juegos.agregar(e2);
//		juegos.agregar(e3);
//		juegos.agregar(e4);
//		juegos.agregar(e5);
//		
//		

boolean repetir=true;
do {
	@SuppressWarnings("resource")
	Scanner ingreso= new Scanner(System.in);
	System.out.println("Ingrese opcion\n1)Agregar Serie\n2)Agregar Juego\n3)Ver Juegos\n4)Ver Series\n5)Contar y devolver juegos\n6)Contar y devolver series\n7)Mostrar Juego con mas horas estimadas y serie con mas temporadas");
	int ingreso2 = ingreso.nextInt();
	switch (ingreso2) {		
	case 1:
		Scanner ingreso1= new Scanner(System.in);
		
		System.out.println("Ingrese titulo");
		String title = ingreso1.nextLine();
		
		System.out.println("Ingrese temporadas");
		int nroTemporadas = ingreso1.nextInt();
		
		System.out.println("Ingrese genero");
		String genero = ingreso1.next();
		
		System.out.println("Ingrese creador");
		String creador = ingreso1.next();
		series.agregar(new Serie(title,nroTemporadas,genero,creador,fechaA,fechaE));
		break;
	case 2:
		Scanner ingresoJuego= new Scanner(System.in);
		
		System.out.println("Ingrese titulo");
		String tituloJuego = ingresoJuego.nextLine();
		
		System.out.println("Ingrese horas estimadas");
		int horasEstimadas = ingresoJuego.nextInt();
		
		System.out.println("Ingrese genero");
		String generoJuego = ingresoJuego.next();
		
		System.out.println("Ingrese creador");
		String empresa = ingresoJuego.next();
		juegos.agregar(new VideoJuego(tituloJuego,horasEstimadas,generoJuego,empresa,fechaA,fechaE));
		break;
	case 3:
		juegos.verArray();
		break;
	case 4:
		series.verArray();
		break;
	case 5:
		juegos.contarJuegos();
		break;
	case 6:
		series.contarSeries();
		break;
		
	case 7:
		juegos.mayorJ();
		series.mayorS();
		break;
	case 8:
		series.prestar();
		break;
	case 9:
		juegos.prestar();
		break;
	default:
		System.out.println("Opcion incorrecta");
		break;
	}
} while (repetir);

//		System.out.println(x.toString());
		
	}

}

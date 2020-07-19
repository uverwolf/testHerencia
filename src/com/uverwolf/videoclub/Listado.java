package com.uverwolf.videoclub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
@SuppressWarnings({ "resource", "rawtypes" })
public class Listado  implements Iterable {
	ArrayList<VideoJuego> juegos=new ArrayList<VideoJuego>();
	ArrayList<Serie> series=new ArrayList<Serie>();
	public void verArray() {
		
		for(VideoJuego juego : juegos) {
			System.out.println(juego);
		}
		
		for(Serie serie : series) {
			System.out.println(serie);
		}
	}


	public void agregar(VideoJuego juego) {
		juegos.add(juego);
	}
	
	public void agregar(Serie serie) {
		series.add(serie);
	}
	public void mayorJ() {
		if(juegos.size()<=0) {
			System.out.println("No existen juegos en el listado");
		}else {
		int contar = juegos.get(0).getHorasEstimadas();
		String nombre =juegos.get(0).getTitulo();
		
		for(int i = 0 ;i<juegos.size();i++) {
			
			if(juegos.get(i).getHorasEstimadas()>contar) {
				contar=juegos.get(i).getHorasEstimadas();	
				nombre =juegos.get(i).getTitulo();
			}	
		}
		System.out.println("El valor mayor en las horas de juego es " +contar+" y el juego es: "+nombre);}
	}
	public void mayorS() {
		// TODO Auto-generated method stub
		if(series.size()<=0) {
			System.out.println("no existen series en el array");
		}else {
		int contar = series.get(0).getNumeroTemporadas();
		String nombre = series.get(0).getTitulo();
		for(int i = 0 ;i<series.size();i++) {
			
			if(series.get(i).getNumeroTemporadas()>contar) {
				contar=series.get(i).getNumeroTemporadas();	
				nombre =series.get(i).getTitulo();
			}	
		}
		System.out.println("Mayor temporada " +contar+" nombre serie:"+nombre);}
	}
	
	public void contarJuegos() {
		int contador=0;	
		for(int i=0;i<juegos.size();i++) {
			if(juegos.get(i).getEntregado()) {
				juegos.get(i).devolver();				
				contador++;
			}
		}
		System.out.printf("Existen :%s Juegos prestados en el sistema\n",contador);
		
		
	}
	public void contarSeries() {
		int contadorS=0;
		for(int i=0;i<series.size();i++) {
			if(series.get(i).getEntregado()) {
				series.get(i).devolver();				
				contadorS++;
			}
		}
		System.out.printf("Existen :%s Series prestadas en el sistema\n",contadorS);
	}
	
	public void prestar() {
		
		Scanner sc = new Scanner(System.in);
		for(Serie serie: series) {
			
			if(!serie.getEntregado()) {
				System.out.println("Desea prestar esta serie?("+serie.getTitulo()+")");
				String response = sc.next();
				switch (response) {
				case "si":
					serie.entregar();
					break;
				case "no":
					serie.devolver();
				default:
					System.out.println("Opcion invalida");
					break;
				}
				
			}
		}
		for(VideoJuego juego: juegos) {
			
			if(!juego.getEntregado()) {
				System.out.println("Desea prestar esta juego?(si/no)("+juego.getTitulo()+")");
				String response = sc.next();
				switch (response) {
				case "si":
					juego.entregar();
					break;
				case "no":
					juego.devolver();
				default:
					System.out.println("Opcion invalida");
					break;
				}
				
			}
		}
		
		
	}
//	public void contarSeries() {
//		int contadorS=0;
//		for(int i=0;i<series.size();i++) {
//			if(!series.get(i).getEntregado()) {
//				series.get(i).devolver();				
//				contadorS++;
//			}
//	}System.out.println(contadorS);
//		}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}

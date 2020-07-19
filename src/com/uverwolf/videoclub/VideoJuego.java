package com.uverwolf.videoclub;
import java.util.Date;

public class VideoJuego extends VideoSerie implements Entregable{
	private String titulo;
	private int horasEstimadas =10;
	private boolean entregado =false;
	private String genero;
	private String compa�ia;
	private Date fEntrega,fDevolucion;
	
	
	@Override
	public String toString() {
		return "VideoJuego :[titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compa�ia=" + compa�ia + ", fEntrega=" + fEntrega + ", fDevolucion="
				+ fDevolucion + "]";
	}
	

	//CONSTRUCTORES
	public VideoJuego() {
		
	}
	public VideoJuego(String titulo,int horasE) {
		
	}	
	public VideoJuego(String titulo, int horasEstimadas,String genero, String compa�ia) {	
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;

	}
	public VideoJuego(String titulo, int horasEstimadas,String genero, String compa�ia,
			Date fEntrega, Date fDevolucion) {	
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
		this.fEntrega = fEntrega;
		this.fDevolucion = fDevolucion;
	}
	
	//GETTER SETTER
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	protected boolean getEntregado() {
		return entregado;
	}
	
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompa�ia() {
		return compa�ia;
	}
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	public Date getfEntrega() {
		return fEntrega;
	}
	public void setfEntrega(Date fEntrega) {
		this.fEntrega = fEntrega;
	}
	public Date getfDevolucion() {
		return fDevolucion;
	}
	public void setfDevolucion(Date fDevolucion) {
		this.fDevolucion = fDevolucion;
	}
	
	
	
	//METODOS DE INTERFAZ //
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		setEntregado(true);
		setfEntrega(fechaActual);
		System.out.println("Se presto correctamente el Juego!");
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		setEntregado(false);
		setfDevolucion(fechaActual);
	}
	@Override
	public void isEntregado() {
		// TODO Auto-generated method stub
		if(getEntregado()) {
			System.out.println("Se encuentra prestada");
		}else {
			System.out.println("Se encuentra disponible");
		}
	}




}

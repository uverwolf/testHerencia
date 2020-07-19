package com.uverwolf.videoclub;
import java.util.Date;
import java.util.ArrayList;

public class Serie extends VideoSerie implements Entregable {
	private String titulo;
	private int numeroTemporadas =3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	private Date fechaEntrega;
	private Date fechaDevolucion;
	ArrayList<Serie> listaSeries=new ArrayList<Serie>();

	public void verArray() {
		// TODO Auto-generated method stub
		for(Serie series : listaSeries) {
			System.out.println(series);
		}
	}

	public void agregar(Serie e) {
		// TODO Auto-generated method stub
		listaSeries.add(e);
	}
	
	//Objeto a string
	@Override
	public String toString() {
		return "Serie : [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + ", fechaEntrega=" + fechaEntrega
				+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	//Constructores
	public Serie() {
		
	}
	public Serie(String creador,String titulo) {
		setCreador(creador);
		setTitulo(titulo);
	}
	public Serie(String titulo,int nroTempo,String genero,String creador) {
		setTitulo(titulo);
		setNumeroTemporadas(nroTempo);
		setGenero(genero);
		setCreador(creador);
		

	}
	public Serie(String titulo,int nroTempo,String genero,String creador, Date fEntrega,Date fDevolucion) {
		setTitulo(titulo);
		setNumeroTemporadas(nroTempo);
		setGenero(genero);
		setCreador(creador);
		setFechaEntrega(fEntrega);
		setFechaDevolucion(fDevolucion);

	}
	
	//GEtter Setter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public boolean getEntregado() {
		return entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
		setEntregado(true);
		setFechaEntrega(fechaActual);
		System.out.println("Se presto correctamente la serie");
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
		setEntregado(false);
		setFechaDevolucion(fechaActual);
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

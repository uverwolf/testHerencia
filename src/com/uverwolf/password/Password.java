package com.uverwolf.password;
public class Password {
	private int longitud=8;
	private String contraseña;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Password() {
		
	}
	public Password(int longitud) {
		this.longitud=longitud;
	}
	
	public void generarPass(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
        StringBuilder newpass = new StringBuilder(longitud);
        
        for(int i =0 ; i<longitud;i++) {
        	  int posicion= (int)(caracteres.length()* Math.random()); 
        	  newpass.append(caracteres.charAt(posicion));
        }
        setContraseña(newpass.toString());
	}
	
	public boolean esFuerte() {
		int mayusculas = 0;
		int minusculas =0;
		int numeros=0;
		for(int i=0;i<getContraseña().length();i++) {
			if(Character.isUpperCase(getContraseña().charAt(i))){
				mayusculas++;
			}else if(Character.isDigit(getContraseña().charAt(i))) {
				numeros++;
			}else if(Character.isLowerCase(getContraseña().charAt(i))) {
				minusculas++;
			}
			
		}
		
		if(mayusculas>=2 && numeros>=3 && minusculas>=1) {
			
			return true;
		}else {
			
			return false;
		}
	}
}

package com.uverwolf.password;
public class Password {
	private int longitud=8;
	private String contrase�a;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
        setContrase�a(newpass.toString());
	}
	
	public boolean esFuerte() {
		int mayusculas = 0;
		int minusculas =0;
		int numeros=0;
		for(int i=0;i<getContrase�a().length();i++) {
			if(Character.isUpperCase(getContrase�a().charAt(i))){
				mayusculas++;
			}else if(Character.isDigit(getContrase�a().charAt(i))) {
				numeros++;
			}else if(Character.isLowerCase(getContrase�a().charAt(i))) {
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

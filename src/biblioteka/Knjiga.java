package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	private String naslov;
	private LinkedList<Autor> autori;
	private String isbn;
	private String Izdavac;
	private int izdanje;
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIzdavac() {
		return Izdavac;
	}
	public void setIzdavac(String izdavac) {
		Izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
}

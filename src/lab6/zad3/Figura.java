package lab6.zad3;


abstract class Figura{
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	abstract String opis();
	abstract void skaluj(int skala);
	Figura(){
		punkt = new Punkt(0,0);
	}
	Figura(String kolor){
		this.kolor=kolor;
	}
	Figura(Punkt punkt){
		this.punkt=punkt;
	}
	String getKolor(){
		return kolor;
	}
	//metody abstrakcyjne
	}

package lab6.zad3;


class Kwadrat extends Prostokat{
	Kwadrat(int bok,String kolor){
		super(bok,bok,kolor);
	}
	public String opis(){
		return "Kwadrat o boku: "+wys;
	}
}
package lab6.zad3;

class Prostokat extends Figura implements IFigury {
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Prostokat o wymiarach: "+szer+" x "+wys;
	}

	public void skaluj(int skala){
		wys = wys*skala;
		szer = szer*skala;
	}

	@Override
	public float getPowierzchnia() {
		return wys*szer;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}
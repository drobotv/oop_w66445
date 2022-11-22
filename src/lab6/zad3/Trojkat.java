package lab6.zad3;


class Trojkat extends Figura implements IFigury{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Trojkat o wymiarach: "+wys+"  "+podst;
	}

	public void skaluj(int skala){
		wys = wys*skala;
		podst = podst*skala;
	}

	@Override
	public float getPowierzchnia() {
		return 0;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}
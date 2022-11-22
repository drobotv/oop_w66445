package lab6.zad3;

class main
{
	public static void main(String[] arg)
	{
		Punkt p1 = new Punkt(1,2);
//		Figura f1 = new Figura(p1);
//		System.out.println(f1.getKolor());

//		Kwadrat k1 = new Kwadrat(1,"czerwony");
//		System.out.println(k1.getKolor());
//		System.out.println(k1.opis());
//		Prostokat pr1 = new Prostokat(1,2,"czerwony");
//		System.out.println(pr1.getKolor());
//		System.out.println(pr1.opis());
//		Trojkat t1 = new Trojkat(1,2,"czerwony");
//		System.out.println(t1.getKolor());
//		System.out.println(t1.opis());

		Figura[] tablicaFigur = new Figura[10];

		tablicaFigur[0] = new Kwadrat(1,"czerwony");
		tablicaFigur[1] = new Prostokat(1,2,"czerwony");
		tablicaFigur[2] = new Trojkat(1,2,"czerwony");
		tablicaFigur[3] = new Kwadrat(2,"bialy");
		tablicaFigur[4] = new Prostokat(2,2,"bialy");
		tablicaFigur[5] = new Trojkat(2,2,"bialy");
		tablicaFigur[6] = new Kwadrat(3,"zielony");
		tablicaFigur[7] = new Prostokat(3,2,"zielony");
		tablicaFigur[8] = new Trojkat(3,2,"zielony");
		tablicaFigur[9] = new Kwadrat(4,"czarny");

		for(int i=0;i<tablicaFigur.length;i++)
		{
			System.out.println(tablicaFigur[i].opis());
		}

	}
}
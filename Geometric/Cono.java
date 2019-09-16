package geometric;

public class Cono{
	private double radio, altura, volumenCono, areaSuperficial;
	public static final double PI = 3.1416;

	public Cono(double radio, double altura){
		this.radio = radio;
		this.altura = altura;
	}

	public double getRadio(){
		return radio;
	}

	public void setRadio(double radio){
		this.radio = radio;
	}

	public double getAltura(){
		return altura;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public double getVolumenCono(){
		this.volumenCono =(Math.PI*(radio*radio)*altura)/3;
		return volumenCono;
	}

	public double getAreaSuperficial(){
		this.areaSuperficial = Math.PI*(radio*altura)+Math.PI*(radio*radio);
		return areaSuperficial;
	}


}

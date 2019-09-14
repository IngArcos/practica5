public class Cono{
	private double radio, altura, volumenCono;
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

	public double getVolumenCono(){
		return volumenCono;
	}

	public void volumen(){
		volumenCono =(Math.PI*(radio*radio)*altura)/3;
		//Utilizar Math.round(volumenCono));
	}
}

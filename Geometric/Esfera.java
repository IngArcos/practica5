package geometric;
import java.lang.Math;

public class Esfera{
  //private fields
  private double radio,area,volumen;
  public static final double PI = 3.141592;

  //Constructor method
  public Esfera(double radio){
    this.radio= radio;
  }

  //Accessor for radio
  public double getRadio(){
    return radio;
  }


  //Setter for radio
  public void setRadio(double radio){
		this.radio = radio;
	}


  //Accessor for area
  public double getArea(){
    return area;
  }

  //Accessor for volume
  public double getVolumen(){
    return volumen;
  }

  //Volume method
  public void Volume(){
    volumen = 4/3*PI*radio*radio*radio;
  }

  //Area method
  public void Area(){
    area = PI*radio*radio;
  }






}

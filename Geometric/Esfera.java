import java.lang.Math;
public class Esfera{
  //private fields
  private float radio;
  private float area;
  private float volumen;

  //Accessor for area
  public float getArea(){
    return area;
  }

  //Accessor for volume
  public float getVolumen(){
    return volumen;
  }

  //Accessor for radio
  public float getRadio(){
    return radio;
  }

  //Constructor method
  public Esfera(float radio, float area, float volumen ){
    this.radio= radio;
    this.area = PI*pow(radio,2);
    this.volumen = 4/3*PI*pow(radio,3);
  }
}

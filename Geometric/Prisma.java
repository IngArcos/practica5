package geometric;
import static java.lang.Math.*;

public class Prisma {
    private double numl,lado,h,v,aSup,areaBase;
    //Solo se consideran figuras equiláteras
    public void setNuml(double numl){
        this.numl=numl;//Número de lados, 1 se considera una circunferencia
    }
    public void setLado(double lado){
        this.lado=lado;//Tamaño del lado
    }
    public void setH(double h){
        this.h=h;//Altura
    }
    public double getNuml(){
        return numl;
    }
    public double getLado(){
        return lado;
    }
    public double getH(){
        return h;
    }
    public double getAreaBase(){
        if(numl==1){//lado=radio
            this.areaBase=Math.PI*pow(lado,2);
        }else{
            if(numl==3){//triángulo
                this.areaBase=pow(lado,2)*(sqrt(3)/4);
            }else{
                if(numl==4){//cuadrado
                    this.areaBase=pow(lado,2);
                }else{
                    if(numl>4){//polígonos de más de 4 lados
                        this.areaBase=((numl*lado)*(lado/(2*tan(Math.PI/numl))))/2;
                    }else{
                        this.areaBase=-1;//2 no es un número de lados válido
                    }
                }
            }
        }
        return areaBase;
    }
    public double getV(){
        this.v=areaBase*h;
        return v;
    }
    public double getASup(){
        if(numl!=1){
            this.aSup=(2*areaBase)+(numl*(lado*h));
        }else{
            this.aSup=(2*areaBase)+(2*Math.PI*lado*h);
        }
        return aSup;
    }
}

import geometric.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente{

  public static Esfera esfera = new Esfera(0f);
  public static Cono cono = new Cono(0f,0f);
  public static Prisma prisma = new Prisma(0f,0f,0f);
  static boolean firstC = true, firstP = true, firstE = true;

  public static void main(String[] args) {
    int op=0;
    Scanner sc = new Scanner(System.in);
    //Despliege de menu
    while(op != 4){
      System.out.println("¿Que desea hacer?: \n   1)Calcular area/volumen esfera\n   2)Calcular area/volumen prisma\n   3)Calcular area/volumen cono\n   4)Salir");
      op = sc.nextInt();
      if (op<1 || op>4) {
        System.out.println("Opción incorrecta");
      } else {
        Cliente.setGeometricData(op);
        Cliente.getGeometricData(op);
      }
    }
    return;
  }

  public static void getGeometricData(int op) {
    switch (op) {
      case 1:
        System.out.println("La esfera de radio "+esfera.getRadio()+", tiene:");
        System.out.println("\t Area: "+esfera.getArea()+"\n\t Volumen: "+esfera.getVolumen());
      break;
      case 2:
        System.out.println("El prisma de "+prisma.getNuml()+" lados (tamaño "+prisma.getLado()+") y altura "+prisma.getH()+", tiene:");
        System.out.println("\t Area de la base: "+prisma.getAreaBase()+"\n\t Area de la superficie: "+prisma.getASup()+"\n\t Volumen: "+prisma.getV());
      break;
      case 3:
        System.out.println("El cono de radio "+cono.getRadio()+" de altura "+cono.getAltura()+", tiene:");
        System.out.println("\t Volumen: "+cono.getVolumenCono());
      break;
    }
  }


  public static void setGeometricData(int op) {
    Scanner sc = new Scanner(System.in);
    switch (op) {
      case 1:
        System.out.print("De el radio: ");
        esfera.setRadio((double)sc.nextInt());
      break;
      case 2:
        System.out.print("De el número de lados: ");
        prisma.setNuml((double)sc.nextInt());
        System.out.print("De el tamaño del lado: ");
        prisma.setLado((double)sc.nextInt());
        System.out.print("De la altura: ");
        prisma.setH((double)sc.nextInt());
      break;
      case 3:
        System.out.print("De el radio de la base: ");
        cono.setRadio((double)sc.nextInt());
        System.out.print("De la altura: ");
        cono.setAltura((double)sc.nextInt());
      break;
    }
  }

}

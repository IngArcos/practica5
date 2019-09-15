import geometric.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente{

  public static int op;
  public static ArrayList geometric = new ArrayList();
  static boolean firstC = true, firstP = true, firstE = true;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Despliege de menu
    while(Cliente.op != 4){
      System.out.println("¿Que desea hacer?: \n   1) Crear/modificar esfera\n   2) Crear/modificar prisma\n   3) Crear/modificar cono\n   4) Salir");
      Cliente.op = (sc.nextInt())-1;
      switch (Cliente.op) {
        case 0:
          if(Cliente.firstE){
            geometric.add(new Esfera(0));
          } else {
          }
        break;
        case 1:
          if(Cliente.firstP){
          } else {
          }
        break;
        case 2:
          if(Cliente.firstC){
          } else {
          }
        break;
        case 3:
          sc.close();
          return;
        default:
          System.out.println("Opción incorrecta");
      }
    }
  }

  public void getGeometricData() {
    switch (Cliente.op) {
      case 0:
        Cliente.geometric.get(0).getArea();
      break;
      case 1:

      break;
      case 2:
      break;
    }
  }


  public void setGeometricData() {
    Scanner sc = new Scanner(System.in);
    switch (Cliente.op) {
      case 0:
        System.out.println("De el nuevo radio: ");
      break;
      case 1:
      break;
      case 2:
      break;
    }
  }


}

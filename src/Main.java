import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int kiloAr, kiloEl, kiloDo, kiloMu, kiloPa;
      double armut = 2.14, elma = 3.67, dmts = 1.11, muz = 0.95, ptlcn = 5.00, toplam;

      Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        kiloAr = input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        kiloEl = input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        kiloDo = input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        kiloMu = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        kiloPa = input.nextInt();

        toplam = (kiloAr * armut) + (kiloEl * elma) + (kiloDo * dmts) + (kiloMu * muz) + (kiloPa * ptlcn);
        System.out.println("Toplam Tutar : " + toplam);
    }
    }

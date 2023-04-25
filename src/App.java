import java.util.Scanner;
import java.lang.Math;

class main {
    public static void main(String[] args){
        int area;
        double litros;
        double quantidadedelatas;
        double valorfinal;
        Scanner input;

        input = new Scanner(System.in);
        area = input.nextInt();

        litros = area / 3;
        quantidadedelatas = Math.ceil( litros / 18);
        valorfinal = quantidadedelatas * 80;

        System.out.println(quantidadedelatas);
        System.out.println("R$" + valorfinal);




}
}






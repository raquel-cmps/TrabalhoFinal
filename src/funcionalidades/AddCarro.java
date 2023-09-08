package funcionalidades;

import gerenciador.Carro;
import gerenciador.DataVenda;

import java.util.Scanner;

public class AddCarro {
    static Scanner src = new Scanner(System.in);
    public static Carro novoCarro(){
        Carro x = new Carro();
        System.out.println("digite a marca");
        x.setMarca(src.next());

        System.out.println("digite o ano ");
        x.setAno(src.nextInt());

        System.out.println("digite a quilometragem");
        x.setKm(src.nextDouble());

        return  x;
    }
    public static Carro dataVenda(){
        Carro data = new Carro();
        DataVenda leituraData = new DataVenda();

        data.setDataVenda(leituraData.toString());

        return data;
    }
}

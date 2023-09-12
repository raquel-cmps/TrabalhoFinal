package gerenciador;

import funcionalidades.DataVenda;
import funcionalidades.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import static funcionalidades.AddCarro.novoCarro;
import static funcionalidades.TesteMes.qualMes;


public class Execultora {
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Adicionar carros");
        System.out.println("2. Listar carro");
        System.out.println("3. Vender carro");
        System.out.println("4. Relatorio de vendas");
        System.out.println("5. SAIR DO PROGRAMA");
    }

    public static void main(String[] args) {
        ArrayList<Carro> lista = new ArrayList<Carro>();
        Map<String, Integer> listaVendas = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        DataVenda dataVenda = new DataVenda();
        menu();
        int op;
        int quant = 0;

        do{
            op = scanner.nextInt();
            if(op == 1){
                System.out.println("Quantos carros você quer adicionar? ");
                quant = scanner.nextInt();
                for(int i = 0; i < quant; i++){
                    lista.add(i, novoCarro());
                    System.out.println("Carro " + i + " adicionado com sucesso");
                    System.out.println();
                }
                menu();

            }
            else if(op == 2){
                for(int i = 0; i < quant; i++){
                    System.out.println("CARRO " + i);
                    System.out.println(lista.get(i).getMarca());
                    System.out.println(lista.get(i).getAno());
                    System.out.println(lista.get(i).getKm());
                    System.out.println();
                }
                menu();
            }

            else if(op == 3) {
                int excluir = 0;
                System.out.println("Escolha o indice do carro que deseja vender");
                excluir = scanner.nextInt();

                System.out.println("Informe a data de venda: ");
                System.out.print("DIA: (dd)");
                dataVenda.setDia(scanner.nextInt());
                System.out.print("MES: (mm)");
                dataVenda.setMes(scanner.nextInt());
                System.out.print("ANO: (yyyy)");
                dataVenda.setAno(scanner.nextInt());
                int mes = dataVenda.getMes();

                listaVendas.merge(qualMes(mes), 1, Integer::sum);

                for (int i = 0; i < lista.size(); i++) {
                    if (i == excluir) {
                        lista.remove(i);
                    }
                }

                System.out.println();
                System.out.println("O carro indice " + excluir + " foi excluido com sucesso!");

                menu();
            }
            else if(op == 4){
                System.out.println("Foram vendidos: ");
                System.out.println(listaVendas);
                menu();
            }
        }while (op !=5);
    }
}

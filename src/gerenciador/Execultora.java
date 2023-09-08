package gerenciador;

import funcionalidades.AddCarro;

import java.util.ArrayList;
import java.util.Scanner;

import static funcionalidades.AddCarro.novoCarro;

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
        Scanner scanner = new Scanner(System.in);
        DataVenda dataVenda = new DataVenda();
        Carro carro = new Carro();
        menu();
        int op;
        int quant = 0;
        int vendidos = 0;
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
                for (int i = 0; i < quant; i++) {
                    if (quant == excluir) {
                        lista.remove(i);
                        vendidos += 1;
                    }
                }

                System.out.println("Informe a data de venda: ");
                System.out.print("DIA: ");
                dataVenda.setDia(scanner.nextInt());
                System.out.print("MES: ");
                dataVenda.setMes(scanner.nextInt());
                System.out.print("ANO: ");
                dataVenda.setAno(scanner.nextInt());

                for (int i = 0; i < quant; i++) {
                    lista.add(i, AddCarro.dataVenda());
                }

                System.out.println();
                System.out.println("O carro indice " + excluir + " foi excluido com sucesso!");

                menu();
            }
            else if(op == 4){
                System.out.println("A quantidade de carros vendidas foi de: ");
                System.out.println(vendidos);

                menu();
            }
        }while (op !=5);

    }

}

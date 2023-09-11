package funcionalidades;

public class VerificaMes {
     public void dataMes(int mes, int[] carrosVendidos){

         switch (mes){
             case 1:
                 carrosVendidos[0] += 1;
                 break;
             case 2:
                 carrosVendidos[1] += 1;
                 break;
             case 3:
                 carrosVendidos[2] += 1;
                 break;
             case 4:
                 carrosVendidos[3] += 1;
                 break;
             case 5:
                 carrosVendidos[4] += 1;
                 break;
             case 6:
                 carrosVendidos[5] += 1;
                 break;
             case 7:
                 carrosVendidos[6] += 1;
                 break;
             case 8:
                 carrosVendidos[7] += 1;
                 break;
             case 9:
                 carrosVendidos[8] += 1;
                 break;
             case 10:
                 carrosVendidos[9] += 1;
                 break;
             case 11:
                 carrosVendidos[10] += 1;
                 break;
             case 12:
                 carrosVendidos[11] += 1;
                 break;
             default:
                 System.out.println("mes invalido!");
         }
     }


}

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Auditoria {
    static void main(String[] args) throws Exception {
        String[][] equipamentos = new String[2][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== Gerador de Excel - Auditoria ======");
        for (int i = 0; i < equipamentos.length; i++) {
            System.out.print("Digite o nome do equipamento " + (i + 1) + ": ");
            equipamentos[i][0] = scanner.nextLine();

            System.out.print("Digite o preço do equipamento " + (i + 1) + ": ");
            equipamentos[i][1] = scanner.nextLine();

            System.out.print("Digite a quantidade do equipamento " + (i + 1) + ": ");
            equipamentos[i][2] = scanner.nextLine();
        }

        for(int i = 0; i<equipamentos.length; i++){
        double preco = Double.parseDouble(equipamentos[i][1]);
        double quantidade = Double.parseDouble(equipamentos[i][2]);
        double valorFinal = preco * quantidade;
        equipamentos[i][3] = String.valueOf(valorFinal);
        }
        PrintWriter gravar = new PrintWriter("equipamentos-auditoria.csv");
        gravar.println("Nome;Preco;Quantidade;Valor Total");
        for (int i = 0; i< equipamentos.length; i++){
            gravar.println(equipamentos[i][0] + ";" + equipamentos[i][1] + ";" + equipamentos[i][2] + ";" + equipamentos[i][3]);
        }
        gravar.close();
        System.out.println("Arquivo 'equipamentos-auditoria.csv' gerado com sucesso!");
    }
}


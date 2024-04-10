package principal;

import javax.swing.JOptionPane;
import model.Caminhao;

public class Principal {

    public static void main(String[] args) {
        Caminhao busao = new Caminhao();

        int op = -1;
        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Menu de op\u00e7\u00f5es
                                                              1 - Leitura do veiculo
                                                              2 - Imprimir veiculo
                                                              9 - Sair"""));

            switch (op) {
                case 1:
                    busao.leitura();
                    break;

                case 2:
                    busao.imprimir();
                    break;
            }
        }
    }
}

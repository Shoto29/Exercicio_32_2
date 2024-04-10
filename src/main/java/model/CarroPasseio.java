package model;

import javax.swing.JOptionPane;

public class CarroPasseio extends Veiculo {

    private String Cor;
    private String Modelo;

    public CarroPasseio() {
        this(0, 0, 0, "", "");
    }

    public CarroPasseio(int Peso, int VelocMax, float Preco, String Cor, String Modelo) {
        super(Peso, VelocMax, Preco);
        this.Cor = Cor;
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCor = " + Cor + "\nModelo = " + Modelo;
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, toString());
    }

    @Override
    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro:"));
        setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do carro:"));

    }

}

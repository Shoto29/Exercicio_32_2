package model;

import javax.swing.JOptionPane;

public class Veiculo {

    private int Peso;
    private int VelocMax;
    private float Preco;

    public Veiculo() {
        this(0, 0, 0);
    }

    public Veiculo(int Peso, int VelocMax, float Preco) {
        this.Peso = Peso;
        this.VelocMax = VelocMax;
        this.Preco = Preco;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getVelocMax() {
        return VelocMax;
    }

    public void setVelocMax(int VelocMax) {
        this.VelocMax = VelocMax;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public void leitura() {
        setPeso(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso do veiculo:")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade maxima do veiculo:")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preco do veiculo:")));

    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, toString());
    }

    @Override
    public String toString() {
        return "Veiculo\nPeso = " + Peso + ", \nVelocMax = " + VelocMax + ", \nPreco = " + Preco;
    }

}

package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
    private int CargaMax;
    private int AlturaMax;
    private int Comprimento;

    public Caminhao(){
        this(0,0,0,0,0,0);
    }

    public Caminhao( int Peso, int VelocMax, float Preco, int CargaMax, int AlturaMax, int Comprimento) {
        super(Peso, VelocMax, Preco);
        this.CargaMax = CargaMax;
        this.AlturaMax = AlturaMax;
        this.Comprimento = Comprimento;
    }

    public int getCargaMax() {
        return CargaMax;
    }

    public void setCargaMax(int CargaMax) {
        this.CargaMax = CargaMax;
    }

    public int getAlturaMax() {
        return AlturaMax;
    }

    public void setAlturaMax(int AlturaMax) {
        this.AlturaMax = AlturaMax;
    }

    public int getComprimento() {
        return Comprimento;
    }

    public void setComprimento(int Comprimento) {
        this.Comprimento = Comprimento;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setCargaMax(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o peso limite")));
        setAlturaMax(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o limite de altura")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o comprimento")));

    }
    
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null,toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargaMax = " + CargaMax + "\nAlturaMax = " + AlturaMax + "\nComprimento = " + Comprimento;
    }
    
    
    
    
    
}

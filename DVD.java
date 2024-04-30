package Questão;
import java.util.Scanner;

public class DVD extends Midia{
    private int numeroFaixas;

    public DVD() {
    }

    public DVD( String nome, int codigo, double preco, int numeroFaixas) {
        super(nome, codigo, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        String detalhes = "Código: " + this.getCodigo() + ", " +
                          "Nome: " + this.getNome() + ", " +
                          "Preço: " + this.getPreco();
        
        return detalhes;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Número de faixas: ");
        int NumeroFaixas = scanner.nextInt();
        
        setNumeroFaixas(numeroFaixas);
    }
}

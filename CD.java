package Questão01;
import java.util.Scanner;

public class CD extends Midia {
    private int numeroMusicas;

    Scanner scanner = new Scanner(System.in);
    
    public CD() {
    }

    public CD( String nome, int codigo, double preco, int numeroMusicas) {
        super(nome, codigo, preco);
        this.numeroMusicas = numeroMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        String detalhes = "Código: " + this.getCodigo() + ", " +
                          "Nome: " + this.getNome() + ", " +
                          "Preço: " + this.getPreco();
        return detalhes;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Número de músicas: ");
        int NumeroMusicas = scanner.nextInt();
        
        setNumeroMusicas(numeroMusicas);
    }
}

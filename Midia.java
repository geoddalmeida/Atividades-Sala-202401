package Questão;
import java.util.Scanner;

public class Midia {
    private String nome;
    private int codigo;
    private double preco;
    

    public Midia() {
    }

    public Midia(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        String detalhes = "Código: " + this.getCodigo() + ", " +
                          "Nome: " + this.getNome() + ", " +
                          "Preço: " + this.getPreco();
        
        return detalhes;
    }

    public void printDados() {
        this.getTipo();
        this.getDetalhes();
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o codigo: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Digite o preco: ");
        double preco = scanner.nextDouble();
        
        setNome(nome); setCodigo(codigo); setPreco(preco);
    }
}

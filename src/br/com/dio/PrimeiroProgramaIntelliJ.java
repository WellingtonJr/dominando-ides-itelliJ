package br.com.dio;

public class PrimeiroProgramaIntelliJ {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("ererer " + (a + b));

        Livro livro = new Livro("Teste Nome Livro", 300);

        System.out.println(livro);

    }
}


class Livro {
    private String nome;
    private Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}
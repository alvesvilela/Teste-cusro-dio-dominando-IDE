package br.com.dio;

import br.com.dio.model.Gata;

public class Primeiroprograma {
    public static void main(String[] args) {
        Gata gata = new Gata();
        System.out.println(gata);

        Livro Livro = new Livro(" dominando IDE Java", 300);
        System.out.println(Livro);

        /*float a = 5;
          float b = 2;
       System.out.println("hello world! " + (a/b));*/

    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
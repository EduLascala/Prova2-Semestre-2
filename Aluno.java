package prova2;

import java.util.Random;

public class Aluno {
    int codigo;
    String nome;
    public double nota1 = 0;
    public double nota2 = 0;
    Random geradorCodigo = new Random();

    Aluno(int codigo, String nome, double nota1, double nota2) {
        this.codigo = geradorCodigo.nextInt(99999) + 10000;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double media() {
        return (nota1 + nota2) / 2;
    }
    
    int codigo() {
    	return codigo;
    }
}
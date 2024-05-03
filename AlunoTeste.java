package prova2;

import java.util.Scanner;

public class AlunoTeste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno[] alunos = new Aluno[7];

		for (int i = 0; i < alunos.length; i++) {
		    String nome;
		    do {
		        System.out.println("Insira o nome do aluno " + (i + 1) + ":");
		        nome = scanner.nextLine();

		        if (nome.trim().isEmpty()) {
		            System.out.println("Nome inválido. O nome não pode estar vazio. Digite novamente.");
		        }

		    } while (nome.trim().isEmpty());

		    double nota1 = 0;
		    do {
		        System.out.println("Insira a primeira nota do aluno " + (i + 1) + ":");
		        nota1 = scanner.nextDouble();
		        scanner.nextLine();
		        if (nota1 > 10 || nota1 < 0) {
		            System.out.println("Nota Inválida.");
		            System.out.println("A nota deve ser de 0 à 10 \nDigite Novamente: \n");
		        }
		    } while (nota1 > 10 || nota1 < 0);

		    double nota2 = 0;
		    do {
		        System.out.println("Insira a segunda nota do aluno " + (i + 1) + ":");
		        nota2 = scanner.nextDouble();
		        scanner.nextLine();
		        if (nota2 > 10 || nota2 < 0) {
		            System.out.println("Nota Inválida.");
		            System.out.println("A nota deve ser de 0 à 10 \nDigite Novamente: \n");
		        }
		    } while (nota2 > 10 || nota2 < 0);

		    alunos[i] = new Aluno(i + 1, nome, nota1, nota2);
		}

		// a) Ordenar por média
		for (int i = 0; i < alunos.length - 1; i++) {
			for (int j = 0; j < alunos.length - i - 1; j++) {
				if (alunos[j].media() > alunos[j + 1].media()) {
					Aluno temp = alunos[j];
					alunos[j] = alunos[j + 1];
					alunos[j + 1] = temp;
				}
			}
		}
		System.out.println("Alunos ordenados por média:");
		for (Aluno aluno : alunos) {
			System.out.println(aluno.codigo + " - " + aluno.nome + ": " + aluno.media());
		}

		// b) Alunos aprovados em ordem alfabética
		for (int i = 0; i < alunos.length - 1; i++) {
			for (int j = 0; j < alunos.length - i - 1; j++) {
				if (alunos[j].nome.compareTo(alunos[j + 1].nome) > 0) {
					Aluno temp = alunos[j];
					alunos[j] = alunos[j + 1];
					alunos[j + 1] = temp;
				}
			}
		}
		System.out.println("\nAlunos aprovados:");
		for (Aluno aluno : alunos) {
			if (aluno.media() >= 7) {
				System.out.println(aluno.codigo + " - " + aluno.nome + ": " + aluno.media());
			}
		}
	}
}
package Exercicio2;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("valeria", 20, 10.0);
        Aluno aluno2 = new Aluno("galileu", 15, 9.8);
        
        
        Vetor vetAlunos = new Vetor();
        vetAlunos.adiciona(aluno1);
        System.out.println("ha um total de: "+vetAlunos.tamanho()+" alunos");
        System.out.println("estão presente os seguintes alunos: "+ vetAlunos.contem(aluno1));
        System.out.println("o aluno "+aluno2.getNome()+" está presente? "+ vetAlunos.contem(aluno2));
        System.out.println("-----");
        vetAlunos.adiciona(aluno2);
        System.out.println("ha um total de: "+vetAlunos.tamanho()+" alunos");

       
    }
}

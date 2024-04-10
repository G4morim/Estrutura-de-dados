package Exercicio2;
import java.util.*;

public class Vetor {
    
    private Aluno[] alunos;
    private int totalDeAlunos = 0;

    public Vetor() {
        alunos = new Aluno[5];
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno.getNome().equals(alunos[i].getNome())) {
                System.out.println(alunos[i].getNome());
                return true;
            }
        }
        return false;
    }

    public void adiciona(Aluno aluno) {
        if (totalDeAlunos == alunos.length) {
           return;
    }
    alunos[totalDeAlunos]= aluno;
    totalDeAlunos++;
    }


    public int tamanho() {
        return this.totalDeAlunos;
    }

}

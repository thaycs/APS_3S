package project;

import java.util.ArrayList;
import java.util.Scanner;

public class funcoes {

    private final ArrayList<tab_aluno> Alunos;
    private final ArrayList<tab_cursos> Cursos;

    public funcoes(){
        Alunos = new ArrayList<>();
        Cursos = new ArrayList<>();
    }

    public void cadastraAlunos(){
        Scanner sc = new Scanner(System.in);
        tab_aluno tabAluno = new tab_aluno();

        System.out.print("Digite o ID do Aluno:" );
        String ID = sc.nextLine();

        if(!verificaId(ID)){
            for(tab_aluno tabAlunos : Alunos){
                if(tabAlunos.getId().equals(ID)){
                    tabAluno = tabAlunos;
                }
            }
            tabAluno.setId(ID);

            System.out.print("Digite o Nome do Aluno:");
            tabAluno.setNome(sc.next());

            System.out.println("\nCadastro efetuado com sucesso!");
        }else{
            System.out.println("Esse aluno já foi cadastrado! ");
        }

        Alunos.add(tabAluno);
    }

    public Boolean verificaId(String ID){
        boolean controle = false;
        for (tab_aluno tabAlunos : Alunos) {
            if (tabAlunos.getId().equals(ID)) {
                controle = Boolean.TRUE;
                break;
            }
        }
        return controle;
    }

    public void cadastraCurso(){
        Scanner sc = new Scanner(System.in);
        tab_cursos tabCurso = new tab_cursos();

        System.out.print("Digite o Nome do Curso:");
        tabCurso.setNome(sc.next());

        System.out.print("Digite o Nível sendo Graduação/Pós Graduação:");
        tabCurso.setNome(sc.next());

        System.out.print("Digite o Ano:");
        tabCurso.setNome(sc.next());

        /*if(!verificaCurso(Nome,Nivel,Ano)){
            for(tab_cursos tabCursos : Cursos){
                if(tabCursos.getNome().equals(Nome)){
                    tabCurso = tabCursos;
                }
            }
        }*/
        Cursos.add(tabCurso);
        }

    public void cadastraNota() {
        Scanner sc = new Scanner(System.in);
        tab_cursos tabNota = new tab_cursos();
        //PEDIR ID DO ALUNO
        //VERIFICAR ID ALUNO
        //PEDIR ID DO CURSO (????)
        //VERIFICAR ID DO CURSO

        System.out.print("Digite a NP1: ");
        tabNota.setNP1(sc.nextDouble());

        System.out.print("Digite a NP2: ");
        tabNota.setNP2(sc.nextDouble());

        System.out.print("Digite a Reposição: ");
        tabNota.setRep(sc.nextDouble());

        System.out.print("Digite o Exame: ");
        tabNota.setExa(sc.nextDouble());

        Cursos.add(tabNota);

    }

    public Boolean verificaCurso(String Nome,String Nivel, Integer Ano){
        boolean controle = false;
        for (tab_cursos tabCurso : Cursos) {
            if (tabCurso.getNome().equals(Nome)) {
                controle = Boolean.TRUE;
                break;
            }
            else if (tabCurso.getNivel().equals(Nivel)) {
                controle = Boolean.TRUE;
                break;
            }
            else if (tabCurso.getAno().equals(Ano)) {
                controle = Boolean.TRUE;
                break;
            }
        }
        return controle;
    }

}

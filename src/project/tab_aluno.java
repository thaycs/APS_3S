package project;

public class tab_aluno {
    private String ID;
    private String Nome;

    public tab_aluno(){
        String ID;
        String Nome;
    }

    public String getId() {
        return ID;
    }

    public void setId(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void mostraAlunos(){
        System.out.println("ID: " + ID
                + "\n Nome Curso: " + Nome);
    }

}



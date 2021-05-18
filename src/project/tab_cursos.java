package project;

public class tab_cursos {
    private String Nome;
    private String Nivel;
    private Integer Ano;
    private Double NP1;
    private Double NP2;
    private Double Rep;
    private Double Exa;

    public tab_cursos(){
        String Nome;
        String Nivel;
        Integer Ano;
        Double NP1;
        Double NP2;
        Double Rep;
        Double Exa;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNivel(){
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public Integer getAno(){
        return Ano;
    }

    public void setAno(Integer Ano) {
        this.Ano = Ano;
    }

    public Double getNP1(){
        return NP1;
    }

    public void setNP1(Double NP1) {
        this.NP1 = NP1;
    }

    public Double getNP2(){
        return NP2;
    }

    public void setNP2(Double NP2) {
        this.NP2 = NP2;
    }

    public Double getRep(){
        return Rep;
    }

    public void setRep(Double Rep) {
        this.Rep = Rep;
    }

    public Double getExa(){
        return Exa;
    }

    public void setExa(Double Exa) {
        this.Exa = Exa;
    }

    public void mostraCursos(){
        System.out.println("Nome: " + Nome
                + "\nNível: " + Nivel
                + "\nAno: " + Ano);
    }

}

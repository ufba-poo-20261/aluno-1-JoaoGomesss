public class Aluno {
    private String nome;
    private final String matricula;

    public Aluno(String matricula, String nome){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return  nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        } else if (!(obj instanceof Aluno)) {
            return false;
        }
        Aluno aluno1 = (Aluno) obj;
        return this.matricula.equals(aluno1.matricula);

    }


}

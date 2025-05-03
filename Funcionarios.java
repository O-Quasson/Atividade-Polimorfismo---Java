public abstract class Funcionarios extends Pessoa {
    private String nome; 
    String sobrenome;
    private Double salario;
    private String departamento;
    
    // //FUNCIONARIO
    public Funcionarios (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
        super(cpf, dia, mes, ano);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.departamento = departamento;
    }

    void baterPonto(Funcionarios Funcionarios){
        System.out.println(Funcionarios.getnome() + " bateu o ponto e foi embora");
    }

    abstract void mostrarDados (Funcionarios funcionarios);

    public String getnome (){
        return nome;
    }

    public Double getsalario (){
        return salario;
    }

    public String getdepartamento (){
        return departamento;
    }

    public String getsobrenome (){
        return sobrenome;
    }

    public void setsobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setnome (String nome){
    this.nome = nome;
    }

    public void setsalario (Double salario){
    this.salario = salario;
    }

    public void setdepartamento (String departamento){
    this.departamento = departamento;
    }
}
public class Desenvolvedor extends Funcionarios{

    //super(getano,getcpf,getdepartamento,getdia,getmes,getnome,getsalario);
    
    public Desenvolvedor (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
        super(nome, sobrenome, salario, departamento, cpf, dia, mes, ano); 
    }

    void programar(Funcionarios funcionarios){
        System.out.println(funcionarios.getnome() + " está programando!");
    }

    //deu erro, perguntar pro leo dps
    @Override
    void mostrarDados (Funcionarios funcionarios){
        System.out.println("Nome: " + funcionarios.getnome());
        System.out.println("Sobrenome: " + funcionarios.getsobrenome());
        System.out.println("Data de nascimento: " + funcionarios.getdia() + "/" + funcionarios.getmes() + "/" + funcionarios.getano());
        System.out.println("Salário: " + funcionarios.getsalario());
        System.out.println("Departamento: " + funcionarios.getdepartamento());
        System.out.println("Posição na empresa: funcionarios");

    }
}

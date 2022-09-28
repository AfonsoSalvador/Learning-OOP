public class App {

    public static void imprimeEmpresa(Empresa em){
        System.out.printf("%s LTDA\n\nCusto total: %.02f\nSalario médio: %.02f\nNúmero de funcionários: %d\n\n",em.getNome(),em.GetCustoEmpresa(),em.getSalarioMedio(), em.getNumFuncionarios());
        for(Departamento d : em.getDepartamentosEmpresa()){
            System.out.print(d.toString());
        }
    }



    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioTempoIntegral("f1",1200.0f );
        Funcionario f2 = new FuncionarioTempoIntegral("f2", 2400.00f);
        Funcionario f3 = new FuncionarioTempoIntegral("f3",1300.00f);
        Funcionario f4 = new FuncionarioTempoIntegral("f4", 30000.00f);
        Funcionario f5 = new FuncionarioTempoParcial("Cleber", 3.50f,10);
        Funcionario f6 = new FuncionarioTempoParcial("Henrique", 4500.0f,15);

        Departamento rh = new Departamento("Recursos Humanos");
        Departamento ti = new Departamento("Tecnologia da Informação");
        Departamento ve = new Departamento("Vendas");

        Empresa em = new Empresa("Montanhas do Lago Salgado");

        rh.addFuncionario(f6);
        rh.addFuncionario(f5);

        ti.addFuncionario(f4);
        ti.addFuncionario(f3);

        ve.addFuncionario(f2);
        ve.addFuncionario(f1);

        em.addDepartamento(ve);
        em.addDepartamento(ti);
        em.addDepartamento(rh);

        em.aumentaSalario(100.00f);

        imprimeEmpresa(em);


    }
    
}

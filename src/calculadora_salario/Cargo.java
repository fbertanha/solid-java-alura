package calculadora_salario;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinteOuVinteCincoPorCento()),
    TESTER(new QuinteOuVinteCincoPorCento());

    final private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
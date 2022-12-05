package lambdas;

@FunctionalInterface // Força a interface a ter apenas um único metodo / função
public interface Calculo {

    public abstract double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String muitoLegal() {
        return "muito legal";
    }
}

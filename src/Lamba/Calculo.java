package Lamba;

@FunctionalInterface // significa que a interface só pode ter 1 método abstrato
public interface Calculo {
    public abstract double executar(double a, double b);

    default String legal (){
        return "legal";
    }
    default String massa(){
        return "massa";
    }
}

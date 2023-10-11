
public class Main {
    public static void main(String[] args) {
        Aritmetica calculo = new Aritmetica();

        //Geometrica calculo = new Geometrica();

        Disciplina d = new Disciplina(calculo);
        d.setNome("Padroes de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();
        d.Situacao();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s", d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}

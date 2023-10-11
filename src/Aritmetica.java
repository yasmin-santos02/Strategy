public class Aritmetica extends Disciplina {

    public double CalcularMedia() {
        return CalcMedia.CalcularMedia(getP1(), getP2());
    }

    public String Situacao() {
        return CalcMedia.Situacao(getMedia());
    }
}

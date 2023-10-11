public class Disciplina {

    ICalcMedia CalcMedia = new MediaAritmetica();
    //ICalcMedia CalcMedia = new MediaGeometrica();

    public double media;
    private String nome;
    private double P1;
    private double P2;
    public String situacao;

    public Disciplina() {
    }

    public Disciplina(Aritmetica media) {
        this.media = media.getMedia();
    }

    public Disciplina(Geometrica media) {
        this.media = media.getMedia();
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        Situacao();
        this.situacao = situacao;
    }

    public double CalcularMedia() {
        return media = CalcMedia.CalcularMedia(P1, P2);
    }

    public String Situacao() {
        return situacao = CalcMedia.Situacao(media);
    }
}
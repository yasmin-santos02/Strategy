interface ICalcMedia {
    double CalcularMedia(double P1, double P2);

    String Situacao(double media);
}

class MediaAritmetica implements ICalcMedia {
    public double CalcularMedia(double p1, double p2) {
        double media;
        return media = (p1 + p2) / 2;
    }

    public String Situacao(double media) {
        if (media > 5) {
            return "Aprovado!";
        } else
            return "Reprovado...";
    }
}

class MediaGeometrica implements ICalcMedia {
    public double CalcularMedia(double p1, double p2) {
        double media;
        return media = Math.sqrt(p1 * p2);
    }

    public String Situacao(double media) {
        if (media > 7) {
            return "Aprovado!";
        } else
            return "Reprovado...";
    }
}
package calculos;

public class Calculadora {

    private double resultSoma, resultSub, resultMult, resultDiv;


    public void resultadoSoma(double nr1, double nr2) {
        this.resultSoma = nr1 + nr2;
    }

    public void resultadoSub(double nr1, double nr2) {
        this.resultSub = nr1 - nr2;
    }

    public void resultadoMult(double nr1, double nr2) {
        this.resultMult = nr1 * nr2;
    }

    public void resultadoDiv(double nr1, double nr2) {
        this.resultDiv = nr1 / nr2;
    }

    public double mostrarSoma(){
        return this.resultSoma;
    }
    public double mostrarSub(){
        return this.resultSub;
    }
    public double mostrarMult(){
        return this.resultMult;
    }
    public double mostrarDiv(){
        return this.resultDiv;
    }
}

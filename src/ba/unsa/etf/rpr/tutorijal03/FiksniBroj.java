package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    public enum Grad {
        BUGOJNO("030"), BUSOVACA("030"), DOBRETICI("030"), DONJIVAKUF("030"), FOJNICA("030"), GORNJIVAKUF("030"),
        JAJCE("030"), KISELJAK("030"), KREŠEVO("030"), NOVITRAVNKI("030"), TRAVNIK("030"), VITEZ("030"),
        ODŽAK("031"), SARAJEVO("033"), ZENICA("032"), LIVNO("034"), TUZLA("035"), MOSTAR("036"), BIHAC("037"),
        GORAŽDE("038");

        private String poziv;

        Grad(String pozivni) {
            this.poziv = pozivni;
        }

        public String getPozivni() {
            return poziv;
        }
    }

    private Grad grad;
    private String fiksni = "";

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        fiksni = broj;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return fiksni;
    }

    public void setBroj(String broj) {
        this.fiksni = broj;
    }

    @Override
    public String ispisi() {
        return getGrad().getPozivni() + "/" + fiksni;
    }

    @Override
    public int hashCode() {
        return fiksni.hashCode();
    }
}

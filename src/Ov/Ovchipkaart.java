package Ov;

public class Ovchipkaart {
    private double saldo;

    public Ovchipkaart(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void verhoogSaldo(double bedrag) {
        if (bedrag > 0) {
            saldo += bedrag;
        }
    }

    public void stelSaldoIn(double nieuwSaldo) {
        if (nieuwSaldo >= 0) {
            saldo = nieuwSaldo;
        }
    }

    public boolean heeftGenoegSaldoVoorIncheck() {
        return saldo >= 10;
    }

    public boolean kanUitchecken() {
        return saldo >= 4.00;
    }

    public void betaalRit() {
        if (kanUitchecken()) {
            saldo -= 4.00;
        }
    }
}
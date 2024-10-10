package modelo;

public abstract class Cuenta {
    protected String numeroCuenta;
    protected double saldo;
    protected String titular;

    public Cuenta(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);
    
    public double getSaldo() {
        return saldo;
    }
}

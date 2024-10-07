package modelo;

public class CuentaAhorro extends Cuenta {
    private double porcentajeAhorro;

    public CuentaAhorro(String numeroCuenta, String titular, double saldoInicial, double porcentajeAhorro) {
        super(numeroCuenta, titular, saldoInicial);
        if (saldoInicial < 1000) {
            throw new IllegalArgumentException("El primer depósito debe ser de $1,000");
        }
        this.porcentajeAhorro = porcentajeAhorro;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo - monto < 500) {
            throw new IllegalArgumentException("No se puede dejar la cuenta en cero. Debe haber al menos $500.");
        }
        saldo -= monto;
    }

    public void calcularIntereses() {
        saldo += saldo * (porcentajeAhorro / 100);
    }
}

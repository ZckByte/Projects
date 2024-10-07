package modelo;

public class CuentaInversion extends Cuenta {
    public CuentaInversion(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
        if (saldoInicial < 25000) {
            throw new IllegalArgumentException("El monto inicial debe ser de $25,000");
        }
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo - monto < 10000 && saldo != monto) {
            throw new IllegalArgumentException("No se puede dejar la cuenta en cero. Debe haber al menos $10,000.");
        }
        saldo -= monto;
    }
}

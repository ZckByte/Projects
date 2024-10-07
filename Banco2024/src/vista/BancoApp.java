package vista;

import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaInversion;
import modelo.Empleado;

public class BancoApp {
    public static void main(String[] args) {
        // Crear empleado
        Empleado empleado1 = new Empleado("Carlos Ruiz", "E001", 3, "Cajero", 1200);
        System.out.println(empleado1.getNombre() + " tiene " + empleado1.calcularVacaciones() + " días de vacaciones.");

        //cuenta de ahorro
        Cuenta cuentaAhorro = new CuentaAhorro("12345", "Juan Pérez", 1000, 5);
        cuentaAhorro.depositar(500);
        System.out.println("Saldo Cuenta Ahorro: " + cuentaAhorro.getSaldo());

        // Retirar mas de lo permitido
        try {
            cuentaAhorro.retirar(1100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Cuenta de inversión
        Cuenta cuentaInversion = new CuentaInversion("54321", "Ana López", 30000);
        cuentaInversion.depositar(5000);
        System.out.println("Saldo Cuenta Inversión: " + cuentaInversion.getSaldo());

        // Polimorfismo 
        realizarTransaccion(cuentaAhorro, 200);
        realizarTransaccion(cuentaInversion, 3000);

        // Saldo actualizado
        System.out.println("Saldo actualizado Cuenta Ahorro: " + cuentaAhorro.getSaldo());
        System.out.println("Saldo actualizado Cuenta Inversión: " + cuentaInversion.getSaldo());
    }

    // Polimorfismo en cuenta de ahorro y inversión
    public static void realizarTransaccion(Cuenta cuenta, double monto) {
        cuenta.depositar(monto);
        System.out.println("Depósito de " + monto + " realizado en la cuenta: " + cuenta.getClass().getSimpleName());
    }
}

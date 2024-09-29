package Ejercicio_Abstraccion;

//import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double kilometros1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los Kilometros recorridos del Auto"));
        double litros1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Consumo de Combustible del Auto"));

        Auto auto1 = new Auto(kilometros1, litros1);

        JOptionPane.showInternalMessageDialog(null, "Detalle Automovil " + "\n"
                + "-----------------------------------------" + "\n"
                + "Consumo de Combustible del Auto: " + auto1.calcularConsumo() + "\n"
                + "Costo de Mantenimiento del Auto: " + auto1.calcularCostoMantenimiento() + "\n"
                + "Costo Total del Auto: " + auto1.calcularCostoTotal());

        if (auto1.necesitaRevision()) {
            JOptionPane.showMessageDialog(null, "¿El auto necesita revision?: Si");
        } else {
            JOptionPane.showMessageDialog(null, "¿El auto necesita revision?: No");
        }

        double kilometros2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los Kilometros recorridos de la Moto"));
        double litros2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Consumo de Combustible de la Moto"));

        Moto moto1 = new Moto(kilometros2, litros2);

        JOptionPane.showInternalMessageDialog(null, "Detalle Moto" + "\n"
                + "-----------------------------------------" + "\n"
                + "Consumo de Combustible de la Moto: " + moto1.calcularConsumo() + "\n"
                + "Costo de Mantenimiento de la moto: " + moto1.calcularCostoMantenimiento() + "\n"
                + "Costo Total de la Moto: " + moto1.calcularCostoTotal() + "\n");

        if (moto1.necesitaRevision()) {
            JOptionPane.showMessageDialog(null, "¿La Moto necesita revision?: Si");
        } else {
            JOptionPane.showMessageDialog(null, "¿La moto necesita revision?: No");
        }

        int option = JOptionPane.showConfirmDialog(null, "Desea ingresar nuevos datos para el auto:", "Reingresar", JOptionPane.YES_OPTION);

        if (option == JOptionPane.YES_NO_OPTION) {
            kilometros1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los Kilometros recorridos del Auto"));
            litros1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Consumo de Combustible del Auto"));

            auto1.kilometrosRecorridos = kilometros1;
            auto1.litrosCombustible = litros1;

            JOptionPane.showInternalMessageDialog(null, "Detalle Automovil" + "\n"
                    + "-----------------------------------------" + "\n"
                    + "Consumo de Combustible del Auto: " + auto1.calcularConsumo() + "\n"
                    + "Costo de Mantenimiento del Auto: " + auto1.calcularCostoMantenimiento() + "\n"
                    + "Costo Total del Auto: " + auto1.calcularCostoTotal() + "\n");
            if (auto1.necesitaRevision()) {
                JOptionPane.showMessageDialog(null, "¿El auto necesita revision?: Si");
            } else {
                JOptionPane.showMessageDialog(null, "¿El auto necesita revision?: No");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Muchas Gracias", "Cierre Sesion", JOptionPane.CLOSED_OPTION);

        }
        System.exit(0);
    }

}

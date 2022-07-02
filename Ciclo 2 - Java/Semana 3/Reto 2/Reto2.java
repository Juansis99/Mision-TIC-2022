import java.util.Arrays;

public class Reto2 {
    public static void main(String[] args) {
        String cola[] = { "A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11" };
        for (int i = 0; i < cola.length; i++) {
            System.out.println(cola[i]);
        }
        TurnoVirtual turnoVirtual1 = new TurnoVirtual(cola);
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.cambiarEstadoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.cambiarEstadoTurno();
        System.out.print("Turnos: ");
        System.out.println(Arrays.toString(turnoVirtual1.getTurnos()));
        System.out.print("Turnos Perdidos: ");
        System.out.println(Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        System.out.print("Estado del Turno Virtual: ");
        System.out.println(turnoVirtual1.isEstadoTurnoVirtual());
        System.out.print("Turno en Atención: ");
        System.out.println(turnoVirtual1.getTurnoEnAtencion());
        System.out.print("Cantidad de turnos atendidos: ");
        System.out.println(turnoVirtual1.getCantidadTurnosAtendidos());
    }
}
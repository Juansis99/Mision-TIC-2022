public class TurnoVirtual {

    private String turnos[];
    private String turnosPerdidos[];
    private boolean estadoTurnoVirtual;
    private int turnoEnAtencion;
    private int cantidadTurnosAtendidos;

    public TurnoVirtual(String turnos[]) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length];
        for (int i = 0; i < this.turnos.length; i++) {
            this.turnosPerdidos[i] = (" ");
        }
        this.estadoTurnoVirtual = true;
        this.turnoEnAtencion = 0;
        this.cantidadTurnosAtendidos = 1;
    }

    public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String turnos[]) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String turnosPerdidos[]) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    public void atenderProximoTurno() {
        if (this.estadoTurnoVirtual == true) {
            this.turnoEnAtencion += 1;
            this.cantidadTurnosAtendidos += 1;
        }
    }

    public void agregarTurnoPerdido() {
        for (int i = 0; i < this.turnosPerdidos.length; i++) {
            if (" ".equals(this.turnosPerdidos[i])) {
                this.turnosPerdidos[i] = this.turnos[turnoEnAtencion];
                break;
            }
        }
    }

    public void cambiarEstadoTurno() {
        if (this.estadoTurnoVirtual == true) {
            this.estadoTurnoVirtual = false;
        } else {
            this.estadoTurnoVirtual = true;
        }
    }
}
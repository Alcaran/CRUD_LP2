package crud_081170031.consolestate;

public enum EnumConsoleState {
    
    MENU(new ConsoleStateMenu());
    
    private final ConsoleState estadoMaquina;
    
    EnumConsoleState(ConsoleState estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
 
    public ConsoleState getEstadoMaquina() {
        return estadoMaquina;
    }
}

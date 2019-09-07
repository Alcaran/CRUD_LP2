package crud_081170031;

import crud_081170031.consolestate.ConsoleState;
import crud_081170031.consolestate.EnumConsoleState;

public class CRUD_081170031 {
  
    public static ConsoleState consoleState;
    
    public static void main(String[] args) {
        consoleState = EnumConsoleState.MENU.getEstadoMaquina();
        Boolean saida = false;
        while (!saida){
            saida = consoleState.Execute();
        }    
    }
      private void jTextArea2KeyPressed(java.awt.event.KeyEvent evt) {                                          
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           
        }
    }  
}

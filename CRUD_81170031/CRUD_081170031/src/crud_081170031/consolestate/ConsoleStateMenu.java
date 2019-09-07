package crud_081170031.consolestate;

import crud_081170031.CRUD_081170031;
import java.util.Scanner;
import java.awt.event.*;

public class ConsoleStateMenu extends ConsoleState{

    @Override
    public boolean Execute() {
        System.out.println("----Menu Principal----");
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Sair");
        
        String opcao = evt.getKeyCode().toString();
        switch (opcao)
        {
            case 0:
                CRUD_081170031.consoleState = EnumConsoleState.MENU.getEstadoMaquina();
                break;
            case 1:                
                break;
        }
        return false;
    }
    
    private String jTextArea2KeyPressed(java.awt.event.KeyEvent evt) {                                          
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
           
        
        return (evt.getKeyCode().toString());
    } 
}

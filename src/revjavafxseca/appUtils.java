/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revjavafxseca;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Ahemd M. Abd El-Ghany
 */
public class appUtils {

    public static void changeStroke(Button btn) {
        DropShadow dsStroke = new DropShadow();
        btn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> btn.setEffect(dsStroke));
        btn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> btn.setEffect(null));
    }

}

package ListenersSimpleFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ListenerFactory {
    public ActionListener getListener(ListenerType listenerType, JTextField textField){
        if(listenerType.equals(ListenerType.Number))
            return new NumberListener(textField);
        else if(listenerType.equals(ListenerType.Operation))
            return new OperatorListener(textField);
        else
            return null;
    }

    public enum ListenerType{
        Number , Operation
    }
}

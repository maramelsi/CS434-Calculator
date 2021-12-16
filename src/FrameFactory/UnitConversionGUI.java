package FrameFactory;

import javax.swing.*;

public class UnitConversionGUI extends Frame {
    JFrame frame;
    @Override
    public void create(){
        Unit frame = new Unit();
        frame.setVisible(true);
    }
}

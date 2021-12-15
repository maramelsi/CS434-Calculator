package FrameFactory;

public class ConcreteFrameFactory extends FrameFactory{

    @Override
    protected Frame produceFrame(String type){
        Frame frame = null;
        if (type.equals("unit"))
            frame = new UnitConversionGUI();
        else if(type.equals("calculator"))
            frame = new CalculatorGUI();

            return frame;
    }
}

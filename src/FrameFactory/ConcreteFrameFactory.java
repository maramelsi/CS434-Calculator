package FrameFactory;

public class ConcreteFrameFactory extends FrameFactory {

    @Override
    protected Frame produceFrame(String type){
        Frame frame = null;
        if (type.equals("unit"))
            frame = new UnitConversionGUI();
        else if(type.equals("calculator"))
            frame = new CalculatorGUI();
        else if(type.equals("temp"))
            frame = new TemperatureFrame();
        else if(type.equals("length"))
            frame = new LengthFrame();

        return frame;
    }
}
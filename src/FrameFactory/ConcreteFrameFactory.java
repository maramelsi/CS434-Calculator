package FrameFactory;

public class ConcreteFrameFactory extends FrameFactory {

    @Override
    protected Frame produceFrame(String type){
        Frame frame = null;
        switch (type) {
            case "unit":
                frame = new UnitConversionGUI();
                break;
            case "calculator":
                frame = new CalculatorGUI();
                break;
            case "temp":
                frame = new TemperatureFrame();
                break;
            case "length":
                frame = new LengthFrame();
                break;
        }

        return frame;
    }
}
package FrameFactory;

public class AddOperation extends Operation {
    public AddOperation() {
        super.type = "+";
    }

    @Override
  double calculate(String displayText){
   return total += convertToNumber(displayText);
  }
}

package FrameFactory;

public abstract class FrameFactory {

    public void createFrame(String type){
        Frame frame = produceFrame(type);
        frame.create();
    }
    protected abstract Frame produceFrame(String type);
}
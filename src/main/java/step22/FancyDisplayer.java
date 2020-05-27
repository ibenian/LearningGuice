package step22;

public class FancyDisplayer extends DisplayerBase {
    @Override
    public void display(String s) {
        System.out.println(String.format("FancyDisplayer: %s", s));
    }
}

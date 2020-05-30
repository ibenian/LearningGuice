package step26;


public class StdoutDisplayer implements Displayer {
    public void display(String s) {
        System.out.println(String.format("Stdout Displayer: %s", s));
    }
}

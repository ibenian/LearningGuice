package step21;

/**
 * Created by ibenian on 17/5/20.
 */
public class StdoutDisplayer implements Displayer {
    public void display(String s) {
        System.out.println(s);
    }
}

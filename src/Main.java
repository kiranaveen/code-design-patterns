import Iterator.BrowserHistory;
import Iterator.Iterator;

public class Main {
    public static void main(String[] args) {

        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();

        while (iterator.hasNext())
        {
            var url =iterator.current();
            System.out.println(url);
            iterator.next();
        }





    }
}
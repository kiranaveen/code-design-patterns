import Iterator.BrowserHistory;
import Iterator.Iterator;
import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {

        //Iterator Main Method Implementation
//        var history = new BrowserHistory();
//        history.push("a");
//        history.push("b");
//        history.push("c");
//
//        Iterator iterator = history.createIterator();
//
//        while (iterator.hasNext())
//        {
//            var url =iterator.current();
//            System.out.println(url);
//            iterator.next();
//        }

//        Momento Patter Main Implementation

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");

        editor.restore(history.pop());
        editor.restore(history.pop());


        System.out.println(editor.getContent());







    }
}
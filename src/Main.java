import Iterator.BrowserHistory;

public class Main {
    public static void main(String[] args) {

        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        for (var i = 0; i<history.getUrls().size();i++)
        {
            var url = history.getUrls().get(i);
            System.out.printf("url");
        }



    }
}
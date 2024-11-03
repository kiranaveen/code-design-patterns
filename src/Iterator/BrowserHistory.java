package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory
{

    private List<String> urls = new ArrayList<>();
//    private String[] urls = new ArrayList<>();  // change like this will break the entire code need to follow iterator pattern to solve it

    public void push(String url)
    {
        urls.add(url);
    }

    public String pop()
    {
        var lastIndex = urls.size()-1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator createIterator()
    {
        return new ListIterator(this);
    }




    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public class ListIterator implements Iterator
    {
        private final BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory history)
        {
            this.history = history;
        }


        @Override
        public boolean hasNext() {
            return (index<history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}

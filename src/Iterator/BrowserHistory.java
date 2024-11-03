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

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

}

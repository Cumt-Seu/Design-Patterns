package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filterList = new ArrayList<>();
    public FilterChain add(Filter f)
    {
        filterList.add(f);
        return this;
    }
    public boolean doFilter(Message m)
    {
        for (Filter filter : filterList) {
            if(!filter.doFilter(m))
            {
                return false;
            }
        }
        return true;
    }
}

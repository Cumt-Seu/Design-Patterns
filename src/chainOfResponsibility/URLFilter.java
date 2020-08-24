package chainOfResponsibility;

public class URLFilter implements Filter{
    @Override
    public boolean doFilter(Message m) {
        String msg = m.getMsg();
        msg = msg.replace("cumt.edu.cn","http://www.cumt.edu.cn");
        m.setMsg(msg);
        return true;
    }
}

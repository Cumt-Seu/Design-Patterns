package chainOfResponsibility;

public class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Message m) {
        String msg = m.getMsg();
        msg = msg.replace("<","[");
        msg = msg.replace(">","]");
        m.setMsg(msg);
        return true;
    }
}

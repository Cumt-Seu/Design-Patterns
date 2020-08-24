package chainOfResponsibility;

public class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Message m) {
        String msg = m.getMsg();
        msg = msg.replace("牛逼","优秀");
        m.setMsg(msg);
        return false;
    }
}

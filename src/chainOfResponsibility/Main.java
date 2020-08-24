package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMsg("hello，<script>CUMT是个很牛逼的大学，想了解请访问：'cumt.edu.cn'</script>");
        FilterChain filterChain = new FilterChain();
        filterChain.add(new SensitiveFilter()).add(new URLFilter());
        filterChain.doFilter(message);
        System.out.println(message);


        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new HTMLFilter());
        Message message1 = new Message();
        message1.setMsg("hello，<script>CUMT是个很牛逼的大学，想了解请访问：'cumt.edu.cn'</script>");
        filterChain1.add(filterChain);
        filterChain1.doFilter(message1);
        System.out.println(message1);
    }
}

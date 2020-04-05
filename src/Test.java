public class Test {
    public static void main(String[] args) {
        System.out.println("aaa");
        ThreadLocal<String> a = new ThreadLocal<>();
        a.set("aa");
    }
}

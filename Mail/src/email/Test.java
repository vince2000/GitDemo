package email;

public class Test {
public static void main(String[] args) {
   /* String s="$$A{\"actionName\":\"nod\"}";
    s = s.replaceAll("\\[p1000\\]", "");
    s = s.replaceAll("\\$\\$P\\d", "");
    s = s.replaceAll("(?:\"\\w+\"):(?:\"[^\"]+\")", "");
    s = s.replaceAll("\\$\\$A", "");
    s= s.replaceAll("\\{\\}", "1");
    s = s.replaceAll("\\$\\$T信用卡", "");
    s = s.replaceAll("\\$\\$T", "");*/
    String s = "[p898944]";
    s = s.replaceAll("\\[p.*\\]", "");
    System.out.println(s);;
}
}

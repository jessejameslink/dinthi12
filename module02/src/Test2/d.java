package Test2;

public class d {
    String s1 = "a";
    String s2 = "b";

    public String getS1(){
        return s1;
    }
    static class y extends d{
        String s1 = "f";
        public String gets1(){
            return s1;
        }
    }


}

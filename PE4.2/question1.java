

 class qu1 {
    String string;

    public qu1(String string) {
        super();
        this.string = string;
    }
}
public class question1 {
    private class Inner{
        String s;
        public Inner() {
            super();
            qu1 ob = new qu1("shutup mofu");
            s =ob.string;
        }
            
    }
    private question1.Inner getInnerobject(){
        question1.Inner inner = new Inner();
        return inner;
    }
    
    public static void main(String[] args) {
        question1 ob = new question1();
        Inner in = ob.getInnerobject();
        System.out.println(in.s);
    }
}


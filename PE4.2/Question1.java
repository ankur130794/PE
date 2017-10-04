

 class qu1 {
    String string;

    public qu1(String string) {
        super();
        this.string = string;
    }
}
public class Question1 {
    private class Inner{
        String s;
        public Inner() {
            super();
            qu1 ob = new qu1("shutup mofu");
            s =ob.string;
        }
            
    }
    private Question1.Inner getInnerobject(){
        Question1.Inner inner = new Inner();
        return inner;
    }
    
    public static void main(String[] args) {
        Question1 ob = new Question1();
        Inner in = ob.getInnerobject();
        System.out.println(in.s);
    }
}


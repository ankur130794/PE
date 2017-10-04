

class mainClass {
   

    public InnerClass getObj() {
        return this.new InnerClass();
    }

    private class InnerClass {
        InnerClass() {}
    }
    public static void main( String[] args ) {
        mainClass mc = new mainClass();
        InnerClass ic = mc.getObj();
        System.out.println( ic );
    }
}



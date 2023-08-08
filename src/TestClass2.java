public class TestClass2 {
    public boolean tester(){
        return true;
    }
    public static void main(String[] args) throws Exception {
        TestClass2 tc = new TestClass2();
        while(tc.tester()){
            System.out.println("running...");
        }
    }
}

public class App {

  public static void main( String[] args ) {
  
    System.out.println("I am a Java application");
    Delegate delegate = new Delegate();
    int result = delegate.answer();
    System.out.println(result);
  }
}

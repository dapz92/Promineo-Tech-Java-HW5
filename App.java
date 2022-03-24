public class App {
    public static void main(String args[]) {
        AsteriskLogger ask = new AsteriskLogger();
        SpacedLogger space = new SpacedLogger();
        
        ask.Log("Hello");
        space.Log("Hello");
        ask.Error("Danger!");
        space.Error("Danger!");
        
    }
}
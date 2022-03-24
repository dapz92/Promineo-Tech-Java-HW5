public class SpacedLogger implements Logger {
    public SpacedLogger(){
        
    }
    
    @Override
    public void Log(String message){
        message = String.join(" ", message.split(""));
        System.out.println(message);
    }
    
    @Override
    public void Error(String message){
        message = String.join(" ", message.split(""));
        System.out.println("ERROR: " + message);
    }
}
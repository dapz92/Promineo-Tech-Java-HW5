public class AsteriskLogger implements Logger {
    public AsteriskLogger(){
        
    }
    
    @Override
    public void Log(String message){
        System.out.println("***" + message + "***");
    }
    
    @Override
    public void Error(String message){
        System.out.println("****************");
        System.out.println("*** Error: " + message + "***");
        System.out.println("****************");
    }
}
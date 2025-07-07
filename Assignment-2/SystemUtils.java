class SystemUtils {
    static class Logger{
        static void log(String message){
            System.out.println("It records Log activities "+message);
        }
    }
        public static void main(String[] args){
        SystemUtils.Logger.log("Finding the error in the code");
        SystemUtils.Logger.log("Resolve the errors");
        SystemUtils.Logger.log("push it into git");

    }
}

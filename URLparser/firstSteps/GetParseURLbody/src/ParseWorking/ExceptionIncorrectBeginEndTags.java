package ParseWorking;

public class ExceptionIncorrectBeginEndTags extends Exception{

    ExceptionIncorrectBeginEndTags(){
        super("Incorrect inputs data. Position begin tag is after ending tag...");
    }
}

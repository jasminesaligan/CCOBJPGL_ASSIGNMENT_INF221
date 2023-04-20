public class exercise1 {
    
    static boolean iwillNotCheat = true;
    static boolean iwillWin = true;

    public static void main(String[] args) throws Exception {


        // Precondition 
        assert iwillNotCheat == true: "EW! That's unethical and not professional...nyeaaah"; 

        enterCompetition();

        // Postcondition
        assert iwillWin == true: "NAUUUR WAAAY"; 







    }

     static void enterCompetition() {
        iwillWin = false;
        // iwillNotCheat = false;
    }
}

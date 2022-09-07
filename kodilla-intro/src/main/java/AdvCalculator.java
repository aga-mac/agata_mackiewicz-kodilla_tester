public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        switch (userSelected) {
            case "ADD": return a + b;
            case "SUB": return a - b;
            case "DIV": return a / b;
            case "MUL": return a * b;
            default: return 0;
        }
    }
}
//switch (userSelected) { case "ADD":
        //result = a + b;
        //break;                     // [1]
        //case "SUB":
        //result = a - b;
        //break;                     // [2]
        //case "DIV":
       // result = a / b;
        //break;                     // [3]
        //case "MUL":
       // result = a * b;
        //break;                     // [4]
        //}
        //return result;
        //}
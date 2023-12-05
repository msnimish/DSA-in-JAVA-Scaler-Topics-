public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        PrintConsonants("welcometoscaler");
    }

    public static void PrintConsonants(String str){
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.print(ch);
        }
    }
}

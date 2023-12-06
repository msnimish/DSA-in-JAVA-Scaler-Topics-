public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        ReverseVowels("Done");
        PrintConsonants("welcometoscaler");
        ConvertUpperCaseToLowerCase("HiCaTherIneGooDMorNIng");
    }

    public static void ConvertUpperCaseToLowerCase(String str){
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length;i++){
            if(ch[i]>'A' && ch[i] < 'a'){
                ch[i] = (char)(ch[i] + 'a' - 'A');
            }
        }

        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i ]);
        }
    }

    public static void PrintConsonants(String str){
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void ReverseVowels(String str){
        int i = 0; int j=str.length()-1;
        StringBuilder sb = new StringBuilder(str);
        while(i < j){
            boolean isIVowel = checkVowel(sb.charAt(i));
            boolean isJVowel = checkVowel(sb.charAt(j));
            if(isIVowel && isJVowel){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++; j--;
            }else if(!isIVowel){
                i++;
            }else if(!isJVowel){
                j--;
            }else{
                i++; j--;
            }
        }
        System.out.println(sb.toString());
    }

    public static boolean checkVowel(Character ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}

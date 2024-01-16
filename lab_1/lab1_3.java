
public class lab1_3 {
    public static void main(String[] args) {
        String str = "00001111";
        System.out.println("This string is "+(checkString(str)? "":"not ")+"in the language.");
    }

    public static boolean checkString(String str){
        Stack stack = new Stack();
        char c;

        if(str.length()%2 != 0) return false;
        
        boolean countingOnes = false;
        
        for(int i = 0; i < str.length(); i++){
            try{
                c = str.charAt(i);
                switch (c) {
                    case '0':
                        if(!countingOnes) stack.push(c);
                        else return false;
                        break;
                    case '1':
                        countingOnes = true;
                        stack.pop();
                    default:
                        break;
                }
            }catch(Exception e){
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}

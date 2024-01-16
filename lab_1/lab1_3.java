public class lab1_3 {
    public static void main(String[] args) {
        String str = "00001111";

        //O(1) Stack ADT
        long start = System.nanoTime();
        for(int i = 0; i < 100000000; i++){
            checkString_O_1(str);
        }
        long end = System.nanoTime();
        double o1_Time = (end - start) / 1_000_000_000;

        //O(n) Stack ADT
        start = System.nanoTime();
        for(int i = 0; i < 100000000; i++){
            checkString_O_n(str);
        }
        end = System.nanoTime();
        double on_Time = (end - start) / 1_000_000_000;

        System.out.println("This string is "+(checkString_O_n(str)? "":"not ")+"in the language.");
        System.out.println(o1_Time+" seconds to run in O(1) time (100,000,000 times)");
        System.out.println(on_Time+" seconds to run in O(n) time (100,000,000 times)");        
    }

    public static boolean checkString_O_n(String str){
        StackO_n stack = new StackO_n();
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

    public static boolean checkString_O_1(String str){
        StackO_1 stack = new StackO_1();
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

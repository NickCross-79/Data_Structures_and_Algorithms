
public class lab1_3 {
    public static void main(String[] args) {
        String str1 = "0111000111";
        System.out.println(checkString_O_1(str1));
        StringBuilder str = new StringBuilder("");
        for (int j = 1; j <= 20; j++) {

            str.append(Integer.toString(1));
            str.insert(0, Integer.toString(0));

            // O(1) Stack ADT
            int sum = 0;
            long start = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                
                checkString_O_1(str.toString());
                
            }
            long end = System.nanoTime();
            int o1_Time = (int)(end - start);
            sum = o1_Time / 1000;

            System.out.println(2+"^"+j);
            System.out.println(str+":");
            System.out.println("This string is " + (checkString_O_1(str.toString()) ? "" : "not ") + "in the language.");
            System.out.println(sum + " seconds to run in O(1) time (100,000,000 times)");
        }
    }

    public static boolean checkString_O_1(String str) {
        StackO_1 stack = new StackO_1();
        char c;

        if (str.length() % 2 != 0)
            return false;

        boolean countingOnes = false;

        for (int i = 0; i < str.length(); i++) {
            try {
                c = str.charAt(i);
                switch (c) {
                    case '0':
                        if (!countingOnes)
                            stack.push(c);
                        else
                            return false;
                        break;
                    case '1':
                        countingOnes = true;
                        stack.pop();
                    default:
                        break;
                }
            } catch (Exception e) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

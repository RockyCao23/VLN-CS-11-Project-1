public class Main {

    static int problemOne(String s){
        int answer = 0; //count
        for (int i = 0; i < s.length(); i ++){//loop

            if (s.substring(i,i+1).equals("a") || s.substring(i,i+1).equals("e") || s.substring(i,i+1).equals("i") || s.substring(i,i+1).equals("o") || s.substring(i,i+1).equals("u")){
                answer++;
            }
        }
        return answer;
    }

    static int problemTwo(String s){
        int answer = 0;//count

        for (int i = 0; i < s.length()-2; i++){

            if (s.substring(i,i+3).contains("bob")){//searches for BOB
                answer++;
            }
        }
        return answer;
    }

    static String problemThree(String s){

        int x = 0;//index position

        String a = s.substring(0,1);
        String b = s.substring(0,1);

        for (int i = 0; i < s.length()-1; i ++){

            if ((s.substring(i,i+1).compareTo(s.substring(i+1,i+2)) <= 0)){       //check if alphabetical order
                b = s.substring(x,i+2); //records alphabetical order substring
                if (b.length() > a.length()){       //compares length
                    a = b;                           //keeps longer substring
                }
            }else {
                x = i+1;//if not alphabetical, then resets
            }

        }

        return a;  //returns substring
    }
    public static void main(String[] args) {

        System.out.println(problemThree("XZZABCDEFJAA"));   //test
    }
}

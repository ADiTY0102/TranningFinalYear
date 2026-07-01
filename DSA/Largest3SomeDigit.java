public class Largest3SomeDigit {
    public static void main(String[] args) {
        String num = "6777133339";

        String result = "";
        for(int i=0;i<num.length()-2;i++){
            String sub = num.substring(i, i+3);

            if(sub.charAt(0) == sub.charAt(1) && sub.charAt(1)== sub.charAt(2)){
                if(result.length() < sub.length() || result.isEmpty()) {
                    result = sub;
                }
            }
        }
        if(!result.isEmpty()) {
            System.out.println(result);
        }else{
            System.out.println(" ");
        }
    }
}

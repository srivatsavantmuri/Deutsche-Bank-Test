//Write a Program to convert below string into Integer: Input String = "$180,240/y" Output Integer = 180240

public class Main {

  public static void main(String[] args) {

        String str = "$180,240/y";
        StringBuilder res = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(Character.isDigit(ch)){
                res.append(ch);
            }
        }

        Integer val = Integer.valueOf(res.toString());
        System.out.printf("Integer value of String: %d%n",val);
    }
}

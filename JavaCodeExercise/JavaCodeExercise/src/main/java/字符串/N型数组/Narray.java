package 字符串.N型数组;

public class Narray {



    public static String cover(String s, int numsrow){

        StringBuilder [] sb =new StringBuilder[numsrow];

        for (int i = 0; i <numsrow ; i++) {

            sb [i] =new StringBuilder();

        }

        // 怎么来创建字符数组，字符数组里面放入字符串对象是这么做的

        int cur=0;
        boolean goDown=false;

       for(char c:s.toCharArray()){
           sb[cur].append(c);
           if(cur==0||cur==numsrow-1){
               goDown = !goDown;
           }
           cur += goDown ? 1:-1;
       }
       // 回收字符串
        StringBuilder result =new StringBuilder();
       for (StringBuilder row :sb){
           result.append(row);
       }
        return result.toString();
    }


    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int a=3;
        String aaa=cover(s,a);
        System.out.println(aaa);

    }
}

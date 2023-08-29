package 数组.两个数组之间的遍历;

public class TwoArray {

    public static int twoArray(String arr,String nums){
        int arrLength=arr.length();
        int numsLength=nums.length();
        for(int i=0;i<arrLength-numsLength;i++){
            for (int j = 0; j <arrLength ; j++) {
                if(arr.charAt(i+j)!=nums.charAt(j)){
                    break;
                }
                if(j==numsLength-1){
                    return i;
                }

            }

        }
        return -1;

    }



    public static void main(String[] args) {
        String arr="CDDDABCDEF";
        String nums="DAB";
        int result = twoArray(arr,nums);
        System.out.println(result);

}
    }

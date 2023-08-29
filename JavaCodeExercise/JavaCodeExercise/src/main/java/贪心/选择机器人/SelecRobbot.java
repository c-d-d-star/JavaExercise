package 贪心.选择机器人;
//有100个机器人的比赛，每个机器人都有不同的时速。问应该选择哪个机器人来赢得比赛，使得选择的机器人的速度比其他机器人都快？
public class SelecRobbot {

    public static int select(int []roobts){

        int maxSpeed=0;
        int index=0;// 这个是需要返回的数组
        for (int i = 0; i <roobts.length ; i++) {
            if(roobts[i]>maxSpeed){
                maxSpeed=roobts[i];
                index=i;// 此时这个i就是我想要找到的，但是我不能直接将i的值给返回了，拿变量进行接受，接着就是及那个接受道的变量进行返回
            }

        }
        return index;
    }

}

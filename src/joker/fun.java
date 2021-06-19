package joker;

import java.util.ArrayList;
import java.util.Arrays;

public class fun {
    static int[] input=new int[15];
    static int[] theWay=new int[5];
    public static void create(String att){
        ArrayList arrayList=new ArrayList(Arrays.asList(att.split(",")));
        for (int i=0;i<15;i++) {
            input[i]= Integer.parseInt(arrayList.get(i).toString());
        }
    }
    public static int FindMax(int a,int b){
        if(a>b)
        {
            return a;
        }
        else
            return b;
    }
    public static void deal(){
        int no=1;
        int nowlevel=1,nowlo=0,nextlo1,nextlo2,next1,next2;
        int way=input[0];
        //int[] theWay=new int[5];
        theWay[0]=0;
        while (nowlevel!=5) {
            nextlo1 = nowlo + nowlevel;//现在在一维数组中的位置加上层数
            nextlo2 = nextlo1 + 1;
            next1=input[nextlo1];
            next2=input[nextlo2];
            if (next1 == FindMax(next1, next2)) {
                nowlo = nextlo1;
                way = way + next1;
                theWay[no]=nowlo;
                no++;
            } else {
                nowlo = nextlo2;
                way = way + next2;
                theWay[no]=nowlo;
                no++;
            }
            nowlevel++;
        }
        for (int o=0;o<5;o++)
        System.out.println(theWay[o]);
        System.out.println(way);
    }
}

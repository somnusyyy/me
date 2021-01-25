package Integer;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s="12 97 56 43 15";
        String[] str=s.split(" ");//将字符串内容由regex分割成字符数组
//        System.out.println(str[1]);
        int[] arr= new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);//str[i]--->int[i]
        }
        Arrays.sort(arr);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(arr[i]+" ");
        }
//        System.out.println(sb);
        String string = sb.toString();
        System.out.println(string);
    }


}

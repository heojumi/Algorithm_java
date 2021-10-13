package chap03;
import java.util.Scanner;
public class prcatice02 {
    static int Search(int[] a,int key){
        int i;
        System.out.print("  |");
        for(i=0;i< a.length;i++)
            System.out.print(" "+i);
        System.out.println();
        System.out.println("--+-------------------");

        for(i=0;i< a.length;i++) {
            int t;
            System.out.print("  |");
            for(t=0;t<a.length;t++){
                if(i==t)
                    System.out.print(" * ");
                else
                    System.out.print("  ");
            }
            System.out.println();

            System.out.print(" "+i+"|");
            for(t=0;t<a.length;t++){
                System.out.print(" "+a[t]);
            }
            System.out.println();
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a;
        System.out.println("요솟수");
       int length=stdIn.nextInt();
        int[] array=new int[length];
        for(a=0;a<length;a++){
            System.out.println(a+"번째 값을 입력하세요");
            int value= stdIn.nextInt();
            array[a]= value;
        }
        System.out.println("찾고싶은 값을 입력하세요");
        int ky=stdIn.nextInt();

        int idx=Search(array,ky);
        if(idx==-1)
            System.out.println("찾는값이 존재하지 않습니다.");
        else
            System.out.println(ky+"은 x["+idx+"] 에 있습니다.");
    }
}

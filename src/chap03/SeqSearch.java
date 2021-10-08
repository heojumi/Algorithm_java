package chap03;
//사용자에게 입려받기
import java.util.Scanner;
//선형 검색
public class SeqSearch {

    static int seqSearch(int[] a,int n, int key){
        int i = 0;
        //무한 루프
        while(true){
            //해당 키 값이 존재하지 않을 때
            if(i==n)
                return -1;
            //해당 키 값이 존재할 때 위치 반환
            if(a[i]==key)
                return i;
            i++;
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        //요솟수 입력
        System.out.println("요솟수 :");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        //내부 값 입력
        for(int i=0; i<num; i++){
            System.out.println("x[" + i + "] :");
            x[i]= stdIn.nextInt();
        }
        //키 값 입력
        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        //함수 호출
        int idx = seqSearch(x,num,ky);

        //결과 출력
        if(idx==-1)
            System.out.println("찾는 값이 없습니다");
        else
            System.out.println(ky+"는 " +idx+" 에 있습니다");

    }

}

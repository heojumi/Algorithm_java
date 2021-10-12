package chap03;
import java.util.Scanner;

public class BinSearch {

    static int binSearch(int[] a, int n, int key){
        //검색범위 변수설정
        int Min=0;
        int Max=n-1;

        do{
            //Mid값은 key값과 비교하는 변수
            int Mid=(Min+Max)/2;
            if(a[Mid]==key)
                //값을 찾은 경우 Mid를 return 한다.
                return Mid;
            else if(a[Mid]<key)
                //key 값보다 Mid값이 작은경우 Mid보다 큰 인덱스로 검색범위를 옮기기 위해 Min을 Mid보다 1 크도록 옮긴다.
                Min=Mid+1;
            else
                //key값보다 Mid값이 큰 경우 Mid보다 작은 인덱스로 검색범위를 옮기기 위해 Max를 Mid보다 1 작도록 옮긴다.
                Max=Mid-1;
            //무한 루프를 Min의 값이 Max보다 작거나 같을때까지 돌린다->Min의 값이 Max값보다 크면 종료
        }while (Min<=Max);
        //Min의 값이 Max보다 커졌는데 값을 찾지 못한 경우 -1을 리턴한다.
        return -1;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();
        //크기가 num인 배열 생성
        int[] x=new int[num];

        System.out.println("오름차순으로 입력해 주세요.");
        //x[0]의 값 미리 받는다.
        System.out.println("x[0] :");
        x[0]=stdIn.nextInt();

        for(int i=1; i<num; i++){
            do{
                System.out.println("x["+i+"]:");
                x[i]=stdIn.nextInt();
                //오름차순으로 값을 받기위한 무한루프 이전 값보다 값이 작다면 다시 입력해야한다.
            }while (x[i]<x[i-1]);
        }

        System.out.println("검색할 값: ");
        int ky = stdIn.nextInt();

        int idx=binSearch(x,num,ky);

        if(idx==-1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"는 x["+idx+"]에 있습니다.");

    }
}

import java.util.*;

public class q1 {
    static int  NumberItems;
    static int[] DataStored =new int[20];
    static Scanner aa=new Scanner(System.in);
    static int num;
    static void initialise(){
        System.out.println("Please input the number you would like to have");
        
        do{
            num=aa.nextInt();
            if(num<1||num>20){
                System.out.println("Input it again,it should be between 1 and 20");
            }

        }while(num<1&&num>20);
        for(int i=0;i<num;i++){
            System.out.println("Input data element"+(i+1));
            DataStored[i]=aa.nextInt();
        }
    }
    static void BubbleSort(){
        int temp=0;
        for(int i=0;i<DataStored.length;i++){
            for (int j = 0; j < DataStored.length-i; j++) {
                if(DataStored[j]>DataStored[j+1]){
                    temp=DataStored[j];
                    DataStored[j]=DataStored[j+1];
                    DataStored[j+1]=temp;
                }
                
            }
        }
    }
    static int BinarySearch(int DataToFind){
        int highbound=DataStored.length;
        int lowbound=0;
        int index=0;
        boolean found=false;
        int middle=0;
        
        while(lowbound<=highbound&&found!=true){
            middle=(highbound+lowbound)/2;
            if(DataStored[middle]==DataToFind){
                found=true;
            }
            if(DataStored[middle]>DataToFind){
                highbound=middle-1;
            }
            else{
                lowbound=middle+1;
            }
        }
        if(found){
            return middle;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        NumberItems=0;
        initialise();
        BubbleSort();
        System.out.println("Input a data that you would like to find in the array?");
        int daddd=aa.nextInt();
        BinarySearch(daddd);
        aa.close();

        for(int j=0;j<num;j++){
            System.out.println(DataStored[j]);
        }
    }
}

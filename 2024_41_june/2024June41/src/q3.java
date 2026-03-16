
public class q3 {

   static int queuehead=-1,queuetail=-1;

 static String[]  QueueData =new String[20];
static boolean Enqueue(String dataToInsert){
        if(queuetail==QueueData.length-1){
            return false;
        }
        if(queuehead==-1){
            queuehead=0;
            queuetail=0;
        }
        else{
            queuetail++;
        }
        QueueData[queuetail]=dataToInsert;
        return true;
}

static String Dequeue(){
    if(queuehead==-1){
        return "false";
    }
    String trmp;
    trmp=QueueData[queuetail];
    queuetail--;
    return trmp;
}

static void StoreItems(String st){
    int checkdigit;
    int sum1=Integer.parseInt(st.substring(0,1))+Integer.parseInt(st.substring(3,4))+Integer.parseInt(st.substring(1,2));
    int sum2=Integer.parseInt(st.substring(2,3))*3+Integer.parseInt(st.substring(3,4))*3+Integer.parseInt(st.substring(5,6))*3;
    checkdigit=(sum1+sum2/10);
    if(checkdigit==Integer.parseInt(st.substring(6,7))){
        Enqueue(st.substring(6,7));

    }
    else{
        System.out.println("Fuck you and get out of my string my hacker");

    }

}




    public static void main(String[] args) {
        for(int i=0;i<19;i++){
            QueueData[i]=null;
            StoreItems("1817352");
            Dequeue();

           
        }
    }
}

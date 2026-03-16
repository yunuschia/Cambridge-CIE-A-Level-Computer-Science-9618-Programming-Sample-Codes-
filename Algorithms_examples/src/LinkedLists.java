

public class LinkedLists {
    public class node{//  this is a userdefined type(record) prepared for the LinkedList function
        int data;
        node next;
        public node(){
            next=null;
        }
        
    }
    public class LinkedListss{
        node head;//head pointer
        public void InsertFromTheFront(int Dt){
            node NN=new node();//Creat the new node that is to be inserted from the front
            NN.data=Dt;// the data need to be insert 
            NN.next=null;//since it is the most front node,it does not refer to anyother node
            //check if it is empty
            if(head==null){
                head=NN;
            }
            else{
                node n=head;//Here it is assumed that head is pointed to a actudal node
                while(n.next!=null){
                    n=n.next;
                }//try to find one node which has a empty reference
                n.next=NN; //refer this to the node that we want to add
            }   
        }
        public void Showdata(){
            if(head!=null){
                node n=head;
                while(n.next!=null){// if not empty,keep outputting all the elements in the linkedlist
                System.out.println(n.data);
                n=n.next;//Switch to the next node
            }
            System.out.println(n.data);//due to the while loop is pre-conditional there will missing one node unprinted,here we need to print it manually
            }
            else{
                System.out.println("No element found!");
            }
        }
        public void InsertFromTheStart(int ddt){
            node n2 =new node();
            n2.data=ddt;
            //created a new node with desired data to be inserted.
            n2.next=head;
            head=n2;

        }
        public void InsertFromTheMiddle(int insertPosistion,int dataTobeInserted){
            //first create the node you want to insert
            node n3 =new node();
            n3.data=dataTobeInserted;
            node nn =head;//Give pointer nn pointing to head(to avoid duplication)
            //YUNUS'version,a bit of low effciency,but high redundancy in the exam 
            /*
            int index=0;
            while(index!=insertPosistion){
                nn=nn.next;
                index++;
            }
            node temp;
            temp=nn.next;//Put the next node into a provisional space
            nn.next=n3;//change the reference of the next node to the deserved node
            n3.next=temp;//link the rest of the nodes back to the new node;
             */
           // Mistery Indian bro version:
            for(int i=0;i<insertPosistion;i++){//equal or less than??????? 
                nn=nn.next;
            }
            n3.next=nn.next;
            nn.next=n3;

            //这我真心写个屌啊，我拿鸡巴都写不出来 If you are reading this line,do not translate it,just treat this line as "OMG this is so difficult"
        }
            
        public void DeletAt(int index){
            node nn =head;
            for(int i=0;i<index;i++){//equal or less than??????? 
                nn=nn.next;
            }
            nn.next=nn.next.next;
        }
    }
    public static void main(String[] args) {
    }
}

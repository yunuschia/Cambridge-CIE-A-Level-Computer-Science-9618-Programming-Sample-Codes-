
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q2 {
    static tree[] bb =new tree[9];
    public static class tree{
        
        private String TreeName;
        private int HeightGrowth;
        private int MaxHeight;
        private int MaxWidth;
        private String EverGreen;

        public tree(String treename,int heightgrowth,int maxheight,int maxwidth,String evergreen){
            this.TreeName=treename;
            this.HeightGrowth=heightgrowth;
            this.MaxHeight=maxheight;
            this.MaxWidth=maxwidth;
            this.EverGreen=evergreen;
        }

        public String Gettreename(){
            return TreeName;
        }
        public int GetGrowth(){
            return HeightGrowth;
        }
        public int GetMaxHeight(){
            return MaxHeight;
        }
        public int GetMaxWidth(){
            return MaxWidth;
        }
        public String GeteverGreen(){
            return EverGreen;
        }
    }
    public static tree ReadData(){
            
            try {
                BufferedReader br =new BufferedReader(new FileReader("Trees.txt"));
                String line="";

            for (int i = 0; i <5; i++) {
                line=br.readLine();
                String [] parts = line.split(",");
                bb[i]=new tree(parts[0],Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4]);
                br.close();
            }
            } catch (Exception e) {
            }
            return bb[9];
            

    }
public static void PrintTrees(tree te){
    if(te.EverGreen=="yes"){
        System.out.println(te.Gettreename()+"has a maxmumheight" +te.GetMaxHeight()+"a maximum width of "+te.GetMaxWidth()+"it grows"+te.GetGrowth()+"it does not lose its leaves");
    }
    else if(te.EverGreen=="no"){
        System.out.println(te.Gettreename()+"has a maxmumheight" +te.GetMaxHeight()+"a maximum width of "+te.GetMaxWidth()+"it grows"+te.GetGrowth()+"It loses its leaves each year.");


    }
}
public static void  ChooseTree(tree[] rt){
        Scanner sc =new Scanner(System.in);
        int mheightr;
        int mwidthr;
        Boolean egreenq;
    System.out.println("what is your dream height for the tree?");
    mheightr=sc.nextInt();
    System.out.println("What is your dream maximum width for this tree");
    mwidthr=sc.nextInt();
    System.out.println("do you want this tree to be green");
    egreenq=sc.nextBoolean();
    String YorN;
    if(egreenq==true){
        YorN="yes";
    }
    else{
        YorN="No";
    }
    int numTreeFound=0;
    List<tree> trList =new ArrayList<>();
    for(int i=0;i<rt.length;i++){
        if(rt[i].GetMaxHeight()==mheightr&&rt[i].GetMaxWidth()==mwidthr&&rt[i].EverGreen==YorN){
            numTreeFound++;
            trList.add(rt[i]);    
        }
    }
    if(numTreeFound!=0){
        for(int j=0;j<numTreeFound;j++){
            PrintTrees(trList.get(j));
        }
    }
    else{
        System.out.println("no suitable trees found!");
    }
    System.out.println("Which tree you would like to buy and what is the height when it is bought?");

String aswer;
int hei;
aswer=sc.nextLine();
hei=sc.nextInt();
int f=0;
while(trList.get(f).Gettreename()!=aswer){
    f++;
}
System.out.println("the tree takes "+((trList.get(f).GetMaxHeight()-hei)/trList.get(f).HeightGrowth)+"years to grown to its maximum height of"+trList.get(f).GetMaxHeight());

}


    public static void main(String[] args) {
        ReadData();
        PrintTrees(bb[0]);
        ChooseTree(bb);
    }
}

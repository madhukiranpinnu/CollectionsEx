public class ProgramDEC24Pro3 {
    public static void main(String[] args) {
        //SecondLargest in Array
        Integer[] i=new Integer[9];
        i[0]=23;
        i[1]=90;
        i[2]=94;
        i[3]=56;
        i[4]=34;
        i[5]=59;
        i[6]=95;
        i[7]=99;
        i[8]=98;
        int largest=i[0];
        int secondlargest=0;
        for(int i1=1;i1<i.length;i1++){
            if(i[i1]>largest){
                secondlargest=largest;
                largest=i[i1];
            }
            else if (i[i1]>secondlargest) {
                secondlargest=i[i1];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }
}

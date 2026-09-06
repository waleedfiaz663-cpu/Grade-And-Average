import java.util.Scanner;
public class GradeandAverage {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); 
        
        int grade;
        int counter=0;
        int total=0;
        int[] frequency=new int[101];
        
        System.out.println("Enter grades (-1 to stop)");
        grade=input.nextInt();
        
        while(grade!=-1)
        {
            total=total+grade;
            counter=counter+1;
            frequency[grade]++;
            
            grade=input.nextInt();
           
        }
        if (counter != 0) {
            float average = (float) total / counter;
            
            System.out.println("total grades : " +total);
            System.out.printf("Average : %.2f ", average);
             System.out.printf("\n==================\n");
             System.out.println("Grade Frequency:");
             System.out.printf("==================\n");
             
             for(int i=0;i<frequency.length;i++){
                 if(frequency[i]>0)
                 {
                     System.out.println("grade"+i+"="+frequency[i]);
                 }
             }
        }
            else
            {
                    System.out.println("no grade entered");
            }
    }
}
    
    
    
    


// Find possible equal maximum sum 
class Queue2{

    public static int maxSum(int queue1[], int queue2[],int queue3[], int n1, int n2,int n3)
    {
      int sum1 = 0, sum2 = 0, sum3 = 0;
       
      for (int i=0; i < n1; i++)
          sum1 += queue1[i];
      
      for (int i=0; i < n2; i++)
          sum2 += queue2[i];
      
      for (int i=0; i < n3; i++)
          sum3 += queue3[i];
      
      int front1 =0, front2 = 0, front3 = 0;
      
      while (true)
      {
          if (front1 == n1 || front2 == n2 || front3 == n3)
             return 0;
      
          if (sum1 == sum2 && sum2 == sum3)
             return sum1;
          
          if (sum1 >= sum2 && sum1 >= sum3)
             sum1 -= queue1[front1++];
          else if (sum2 >= sum1 && sum2 >= sum3)
             sum2 -= queue2[front2++];
          else if (sum3 >= sum2 && sum3 >= sum1)
             sum3 -= queue3[front3++];
       }
    }
         public static void main(String[] args)
    {
      int queue1[] = { 4,2,1,1,2};
      int queue2[] = { 3,3,3 };
      int queue3[] = { 4,4,2 };
          
          int n1 = queue1.length;
          int n2 = queue2.length;
          int n3 = queue3.length;
          
          System.out.println(maxSum(queue1, queue2,
                               queue3, n1, n2, n3));
    }
  }
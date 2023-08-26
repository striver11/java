public class duplicate {
    public static void main(String ... duplicates) {
        int a[]={1,2,3,4,4,1,2,7,6};
        int b[]=new int[a.length];
        for(int i=0;i<=a.length-1;i++)
        {
             if(b[i]!=-1)
            {
            int count=1;
            for(int j=i+1;j<=a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    b[j]=-1;
                    count++;
                }
            }
           
                b[i]=count;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            if(b[i]==-1)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    
}


// output:
// 4 1 2

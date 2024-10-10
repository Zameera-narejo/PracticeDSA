package LAB08;

public class DecimalToBinary {
    public static int DecimalToBinary(int d)
    {
        if(d==0)
        {
            int binary=0;
            return binary;  
        }
        else{
            return (d%2+10*DecimalToBinary(d/2));
        }


    }
    public static void main(String[] args) {
        System.out.println("Decimal To Binary:"+DecimalToBinary(13));
        
    }
    
}

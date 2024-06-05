public class InvertedHalfPyramid {
    public static void main(String[] args){
        int m=4;
        int n=4;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
                System.out.print("*");
           }
           System.out.print("\n");
        }
        
    }
}

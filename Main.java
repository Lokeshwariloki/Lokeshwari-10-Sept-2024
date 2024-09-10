public class Main {
    public static void main(String[] args) {
        int rows=5;
        int cols=4;
        //Position of adventurer
        int row1=4;
        int col1=0;
        //Position of gold
        int row2=0;
        int col2=3;
        if(row1>row2 && col1<col2){
            int[][] dp=new int[row1+1][col2+1];
            int val=0,col=col1;
            int k=row1;
            while(col<=col2){
                dp[k][col++]=val++;
            }
            int val1=0,row=row1;
            int k1=col1;
            while(row>=row2){
                dp[row--][k1]=val1++;
            }
            for(int i=row1-1;i>=row2;i--){
                for(int j=col1+1;j<=col2;j++){
                    dp[i][j]=(dp[i+1][j]+dp[i][j-1])-dp[i+1][j-1];
                }
            }
            System.out.println(dp[row2][col2]);
        }

        if(row1<row2 && col1>col2){
            int[][] dp=new int[row2+1][col1+1];
            int val=0,col=col1;
            int k=row1;
            while(col>=col2){
                dp[k][col--]=val++;
            }
            int val1=0,row=row1;
            int k1=col1;
            while(row<=row2){
                dp[row++][k1]=val1++;
            }
            for(int i=row1+1;i<=row2;i++){
                for(int j=col1-1;j>=col2;j--){
                    dp[i][j]=(dp[i-1][j]+dp[i][j+1])-dp[i-1][j+1];
                }
            }
            System.out.println(dp[row2][col2]);
        }
    }
}
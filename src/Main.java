public class Main {
    public static void main(String[] args) {
        String[][] b= new String[5][3];
        for (int i=0 ;i< b.length;i++){
            for (int j =0 ;j<b[i].length;j++){
                if (i==0  ||(i==2 && j==1 )|| i==4||j==0 || j==2 ){
                    b[i][j]=" * ";
                } else {
                    b[i][j]="   ";
                }
            }
        }
        for (String[] row :b) {
            for (String column:row) {
                System.out.print(column);
            }
            System.out.println();

        }
    }
}
public class BasicOperations {
    public static void main(String[] args) {
        int[] a = new int[5];


        //Insertion at specific index
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        //Traversal
        for(int element : a){
            System.out.print(element + ", ");
        }
        System.out.println();

        //Search and update
        int searchElement = 20;
        for(int i=0; i<a.length;i++){
            if(a[i] == searchElement){
                a[i] = -1;
            }
            System.out.print(a[i]+ ", ");
        }
        System.out.println();

        //Delete by position
        int deletionPosition = 4;
        for(int i = deletionPosition; i<a.length; i++){
            a[i-1] = a[i];
        }
        a[a.length-1] = 0;
        for(int element : a){
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}

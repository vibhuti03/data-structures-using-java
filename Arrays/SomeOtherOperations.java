package Arrays;

public class SomeOtherOperations {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        String[][] s = {{"hello"},{"world"}};

        //copying an array
        int[] b = new int[5];
        System.arraycopy(a,0, b, 0, 5);
        System.out.print("Copied array is - ");
        for(int i : b){
            System.out.print(i + ", ");
        }
        System.out.println("Are the copied arrays same (hashcode wise)? " + (a==b));

        //cloning 1D array
        int[] c = a.clone();
        System.out.print("Cloned 1D array is - ");
        for(int i : c){
            System.out.print(i + ", ");
        }
        System.out.println("Are the cloned 1D arrays same (hashcode wise)? " + (a==c));

        //cloning multiDimensional array
        String[][] q = s.clone();
        System.out.print("Cloned multi dimensional array is - ");
        for(String[] i : s){
            for(String j : i){
            System.out.print(j);
        }System.out.print(" , ");
        }
        System.out.println("Are the cloned multi dimensional arrays same (hashcode wise)? " + (s==q));

    }
}

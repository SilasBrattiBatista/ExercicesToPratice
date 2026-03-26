package table;

public class MultiplicationTable implements Table {
    public void showTable(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i + " x " + n +" = " + i*n);
        };
    }
}

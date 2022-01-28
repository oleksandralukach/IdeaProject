package coding_bat.logic_1;

public class dateFashion {
    public static void main(String[] args) {
        dateFashion dateFashionO = new dateFashion();
        int tableAccess = dateFashionO.dateFashion(8, 1);
        if (tableAccess == 2) {
            System.out.println("Yes");
        } else if (tableAccess == 1) {
            System.out.println("Maybe");
        } else {
            System.out.println("No");
        }
    }

    public int dateFashion(int you, int date) {
        int tableAccess;

        if (you <= 2 || date <= 2) {
            tableAccess = 0;
        } else if (you >= 8 && date >= 8) {
            tableAccess = 2;
        } else {
            tableAccess = 1;
        }

        return tableAccess;
    }
}

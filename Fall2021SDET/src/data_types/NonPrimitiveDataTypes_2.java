package data_types;

public class NonPrimitiveDataTypes_2 {
    /**
    The main purpose of using variable is to KEEP CODE MAINTAINABLE, REUSABLE.
     * Basically it becomes easier to UPDATE if needed at one place and it gets applied
     * on every usage of that variable.
     *
     * Variables in Java are data containers that stores data values.
     * Variable is a memory location name of the data
     * [data type] + [variable name] = [data value]
     */
    public static void main(String[] args) {

        String ceoOfApple = "Tim Cook";
        String aboutAppleCeo = "The current CEO of Apple co. is " +ceoOfApple+ ".\n He joined Apple co. in 1990. He " +
                "is the best CEO of Apple co. \n in the history. " + ceoOfApple + " has a great personality";
        System.out.println(aboutAppleCeo);

        int tallestBuildingSize = 828;
        String tallestBuildingName = "Burj Khalifa";
        String tallestBuildingInfo = " The tallest building is " +tallestBuildingName+ ". The height of it is " +tallestBuildingSize;
        System.out.println (tallestBuildingInfo);
    }
}

public class Calculator{
    private static final int MAX_SUM_OF_SIDE = 20;
    private int diagonal;
    private int secondAngleSide;
    private int sumOfSide;

    public Calculator(){
        this.diagonal = 0;
        this.secondAngleSide = 0;
        this.sumOfSide = 0;
    }

    public void calculate(){
        Printer printer = new Printer();
        for(int firstAngleSide = 1; sumOfSide < MAX_SUM_OF_SIDE; firstAngleSide++){
            for(secondAngleSide = 1; sumOfSide < MAX_SUM_OF_SIDE; secondAngleSide++){
                diagonal = firstAngleSide*firstAngleSide + secondAngleSide*secondAngleSide;
                sumOfSide = diagonal + firstAngleSide + secondAngleSide;
            }
            printer.print(diagonal, firstAngleSide, secondAngleSide);
        }
        
    }
}
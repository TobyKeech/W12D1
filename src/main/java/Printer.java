public class Printer {

    private int sheetsOfPaperLeft;

    public Printer (int sheetsOfPaperLeft){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
    }

    public int getSheetsOfPaperLeft(){
        return this.sheetsOfPaperLeft;
    }

    public int print(int numOfPages, int numOfCopies){
    if(numOfPages >= 10) {
       return this.sheetsOfPaperLeft - numOfCopies;
    } else
        return (0);
    };
}

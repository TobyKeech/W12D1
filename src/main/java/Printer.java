public class Printer {

    private int sheetsOfPaperLeft;

    private int tonerVolume;

    public Printer (int sheetsOfPaperLeft, int tonerVolume){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
        this.tonerVolume= tonerVolume;
    }

    public int getSheetsOfPaperLeft(){
        return this.sheetsOfPaperLeft;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public int print(int numOfPages, int numOfCopies){
    if(numOfPages >= 10) {
       return this.sheetsOfPaperLeft - numOfCopies;
    } else
        return (0);
    };
}

public class CarsAssemble{
    public double productioRatePerHour(int speed){
        if (velocidade < 5){
            return (double) velocidade*221;
        }else if(velocidade < 9){
            return (double)((velocidade*221)*0.9);
        }else if(velocidade == 9){
            return (double) ((velocidade*221)*0.8);
        }else{
            return(double) ((velocidade*221)*0.77);
        }
    }
    public int workingItemsPerMinute(int velocidade){
        return(int) (procuctionRatePerHour(speed)/60);
    }
}
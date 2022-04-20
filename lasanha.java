public class lasanha{
    int tempo = 40;
    
    public int expectedMinutesInOven(){
        return tempo;
    }
    public int remainingMinutesInOven(int noForno){
        return tempo-noForno;
    }
    public int preparationTimeInMinutes(int camadas){
        return camadas*2;
    }
    public int totalTimeInMinutes(int camadas, int noForno){
        return preparationTimeInMinutes(camadas) + noForno;
    }
}
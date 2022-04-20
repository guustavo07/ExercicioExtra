public class ElonsToyCar{
    int distancia=0, bateria=110;
    
    public static ElonsToyCar buy(){
        return new ElonsToyCar();
    }
    public String distanceDisplay(){
        return "Distancia percorrida: "+distancia+"metros";
    }
    public String batteryDisplay(){
        if(bateria > 0){
            return "A Bateria em "+bateria+"%"
        }else{
            return "A Bateria vazia"
        }
        public void dirigir(){
            if(bateria > 0){
                bateria--;
                distancia+=20;
            }
        }
    }
}
package wk4;

public class BarrieGoTrain {

    //public String station;

    //declaration of possibilities
    enum Station {ALLENDALE, NEWMARKET, AURORA,
        DOWNSVIEW_PARK , UNION}

    //instance variables to store one of the possibilities

    Station chosenStation = Station.ALLENDALE;

    private Station boarding, departing;
    private String direction;

    private int tapOnIndex, tapOffIndex;


    public BarrieGoTrain() {}
    public BarrieGoTrain(String direction){
        setDirection(direction);
    }
    public void setDirection(String direction){
        if(direction.equalsIgnoreCase("north") ||
        direction.equalsIgnoreCase("south")){
            this.direction = direction.toLowerCase();
        }
    }
    private int getStationIndex(Station target){

        Station[] stations = Station.values();
        for(int i = 0; i < stations.length; i++){
            if(stations[i] == target){
                return i;
            }
        }
        return -1;
    }
    public void tapOn(Station station) {
     boarding = station;
     tapOnIndex = getStationIndex(station);
    }
    public void tapOff(Station station) {
        departing = station;
        tapOffIndex = getStationIndex(station);

        if(!isTripValid()){
            System.out.println("Invalid Tap Off!");
        }


    }
    public boolean isTripValid(){
        if(direction.equalsIgnoreCase("north")){
            return tapOnIndex > tapOffIndex;
        }
        else{
            return tapOnIndex < tapOffIndex;
        }
    }
}

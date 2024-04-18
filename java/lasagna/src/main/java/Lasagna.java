public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes){
        int remainingMinutes = expectedMinutesInOven() - minutes ;

        return  remainingMinutes ;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int preparationTimeForOneLayer = 2;

        int preparationTime = layers * preparationTimeForOneLayer;

        return preparationTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers , int timeSpentInOven){
        int preparationTime = preparationTimeInMinutes(layers);

        int totalTime = preparationTime + timeSpentInOven ;

        return totalTime ;
    }
}

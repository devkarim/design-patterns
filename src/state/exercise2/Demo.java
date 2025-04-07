package state.exercise2;

public class Demo {
    public static void main(String[] args) {
        var directionService = new DirectionService(new DrivingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());

        directionService.setTravelMode(new BicyclingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());

        directionService.setTravelMode(new TransitMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());

        directionService.setTravelMode(new WalkingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());
    }
}

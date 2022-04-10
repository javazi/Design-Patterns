package designPattern.adapter.adapter2;

//Adapter:
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCar;

    public MovableAdapterImpl(Movable luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    public MovableAdapterImpl() {
    }

    //return speed in KPH
    @Override
    public Double getSpeed() {
        return convertMPHToKPH(luxuryCar.getSpeed());
    }

     private Double convertMPHToKPH(Double mph){
        return mph*1.60934;
     }
}

package entities;

public class OutsourcedEmployeeFunc extends EmployeeFunc{
       private Double additionalCharge;

    public OutsourcedEmployeeFunc() {
        super();
    }

    public OutsourcedEmployeeFunc(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1 ;
    }
}

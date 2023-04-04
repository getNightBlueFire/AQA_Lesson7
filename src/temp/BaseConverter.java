package temp;

public class BaseConverter {
    private float currentTemperature;
    private Grade currentGrade;

    public BaseConverter(float currentTemperature, Grade currentGrade) {
        this.currentTemperature = currentTemperature;
        this.currentGrade = currentGrade;
    }

    public String info() {
        return currentGrade + " " + currentTemperature;
    }

    public void setCurrentTemperature(Float currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setCurrentGrade(Grade currentGrade) {
        Grade currentGrade1 = this.currentGrade;
        if(currentGrade1.equals(Grade.C) && currentGrade.equals(Grade.K)){
            fromCtoK();
        }



        this.currentGrade = currentGrade;
    }

    private void fromCtoK(){
        this.currentTemperature += 273.15f;
    }

    private void fromKtoC(){
        this.currentTemperature -= 273.15f;
    }

    private void fromCtoF(){
        this.currentTemperature = 1.8f * this.currentTemperature + 32f;
    }

    private void fromFtoC(){
        this.currentTemperature =(this.currentTemperature - 32f)/ 1.8f;
    }
}

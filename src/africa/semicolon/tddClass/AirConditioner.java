package africa.semicolon.tddClass;

    public class AirConditioner {
        private boolean isOn;
        private String productName;
        private int temperature = 16;

        public AirConditioner(String productName){
            this.productName = productName;

        }
        public String getProductName(){
            return productName;
        }


        public void setOn(boolean isAcOn) {
            this.isOn = isAcOn;
        }

        public Boolean isOn() {
            return isOn;
        }

        public void setTemperature(int temperature) {
            if(isOn == true){
                this.temperature = temperature;
            }else{

            }

        }

        public int getTemperature() {
            return temperature;
        }
    }

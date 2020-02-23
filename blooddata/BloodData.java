package BloodData;

public class BloodData {
	private String bloodType;
        private String rhFactor;
        
        BloodData(){
            bloodType = "0";
            rhFactor = "+";
        }
        
        BloodData(String bloodType, String rhFactor){
            this.bloodType = bloodType;
            this.rhFactor = rhFactor;
        }
        
        public String getBloodType(){
            return bloodType;
        }
        
        public void setBloodType(String type){
            this.bloodType = type;
        }
        
        public String getRhFactor(){
            return this.rhFactor;
        }
        
        public void setRhFactor(String factor){
            this.rhFactor = factor;
        }

    class set {

        public set() {
        }
    }
}
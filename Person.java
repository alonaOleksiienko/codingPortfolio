import java.util.Arrays;

public class Person {


        private String name;
        private int insuranceNumber;
        private String dateOfBirth;
        private int numberInLine;
        private String[] prescription;


        public Person(String name, int insuranceNumber, String dateOfBirth, String s, String mps098675){
            this.name = name;
            this.insuranceNumber = insuranceNumber;
            this.dateOfBirth = dateOfBirth;
            this.numberInLine = numbImQueue();
            this.prescription = new String[3];
            this.prescription[0] = "MPS098675";
            this.prescription[1] = "AWC008971";
            this.prescription[2] = "RTC6510934";

        }
        public Person(Person source) {
            this.name = source.name;
            this.insuranceNumber = source.insuranceNumber;
            this.dateOfBirth = source.dateOfBirth;
            this.numberInLine = source.numberInLine;
            this.prescription = Arrays.copyOf(source.prescription, source.prescription.length);


        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getInsuranceNumber () {
            return insuranceNumber;
        }

        public void setInsuranceNumber ( int insuranceNumber){
            this.insuranceNumber = insuranceNumber;
        }

        public String getDateOfBirth () {
            return dateOfBirth;
        }

        public void setDateOfBirth (String dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }

        public int getNumberInLine () {
            return numberInLine;
        }

        public void setNumberInLine ( int numberInLine){
            this.numberInLine = numberInLine;
        }

        public String[] getPrescription () {
            return Arrays.copyOf(this.prescription, this.prescription.length);
        }

        public void setPrescription () {
            this.prescription = Arrays.copyOf(prescription, prescription.length);
        }

        public int numbImQueue () {
            //this.numberInLine = (int) (Math.random() * 11 + 1);
            //String orderInLine=Integer.toString(this.numberInLine);
            return this.numberInLine = (int) (Math.random() * 11 + 1);

        }


        public String toString () {
            return "Patient name: " + this.name + "\nInsurance number: " + this.insuranceNumber + "\nDate of birth: " + this.dateOfBirth
                    + "\nYour number in line: " + this.numberInLine + "\nDrugs prescription codes: " + Arrays.toString(this.prescription);


        }
    }




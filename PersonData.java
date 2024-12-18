public class PersonData {
    public static void main(String[] args) {
        Person patientOne=new Person("Lara",1235,"12.04.1990","","");
        Person patientTwo=new Person("Tony",8967,"05.04.1988","","");
        Person patientThree= new Person("Tim",5176,"09.07.1965","","");
        Person patientFour= new Person("Keith",9087,"01.09.1998","","");
        var s = patientFour.toString();
        System.out.println(s);


    }
}

public class Employee {
    // initializing attributes
    private String name;
    private int idNumber;
    private String department;
    private String position;

    //Constructor
    public Employee(String n, int id, String d, String p){
        name = n;
        idNumber = id;
        department = d;
        position = p;
    }

    // Mutator fields
    public void setName(String n){
        name = n;
    }
    public void setIdNumber(int id){
        idNumber = id;
    }
    public void setDepartment(String d){
        department = d;
    }
    public void setPosition(String p){
        position = p;
    }

    // Accessor Fields
    public String getName(){
        return name;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
}
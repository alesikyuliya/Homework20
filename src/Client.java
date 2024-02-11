public class Client {
    private String name;
    private String surname;
    private int day;
    private String month;
    private int year;
    private String email;
    private long phone;
    private double weight;
    private String pressure;
    private int steps;

    private int age;

    public Client(String name, String surname, int day, String month, int year, String email, long phone, double weight,
                  String pressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2024 - year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
    public void printAccount(){
        System.out.println("Client{" +
                " name='" + name + '\'' + "\n" +
                " surname='" + surname + '\'' + "\n" +
                " day=" + day + "\n" +
                " month='" + month + '\'' + "\n" +
                " year=" + year + "\n" +
                " email='" + email + '\'' + "\n" +
                " phone=" + phone + "\n" +
                " weight=" + weight + "\n" +
                " pressure='" + pressure + '\'' + "\n" +
                " steps=" + steps + "\n" +
                " age=" + age + "\n" +
                '}');
    }

}

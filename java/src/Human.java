public class Human implements Runner {

    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() +  "Human{" +
                "age=" + age +
                '}';
    }

    @Override
    public int getSpeed() {
        if(age < 50){
            return 10;
        }else{
            return 7;
        }
    }
}

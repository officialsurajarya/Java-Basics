class consParameterized {
    String name;
    int age;

    consParameterized(int age,String name) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
    consParameterized person1 = new consParameterized(21, "Suraj");
        System.out.println(person1.name +" "+ person1.age);
    }
}

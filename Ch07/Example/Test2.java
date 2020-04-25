class Super {
    String greeting() { return "Goodnight"; }
    String name() { return "Richard"; }
}
class Sub extends Super {
    String greeting() { return "Hello"; }
    String name() { return "Dick"; }
}
class Test2 {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + ", " + s.name());
    }
}
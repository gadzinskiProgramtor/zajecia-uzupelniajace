package pl.gadzinski.builder;

public class BuilderApplication {
    public static void main(String[] args) {
        UserWithLombok userWithLombok = UserWithLombok.builder()
                .age(12)
                .lastName("asd")
                .build();

        System.out.println(userWithLombok.toString());
    }
}

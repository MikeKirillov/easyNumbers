package JavaCore.Module28.Task2834;

@Author("Stephen King")
public class AnnotationExample {
    public static void main(String[] args) {
        AnnotationExample map = new AnnotationExample();

        Class<?> cl = map.getClass();
        Author annotation = cl.getAnnotation(Author.class);
        System.out.println("Author: " + annotation.value());
    }
}
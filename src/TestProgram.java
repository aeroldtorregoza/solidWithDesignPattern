public class TestProgram {
    public static void main(String[] args)
    {
        Library library = new INCLibrary();
        Student student = new Student("Aerold Torregoza");
        BorrowProcessor borrowProcessor = new BorrowProcessor(library, student);

        System.out.println("--------------------------------------------------");
        System.out.println("-----------------INC Library----------------------");
        System.out.println("Student Name: " + borrowProcessor.getName());


        borrowProcessor.borrowResource(new Book("Harry Potter and The Sorcerer's Stone"));

        borrowProcessor.borrowResource(new Journal("The Age of Cryptocurrency"));

        System.out.println("--------------------------------------------------");
    }
}
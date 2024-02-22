public class Main{
    public static void main(String[]args){

        Person firstPerson = new Person("Alberto",18,"Femboy");
        Person secondPerson = new Person("Jafet", 27,"Man");
        Person thirdPerson = new Person("Mariana", 18, "Woman");
        Person fourthPerson = new Person("Ale",23,"Woman");

        System.out.println(firstPerson.getPersonInfo());
        System.out.println(secondPerson.getPersonInfo());
        System.out.println(thirdPerson.getPersonInfo());
        System.out.println(fourthPerson.getPersonInfo());

        Book firstBook = new Book();
        Book secondBook = new Book();
        secondBook.title = "Cien años de soledad";
        secondBook.author = "Gabriel García Márquez";
        secondBook.releaseYear = 1982;
        Book thirdBook = new Book();
        thirdBook.title = "Berserk";
        thirdBook.author = "Kentaro Miura";
        thirdBook.releaseYear = 1989;
        Book fourthBook = new Book();
        fourthBook.title = "The Godfather";
        fourthBook.author = "Mario Puzo";
        fourthBook.releaseYear = 1969;

        System.out.printf("Title: %s, Author: %s, Published in: %d \n", firstBook.title,firstBook.author,firstBook.releaseYear);
        System.out.printf("Title: %s, Author: %s, Published in: %d \n", secondBook.title,secondBook.author,secondBook.releaseYear);
        System.out.printf("Title: %s, Author: %s, Published in: %d \n", thirdBook.title,thirdBook.author,thirdBook.releaseYear);
        System.out.printf("Title: %s, Author: %s, Published in: %d \n", fourthBook.title,fourthBook.author,fourthBook.releaseYear);

        Rectangle firstRectangle = new Rectangle(6.5, 34.6);
        Rectangle secondRectangle = new Rectangle(78, 90);
        Rectangle thirdRectangle = new Rectangle(6.6,9.7);
        Rectangle fourthRectangle = new Rectangle (77.7, 45.4);

        System.out.println(firstRectangle.getAreaPerimeter());
        System.out.println(secondRectangle.getAreaPerimeter());
        System.out.println(thirdRectangle.getAreaPerimeter());
        System.out.println(fourthRectangle.getAreaPerimeter());

    }
}
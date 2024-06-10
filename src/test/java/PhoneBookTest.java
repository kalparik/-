import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;


public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    void startTest() {
        System.out.println("Начало теста");
        phoneBook = new PhoneBook();
    }

    @AfterEach
    void endTest() {
        System.out.println("Окончание теста");
        phoneBook = null;
    }

    @Test
    void addTest() {
        String name = "Петя";
        String number = "+7(999) 111-22-33";
        int expected = 1;
        Assertions.assertEquals(expected, phoneBook.add(name, number));
    }

    @Test
    void findByNumberTest() {
        phoneBook.add("Петя", "111-222");
        String expected = "Петя";
        Assertions.assertEquals(expected, phoneBook.findByNumber("111-222"));
    }

    @Test
    void findByNameTest() {
        phoneBook.add("Таня", "333-444");
        String expected = "333-444";
        Assertions.assertEquals(expected, phoneBook.findByName("Таня"));
    }

    @Test
    void printAllNamesTest() {
        phoneBook.add("Таня", "333-444");
        phoneBook.add("Оля", "111-22");
        phoneBook.add("Петя", "111-222");
        String expectedL = "[Оля, Петя, Таня]";
        Assertions.assertEquals(expectedL, phoneBook.printAllNames());
    }
}

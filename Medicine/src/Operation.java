import com.hospital.*;

public class Operation {

    public static void main(String[] args) {

        Person workers [] = new Person[3];
        workers[0] = new Intern("John", 20);
        workers[1] = new Surgeon("Stas", 30);
        workers[2] = new Intern("Naix", 22);

        for (Person p: workers){
            ((OperationSkills)p).operationDifficulty(60);
        }
    }

}

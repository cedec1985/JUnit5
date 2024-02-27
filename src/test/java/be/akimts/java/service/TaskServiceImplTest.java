package be.akimts.java.service;

import be.akimts.java.model.Task;
import be.akimts.java.model.TaskStatus;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceImplTest {


    private TaskService taskService;

    @BeforeAll
    static void init(){
        System.out.println("TASK> before all:");
        // initialization of the test environment:
        // example: open connection to fake DB
    }

    @BeforeEach
    void initTest(){
        System.out.println("TASK-- before each:");
        this.taskService = new TaskServiceImpl();
        // example: add data to fake DB
    }

    @AfterEach
    void tearUpTest(){
        System.out.println("TASK-- after each:");
        // example: remove data inserted by the test in fake DB
    }

    @AfterAll
    static void tearUp(){
        System.out.println("TASK> after all:");
        // example: destray fake DB/close connection fake DB
    }


    @Test
    void create() {
        System.out.println("\ttesting create");
        // Setup l'environnement de test
        Task task = new Task(null, "title", "description", TaskStatus.TODO);

        // executer la methode
        Task returnedTask = this.taskService.create(task);

        // verifier le resultat
        assertNotNull( returnedTask );
        assertEquals( returnedTask.getId(), 1L );

        // tear up
        // ex: fermer connection db, un fichier
    }

    @Test
    void getOne() {
        System.out.println("\ttesting getOne");
        Task task = new Task(null, "title", "description", TaskStatus.TODO);
        Task returnedTask = this.taskService.create(task); // L'ID devrait être 1

        Task gotTask = this.taskService.getOne( returnedTask.getId() );

        assertNotNull(gotTask);
        assertEquals(gotTask.getId(), returnedTask.getId());
    }

    @Test
    void getOne_notFound(){
        System.out.println("\ttesting getOne_notFound");
        assertThrows(
                RuntimeException.class,
                () -> this.taskService.getOne(999L)
        );
    }

    @Test
    void delete() {
        System.out.println("\ttesting delete");
        Task task = new Task(null, "title", "description", TaskStatus.TODO);
        Task returnedTask = this.taskService.create(task); // L'ID devrait être 1

        this.taskService.delete(returnedTask.getId());

        assertThrows(
                RuntimeException.class,
                () -> this.taskService.getOne(returnedTask.getId())
        );
    }
}
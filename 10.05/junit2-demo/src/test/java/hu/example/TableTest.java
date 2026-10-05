package hu.example;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
 
class TableTest {
 
    private Table adjustableTable;
    private Table fixedTable;
 
    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Tests starting...");
    }

    @BeforeEach
    void setUp() {
        adjustableTable = new Table(60, 120, 100, 80);
        fixedTable = new Table(60, 120, 80);
    }
    
    @Test
    @DisplayName("Terület számítás: 60 * 120 = 7200")
    void testAreaCalculation() {
        assertEquals(7200, adjustableTable.area(), "Az alapterület kiszámítása hibás!");
    }

    @Test
    @DisplayName("Kapacitás számítás: Kerület (360 cm) / 60 = 6 személy")
    void testCapacityCalculation() {
        assertEquals(6, adjustableTable.getCapacity(), "A férőhelyek számítása hibás!");
    }

    @Test
    @DisplayName("setHeight: Érvényes belső érték beállítása állítható asztalnál (150 cm)")
    void testSetHeightValid() {
        adjustableTable.setHeight(150);
        assertEquals(150, adjustableTable.getCurrentHeight(), "Nem sikerült átállítani az érvényes magasságot!");
    }

    @Test
    @DisplayName("setHeight: Fix (nem állítható) asztal magasságát nem szabad átírni")
    void testSetHeightWhenNotAdjustable() {
        fixedTable.setHeight(100);
        assertEquals(80, fixedTable.getCurrentHeight(), "A fix asztal magassága módosult, pedig nem állítható!");
    }

    @Test
    @DisplayName("setHeight Alsó Határ: Pontosan 0 cm (Érvényes)")
    void testSetHeightBoundaryMin() {
        adjustableTable.setHeight(0);
        assertEquals(0, adjustableTable.getCurrentHeight(), "A 0 cm-es alsó határérték nem lett beállítva!");
    }

    @Test
    @DisplayName("setHeight Felső Határ: Pontosan 200 cm (Érvényes)")
    void testSetHeightBoundaryMax() {
        adjustableTable.setHeight(200);
        assertEquals(200, adjustableTable.getCurrentHeight(), "A 200 cm-es felső határérték nem lett beállítva!");
    }

    @Test
    @DisplayName("setHeight Hibás Alsó Határ: -1 cm (Érvénytelen - nem szabad változnia)")
    void testSetHeightInvalidBelowMin() {
        adjustableTable.setHeight(-1);
        assertEquals(80, adjustableTable.getCurrentHeight(), "A magasság negatív értékre változott!");
    }

    @Test
    @DisplayName("setHeight Hibás Felső Határ: 201 cm (Érvénytelen - nem szabad változnia)")
    void testSetHeightInvalidAboveMax() {
        adjustableTable.setHeight(201);
        assertEquals(80, adjustableTable.getCurrentHeight(), "A magasság átlépte a 200 cm-es maximum korlátot!");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("Tests finished.");
    }
}

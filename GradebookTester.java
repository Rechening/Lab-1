
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradebookTester {

    // declare two variables of type GradeBook for g1 and g2
	private GradeBook g1;
    private GradeBook g2;


    @Before
    /**
     * Used to set up the GradeBook objects for testing
     */
    public void setUp() {
        // create a GradeBook to hold 5 scores
        g1 = new GradeBook(5);
        // create a GradeBook to hold 5 scores
        g2 = new GradeBook(5);

        // add two scores to g1 (50.0, 75.0)
        g1.addScore(50.0);
        g1.addScore(75.0);

        // add four scores to g2 for(80, 85, 90, 95)
        g2.addScore(80.0);
        g2.addScore(85.0);
        g2.addScore(90.0);
        g2.addScore(95.0);
    }

    @After
    /**
     * Used to tear down the objects
     */
    public void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    /**
     * Tests addScore method by checking whether they have correct scores or not
     */
    public void addScoreTest() {
        // checks GradeBooks have correct scores using assertTrue
        assertTrue(g1.toString().equals("50.0 75.0"));
        assertTrue(g2.toString().equals("80.0 85.0 90.0 95.0"));
    }

    @Test
    /**
     * Tests sum method of GradeBook
     */
    public void testSum() {
        // checks GradeBooks sum of scores
    	assertEquals(125, g1.sum(), .0001);
    	assertEquals(350, g2.sum(), .0001);
    	
    }

    @Test
    /**
     * Tests minimum method of GradeBook
     */
    public void testMinimum() {
        // checks GradeBooks minimum of scores
    	assertEquals(50, g1.minimum(), .001);
        assertEquals(80, g2.minimum(), .001);
    }

    @Test
    /**
    * Tests finalScore method of GradeBook and sum(Score) - minimum(Score) = Final Score
     */
    public void testFinalScore() {
        // checks GradeBooks correct final score
        assertEquals(75.0, g1.finalScore(), .001);
        assertEquals(270.0, g2.finalScore(), .001);
    }

    @Test
    /**
     * Tests getScoresSize method of GradeBook 
     */
    public void getScoresSizeTest() {
        // checks GradeBooks correct scores
        assertEquals(2,g1.getScoresSize());
        assertEquals(4,g2.getScoresSize());
    }
}
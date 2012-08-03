import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LineDetectorTest {
	
	LineDetector line = new LineDetector();
	
	@Before 
	public void initialize() {
		line = new LineDetector();
	}
	
	/////////////////////////
	//Get straight line tests
	@Test
	public void test_getStraightLineValue_for_diogonal_left() {
		int[][] testArray = {{0, 0, 1},
							 {0, 1, 0},
							 {1, 0, 0}};
		
		int[] testFrom = {0, 2};
		int[] testTo = {2, 0};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(3, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_flat() {
		int[][] testArray = {{1, 1, 1},
							 {0, 0, 0},
							 {0, 0, 0}};
		
		int[] testFrom = {0, 0};
		int[] testTo = {0, 2};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(3, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_down() {
		int[][] testArray = {{1, 0, 0},
							 {1, 0, 0},
							 {1, 0, 0}};
		
		int[] testFrom = {0, 0};
		int[] testTo = {2, 0};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(3, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_justified_flat() {
		int[][] testArray = {{0, 0, 0},
							 {1, 1, 1},
							 {0, 0, 0}};
		
		int[] testFrom = {1, 0};
		int[] testTo = {1, 2};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(3, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_justified_down() {
		int[][] testArray = {{0, 1, 0},
							 {0, 1, 0},
							 {0, 1, 0}};
		
		int[] testFrom = {0, 1};
		int[] testTo = {2, 1};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(3, actual);
	}

	@Test
	public void test_getStraightLineValue_for_skewed_right() {
		int[][] testArray = {{0, 1, 0, 0},
							 {0, 1, 0, 0},
							 {0, 0, 1, 0},
							 {0, 0, 1, 0}};
		
		int[] testFrom = {0, 1};
		int[] testTo = {3, 2};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(4, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_skewed_left() {
		int[][] testArray = {{0, 0, 1, 0},
							 {0, 0, 1, 0},
							 {0, 1, 0, 0},
							 {0, 1, 0, 0}};
		
		int[] testFrom = {0, 2};
		int[] testTo = {3, 1};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(4, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_skewed_down() {
		int[][] testArray = {{0, 0, 0, 0},
							 {1, 1, 0, 0},
							 {0, 0, 1, 1},
							 {0, 0, 0, 0}};
		
		int[] testFrom = {1, 0};
		int[] testTo = {2, 3};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(4, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_skewed_up() {
		int[][] testArray = {{0, 0, 0, 0},
							 {0, 0, 1, 1},
							 {1, 1, 0, 0},
							 {0, 0, 0, 0}};
		
		int[] testFrom = {2, 0};
		int[] testTo = {1, 3};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(4, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_skewed_down_2() {
		int[][] testArray = {{0, 0, 0, 0},
							 {0, 0, 0, 1},
							 {0, 0, 1, 0},
							 {0, 1, 0, 0}};
		
		int[] testFrom = {1, 3};
		int[] testTo = {3, 1};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(3, actual);
	}
	
	@Test
	public void test_getStraightLineValue_cont_1() {
		int[][] testArray = {{0, 1, 0, 0},
							 {1, 0, 0, 0},
							 {1, 0, 0, 0},
							 {0, 0, 0, 0}};
		
		int[] testFrom = {0, 1};
		int[] testTo = {2, 0};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(3, actual);
	}

	@Test
	public void test_getStraightLineValue_for_big_final_value_1() {
		int[][] testArray = {{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}};
		
		int[] testFrom = {0, 3};
		int[] testTo = {6, 6};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(7, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_big_final_value_2() {
		int[][] testArray = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}};
		
		int[] testFrom = {2, 0};
		int[] testTo = {6, 8};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(9, actual);
	}
	
	@Test
	public void test_getStraightLineValue_for_big_final_value_3() {
		int[][] testArray = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
							 {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0},
							 {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
							 {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
							 {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		
		int[] testFrom = {5, 0};
		int[] testTo = {0, 10};
		
		int actual = line.getStraightLineValue(testFrom, testTo, testArray);
		
		assertEquals(11, actual);
	}
	
	///////////////////////////
	//Get candidate lines tests
	@Test
	public void test_getCandidateLines_1() {
		int[][] testArray = {{0, 1, 0},
							 {0, 1, 0},
							 {0, 1, 0}};
		
		int[] actuals = line.getCandidateLines(testArray, 3).get(0);
		int[] expecteds = {0, 1, 2, 1, 3};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void test_getCandidateLines_2() {
		int[][] testArray = {{0, 0, 0},
							 {1, 1, 1},
							 {0, 0, 0}};
		
		int[] actuals = line.getCandidateLines(testArray, 3).get(0);
		int[] expecteds = {1, 2, 1, 0, 3};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void test_getCandidateLines_big_final_1() {
		int[][] testArray = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0},
							 {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
							 {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
							 {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		
		int[] actuals = line.getCandidateLines(testArray, 9).get(0);
		int[] expecteds = {0, 9, 5, 0, 10};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void test_getCandidateLines_big_final_2() {
		int[][] testArray = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}};
		
		int[] actuals = line.getCandidateLines(testArray, 5).get(0);
		int[] expecteds = {0, 9, 6, 3, 7};
		
		assertArrayEquals(expecteds, actuals);
	}

}
package controlflow;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 4:20:53 PM
* project: Corejava
* 
* 👍 A cinema hall seating arrangement is a great real-world example of a nested for loop.
 * ✅ This mimics a real cinema hall seating chart where each seat is identified by its row and seat number.
 * 
 * Outer loop (i) → Represents rows.
 * Inner loop (j) → Represents seats in each row.
 * Each seat is displayed in format [Row-Seat].
*/

public class Cinemahallseating {

	public static void main(String[] args) {
		int rows = 5;   // number of rows in the hall
        int cols = 10;  // number of seats per row
        
        System.out.println("Cinema Hall Seating Arrangement:\n");
        
        // Nested for loop
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("[" + i + "-" + j + "] "); // seat number format: Row-Seat
            }
            System.out.println(); // new line after each row
        }

	}

}

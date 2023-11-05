public class StudentStatistics {
    public static void main(String[] args) {
        // Sample student data
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";

        // Split the studentData string into individual records
        String[] records = studentData.split(", ");

        // Initialize arrays to store student names and scores
        String[] studentNames = new String[records.length];
        int[] studentScores = new int[records.length];

        int totalScore = 0;        // Total score accumulator
        int highestScore = Integer.MIN_VALUE;  // Initialize to lowest possible value
        int lowestScore = Integer.MAX_VALUE;   // Initialize to highest possible value
        String highestScorer = "";
        String lowestScorer = "";

        // Process each student record
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(":");
            studentNames[i] = record[0];
            int score = Integer.parseInt(record[1]);
            studentScores[i] = score;

            // Update total score
            totalScore += score;

            // Check for highest and lowest scores
            if (score > highestScore) {
                highestScore = score;
                highestScorer = studentNames[i];
            }
            if (score < lowestScore) {
                lowestScore = score;
                lowestScorer = studentNames[i];
            }
        }

        // Calculate the number of students
        int numStudents = records.length;

        // Calculate the average score
        double averageScore = (double) totalScore / numStudents;

        // Display statistics
        System.out.println("Total number of students: " + numStudents);
        System.out.println("Average score of all students: " + averageScore);
        System.out.println("Highest score: " + highestScore + " achieved by " + highestScorer);
        System.out.println("Lowest score: " + lowestScore + " achieved by " + lowestScorer);
    }
}

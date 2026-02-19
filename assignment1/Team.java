public class Team {
    // Attributes
    private String teamName;
    private int[] scores;
    
    // Constructor
    public Team(String teamName, int[] scores) {
        this.teamName = teamName;
        this.scores = scores;
    }
    
    // Calculate total score
    public int calculateTotalScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }
    
    // Display team performance
    public void displayTeamPerformance() {
        System.out.println("Team: " + teamName);
        System.out.println("Total Score: " + calculateTotalScore());
    }
}

class Tester {
    public static void main(String[] args) {
        int[] teamScores = {85, 90, 78, 92, 88};
        Team myTeam = new Team("Warriors", teamScores);
        
        int total = myTeam.calculateTotalScore();
        System.out.println("Total: " + total);
        
        myTeam.displayTeamPerformance();
    }
}
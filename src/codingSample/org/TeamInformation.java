package codingSample.org;

import static java.lang.Math.abs;

public class TeamInformation implements Comparable<TeamInformation> {

    //Declaring private variables (Encapsulation)
    private String teamName;
    private int goalsFor;
    private int goalsAgainst;

    public TeamInformation(String teamName, int goalsFor, int goalsAgainst) {
        this.teamName = teamName;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int teamGoalDifference() {
        return abs(goalsFor - goalsAgainst);
    }

    // Implementing Comparable Interface to find the team with closest goal difference to zero
    @Override
    public int compareTo(TeamInformation o) {
        return this.teamGoalDifference() - o.teamGoalDifference();
    }
}

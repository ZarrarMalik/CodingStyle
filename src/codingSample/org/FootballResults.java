package codingSample.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FootballResults {
    List<TeamInformation> teamAttributes = new ArrayList<TeamInformation>();

    public void addTeamInformation(TeamInformation teamInformation) {
        teamAttributes.add(teamInformation);
    }

    public int calculateSize() {
        return teamAttributes.size();
    }

    public TeamInformation getTeamWithSmalestGoalDifference() {
        return Collections.min(teamAttributes);
    }
}


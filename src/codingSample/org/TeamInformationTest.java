package codingSample.org;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamInformationTest {

    @Test
    void shouldReturnTeamGoalDifference() {
        TeamInformation goalDifference = new TeamInformation("Arsenal", 78, 36);
        int difference = 78 - 36;
        assertEquals(42, goalDifference.teamGoalDifference());
    }

    @Test
    void checkingRightLineAttributes() {
        TextLineReader textLineReader = new TextLineReader();
        TeamInformation goalDifference = textLineReader.extractTeamInformation("1.  ManUnited \t\t\t\t38  24   8    6    79    31   48   80");
        assertEquals("ManUnited", goalDifference.getTeamName());
        assertEquals(79, goalDifference.getGoalsFor(), "Should be equal");
        assertEquals(31, goalDifference.getGoalsAgainst(), "Should be equal");
    }

}
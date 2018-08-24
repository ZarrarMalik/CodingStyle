package codingSample.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextLineReader {
    // File path
    private String line = "C:\\zarrar\\java\\Football.txt";
    BufferedReader bufferedReader;


    public String usingBufferReader() {
        FootballResults footballResults = new FootballResults();
        try {
            bufferedReader = new BufferedReader(new FileReader(line));
            String readLine = bufferedReader.readLine();
            while ((readLine = bufferedReader.readLine()) != null) {
                footballResults.addTeamInformation(extractTeamInformation(readLine));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return footballResults.getTeamWithSmalestGoalDifference().getTeamName();
    }


    public TeamInformation extractTeamInformation(String line) {
        String[] attributes = line.split("\\s+");
        String clubName = attributes[1];
        int goalsForClub = Integer.parseInt(attributes[6]);
        int goalsAgainstClub = Integer.parseInt(attributes[7]);
        TeamInformation goalDifference = new TeamInformation(clubName, goalsForClub, goalsAgainstClub);
        FootballResults resultTeamGoalDifference = new FootballResults();
        return goalDifference;
    }


}



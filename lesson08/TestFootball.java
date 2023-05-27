package lesson08;

import java.util.ArrayList;

public class TestFootball {
    public static void main(String[] args){
        FootballPlayer player1 = new FootballPlayer("Nguyen Van A", 18, "HN", 1.75,65.5,20000);
        FootballPlayer player2 = new FootballPlayer("Nguyen Van B", 19, "HCM", 1.85,75.5,40000);
        FootballPlayer player3 = new FootballPlayer("Nguyen Van C", 19, "HCM", 1.65,60.5,15000);

        player1.display();
        player2.display();
        player3.display();

        ArrayList<FootballPlayer> playerTeam1 = new ArrayList<>();
        ArrayList<FootballPlayer> playerTeam2 = new ArrayList<>();
        ArrayList<FootballPlayer> playerTeam3 = new ArrayList<>();

        FootballPlayer.sortSalary(playerTeam1);
        for (FootballPlayer p: playerTeam1){
            System.out.println("Name: "+p.getName()+", salary: "+p.getSalary());
        }

        playerTeam1.add(player1);
        playerTeam1.add(player2);

        playerTeam2.add(player1);
        playerTeam2.add(player3);

        playerTeam3.add(player2);
        playerTeam3.add(player3);

        FootballTeam team1 = new FootballTeam("Team1", 10,playerTeam1);
        FootballTeam team2 = new FootballTeam("Team1", 11,playerTeam2);
        FootballTeam team3 = new FootballTeam("Team1", 12,playerTeam3);

        team1.display();
        team2.display();
        team3.display();

        ArrayList<FootballTeam> teamLeague1 = new ArrayList<>();
        ArrayList<FootballTeam> teamLeague2 = new ArrayList<>();
        ArrayList<FootballTeam> teamLeague3 = new ArrayList<>();

        teamLeague1.add(team1);
        teamLeague1.add(team2);

        teamLeague2.add(team1);
        teamLeague2.add(team3);

        teamLeague3.add(team2);
        teamLeague3.add(team3);


        FootBallLeague league1 = new FootBallLeague("League1", 10,teamLeague1);
        FootBallLeague league2 = new FootBallLeague("League1", 11,teamLeague2);
        FootBallLeague league3 = new FootBallLeague("League1", 12,teamLeague3);

        ArrayList<FootBallLeague> leagues = new ArrayList<>();
        leagues.add(league1);
        leagues.add(league2);
        leagues.add(league3);

        ArrayList<String> maxValueTeam = FootBallLeague.getMaxLeagueTeam(leagues);
        for (String name: maxValueTeam){
            System.out.println("Team :"+ name);
        }
    }
}

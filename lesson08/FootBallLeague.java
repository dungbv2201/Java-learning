package lesson08;

import java.util.ArrayList;

public class FootBallLeague {
    private String name;
    private long moneyBonus;
    private ArrayList<FootballTeam> teams;

    FootBallLeague(){}
    FootBallLeague(String name, long moneyBonus, ArrayList<FootballTeam> teams){
        this.name = name;
        this.moneyBonus = moneyBonus;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoneyBonus() {
        return moneyBonus;
    }

    public void setMoneyBonus(long moneyBonus) {
        this.moneyBonus = moneyBonus;
    }

    public ArrayList<FootballTeam> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<FootballTeam> teams) {
        this.teams = teams;
    }

    public void display(){
        System.out.println("Name :"+this.name);
        System.out.println("Money bonus :"+this.moneyBonus);
        for (FootballTeam team: teams){
            team.display();
        }
    }

    public static ArrayList<String> getMaxLeagueTeam(ArrayList<FootBallLeague> leagues){
        int max = leagues.get(0).getTeams().size();
        for (int i= 1; i < leagues.size(); i++){
            FootBallLeague league = leagues.get(i);
            if(league.getTeams().size() > max){
                max = league.getTeams().size();
            }
        }

        ArrayList<String> rs = new ArrayList<>();
        for (FootBallLeague league: leagues){
            if(league.getTeams().size() == max){
                rs.add(league.getName());
            }
        }
        return rs;
    }
}

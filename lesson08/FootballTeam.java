package lesson08;

import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private long valuesTeam;
    private ArrayList<FootballPlayer> players;

    FootballTeam(){}
    FootballTeam(String name, long valuesTeam, ArrayList<FootballPlayer> players){
        this.name = name;
        this.valuesTeam = valuesTeam;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValuesTeam() {
        return valuesTeam;
    }

    public void setValuesTeam(long valuesTeam) {
        this.valuesTeam = valuesTeam;
    }

    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<FootballPlayer> players) {
        this.players = players;
    }

    public void display(){
        System.out.println("Name: "+ this.name);
        System.out.println("Values Team: "+ this.valuesTeam);
        for(FootballPlayer player: players){
            player.display();
        }
    }

    public static ArrayList<String> findMaxValuesTeam(ArrayList<FootballTeam> teams){
        long max = teams.get(0).getValuesTeam();
        for(int i =1; i< teams.size();i++){
            FootballTeam team = teams.get(i);
            if(team.getValuesTeam() > max){
                max = team.getValuesTeam();
            }
        }
        ArrayList<String> rs = new ArrayList<>();
        for (FootballTeam ft: teams){
            if(ft.getValuesTeam() == max){
                rs.add(ft.getName());
            }
        }
        return rs;
    }
}

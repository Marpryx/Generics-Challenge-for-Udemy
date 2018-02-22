package com.prykhodko;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String leagueName;

    private ArrayList<T> league = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println(team.getTeamName() + " is already on the league");
            return false;
        }else{
            league.add(team);
            System.out.println(team.getTeamName() + " added to league");
            return true;
        }
    }

    public void printLeagueTable(){
        Collections.sort(league);
        for(T t : league){
            System.out.println(t.getTeamName() + " : " + t.ranking());
        }
    }

//    public void printTeamsInOrder(){
//
//    }
}

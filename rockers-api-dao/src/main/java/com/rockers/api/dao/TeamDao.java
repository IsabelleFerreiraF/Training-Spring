package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rockers.api.model.Team;

@Component
public class TeamDao implements Crud<Team>{

	@Override
	public Team findOne(String id) {

		// TODO Auto-generated method stub
		Team team = new Team();
		team.setName("Find one Team");
		return team;
	}

	@Override
	public String save(Team t) {
		// TODO Auto-generated method stub
		t.setName("Team name");
		return t.getName();
	}

	@Override
	public List<Team> listAll() {
		// TODO Auto-generated method stub
		
			Team team1 = new Team();
					team1.setName("Team 1");
					
					Team team2 = new Team();
					team2.setName("Team 2");
					
					List<Team> listTeam = new ArrayList<Team>();
					
					listTeam.add(team1);
					listTeam.add(team2);
					return listTeam;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

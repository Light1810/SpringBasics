package me.aakash.icon;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IconRespository extends JpaRepository<Demo_voi_icon, Integer> {
	
	List<Demo_voi_icon> findByAge(int ag);


}

package com.anudip.hotelmanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.hotelmanagement.domain.Hotel;
import com.anudip.hotelmanagement.repository.HotelRepository;

public class HotelService {

	@Service
	public class StudentService {
		
		@Autowired
	    private HotelRepository repo;
		
		public List<Hotel> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Hotel std) {
	        repo.save(std);
	    }
	     
	    public Hotel get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

	}
}

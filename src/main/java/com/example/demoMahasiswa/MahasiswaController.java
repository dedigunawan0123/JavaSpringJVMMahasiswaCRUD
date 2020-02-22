package com.example.demoMahasiswa;


import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mahasiswas")
public class MahasiswaController {
	private final MahasiswaRepository mahasiswaRepository;
	
	public MahasiswaController(MahasiswaRepository mahasiswaRepository) {
		this.mahasiswaRepository = mahasiswaRepository;
	}
	
	@GetMapping
	public Iterable<Mahasiswa> getMahasiswas(){
		return mahasiswaRepository.findAll();
	}
	
	@PostMapping
	public Mahasiswa addNewMahasiswa(@RequestBody Mahasiswa mahasiswa) {
		return mahasiswaRepository.save(mahasiswa);
	}
	
	@GetMapping("/{id}")
	public Optional<Mahasiswa> getMahasiswaById(@PathVariable("id") String id){
		return mahasiswaRepository.findById(Long.parseLong(id));
	}
	
	@DeleteMapping("/{id}")
	public void deleteMahasiswaById(@PathVariable("id") Long id) {
		mahasiswaRepository.deleteById(id);
	}
}

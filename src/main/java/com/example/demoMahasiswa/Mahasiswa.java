package com.example.demoMahasiswa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mahasiswa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nim;
	private String nama;
	private Float ipk;
	private String email;
	
	public Mahasiswa() {
		
	}
	
	public Mahasiswa(Long id, String nim, String nama, Float ipk, String email) {
		super();
		this.id = id;
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.email = email;
	}
	
	public Mahasiswa(String nim, String nama, Float ipk, String email) {
		super();
		this.id = id;
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Float getIpk() {
		return ipk;
	}

	public void setIpk(Float ipk) {
		this.ipk = ipk;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}

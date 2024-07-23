package in.urbanecart.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Data {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private int intensity;
	    private int likelihood;
	    private int relevance;
	    private int year;
	    private String country;
	    private String topics;
	    private String region;
	    private String city;

}

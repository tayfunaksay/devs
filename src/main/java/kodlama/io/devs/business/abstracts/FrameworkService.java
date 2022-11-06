package kodlama.io.devs.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.devs.entities.concretes.Framework;

public interface FrameworkService {
	
void add(Framework framework);
	
	void delete(Framework framework);
	
	void update(Framework framework);
	
	List<Framework> getAll();
	
	Optional<Framework> getById(int id);

}

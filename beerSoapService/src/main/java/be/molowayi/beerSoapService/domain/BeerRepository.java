package be.molowayi.beerSoapService.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Integer> {
    public Beer findById(int id);
    public int countBeersById(int id);
}

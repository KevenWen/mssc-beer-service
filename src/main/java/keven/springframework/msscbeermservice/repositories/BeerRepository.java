package keven.springframework.msscbeermservice.repositories;

import keven.springframework.msscbeermservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}

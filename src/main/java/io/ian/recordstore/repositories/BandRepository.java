package io.ian.recordstore.repositories;

import io.ian.recordstore.models.Band;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends CrudRepository<Band, Long> {
}

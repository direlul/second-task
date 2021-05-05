package ru.saburov.SecondTask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.saburov.SecondTask.domain.StudentGroup;

@Repository
public interface GroupRepository extends CrudRepository<StudentGroup, Long> {
}

package ru.saburov.SecondTask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.saburov.SecondTask.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}

package sk.pro.exam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sk.pro.exam.model.Department;

@Repository
public interface DepartmentRepository
        extends MongoRepository<Department, String> {
}

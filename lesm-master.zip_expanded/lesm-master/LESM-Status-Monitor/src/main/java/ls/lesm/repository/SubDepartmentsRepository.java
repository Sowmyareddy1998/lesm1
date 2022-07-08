package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.Departments;
import ls.lesm.model.SubDepartments;
@Repository
public interface SubDepartmentsRepository extends JpaRepository<SubDepartments, Integer> {
SubDepartments findBySubDepartmentNames(String subDepartmentNames);

}

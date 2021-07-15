package de.szut.customer.database.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    List<Customer> findByLastname(@Param("lastname") String lastname);
    List<Customer> findByCompanyOrLastnameOrderByFirstname(@Param("lastname") String lastname, @Param("company") String company);

}

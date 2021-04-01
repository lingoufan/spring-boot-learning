package top.leikai.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.leikai.boot.jpa.entity.People;

import java.util.List;

/**
 * @author admin
 */
public interface PeopleRepository extends JpaRepository<People, Integer> {
    /**
     *
     * @return
     */
    @Override
    List<People> findAll();

    /**
     *
     * @param firstName
     * @return
     */
    List<People> findByFirstName(String firstName);

    /**
     *
     * @param firstName
     * @param lastName
     * @return
     */
    People findByFirstNameAndLastName(String firstName,String lastName);

    /**
     *
     * @param firstName
     * @param lastName
     * @return
     */
    People findByFirstNameOrLastName(String firstName,String lastName);

    /**
     *
     * @param firstName
     * @return
     */
    People findByFirstNameIs(String firstName);

    /**
     *
     * @param firstName
     * @return
     */
    People findByFirstNameEquals(String firstName);

}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services;

import java.util.List;

import ${package}.models.Person;

public interface PersonService {
    
    Person create(final Person person);
    Person findById(final String personId);
    List<Person> findAll();
    Person update(Person person);
    void delete(Person person);

}

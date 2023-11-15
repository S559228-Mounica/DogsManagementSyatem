/**
 * 
 */
package com.bandiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

/**
 * @author S559228-Mounica Seelam
 * Nov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {

}

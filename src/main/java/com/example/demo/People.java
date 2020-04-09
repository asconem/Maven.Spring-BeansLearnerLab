package com.example.demo;

import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable <PersonType> {
    List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add(PersonType person){
        this.personList.add(person);
    }

    public void remove(PersonType person){
        this.personList.remove(person);
    }

    public void size(PersonType person){
        this.personList.size();
    }

    public void clear(PersonType person){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> people){
        for (PersonType person : people){
            this.personList.add(person);
        }
    }

    public PersonType findById(Long id){
        for (PersonType person : this.personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return this.personList;
    }
}

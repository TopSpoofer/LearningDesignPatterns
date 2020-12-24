package me.spoofer.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    public static final String SINGLE = "SINGLE";
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person p : persons) {
            if (p.getMaritalStatus().equalsIgnoreCase(SINGLE)) {
                singlePersons.add(p);
            }
        }
        return singlePersons;
    }
}

package me.spoofer.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    public static final String FEMALE = "FEMALE";
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person p: persons) {
            if (p.getGender().equalsIgnoreCase(FEMALE)) {
                femalePersons.add(p);
            }
        }
        return femalePersons;
    }
}

package me.spoofer.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    public static final String MALE = "MALE";

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person p : persons) {
            if (p.getGender().equalsIgnoreCase(MALE)) {
                malePersons.add(p);
            }
        }
        return malePersons;
    }
}

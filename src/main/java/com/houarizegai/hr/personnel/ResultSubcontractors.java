package com.houarizegai.hr.personnel;

import java.util.Arrays;
import java.util.List;

public class ResultSubcontractors {

    Subcontractor subcontractor1 = new Subcontractor(
            "Rebekah Jackson",
            "rebekah-jackson@abc.com",
            3000,
            15);
    Subcontractor subcontractor2 = new Subcontractor(
            "Harry Fitz",
            "harryfitz@def.com",
            3000, 15);

    public List<Subcontractor> resultSubcontractors() {
        return Arrays.asList(subcontractor1, subcontractor2);
    }
}

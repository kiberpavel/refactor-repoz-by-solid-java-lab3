package com.houarizegai.hr.main;

import com.houarizegai.hr.personnel.ResultSubcontractors;
import com.houarizegai.hr.personnel.ServiceLicenseAgreement;
import com.houarizegai.hr.personnel.Subcontractor;

import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);
        ResultSubcontractors subcontractors = new ResultSubcontractors();

        List<Subcontractor> collaborators = subcontractors.resultSubcontractors();

        // Check SLA
        for (Subcontractor s : collaborators) {
            s.approveSLA(companySla);
        }
    }
}

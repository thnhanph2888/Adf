package src.services;

import src.models.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityService {
     Map<Facility, Integer> getFacility();

     void addNewFacility();

     List<Facility> displayFacilityNeedMaintenance();
}

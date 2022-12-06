package src.services;

import src.models.facility.Facility;
import src.models.facility.Room;
import src.models.facility.Villa;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService{

    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static List<Facility> listFacilityNeedMaintenance = new ArrayList<>();
    private static int countVilla = 0;
    private static int countRoom = 0;

    @Override
    public Map<Facility, Integer> getFacility() {
        return facilityList;
    }

    @Override
    public void addNewFacility() {
        System.out.println("Add new service: \n" +
                    "1. Add new Villa\n" +
                    "2. Add new Room\n" +
                    "3. Back to menu");
    }

    public void addNewVilla(Villa villa) {
        boolean isExist = false;
       for (Map.Entry<Facility,Integer> facility : facilityList.entrySet()) {
           if (facility.equals(villa)) {
               System.out.println("Villa existed!");
               isExist = true;
               break;
           }
       }
       if (!isExist) {
           facilityList.put(villa, countVilla);
       }
    }
    public void addNewRoom(Room room) {
        boolean isExist = false;
        for (Map.Entry<Facility,Integer> facility : facilityList.entrySet()) {
            if (facility.equals(room)) {
                System.out.println("Room existed!");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            facilityList.put(room, countRoom);
        }

    }
    @Override
    public List<Facility> displayFacilityNeedMaintenance() {
        return listFacilityNeedMaintenance;
    }


}

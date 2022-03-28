package seedu.duke;

import java.util.HashMap;
import java.util.Map;

public class AssignmentMap {

    Map<Room, Housekeeper> map = new HashMap<>();
    //   Map<Integer,String> eMap = new HashMap<>();
    Room room;
    Housekeeper housekeeper;

    public void addAssignment(String name, String roomID,
                              HousekeeperList housekeeperList, RoomList roomList)
            throws InvalidHousekeeperProfile, InvalidRoomNumberException {
        for (Room r : roomList.getRoomList()) {
            if (r.getRoomId() == Integer.parseInt(roomID)) {
                room = r;
                if (housekeeperExists(name, housekeeperList)) {
                    return;
                }
                throw new InvalidHousekeeperProfile();
            }
        }
        throw new InvalidRoomNumberException();
    }

    public void addAssignmentNew(String name, String roomId,
                                 HousekeeperList housekeeperList, RoomList roomList)
            throws InvalidHousekeeperProfile, InvalidRoomNumberException {
        for (Room r : roomList.getRoomList()) {
            if (r.getRoomId() == Integer.parseInt(roomId)) {
                room = r;
                if (housekeeperExists(name, housekeeperList)) {
                    return;
                }
                throw new InvalidHousekeeperProfile();
            }
        }
        throw new InvalidRoomNumberException();
    }

    private boolean housekeeperExists(String name, HousekeeperList housekeeperList) {
        for (Housekeeper h : housekeeperList.getHousekeeperList()) {
            if (h.getName().equalsIgnoreCase(name)) {
                housekeeper = h;
                map.put(room, housekeeper);
                return true;
            }
        }
        return false;
    }

    public String getHouseKeeperNameByRoom(Room room) {
        if (!map.containsKey(room)) {
            return "NA";
        }
        return map.get(room).getName();
    }
}

import java.util.*;
public class AddressBook {


    ArrayList<BuddyInfo> buddyInfo = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy)
    {
        buddyInfo.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy)
    {
        buddyInfo.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Bob","123 Walker ST",1329800032);

    }
}

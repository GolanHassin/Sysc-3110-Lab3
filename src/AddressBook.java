import java.util.*;
public class AddressBook {


    ArrayList<BuddyInfo> buddyInfo = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy)
    {
        if(buddy != null)
        {
            buddyInfo.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index)
    {
        if(index >= 0 && index < buddyInfo.size())
        {
            return buddyInfo.remove(index);
        }
       return null;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Bob","123 Walker ST",1329800032);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

        BuddyInfo bud = new BuddyInfo("Billy-Bob","321 Rawley Ave",230008932);
        addressBook.addBuddy(bud);
        addressBook.addBuddy(buddy);
    }
}

package Hash_Map_Implimentation_and_Generic_Heaps;
public class HashMap_Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap map=new HashMap();
        map.put("Kamlesh", 77);
        map.put("Amisha", 69);
        map.put("Raj", 59);
        map.put("Ankit", 67);
        map.put("Puneet", 78);
        map.put("Shivani", 47);
        map.put("Ankit", 167);
        System.out.println(map.containskey("Shivani"));
        System.out.println(map.containskey("Shivana"));
        System.out.println(map.get("Ankit"));
        System.out.println(map.get("Ankita"));
        System.out.println(map);
        System.out.println(map.remove("Ankit"));
        System.out.println(map);
	}
}
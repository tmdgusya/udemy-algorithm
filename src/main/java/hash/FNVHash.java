package hash;


/**
 * FNV-1 Hash
 */
public class FNVHash {

    private static final int FNV_PRIME_32 = 16777619;
    private static final Long FNV_OFFSET_32 = 2166136261L;

    /**
     * FNV-1
     */
    public long hash(char[] str, int length) {
        long hash = FNV_OFFSET_32;
        for (int i = 0; i < length; ++i) {
            hash = hash * FNV_PRIME_32;
            hash = hash ^ str[i];
        }
        return hash;
    }

    /**
     * FNV-1a
     */
    public long hash_a(char[] str, int length) {
        long hash = FNV_OFFSET_32;
        for (int i = 0; i < length; ++i) {
            hash = hash * FNV_PRIME_32;
            hash = hash ^ str[i];
        }
        return hash;
    }

    public static void main(String[] args) {
        String test1 = "roach";
        String test2 = "roach";
        String test3 = "roach2";

        FNVHash hashAdaptor = new FNVHash();

        long result1 =  hashAdaptor.hash(test1.toCharArray(), test1.length());
        long result2 =  hashAdaptor.hash(test2.toCharArray(), test2.length());
        long result3 =  hashAdaptor.hash(test3.toCharArray(), test3.length());

        long result1_a =  hashAdaptor.hash_a(test1.toCharArray(), test1.length());
        long result2_a =  hashAdaptor.hash_a(test2.toCharArray(), test2.length());
        long result3_a =  hashAdaptor.hash_a(test3.toCharArray(), test3.length());

        System.out.println("resul1 == result2 : " + (result1 == result2));
        System.out.println("resul1 != result3 : " + (result1 != result3));

        System.out.println("resul1 == result2 : " + (result1_a == result2_a));
        System.out.println("resul1 != result3 : " + (result1_a != result3_a));
    }

}

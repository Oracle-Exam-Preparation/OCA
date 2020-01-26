package com.trl.long_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 6/8/19
 */
public class Experience {
    public static void main(String[] args) {
        String mStr = "123";

        long m_1 = new Long(mStr);
        System.out.println("new Long(mStr) --> " + m_1);

        long m_2 = Long.parseLong(mStr);
        System.out.println("Long.parseLong(mStr) --> " + m_2);

                                                // Compilation Error !!! Not exist static method "longValue(String str)"
//        long m_3 = Long.longValue(mStr);
//        System.out.println(m_3);

                                                      // Compilation Error !!! Not exist constructor without parameters.
//        long m_4 = (new Long()).parseLong(mStr);
//        System.out.println(m_4);
//
        long m_44 = (new Long("1234")).parseLong(mStr);
        System.out.println("new Long(\"1234\")).parseLong(mStr) --> " + m_44);

        long m_5 = Long.valueOf(mStr);
        System.out.println("Long.valueOf(mStr) --> " + m_5);

        long m_6 = Long.valueOf(mStr).longValue();
        System.out.println("Long.valueOf(mStr).longValue() --> " + m_6);
    }
}

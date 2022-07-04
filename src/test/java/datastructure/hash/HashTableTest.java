package datastructure.hash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import javax.swing.Spring;

class HashTableTest {

    private static class TestUser {
        String name;
        Integer age;

        public TestUser(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TestUser)) return false;

            TestUser testUser = (TestUser) o;

            if (!name.equals(testUser.name)) return false;
            return age.equals(testUser.age);
        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + age.hashCode();
            return result;
        }
    }

    @Test
    void setDataAndgetData() {
        // given
        final TestUser user = new TestUser("roach", 20);
        HashTable<TestUser> hashTable = new HashTable<>(10);

        // when
        hashTable.setData(user);

        // then
        Assertions.assertEquals(user, hashTable.getData(user.hashCode()));
    }

    @Test
    void setMultipleDataAndgetOne() {
        // given
        final TestUser roach = new TestUser("roach", 20);
        final TestUser honux = new TestUser("Honux", 25);
        HashTable<TestUser> hashTable = new HashTable<>(10);

        // when
        hashTable.setData(roach);
        hashTable.setData(honux);

        // then
        Assertions.assertEquals(roach, hashTable.getData(roach.hashCode()));
    }



}
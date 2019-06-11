package test.java.ru.job4j.addresslisttest;

import org.junit.Test;
import ru.job4j.addresslist.Address;
import ru.job4j.addresslist.Profile;
import ru.job4j.addresslist.Profiles;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class ProfilesTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 15.04.2019
 */
public class ProfilesTest {
    /**
     * test.
     */
    @Test
    public void whenNeedAllAddressesThenListWhithAllAddresses() {
        Address address1 = new Address("Moscow", "stroiteley", 2, 1);
        Address address2 = new Address("Kazan", "Marcs", 1, 4);
        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        List<Profile> profileList = new ArrayList<>();
        profileList.add(profile1);
        profileList.add(profile2);
        List<Address> expect = new ArrayList<>();
        expect.add(address2);
        expect.add(address1);
        Profiles profile = new Profiles();
        assertThat(profile.collect(profileList), is(expect));
    }
    /**
     * test.
     */
    @Test
    public void whenNeedUnicAddressesThenListWhithUnicAddresses() {
        Address address1 = new Address("Moscow", "stroiteley", 2, 1);
        Address address2 = new Address("Kazan", "Marcs", 1, 4);
        Address address3 = new Address("Moscow", "stroiteley", 2, 1);
        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);
        List<Profile> profileList = new ArrayList<>();
        profileList.add(profile1);
        profileList.add(profile2);
        profileList.add(profile3);
        List<Address> expect = new ArrayList<>();
        expect.add(address2);
        expect.add(address1);
        Profiles profile = new Profiles();
        assertThat(profile.collect(profileList), is(expect));
    }
}
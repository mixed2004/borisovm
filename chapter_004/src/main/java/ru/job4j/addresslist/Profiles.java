package ru.job4j.addresslist;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * class Profiles.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 15.04.2019
 */
public class Profiles {
    /**
     * method return list profiles whith addresses.
     * @param profiles profiles
     * @return list of addresses
     */
    public List<Address> collect(List<Profile> profiles) {
         return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}

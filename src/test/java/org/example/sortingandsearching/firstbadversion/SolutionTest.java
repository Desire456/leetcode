package org.example.sortingandsearching.firstbadversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void firstBadVersion() {
        var versionControl = new Solution();

        versionControl.setBadVersion(4);
        assertEquals(4, versionControl.firstBadVersion(5));

        versionControl.setBadVersion(1);
        assertEquals(1, versionControl.firstBadVersion(1));

        versionControl.setBadVersion(6);
        assertEquals(6, versionControl.firstBadVersion(10));

        versionControl.setBadVersion(1);
        assertEquals(1, versionControl.firstBadVersion(1));

        versionControl.setBadVersion(1);
        assertEquals(1, versionControl.firstBadVersion(2));

        versionControl.setBadVersion(2);
        assertEquals(2, versionControl.firstBadVersion(2));

        versionControl.setBadVersion(36);
        assertEquals(36, versionControl.firstBadVersion(100));
    }
}

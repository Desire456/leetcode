package org.example.sortingandsearching.firstbadversion;

public class VersionControl {

    private int badVersion = Integer.MAX_VALUE;

    protected boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }
}

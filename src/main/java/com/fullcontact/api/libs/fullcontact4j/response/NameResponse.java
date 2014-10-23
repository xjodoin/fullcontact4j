package com.fullcontact.api.libs.fullcontact4j.response;

import java.util.List;

public class NameResponse extends FCResponse {

    private String region;
    private NameDetails nameDetails;

    public NameDetails getNameDetails() {
        return nameDetails;
    }

    public String getRegion() {
        return region;
    }

    public static class NameDetails {
        private String givenName;
        private String familyName;
        private List<String> middleNames;
        private List<String> suffixes;
        private List<String> nicknames;
        private String fullName;

        public String getFullName() {
            return fullName;
        }

        public List<String> getNicknames() {
            return nicknames;
        }

        public List<String> getSuffixes() {
            return suffixes;
        }

        public List<String> getMiddleNames() {
            return middleNames;
        }

        public String getFamilyName() {
            return familyName;
        }

        public String getGivenName() {
            return givenName;
        }

    }
}
package hld1.DesignPattern.singleResponsibilityPrinciple;

public class Version {
    public int getMAjorVersion() {
        return 1;
    }
    public int getMinorVersion() {
        return 0;
    }
    public int getBuildNumber() {
        return 0;
    }
    public String getVersion() {
        return getMAjorVersion() + "." + getMinorVersion() + "." + getBuildNumber();
    }

}

package designPattern.proxy.internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites;
    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("ghj.com");
        bannedSites.add("kld.com");
        bannedSites.add("fdb.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
    if (bannedSites.contains(serverHost.toLowerCase())){
        throw new Exception("access denied");
        }
        realInternet.connectTo(serverHost);
    }
}

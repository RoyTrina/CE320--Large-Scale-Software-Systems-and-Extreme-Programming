package URLparserPackage;

public class URL_parser {
    private final String protocol;
    private final String site;
    private final String pathname;

    public URL_parser(String url) {
        String[] protocol_site = url.split("://");
        protocol = protocol_site[0];

        String[] site_pathname = protocol_site[1].split("/", 2);
        site = site_pathname[0];

        if (site_pathname.length > 1) {
            pathname = site_pathname[1];
        } else {
            pathname = "";
        }
    }


    public String getProtocol() {
        return protocol;
    }

    public String getSite() {
        return site;
    }

    public String getPathname() {
        return pathname;
    }
}

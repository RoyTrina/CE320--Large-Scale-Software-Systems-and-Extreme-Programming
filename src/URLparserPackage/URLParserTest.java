package URLparserPackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLParserTest {

    @Test
    public void test_basic_http_protocol_retrieval() {
        URL_parser parser = new URL_parser("https://www.essex.ac.uk");
        assertEquals("https", parser.getProtocol());
    }


    @Test
    public void test_basic_ftp_protocol_retrieval() {
        URL_parser parser = new URL_parser("ftp://www.essex.ac.uk");
        assertEquals("ftp", parser.getProtocol());
    }

    @Test
    public void test_basic_generic_protocol_retrieval() {
        URL_parser parser = new URL_parser("pft://argh.ss.ss.uk");
        assertEquals("pft", parser.getProtocol());
    }

    @Test
    public void test_simple_site() {
        URL_parser parser = new URL_parser("https://www.essex.ac.uk");
        assertEquals("www.essex.ac.uk", parser.getSite());
    }

    @Test
    public void test_simple_site_with_pathname(){
        URL_parser parser = new URL_parser("https://www.essex.ac.uk/index.html");
        assertEquals("www.essex.ac.uk", parser.getSite());
    }

    @Test
    public void test_simple_site_with_slash(){
        URL_parser parser = new URL_parser("https://www.essex.ac.uk/");
        assertEquals("www.essex.ac.uk", parser.getSite());
    }

    @Test
    public void test_simple_pathname(){
        URL_parser parser = new URL_parser("https://www.essex.ac.uk/csee");
        assertEquals("csee", parser.getPathname());
    }

    @Test
    public void test_complex_pathname(){
        URL_parser parser = new URL_parser("https://www.essex.ac.uk/csee/staff/rpoli.html");
        assertArrayEquals("csee/staff/rpoli.html".getBytes(), parser.getPathname().getBytes());
    }

    @Test
    public void test_simple_empty_pathname(){
        URL_parser parser = new URL_parser("https://www.essex.ac.uk/");
        assertEquals("", parser.getPathname());

    }

    @Test
    public void test_simple_single_slash_pathname(){
        URL_parser parser = new URL_parser("https://www.essex.ac.uk/");
        assertEquals("", parser.getPathname());

    }


}

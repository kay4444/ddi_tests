import MainSettings.Settings;
import Pages.Company;
import Pages.HomePage;
import org.testng.annotations.Test;

public class TestCases_didi_links extends Settings
{
    @Test(priority = 0)
    public void company_links_verify_present()
    {
        Company.company_links_present();
    }
    @Test(priority = 1)
    public void services_link_present()
    {
        HomePage.services_link_present();
    }
    @Test(priority = 1)
    public void blog_link_present()
    {
        HomePage.blog_link_present();
    }
    @Test(priority = 1)
    public void company_link_present()
    {        HomePage.company_link_present();    }
    @Test(priority = 1)
    public void contuct_us_link_present()
    {
        HomePage.contuct_us_link_present();
    }
    @Test(priority = 1)
    public void portfolio_link_present()
    {
        HomePage.portfolio_link_present();
    }
    @Test(priority = 1)
    public void technology_link_present()
    {
        HomePage.technology_link_present();
    }
    @Test(priority = 1)
    public void get_subscription_cookie()
    {
        HomePage.get_coockie();
    }
}
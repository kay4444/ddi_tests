package Enums;

public enum Variables
{
    //HomePage
    SERVICES_LINK(".//*[@id='nav']/ul/li[1]/a"),
    COMPANY_LINK(".//*[@id='nav']/ul/li[3]/a"),
    TECHNOLOGY_LINK(".//*[@id='nav']/ul/li[4]/a"),
    PORTFOLIO_LINK(".//*[@id='nav']/ul/li[5]/a"),
    BLOG_LINK(".//*[@id='nav']/ul/li[6]/a"),
    CONTACTS_LINK(".//*[@id='nav']/ul/li[7]/a"),
    START_PROJECT(".//*[@id='main']/section/span/span/div/div/a"),
    SUBSCRIBE(".//*[@id='email-subscribe']"),
    SIGN_UP(".//*[@id='footer']/div[1]/div/form/fieldset/div[2]/input[2]"),
    CONGRATS("html/body/div[2]/div/div/div/p"),
    HOW_WE_WORK(".//*[@id='nav']/ul/li[2]/a"),
    //Services
    CUSTOM_SERVICES(".//*[@id='nav']/ul/li[1]/div/div/ul/li[1]/a"),
    NAME_SERVICES_FORM(".//*[@id='request-quote-name']"),
    EMAIL_SERVICES_FORM(".//*[@id='request-quote-email']"),
    PHONE_SERVICES_FORM(".//*[@id='request-quote-phone']"),
    DESCRIPTION_SERVICES_FORM(".//*[@id='request-quote-message']"),
    SEND_SERVICES_FORM("//button[@class='btn send col-lg-2 col-md-2 col-sm-3 col-xs-6'and @name='send-form-sf'and @id='submit']"),
    //Company
    OPEN_MENU(".//*[@id='bs-example-navbar-collapse-1']/ul/li[5]/i[1]"),
    MANAGMENT_LINK(".//*[@id='nav']/ul/li[3]/div/div/ul/li[1]/a"),
    SOFTWARE_DEVELOPMENT_LINK(".//*[@id='bs-example-navbar-collapse-1']/ul/li[5]/ul/li[2]/a"),
    //Management
    CEO_FACEBOOK("html/body/div[3]/div/article/div[1]/div/a[2]/img"),
    CEO_LINKED_IN("html/body/div[3]/div/article/div[1]/div/a[3]/img"),
    BDM_EUROPA_FACEBOOK("html/body/div[3]/div/article/div[2]/div/a[1]/img"),
    BDM_EUROPA_LINKED_IN("html/body/div[3]/div/article/div[2]/div/a[2]/img"),
    HMD_FACEBOOK("html/body/div[3]/div/article/div[4]/div/a[1]/img"),
    PR_FACEBOOK("html/body/div[3]/div/article/div[5]/div/a[1]/img"),
    HMD_LINKED_IN("html/body/div[3]/div/article/div[4]/div/a[2]/img"),
    PR_LINKED_IN("html/body/div[3]/div/article/div[5]/div/a[2]/img"),
    //Portfolio
    WEB_DEVELOPMENT_TAB(".//*[@id='main']/div[1]/nav/li[2]/a"),
    MOBILE_DEVELOPMENT_TAB(".//*[@id='main']/div[1]/nav/li[3]/a"),
    CLOUD_SOLUTION_TAB(".//*[@id='main']/div[1]/nav/li[4]/a"),
    ENTERPRICE_SOFTWARE_TAB(".//*[@id='main']/div[1]/nav/li[5]/a"),
    TAB_ALL(".//*[@id='main']/div[1]/nav/li[1]/a"),
    PREVIOUS_PAGE(".//*[@id='paginator']/ul/li[1]/a"),
    NEXT_PAGE(".//*[@id='paginator']/ul/li[7]/a"),
    SECOND_PAGE(".//*[@id='paginator']/ul/li[3]/a"),

    //Start project form1
    START_PROJECT_NAME(".//*[@id='requestFormModal']/div/div/div[2]/form/div[2]/input"),
    START_PROJECT_EMAIL(".//*[@id='requestFormModal']/div/div/div[2]/form/div[3]/input"),
    START_PROJECT_PHONE(".//*[@id='requestFormModal']/div/div/div[2]/form/div[4]/input"),
    START_PROJECT_MESSAGE(".//*[@id='requestFormModal']/div/div/div[2]/form/div[5]/textarea"),
    START_PROJECT_SEND_BUTTON(".//*[@id='requestFormModal']/div/div/div[2]/form/div[7]/div[2]/input"),
    //Contact Us form
    NAME_INPUT(".//*[@id='contact-form']/div/input[1]"),
    EMAIL_INPUT(".//*[@id='contact-form']/div/input[2]"),
    PHONE_INPUT(".//*[@id='contact-form']/div/input[3]"),
    MESSAGE_TEXTFIELD(".//*[@id='contact-form']/div/textarea"),
    SENT_BUTTON(".//*[@id='contact-form']/div/div[3]/button"),
    ZOOM_IN(".//*[@id='mapDiv']/div/div/div[11]/div/div/div[1]"),
    ZOOM_OUT(".//*[@id='mapDiv']/div/div/div[11]/div/div/div[3]"),
    CHANGE_TO_USA_LOCATION(".//*[@id='myTab']/li[2]/a/h2"),
    //Blog
    ALL_TAB("html/body/div[2]/div/div/ul/li[1]/a"),
    IT_NEWS_TAB("html/body/div[2]/div/div/ul/li[2]/a"),
    COMPANY_NEWS_TAB("html/body/div[2]/div/div/ul/li[3]/a"),
    CASE_TAB("html/body/div[2]/div/div/ul/li[4]/a"),
    PROGRAMMING_TAB("html/body/div[2]/div/div/ul/li[5]/a"),
    MARKETING_TAB("html/body/div[2]/div/div/ul/li[6]/a"),
    CLOUD_TECHNOLOGY_TAB("html/body/div[2]/div/div/ul/li[7]/a"),
    ARTICLE_LINK("html/body/div[3]/div[1]/div[2]/div[5]/div[3]/a[2]"),
    SHARE_FACEBOOK("html/body/div[6]/div[1]/ul/li[1]"),
    SHARE_TWEET("html/body/div[6]/div[1]/ul/li[2]"),
    SHARE_LINKED_IN("html/body/div[6]/div[1]/ul/li[3]"),
    SHARE_GOOGLE("html/body/div[6]/div[1]/ul/li[4]"),
    START_DISCUSS(".//*[@id='form']/form/div/div[3]/div[1]/div[1]"),
    DISQUS_LOGIN(".//*[@id='form']/form/div/div[4]/div/section/div[1]/ul/li[1]/button"),
    DISQUS_EMAIL(".//*[@id='auth-form']/div[2]/input"),
    DISQUS_PASS(".//*[@id='auth-form']/div[3]/input"),
    LOGIN_DISQUS(".//*[@id='auth-form-button']"),
    POST_COMMENT_BUTTON(".//*[@id='form']/form/div/div[3]/div[5]/div/section/div/button"),
    ACTIVATE_START_DISCUSS(".//*[@id='form']/form/div/div[3]/div[1]/span"),
    //How we work
    TIME_MATERIALS(".//*[@id='main']/section[2]/div/div[1]/div[1]/ul/li[3]/a"),
    FIXED_PRICE(".//*[@id='main']/section[2]/div/div[1]/div[1]/ul/li[1]/a"),
    DEDICATED_TEAM(".//*[@id='main']/section[2]/div/div[1]/div[1]/ul/li[2]/a"),
    INNOVATION_LABS(".//*[@id='main']/section[6]/div/div[1]/div[2]/a"),
    EXHAUSTIVE_DELIVERY(".//*[@id='main']/section[6]/div/div[1]/div[3]/a"),
    OFF_THE_GROUP(".//*[@id='main']/section[6]/div/div[1]/div[1]/a");
    private String text;
    Variables(String text)
    {
        this.text=text;
    }

    public String toString()
    {

        return this.text;
    }
}

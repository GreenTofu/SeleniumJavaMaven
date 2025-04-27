public class CRMLocators {
    //Login Page
    public static String headerLogin = "//div[contains(@class,'company-logo')]/following::h1";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[contains(@id,'password')]";
    public static String checkBoxRemember = "//input[@id='remember']";
    public static String linkForgotPassword = "//div[contains(@class,'form-group')]/child::a";
    public static String btnLogin = "//button[normalize-space()='Login']";
    public static String alertErrorMsg = "//div[@id='alerts']/div";

    //Dashboard Page
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String userProfile = "//li[contains(@class, 'header-user-profile')]";

    //Customer Page
    public static String menuCustomer = "//a[span[starts-with(normalize-space(),'Customers')]]";
    public static String headerCustomer = "//div[contains(@class,'mbot15')]/child::h4/child::span";
    public static String btnNewCustomer = "//a[contains(@class,'btn-primary') and normalize-space()='New Customer']";
    public static String inputCompany = "//input[@id='company']";
    public static String inputVAT = "//input[@id='vat']";
    public static String inputPhoneNum = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroup = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroup = "//button[@data-id='groups_in[]']/following-sibling::div//input";
    public static String itemVIP = "//button[@data-id='groups_in[]']/following::div//span[normalize-space()='VIP']";
    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//button[@data-id='default_currency']/following-sibling::div//input";
    public static String itemUSD = "//button[@data-id='default_currency']/following-sibling::div//span[normalize-space()='USD$']";
    public static String dropdownDefaultLanguage = "//button[@data-id='default_language']";
    public static String itemVietnamese = "//span[normalize-space()='Vietnamese']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String inputSearchCountry = "//button[@data-id='country']/following-sibling::div//input";
    public static String itemVietnamCountry = "//button[@data-id='country']/following-sibling::div//span[normalize-space()='Vietnam']";
    public static String buttonSave = "//div[@id='profile-save-section']//button[normalize-space()='Save']";
//    public static String itemCustomerFirst = "//table[@id='clients']/tbody/tr[1]/td[3]/a";

    //Project page
    public static String menuProjects = "//span[normalize-space()='Projects']/ancestor::a";
    public static String headerProject = "//div[contains(@class,'col-md-12')]/child::h4/child::span";
    public static String btnNewProject = "//div[@class='panel_s tw-mt-2 sm:tw-mt-4']/preceding::a[normalize-space()='New Project']";
    public static String inputProjectName = "//input[@id='name']";
    public static String inputProjectCustomer = "//select[@id='clientid']//following-sibling::button";
    public static String inputSearchProjectCustomer = "//button[@data-id='clientid']/following-sibling::div//input";
    public static String itemCustomer = "//button[@data-id='clientid']/following-sibling::div//span[normalize-space()='Sample Data']";
    public static String inputCheckbox = "//label[@for='progress_from_tasks']/preceding-sibling::input";
    public static String progressBar = "//input[@name='progress']";
    public static String dropdownBillingType = "//button[@data-id='billing_type']";
    public static String itemProjectHour = "//button[@data-id='billing_type']/following-sibling::div//span[normalize-space()='Project Hours']";
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String itemStatusCancel = "//button[@data-id='status']/following::div//span[normalize-space()='Cancelled']";
    public static String inputRatePerHour = "//input[@id='project_rate_per_hour']";
    public static String inputEstimatedHours = "//input[@id='estimated_hours']";
    public static String dropdownMembers = "//button[@data-id='project_members[]']";
    public static String inputSearchMember = "//button[@data-id='project_members[]']/following-sibling::div//input";
    public static String itemMember = "//button[@data-id='project_members[]']/following-sibling::div//span[normalize-space()='Admin Example']";
    public static String inputStartDate = "//input[@id='start_date']";
    public static String inputDeadline = "//input[@id='deadline']";

    public static String sendProjectCheckbox = "//input[@id='send_created_email']";
    public static String btnSave = "//button[normalize-space()='Save']";

}

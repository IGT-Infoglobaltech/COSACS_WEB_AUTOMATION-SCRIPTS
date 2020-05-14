package com.cosac.Locators;

public class Xpath {

	public static class LoginPage {
		public static String userName = "//input[@name='username']";
		public static String passWord = "//input[@name='password']";
		public static String logIn = "//button[contains(text(),'Log In')]";
		public static String Logo = "//div[@id='center']/div";

	}

	public static class LocationCreation {
		public static String merchandising = "//a[contains(text(),'Merchandising')]/..";
		public static String create = "//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String location = "//a[contains(text(),'Combo')]//../..//a[contains(text(),'Location')]";
		public static String locationID = "//label[contains(text(),'Location Id')]/..//input[@class='form-control ng-pristine ng-invalid ng-invalid-required']";
		public static String verifyLocationPage = "//h2[contains(text(),'Create Location')]";
		public static String fascia = "//list[@name='fascia']//div[@class='list-arrow']";
		public static String fasciaSerch = "//list[@name='fascia']//input[@class='ng-pristine ng-valid']";
		public static String fasciaName = "//div[contains(text(),'Courts')][position()=1]";
		public static String StoreType = "//list[@name='storeType']//div[@class='list-arrow']";
		public static String StoreTypeSearch = "//list[@name='storeType']//input[@class='ng-pristine ng-valid']";
		public static String StoteName = "//div[contains(text(),'All Courts')][position()=1]";
		public static String Warehouse_checkbox = "//input[@name='warehouse']";
		public static String Virtual_checkbox = "//input[@name='virtualWarehouse']";
		public static String Active_checkbox = "//input[@name='active']";
		public static String addressLine1 = "//input[@name='addressLine1']";
		public static String addressLine2 = "//input[@name='addressLine2']";
		public static String City = "//input[@name='city']";
		public static String PostCode = "//input[@name='postCode']";
		public static String Contact_arrowMark = "//div[@class='col-lg-4']//div[@class='list-arrow']";
		public static String Contact_Search = "//div[@class='list-options ng-scope']//input";
		public static String SelectSuggestion = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String Contact_Value = "//input[@ng-model='contact.value']";
		public static String AddBTN = "//a[@title='Add']";
		public static String SaveBTN = "//button[text()='Save']";
		public static String Message_catch = "//div[@id='growlcontainer']";
		public static String MessageClick = "//div[@id='growlcontainer']//button[@type='button']";
		public static String LocatinValueID = "//div[@id='center']//h2";

	}

	public static class LocationSearch {

		public static String SearchMenu = "(//a[contains(text(),'Merchandising')]/..//a)[20]";
		public static String Locations = "//a[contains(text(),'Product Enquiry')]//../..//a[contains(text(),'Locations')]";
		public static String Location_Pageheading = "//h2[@id='page-heading']";
		public static String SearchLocation = "//input[@id='searchString']";
		public static String LocationId = "//div[@class='Booking-Columnn panel-heading']//div[@class='col-lg-6'][2]/span[2]";
		public static String LocationName = "//div[@class='Booking-Columnn panel-heading']//a";
		public static String SystemId = "(//div[@id='resultsContainer']//div[@class='col-lg-9'])[2]//div[1]";
		public static String Warehouse = "(//div[@id='resultsContainer']//div[@class='ng-binding'])[2]";
		public static String Active = "(//div[@id='resultsContainer']//div[@class='ng-binding'])[3]";
		public static String Virtual = "(//div[@id='resultsContainer']//div[@class='ng-binding'])[4]";

	}

	public static class Vendor_Creation {
		public static String merchandising = "//a[contains(text(),'Merchandising')]/..";
		public static String create = "//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String vendor = "//a[contains(text(),'Combo')]//../..//a[contains(text(),'Vendor')]";
		public static String Verify_VendorPage = "//div[@id='center']//h2";
		public static String vendorCode = "//input[@name='code']";
		public static String vendorName = "//input[@name='name']";
		public static String SelectVendor = "//select[@name='type']";
		public static String AddressLine1 = "//input[@name='addressLine1']";
		public static String City = "//input[@name='city']";
		public static String State = "//input[@name='state']";
		public static String postcode = "//input[@name='postCode']";
		public static String countryCode = "//input[@name='country']";
		public static String Currency = "//select[@name='currency']";
		public static String Status = "//select[@name='status']";
		public static String PaymentTerms = "//textarea[@name='paymentTerms']";
		public static String orderEmail = "//input[@name='orderEmail']";
		public static String Leadtime = "//input[@name='leadTime']";
		public static String Contact_ArrowMark = "//div[@class='list-container ng-scope']//i[@class='glyphicons play']";
		public static String Enter_ContactType = "//div[@class='list-options ng-scope']//input[@type='text']";
		public static String Select_Contact = "//div[@class='list-item-container ng-scope']/div";
		public static String Email_Contact = "//div[@class='col-lg-6']/input";
		public static String PlusMark = "//div[@class='row']//a[@title='Add']";
		public static String SaveBTN = "//div[@class='col-lg-12']//button[text()='Save']";
		public static String Message_catch = "//div[@id='growlcontainer']";
		public static String AddTag_Text = "//div[@class='well well-sm']//input[@name='tag_']";
		public static String selectTag = "//ul[@class='typeahead dropdown-menu']//li";
		public static String AddBTN = "//div[@class='well well-sm']//span//button[text()='Add']";
		public static String AddTag_Messge = "//div[text()='Vendor tag saved successfully.']";
		public static String MessageClick = "//div[@id='growlcontainer']//button[@type='button']";

	}

	public static class Vendor_Search {
		public static String SearchMenu = "(//a[contains(text(),'Merchandising')]/..//a)[20]";
		public static String VendorSearch = "//a[contains(text(),'Product Enquiry')]//../..//a[contains(text(),'Vendors')]";
		public static String VendorSearch_Pageheading = "//div[@id='center']//h2";
		public static String VendorSearchField = "//input[@id='searchString']";
		public static String VendorName = "//div[@id='resultsContainer']//a[@class='ng-binding']";
		public static String VendorCode = "(//div[@id='resultsContainer']//p)[1]";
		public static String VendorStatus = "(//div[@id='resultsContainer']//p)[3]";
		public static String VendorType = "(//div[@id='resultsContainer']//p)[4]";
		public static String VendorTag = "(//div[@id='resultsContainer']//p)[5]";

	}

	public static class GoodsRecieptNO {
		public static String merchandising = "//a[contains(text(),'Merchandising')]/..";
		public static String create = "//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String Goodsreceipt = "//a[contains(text(),'Combo')]//../..//a[contains(text(),'Goods Receipt')]";
		public static String Verify_GRNPage = "//div[@id='center']//h2";
		public static String RecievingArrow = "(//div[@class='list-container ng-scope'])[1]//div[@class='list-arrow']";
		public static String RecievigSearch = "//div[@class='list-search ng-scope']//input";
		public static String SelectLocation = "//div[@class='list-item-container ng-scope']//div";
		public static String SelectDate = "(//div[@class='form-group has-error'])[1]//input";
		public static String VendordelvryNO = "//input[@name='vendorDeliveryNumber']";
		public static String VendorArrow = "(//div[@class='list-container ng-scope'])[2]//div[@class='list-arrow']";
		public static String VendorSearch = "//div[@class='list-options ng-scope']//input[@type='text']";
		public static String VendorSelect = "//div[@class='list-options ng-scope']//div[@class='list-item-container ng-scope']//div";
		public static String SelectReciever = "//select[@name='receivedById']";
		public static String VendorInvoiceNO = "(//div[@class='form-group has-error'])[6]//input";
		public static String Comment = "//div[@ng-show='editing']/textarea";
		public static String SelectPO = "//select[@name='purchaseOrderId']";
		public static String PlusMark = "(//div[@class='col-md-3'])[2]/p";
		public static String PONumber = "(//div[@class='ng-scope']//div[@class='col-lg-8']/a)[1]";
		public static String ProductCode = "(//div[@class='col-lg-12']//tr[@ng-form='productForm'])[1]//a[@class='ng-binding']";
		public static String OnHandProduct = "//a[contains(text(),'LUCKY DOLLAR MANDEVI')]/parent::td/following-sibling::td[1]";
		public static String AvailableProduct = "//a[contains(text(),'LUCKY DOLLAR MANDEVI')]/parent::td/following-sibling::td[2]";
		public static String OnOrderProduct = "//a[contains(text(),'LUCKY DOLLAR MANDEVI')]/parent::td/following-sibling::td[3]";
		public static String UpdatedProductCode = "//tr[@class='ng-scope ng-pristine ng-valid']//a[@class='ng-binding']";
		public static String QuantityPendng = "(//div[@class='col-lg-12']//td[@class='quantity ng-binding'])[1]";
		public static String QuantityRecieved = "(//div[@class='col-lg-12']//td[@class='quantity']//input)[1]";
		public static String QuantityBackordre = "(//div[@class='col-lg-12']//td[@class='quantity'])[3]";
		public static String CreaterecptBTN = "(//div[@class='pull-right'])[2]//button";
		public static String Message_catch = "//div[@id='growlcontainer']";
		public static String GRNLabel = "//div[@id='center']//h2";
		public static String VerifyCostBTN = "//div[@class='buffer-sm bottom ng-scope']//button[@ng-click='verifyCosts()']";
		public static String ApproveBTN = "//div[@class='buffer-sm bottom ng-scope']//button[@ng-click='approve()']";
		public static String ChildWndGoodReciept = "(//div[@id='center']//div[@class='col-lg-3'])[1]//p";
		public static String ChildWnd_PONo = "//div[@class='col-lg-6']//a";
		public static String ChildWnd_ConfirmBTN = "//div[@class='buffer-sm top']//button[@class='btn btn-primary']";

	}

	public static class productHierarchy {
		public static String merchandising = "//a[contains(text(),'Merchandising')]/..";
		public static String ProductHierarchy = "//ul[@class='dropdown-menu']/..//a[text()='Product Hierarchy']";
		public static String Heirarchylabel = "//div[@id='center']//h2";
		public static String DivOptions = "(//div[@title='levels-container'])[1]//div[@class='tag col-lg-2 false']";
		public static String CreateDivTag = "(//div[@title='levels-container'])[1]//input[@placeholder='Create new tag']";
		public static String DIvBTN = "//div[@class='actions active']//span[@title='Save']";
		public static String Message_catch = "//div[@id='growlcontainer']";
		public static String DeptOptions = "(//div[@title='levels-container'])[2]//div[@class='tag col-lg-2 false']";
		public static String CreateDepttag = "(//article[@class='tags col-lg-9'])[2]//input[@id='createTag_2']";
		public static String DeptSaVeBTN = "//div[@class='actions active']//span[@title='Save']";
		public static String ClassOptions = "(//div[@title='levels-container'])[3]//div[@class='tag col-lg-2 false']";
		public static String CreateClasstag= "(//div[@class='tag new col-lg-2'])[3]//input[@id='createTag_3']";
		public static String ClassSaVeBTN = "//div[@class='actions active']//span[@id='saveNewTag_3']";
		public static String Configuration = "//a[contains(text(),'Configuration')]/..";
		public static String ReIndexing = "//a[contains(text(),'Configuration')]/..//a[text()='Re-Indexing']/..";
		public static String ProductStLevelCheck = "//input[@id='doMerchandiseStockLevels']";
		public static String ReIndeBTN = "//button[text()='Re-Index']";
		public static String Verify_ReindexingPage = "//div[@id='center']//h2";
		
	}

	public static class TopskuReports {
		public static String merchandising = "//li//a[contains(text(),'Merchandising')]";
		public static String Reports = "(//li//a[contains(text(),'Reports')])[5]";
		public static String TopSku = "(//li//a[contains(text(),'Reports')])[5]/..//li//a[contains(text(),'Top Sku')]";
		public static String TopSkulabel = "//div[@id='center']//h2";
		public static String fromDate = "//div[@class='row buffer bottom']//input[@name='fromDate']";
		public static String ToDate = "//div[@class='row buffer bottom']//input[@name='toDate']";
		public static String Divsionarrow = "(//div[@class='row buffer bottom']//div[@class='list-arrow'])[4]";
		public static String DivSearchbox = "//div[@class='list-search ng-scope']//input[@type='text']";
		public static String DivSelectText = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String Deptarrow = "(//div[@class='row buffer bottom']//div[@class='list-arrow'])[6]";
		public static String DeptSearchbox = "//div[@class='list-options ng-scope']//input[@type='text']";
		public static String DeptSelectText = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String Classarrow = "(//div[@class='row buffer bottom']//div[@class='list-arrow'])[8]";
		public static String ClassSearchbox = "//div[@class='list-options ng-scope']//input[@type='text']";
		public static String classSelectText = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String Locationarrow = "(//div[@class='row buffer bottom']//div[@class='list-arrow'])[1]";
		public static String LocationSearchbox = "//div[@class='list-search ng-scope']//input[@type='text']";
		public static String LocationSelectText = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String SearchBTN = "//div[@class='pull-right']//button[text()='Search']";
		public static String ResultsFound = "(//div[@class='col-lg-12'])[3]//div";
		public static String printBTN = "//div[@class='pull-right']//button[text()='Print']";
		public static String SkuLink = "//tr[@ng-repeat='product in location.products']/child::td[4]";
		public static String Quantity = "//tr[@ng-repeat='product in location.products']/child::td[8]";
		public static String NetsaleValue = "//tr[@ng-repeat='product in location.products']/child::td[10]";
		public static String PrintSkuLink = "//tr[@class='item ng-scope']/child::td[4]";
		public static String PrintQuantity = "//tr[@class='item ng-scope']/child::td[8]";
		public static String PrintNetsalevalue = "//tr[@class='item ng-scope']/child::td[10]";
	}
	
	public static class WarrantyReports {
		public static String Warranty = "//a[text()='Warranty']/..";
		public static String Reports ="(//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Reports')])[3]";
		public static String Warrantysales ="//ul[@class='dropdown-menu ng-scope']//a[contains(text(),'Warranty Sales')]";
		public static String DelvrydateTo = "(//div[@class='col col-lg-6 has-error']//input)[1]";
		public static String WarrantyReportsLabel = "//div[@id='center']//h2";
		public static String SelectMonth = "//select[@class='ui-datepicker-month']";
		public static String SelectYear = "//select[@class='ui-datepicker-year']";
		public static String SelectDate = "//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']//a[text()='14']";
		public static String DelivrdateFrom = "(//div[@class='col col-lg-6 has-error']//input)[2]";
		public static String SaleTypeArrow = "//list[@name='salesType']//div[@class='list-arrow']";
		public static String SaleTypeText = "//div[@class='list-options ng-scope']//input[@type='text']";
		public static String SaleTextSelect = "//div[text()='All']";
		public static String SelectFacia = "//select[@id='fascia']";
		public static String SelectWarrantyType = "//select[@id='warrantyType']";
		public static String RunBTN = "//button[@id='buttonSearch']";
		public static String Export = "//button[text()='Export']";
		public static String Clear = "//button[text()='Clear']";
		public static String AccountNo = "//table[@class='main table table-striped table-bordered table-hover table-row-number']//tr[1]//td[10]";	
	}
	
	public static class WarrantYDueRenewal {
		public static String Warranty = "//a[text()='Warranty ']/..";
		public static String Reports ="(//ul[@class='dropdown-menu']//a[contains(text(),'Reports')])[3]";
		public static String WarrantyDue ="//ul[@class='dropdown-menu']//a[contains(text(),'Warranties Due Renewal')]";
		public static String BranchArrow ="//list[@name='listBranches']//div[@class='list-arrow']";
		public static String BranchText ="//div[@class='list-search ng-scope']//input";
		public static String SelectText ="//div[@class='list-item ng-scope ng-binding']";
		public static String SelectFacia = "//select[@id='fascia']";
		public static String DelivrdateFrom = "(//div[@class='col col-lg-6']/input)[1]";
		public static String SelectMonth = "//select[@class='ui-datepicker-month']";
		public static String SelectYear = "//select[@class='ui-datepicker-year']";
		public static String SelectDate = "//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']//a[text()='14']";
		public static String DelivrdateTo = "(//div[@class='col col-lg-6']/input)[2]";
		public static String RunBTN = "//button[@id='buttonSearch']";
		public static String Export = "//button[text()='Export']";
		public static String Clear = "//button[text()='Clear']";
		public static String AccountNo = "//table[@class='main table table-striped table-bordered table-hover table-row-number']//tr[1]//td[10]";	
	}
	
	public static class WarrantyReturns{
		public static String WarrantyReturns ="//ul[@class='dropdown-menu']//a[contains(text(),'Warranty Returns')]";
		public static String CanceledFrom = "(//div[@class='col col-lg-6 has-error']/input)[1]";
		public static String CanceledTo = "(//div[@class='col col-lg-6 has-error']/input)[2]";
		public static String SelectMonth = "//select[@class='ui-datepicker-month']";
		public static String SelectYear = "//select[@class='ui-datepicker-year']";
		public static String SelectDate = "//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']//a[text()='14']";
		public static String returnType = "//select[@id='returnType']";
		public static String warrantyType = "//select[@id='warrantyType']";
		public static String RunBTN = "//button[text()='Run']";
		public static String Clear = "//button[text()='Clear']";
		public static String Export = "//button[text()='Export']";
	}
	
	public static class WarrantyHitRate{
		public static String WarrantyHitRate ="//ul[@class='dropdown-menu']//a[contains(text(),'Warranty Hit Rate')]";
		public static String DeliveredFrom = "(//div[@class='col col-md-5 has-error']//input)[1]";
		public static String DeliveredTo = "(/(//div[@class='col col-md-5 has-error']//input)[2]";
		public static String SelectMonth = "//select[@class='ui-datepicker-month']";
		public static String SelectYear = "//select[@class='ui-datepicker-year']";
		public static String SelectDate = "//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']//a[text()='14']";
		public static String returnType = "//select[@id='returnType']";
		public static String warrantyType = "//select[@id='warrantyType']";
		public static String BranchArrow = "//list[@name='listBranch']//div[@class='list-arrow']";
		public static String BranchSearch = "//div[@class='list-search ng-scope']//input";
		public static String BranchSelect = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String SalesPArrow = "//list[@placeholder='Sales Person']//div[@class='list-arrow']";
		public static String SalesPSearch = "//div[@class='list-search ng-scope']//input";
		public static String SalesSelect = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		
		public static String RunBTN = "//button[text()='Run']";
		public static String Clear = "//button[text()='Clear']";
		public static String Export = "//button[text()='Export']";
	}
	
	public static class SecondeffortSolitationreports{
		public static String WarrantySolitation ="//ul[@class='dropdown-menu']//a[contains(text(),'Second Effort Solicitation')]";
		public static String BranchArrow = "//list[@placeholder='Select branch']//div[@class='list-arrow']";
		public static String BranchSearch = "//div[@class='list-search ng-scope']//input";
		public static String BranchSelect = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String RunBTN = "//button[text()='Run']";
		public static String Clear = "//button[text()='Clear']";
		public static String Export = "//button[text()='Export']";
	}
	
	public static class BrokerWarrantyTransactions{
		public static String BrokerWarranty ="//ul[@class='dropdown-menu']//a[contains(text(),'Broker Warranty Transactions')]";
		public static String RunNo= "//div[@class='col col-lg-4']//input";
		public static String AccountNo = "//table[@class='main table table-striped table-bordered table-hover table-row-number']//tr[1]//td[3]";
		public static String RunBTN = "//button[text()='Run']";
		public static String Clear = "//button[text()='Clear']";
		public static String Export = "//button[text()='Export']";
	}




	

	// ********Kartik******

	public static class Combo_ProductCreation {

		public static String merchandising = "//a[contains(text(),'Merchandising')]";
		public static String create = "//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String combo = "//a[contains(text(),'Combo')]";
		public static String combo_page = "//h2[contains(text(),'Create Combo')]";
		public static String description = "//input[@class='form-control ng-pristine ng-invalid ng-invalid-required']";
		public static String start_date = "//input[@id='startDate']";
		public static String end_date = "//input[@id='endDate']";
		public static String Price_Ticket = "//input[@name='priceTicket']";
		public static String save_button = "//button[contains(text(),'Save')]";
		public static String verify_combo = "//h2[@id='page-heading']";
		public static String Div_dropdown = "(//div[@class='list-arrow']//i[@class='glyphicons play'])[1]";
		public static String Div_Search = "(//input[@class='ng-pristine ng-valid'])[2]";
		public static String Div_List = "//div[@class='list-item-container ng-scope']//div";
		public static String Dep_dropdown = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[2]";
		public static String Dep_Search = "//div[@class='list-options ng-scope']//input[@ng-model='search']";
		public static String Dep_List = "//div[@class='list-options ng-scope']//div";
		public static String class_dropdown = "(//div[@class='list-arrow']//i[@class='glyphicons play'])[3]";
		public static String class_Search = "//div[@class='list-options ng-scope']//input[@ng-model='search']";
		public static String class_List = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String Tag_Click = "//input[@class='taglist form-control ng-pristine ng-valid']";
		public static String Tag_Search = "//input[@class='taglist form-control ng-pristine ng-valid']";
		public static String Tag_List = "//ul[@class='typeahead dropdown-menu']//li";
		public static String Add = "(//button[contains(text(),\"Add\")])[1]";
		public static String Plus_Button = "(//span[@class='glyphicons glyph-btn plus'])[2]";
		public static String Plus_Click = "(//span[@class='glyphicons glyph-btn plus'])[2]";

		public static String SKU_Dropdown = "//a[@href='javascript:void(0)']//div";
		public static String SKU_Search = "(//input[@type='text'])[6]";
		public static String SKU_List = "//ul[@class='select2-results']//div[@class='select2-result-label']/table/tbody/tr";
		/*
		 * public static String
		 * SKU_List="//div[@class='select2-drop productResults select2-with-searchbox select2-drop-active select2-drop-above']//ul[@class='select2-results']"
		 * ;
		 */
		public static String QTY = "//input[@name='quantity']";

		public static String Check = "//span[@class='glyphicons glyph-btn ok_2']";
		public static String Plus_Click1 = "(//span[@class='glyphicons glyph-btn plus'])[2]";
		public static String SKU_Dropdown1 = "(//a[@href='javascript:void(0)']//div)[2]";
		public static String SKU_Search1 = "(//input[@type='text'])[9]";
		public static String SKU_List1 = "//ul[@class='select2-results']//div";
		public static String QTY1 = "(//input[@name='quantity'])[2]";
		public static String Check1 = "(//span[@class='glyphicons glyph-btn ok_2'])[2]";
		public static String Select_FasciaDropdown = "(//div[@class='list-container ng-scope'])[4]//div[@class='list-arrow']";
		public static String Select_FasciaSearch = "//div[@class='list-search ng-scope']//input[@type='text']";
		public static String Select_FasciaList = "//div[@class='list-item-container ng-scope']";
		public static String Add1 = "//button[@class='btn btn-default btn-fixed']";
		public static String Pencil = "(//span[@class='glyphicons glyph-btn pencil'])[3]";

		public static String Regular_Price = "//div[@class='panel-heading bordered']//h4[contains(.,'Regular Price')]";

		public static String CashPriceInclusive1 = "(//input[@class='form-control ng-pristine ng-valid'])[1]";
		public static String CashPriceInclusive2 = "(//div[@standard-price='cashPrice']//tr)[3]//input[@class='form-control ng-pristine ng-valid']";

		public static String RegularPriceInclusive1 = "(//div[@standard-price='regularPrice']//tr)[2]//input[@class='form-control ng-pristine ng-valid']";
		public static String RegularPriceInclusive2 = "(//div[@standard-price='regularPrice']//tr)[3]//input[@class='form-control ng-pristine ng-valid']";

		public static String DutyFree = "(//td[.='TOTAL '])[12]";

		public static String DutyFree1 = "((//div[@class='panel panel-default buffer all buffer-sm'])[3]//input[@class='form-control ng-pristine ng-valid'])[1]";
		public static String DutyFree2 = "((//div[@class='panel panel-default buffer all buffer-sm'])[3]//td[@class='currency'])[11]//input[@class='form-control ng-pristine ng-valid']";

		public static String Click1 = "//div[@class='panel panel-primary ng-scope ng-valid ng-dirty']//span[@class='glyphicons glyph-btn ok_2']";
		public static String PageLabel = "//div[@id='center']//h2[@id='page-heading']";

		public static String Save = "//button[@ng-click='save()']";

		// validation Xpath
		public static String Search = "(//a[contains(.,'Search')])[11]";
		public static String Product_Enquiry = "//ul//li[.='Product Enquiry']";
		public static String ProductSearch = "//div[@class='col-lg-4 col-md-4']//input[@id='searchString']";
		public static String Volume = "//td[.='Volume']";
		public static String Home = "//nav[@class='navbar navbar-inverse navbar-fixed-top']//a[@id='home']";

	}

	public static class Reports_WarehouseOversupply {

		public static String merchandising = "//a[contains(text(),'Merchandising')]";
		public static String Reports = "(//a[contains(text(),'Reports')])[5]";
		public static String WarehouseOversupply = "//a[contains(text(),'Warehouse Oversupply')]";
		public static String WarehouseDropDown = "(//div[@class='form-group']//div[@class='list-arrow'])[1]";
		public static String WarehouseSearch = "//div[@class='list-search ng-scope']//input[@type='text']";
		public static String WarehouseList = "//div[@class='list-item-container ng-scope']";
		public static String DivisionDropDown = "(//div[@class='form-group']//div[@class='list-arrow'])[4]";
		public static String DivisionSearch = "//div[@class='list-search ng-scope']//input[@type='text']";
		public static String DivisionList = "//div[@class='list-item-container ng-scope']";
		public static String DepartmentDropDown = "(//div[@class='form-group']//div[@class='list-arrow'])[6]";
		public static String DepartmentSearch = "//div[@class='list-search ng-scope']//input[@type='text']";
		public static String DepartmentList = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String ClassDropDown = "(//div[@class='form-group']//div[@class='list-arrow'])[8]";
		public static String ClassSearch = "//div[@class='list-search ng-scope']//input[@type='text']";
		public static String ClassList = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String Search = "//button[@id='buttonSearch']";
		public static String Clear = "//button[@id='buttonClear']";
		public static String Export = "//button[@id='buttonExport']";
		public static String Print = "//button[@id='buttonPrint']";
		public static String WarehouseSupply = "//h2[contains(.,'Warehouse Oversupply')]";
		public static String Home = "//nav[@class='navbar navbar-inverse navbar-fixed-top']//a[@id='home']";
	}

	public static class CreateStockCount {
		public static String merchandising = "//a[contains(text(),'Merchandising')]";
		public static String create = "//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String StockCount = "//a[contains(text(),'Stock Count')]";
		public static String LocationDropdown = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[2]";
		public static String Search = "//div[@class='list-options ng-scope']//input[@type='text']";
		public static String List = "//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String CountDate = "//div[@class='col-md-8']//input[@class='form-control ng-pristine ng-invalid ng-invalid-required']";

		public static String DivisionDropDown = "(//div[@class='list-container ng-scope'])[2]//div[@class='list-arrow']";
		public static String DepartmentDropDown = "(//div[@class='list-container ng-scope'])[4]//div[@class='list-arrow']";
		public static String ClassDropDown = "(//div[@class='list-container ng-scope'])[6]//div[@class='list-arrow']";
		public static String Schedule = "//button[contains(.,'Schedule')]";
		// Stock Count validation
		public static String Search1 = "(//a[contains(.,'Search')])[11]";
		public static String SearchStockCount = "//ul//li[.='Stock Counts']";

		public static String LocationSearchDropDown = "(//div[@class='list-container ng-scope'])[1]//div[@class='list-arrow']";
		public static String StatusDropDown = "(//div[@class='list-container ng-scope'])[2]//div[@class='list-arrow']";
		public static String TypeDropDown = "(//div[@class='list-container ng-scope'])[3]//div[@class='list-arrow']";
		public static String ScheduledFrom = "(//div[@class='form-group'])[4]//input[@class='form-control ng-pristine ng-valid']";
		public static String Search2 = "//button[.='Search']";
		public static String StockCountID = "//a[@class='ng-binding']";
		public static String Status = "//tr[@ng-repeat='item in orderItemsResult']//td[@class='ng-binding']";
		public static String StartButton = "//button[contains(.,'Start')]";
		public static String CollectionNotes = "(//input[@type='checkbox'])[1]";
		public static String DeliveryNotes = "(//input[@type='checkbox'])[2]";
		public static String GoodsReciept = "(//input[@type='checkbox'])[3]";
		public static String ReturnToVendor = "(//input[@type='checkbox'])[4]";
		public static String StartCount = "//button[contains(.,'Start Count')]";
		public static String FindProductDropDown = "//a[@class='select2-choice select2-default']//div";
		public static String FindProductSearch = "//div[@class='select2-search']//input[@type='text']";
		public static String FindProductList = "//ul[@class='select2-results']//div[@class='select2-result-label']";
		public static String StockCount1 = "//table//tr[@ng-form='productForm']//td[@class='quantity']//input[@name='count']";
		public static String Comments = "//tr[@class='ng-scope ng-valid ng-dirty']//input[@class='form-control ng-pristine ng-valid']";
		public static String SaveAll = "//button[contains(.,'Save All')]";
		public static String PrintVarience = "(//button[@class='btn btn-default'])[2]";
		public static String CloseStockCount = "//button[contains(.,'Close Stock Count')]";
		public static String PageText = "//div[@id='center']//h2[@id='page-heading']";
		public static String StockCountMin = "(//div//input[@class='form-control ng-pristine ng-valid ng-valid-required'])[1]";
		public static String Home = "//nav[@class='navbar navbar-inverse navbar-fixed-top']//a[@id='home']";

	}
	public static class TechnicalServicesInternalCustomer{
		   public static String Service = "(//ul[@id='mainMenu']//a[@class='dropdown-toggle ng-binding'])[7]";
		   //user search for the existing service
		   public static String SearchInstallation="//ul[@class='dropdown-menu']//a[contains(text(),'Search Service Requests')]";
		   public static String TypeYourSearchHere="//input[@id='searchString']";
		   public static String Request1="//a[@class='refLink ng-binding']";
		   public static String ResolutionAddpart="(//table[@class='table'])[1]//a[@id='addPart']";
		   public static String StockLocationDropDown="(//a[@class='select2-choice'])[15]//div";
		   public static String ResolutionSearch="//span[@class='input-group-addon halflings search click']";
		   public static String ItemSearch1="//div//input[@id='itemNo']";
		   public static String MatchingStockSearch="//div[@class='search row']//div[@class='halflings search click']";
		   public static String MatchingStockClick="//div[@class='glyphicons check click']";
		   public static String Windowchange="popup-body modal-content modalStock";
		   
		   
		   public static String NewServiceRequest="//ul[@class='dropdown-menu']//a[contains(text(),'New Service Request')]";
		   public static String InternalCustomer="//input[@id='si']";
		  //in th edrop down select the customer option adn enter the customer id
		   public static String CustomerID="(//a[@class='select2-choice']//div)[1]";
		   
		   
		   //in the Account Search send the account number
		   public static String AccountSearch="//input[@id='customerSearch']";
		   public static String Search="//button[contains(text(),'Search')]";
		   public static String Select="//btn[@id='0_Select']";
		   //in the adressline2 send the address value
		   public static String Addresssline2="//input[@id='CustomerAddressLine2']";
		   //Scroll to bottom by using scrollto_Element_Regular
		   public static String ManufacturerDropDown="(//div[@class='form-group has-error']//a[@class='select2-choice select2-default'])[1]//div";
		   public static String ModelNumber="//input[@name='ItemModelNumber']";
		   //use selectEl and select the value from the dropdown
		   public static String ManufacturerSearch="//div[@id='select2-drop']//input[@type='text']";
		   public static String ManufacturerList="//ul[@class='select2-results']//div[@class='select2-result-label']";
		   //user saves the request
		   public static String Save="//button[contains(.,'Save')]";
		   public static String PageHeading="//div//h2[@id='service-heading']";
		   public static String Evaluation="//li//a[contains(.,'Evaluation')]";
		   public static String ServiceEvaluationDropDown="//div[@id='s2id_ServiceEvaluation']//div";
		   public static String NoResultFound="//h3[contains(.,'No results found')]";
		   public static String NoResultOK="(//button[contains(.,'OK')])[2]";
		   public static String Telephone="//input[@class='form-control ng-dirty valid ng-invalid ng-invalid-required']";
		 //click on Evaluation
		   public static String Evaluation1="(//a[contains(.,'Evaluation')])[1]";
		   public static String ServiceEvaluationDropdown="(//a[@class='select2-choice select2-default'])[2]//div";
		   public static String ServiceLocationDropDown="(//a[@class='select2-choice select2-default'])[2]//div";
		   public static String ActionRequiredDropDOwn="(//a[@class='select2-choice select2-default'])[2]//div";
		   public static String ClaimForFoodDropDown="(//a[@class='select2-choice select2-default'])[2]//div";
		   public static String InstructionManualRadio="(//div[@class='col-lg-4']//label[@class='radio-inline']//input[@name='1'])[1]";
		   public static String UnderwarrentyRadio="(//div[@class='col-lg-4']//label[@class='radio-inline']//input[@name='2'])[1]";
		   public static String UsedomesticallyRadio="(//div[@class='col-lg-4']//label[@class='radio-inline']//input[@name='3'])[1]";
		   public static String QualifiedPersonnalRadio="(//div[@class='col-lg-4']//label[@class='radio-inline']//input[@name='4'])[1]";
		   public static String DeliveryRadio="(//div[@class='col-lg-4']//label[@class='radio-inline']//input[@name='5'])[1]";
		 //click on Deposit
		   public static String Deposit="//a[contains(.,'Deposit')]";
		   //click on Allocation 
		   public static String Allocation ="(//a[contains(.,'Allocation')])[3]";
		   public static String ClickAllocation="//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']//a";
		   public static String RecievedOn="//div//input[@id='AllocationItemReceivedOn']";
		   public static String ExpectedOn="//input[@id='AllocationPartExpectOn']";
		   public static String ServiceScheduled="//div[@ng-show='sections.allocationEntireSection.visible']//input[@class='form-control ng-pristine ng-valid hasDatepicker']";
		   public static String FilterByCategoryDropDown="(//a[@class='select2-choice select2-default'])[2]//div";
		   public static String TechnicianDropDown="//a[contains(.,'Select Technician')]//div";
		   public static String TimeTrack="(//table[@class='table table-condensed slotTable'])[2]//tr[2]";
		   // click on Resolution
		   public static String Resolution="(//a[contains(.,'Resolution')])[4]";
		   public static String SerialNumber="//input[@id='ItemSerialNumber']";
		   public static String RepairTypeDropDown="(//div[@ng-show='sections.resolutionEntireSection.visible']//a[@class='select2-choice select2-default'])[1]//div";
		   public static String DeliverToChargeDropDown="(//div[@ng-show='sections.resolutionEntireSection.visible']//a[@class='select2-choice select2-default'])[2]//div";
		   // Add the spare part(do click )
		   public static String AddPart="(//div[@ng-show='sections.resolutionEntireSection.visible'])[2]//a[@id='addPart']";
		   //do click operation on SearchPartNumber
		   public static String SearchPartNumber="//span[@class='input-group-addon halflings search click']";
		   public static String ItemSearch="//input[@id='itemNo']";
		   public static String AddSearch="//div[@class='halflings search click']";
		   //after adding the item click on the check box(do click action)
		   public static String ItemSelect="((//table[@class='table table-bordered table-striped'])[4]//td//div)[1]";
		   public static String AddQuantity="//input[@name='part-quantity']";
		   //User do the finalisation
		   public static String Finalise="//a[contains(.,'Finalise')]";
		   public static String ReasonForExchangeDropDown="((//div[@class='row'])[24]//a[@class='select2-choice select2-default'])[1]//div";
		   public static String ReasonForFailureDropDown="((//div[@class='row'])[24]//a[@class='select2-choice select2-default'])[1]//div";
		   //user add the comment
		   public static String AddComment="//textarea[@id='Comment']";
		   public static String SaveComment="(//button[@class='btn btn-primary'])[4]";
	   }
	 public static class Logistics_DeliveryPerformanceSummary{
		   /*public static String Service = "(//ul[@id='mainMenu']//a[@class='dropdown-toggle ng-binding'])[7]"; */
		   public static String Logistics="(//a[@class='dropdown-toggle ng-binding'])[6]";
		   //do mouse over action on the reports
		   public static String Reports="(//ul[@class='dropdown-menu']//li[contains(.,'Reports')])[1]";
		   //click on the delivery report
		   public static String Delivery_Performance_summary="//a[contains(.,'Delivery Performance Summary')]";
		   //Pivot drop down
		   public static String Pivot_DropDown="//div[@id='s2id_pivot']//div";
		   public static String Search_Report="//div[@id='select2-drop']//input[@type='text']";
		   public static String List_Report="//ul[@class='select2-results']//div[@class='select2-result-label']";
		   public static String Delivery_TypeDropDown="//div[@id='s2id_deliveryType']//div";
		   public static String Data_typeDropDown="//div[@id='s2id_dateType']//div";
		   public static String DeliveredFrom="//input[@ng-model='filterParameters.dateFrom']";
		   public static String DeliveredTo="//input[@ng-model='filterParameters.dateTo']";
		   public static String Run1="//button[@id='buttonSearch']";
		   public static String Export="//button[contains(.,'Export')]";
		      
	   }
	 public static class WarrentyExtended{
		   //click on the warrenty
		   public static String Warrenty="(//a[@class='dropdown-toggle ng-binding'])[8]";
		   //click on the create warrenty
		   public static String CreateWarrenty="//a[contains(.,'Create Warranty')]";
		   //click on the extended chechbox
		   public static String ExtendedCheckBox="//input[@id='Extended']";
		   public static String ItemNumber="//input[@id='Number']";
		   public static String Description="//input[@id='Description']";
		   public static String LengthInMths="//input[@id='Length']";
		   public static String DepartmentDropDown="(//div[@class='list-arrow'])[1]";
		   public static String ClassDropDown="(//div[@class='list-arrow'])[2]";
		   public static String SaveAndContinue="(//button[@class='btn btn-primary'])[2]";
		   public static String Search_Dept="(//input[@type='text'])[5]";
		   public static String List_Dept="//div[@class='list-item-container ng-scope']";
		   //verification
		   public static String SearchWarrenty="//a[contains(.,'Search Warranties')]";
		   public static String SearchbyItemNumber="//input[@id='searchString']";
		   public static String Home="//a[@id='home']";
		   //enter the prices
		   public static String Dots="(//span[@class='glyphicons more'])[1]";
		   public static String AddNew="//td[@class='action text-center']//a[@title='New']";
		   public static String CostPrice="//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-number ng-valid-min']";
		   public static String RetailsPrice="//input[@class='form-control ng-pristine ng-invalid ng-invalid-number ng-valid-min ng-invalid-required']";
		   public static String EnterDate="//input[@class='form-control ng-pristine ng-invalid ng-invalid-required hasDatepicker']";
		   public static String Save="//span[@class='action glyph-btn save glyphicons floppy_save']";
		   
		   
		   
		   public static String Export="//button[contains(.,'Export')]"; 
		   
		   
	   }
	
	 public static class CustomerChangedProducts{
		   public static String Logistics="(//a[@class='dropdown-toggle ng-binding'])[6]";
		   public static String SearchShipments="//a[contains(.,'Search Shipments')]";
		   public static String SelectPicking="(//div[@class='col-lg-2 col-md-2 facet ng-scope'])[6]//li[contains(.,'Picking')]";
		   public static String SelectShipment="//div[@class='Booking-Columnn panel-heading']//a[@class='Booking-Id refLink ng-binding']";
		   public static String DeliveryZone="(//ul[@class='facet-field list-unstyled'])[5]//li[contains(.,'Aashley (25)')]";
		   public static String Dots="(//span[@class='glyphicons more'])[1]";
		   public static String Dot="(//div[@class='panel panel-default pick-list result search-result ng-scope'])[1]//div[@class='text-center expandable-toggle']//span[@class='glyphicons more']";
		   
	   }
//*********SHIVA PRASAD *********
	public static class Repossessed
	{
		public static String merchandising="//a[contains(text(),'Merchandising')]/..";
		public static String search="(//a[contains(.,'Merchandising')]/..//a)[20]";
		public static String productenquiryverify="//div[@id='center']//h2[@id='page-heading']";
		public static String productenquiry="//a[.='Product Enquiry']";
		public static String regularstock="(//ul[@class='facet-field list-unstyled'])[5]//li[contains(text(),'RegularStock ')]";
		public static String activenew="(//ul[@class='facet-field list-unstyled'])[6]//li[contains(text(),'Active New')]";
		public static String activecurrent="//div//ul//li[contains(.,'Active Current')]";
		//public static String randomproduct="(//a[@class='ng-binding'])[13]";
		public static String randomproduct="(//a[@class='ng-binding'])[3]";                        //Update for every run
		public static String regularstockmaintenance="//div//h2[contains(.,'Regular Stock Maintenance')]";
		public static String repossessedcodebutton="//button[.='Create Repossession Codes']";
		public static String repossessedsuccessfully="//div[@class='growlstatus']";
		public static String divpro="(//div[@class='list-container ng-scope'])[2]/div/span";
		public static String deppro="(//div[@class='list-container ng-scope'])[3]/div/span";
		public static String classpro="(//div[@class='list-container ng-scope'])[4]/div/span";
		public static String savebut="//div[@class='col-md-12']//button[@class='btn btn-primary']";
		public static String volume="(//div//td[.='Volume'])[2]";                 //Update for every run
		public static String productcoderepoosessed="(//div[@class='col-md-8']//p[@class='form-control-static ng-binding'])[1]";
		
		//**********PATH FOR PRODUCT EXCELLENT************
		public static String productE="(//div[@class='growlstatus']//a)[1]";
		public static String printpriceE="(//input[@class='ng-pristine ng-valid'])[1]";
		public static String requireslabelE="(//input[@class='ng-pristine ng-valid'])[2]";
		
		public static String divisionE="(//div[@class='list-arrow']//i[@class='glyphicons play'])[2]";
		public static String divisiontextboxE="(//input[@class='ng-pristine ng-valid'])[3]";		
		public static String divisiontextE="//div[@class='list-item-container ng-scope']//div";
		
		public static String depE="(//div[@class='list-arrow']//i[@class='glyphicons play'])[3]";
		public static String deptextboxE="(//input[@class='ng-pristine ng-valid'])[3]";
		public static String deptextE="//div[@class='list-item-container ng-scope']//div";
		
		public static String calssE="(//div[@class='list-arrow']//i[@class='glyphicons play'])[4]";
		public static String classtextboxE="(//input[@class='ng-pristine ng-valid'])[3]";
		public static String classtextE="//div[@class='list-item-container ng-scope']//div";
				
		//**********PATH FOR PRODUCT FAIR************
		
		public static String productF="(//div[@class='growlstatus']//a)[2]";

		//**********PATH FOR PRODUCT POOR************
		
		public static String productP="(//div[@class='growlstatus']//a)[3]";

		//**********PATH FOR PRODUCT EFAIR************
		
		public static String productW="(//div[@class='growlstatus']//a)[4]";
		
		
		public static String notifyclose="//div[@class='growlstatus']//button";
		public static String condition="//div[@class='col-lg-8']";
		public static String type="(//div//select[@name='type'])[1]//option[@selected='selected']";
		public static String searchtext="//div[@class='col-lg-4 col-md-4']//input";
		public static String product="//span//a";
	    public static String printpricecheckbox="(//div//input[@class='ng-pristine ng-valid'])[1]";
		public static String requireslabelcheckbox="(//div//input[@class='ng-pristine ng-valid'])[2]";
		public static String homeicon="//li//a[@id='home']";
		public static String status="//div//input[@class='form-control']";
		
	}
	
	
	public static class Directreceipt
	{
		public static String product="//span//a";
		public static String search="(//a[contains(.,'Merchandising')]/..//a)[20]";
		//public static String productenquiryverify="//div[@id='center']//h2[@id='page-heading']";
		public static String productenquiry="//a[.='Product Enquiry']";
		public static String searchtext="//div[@class='col-lg-4 col-md-4']//input";
		public static String merchandising="//a[contains(text(),'Merchandising')]/..";
		public static String create="(//a[contains(.,'Create')])[2]";
		public static String directreceipt="//a[contains(.,'Direct Receipt')]";
		public static String recarrowclick="(//div//i[@class='glyphicons play'])[1]";
		public static String recsearchval="//div//input[@class='ng-pristine ng-valid']";
		public static String recslectlist="//div[@class='list-item-container ng-scope']//div";
		public static String vendorarrowclick="(//div//i[@class='glyphicons play'])[2]";
		public static String vendorsearchval="//input[@class='ng-pristine ng-valid']";
		public static String vendorselectlist="//div[@class='list-item-container ng-scope']//div";
		public static String receivedby="//select[@name='receivedById']";
		public static String vendordevnum="//input[@name='vendorDeliveryNumber']";
		public static String vendorinvnum="//input[@name='vendorInvoiceNumber']";
		public static String addicon="//span[@class='glyphicons glyph-btn plus']";
		public static String addproductarrow="//a[@class='select2-choice select2-default']";
		public static String refaddicon="(//div[@class='row buffer top']//td)[1]";
		public static String refarrow="(//div[@class='row buffer top']//div[@class='list-arrow'])[2]//i";
		public static String reftext="//div[@class='list-options ng-scope']//input";
		public static String refselect="(//div[@class='list-options ng-scope']//div[@class='list-item-container ng-scope'])//div";
		public static String refinput="//td//input[@class='form-control ng-pristine ng-valid ng-valid-required']";
		public static String textarea="//div[@class='form-group']//textarea";
		public static String productcode="//div[@class='select2-drop productResults select2-with-searchbox select2-drop-active']//input";
		public static String procomment="//td//input[@class='form-control ng-pristine ng-valid']";
		public static String productselect="//div[@id='select2-drop']//ul[@class='select2-results']//li//b";
		public static String qtyReceived="(//div[@id='directReceiptProductsGrid']//input)[3]";
		public static String tickmark="(//td[@class='component-controls']//span)[4]";
		
		
		public static String verifylocation="//td//a[.='COURTS CROSS ROADS']";
		public static String verifylocationcount1="(//tr//td//a[.='COURTS CROSS ROADS']/../..//td)[2]";
		public static String verifylocationcount2="(//tr//td//a[.='COURTS CROSS ROADS']/../..//td)[3]";
		
		//****************Jamaica*******************
		
//		public static String verifylocation="//td//a[.='COURTS (BELIZE CITY)']";
//		public static String verifylocationcount1="(//tr//td//a[.='COURTS (BELIZE CITY)']/../..//td)[2]";
//		public static String verifylocationcount2="(//tr//td//a[.='COURTS (BELIZE CITY)']/../..//td)[3]";
		
		//****************BELIZE****************
		
		/*public static String verifylocation="//td//a[.='COURTS MEGASTORE']";
		public static String verifylocationcount1="(//tr//td//a[.='COURTS MEGASTORE']/../..//td)[2]";
		public static String verifylocationcount2="(//tr//td//a[.='COURTS MEGASTORE']/../..//td)[3]";*/
		
		//******************TRINIDAD*********
		
		public static String verifyproductpage="//div//h2[.='Product Enquiry']";
		public static String verifysparepartpage="//div//h2[contains(.,'Spare Part Maintenance')]";
		public static String createdirectreceiptpage="//div//h2[contains(.,'Create Direct Receipt')]";
		public static String verifydirectpage="//div//h2[contains(.,'Direct Receipt')]";
		public static String createreceiptbut="//div//button[.='Create Receipt']";
		public static String verifyapprovepage="//div//h2[@id='page-heading']";
		public static String awaitingapprove="//div//p[.='Awaiting Approval']";
		public static String approvebut="//div//button[contains(.,'Approve')]";
		public static String printcostbut="(//div[@class='pull-right']//button)[1]";
		public static String auditconfirm="//div//h3";
		public static String okbutton="//div//button[.='OK']";
		public static String homeicon="//li//a[@id='home']";
		public static String refnumber="//div[@class='ref']";
	}
	
	public static class PointOfSales
	{
		public static String salesbut="//div[@class='nav-collapse navbar-inverse-collapse ng-scope']//li/a[.='Sales']";
		public static String pointofsalesbut="//li//a[.='Point of Sale']";
		public static String saleverify="//div[.='Sale']";
		public static String majorwhitegreen="//div[.='MAJOR WHITES']";
		public static String randaomproduct="(//span[@class='glyphicons cart_in'])[1]";
		public static String randaomproduct1="(//span[@class='glyphicons cart_in'])[2]";
		public static String resetbutton="//div//button[.='Reset']";
		public static String audiovisual="//div[.='AUDIO VISUAL']";
		public static String cellphoneorange="//div[.='CELLPHONES AND ACCESSORIES']";
		//public static String 12monthsblue="//div[.='12 MONTHS SERVICE PACKAGE']";
		public static String basketicon="//div//h4//span[@class='glyphicons cart_in']";
		public static String warrantyaddicon="(//div//span[@class='input-group-addon glyphicons bordered cart_in click'])[1]";
		public static String customer="(//div[@class='col-lg-3 col-md-3 no-margin no-pad']//button)[2]";
		public static String customeridtextbox="//div//input[@id='CustomerId']";
		public static String searchbutton="//div//button[@id='buttonSearch']";
		public static String selectcustomer="//table";
		public static String unlockbutton="//button[@id='buttonUnlock']";
		public static String clearbutton="//button[@id='buttonClear']";
		public static String basketbutton="//div[@class='col-lg-3 col-md-3 no-margin no-pad basket-button']";
		public static String getproductinbasket="//div[@class='form-control-static onlyLeftSidePadding col-lg-9 ng-binding']";
		public static String downarrow="//span[@class='glyphicons click bordered input-group-addon basket-btn col-lg-1 ng-scope down_arrow']";
		public static String deleteselectedproduct="(//span[@class='glyphicons input-group-addon bordered bin click basket-btn col-lg-1 ng-scope'])[1]";
		public static String discountdropdownarrow="//i[@class='glyphicons play']";
		public static String discounttextbox="//div[@class='list-search ng-scope']//input";
		public static String discounttextselectlist="(//div//div[@class='list-item-container ng-scope']//div)[1]";
		public static String addproducticon="//span[@class='input-group-addon glyphicons plus click ng-scope']";
		public static String discountpercentagetextbox="//div[@class='col-lg-2 col-md-2 has-error']//input";
		public static String discountaddicon="//span[@class='input-group-addon glyphicons bordered plus click']";
		public static String soldbydroparrow2="(//i[@class='glyphicons play'])[2]";
		public static String soldbydroparrow1="//i[@class='glyphicons play']";
		public static String soldbytextbox="//div[@class='list-search ng-scope']//input[@type='text']";		
		public static String soldbyselectlist="//div[@class='list-item-container ng-scope']//div";
		public static String soldbyjamaica="//div[@class='list-item-container ng-scope']//div[contains(.,'Jamaica 911')]";
		public static String paymentbutton="(//div[@class='col-lg-3 col-md-3 no-margin no-pad']//button)[3]";
	    public static String cashoption="(//div//button[@class='btn btn-default btn-lg btn-block ng-binding'])[1]";
		public static String paybutton="//div//button[@class='ok btn btn-lg btn-block btn-primary ng-scope']";
		public static String invoicenumber="//p[@id='invNo']";
		public static String verifyinvnumberpresent="//td[@class='text-right ng-scope']";
		public static String salecompleted="//div[@id='completedMsg']";
		public static String menubutton="//div[@class='col-lg-1 col-md-1 ']//button";
		public static String searchorder="//li[@class='dropdown ng-scope open']//a[.='Search Orders']";
		public static String verifysearchorder="//div//h1[.='Search Order']";
		public static String datefrom="//div[@class='col col-lg-10 no-sidePadding has-error']//input[@type='date']";
		public static String Todate="//div//input[@ng-model='searchObject.dateTo']";
		public static String dateto="//div[@class='col col-lg-9 no-sidePadding has-error']//input[@type='date']";
		public static String invoicefrom="//input[@id='invoiceNoFrom']";
		public static String invoiceto="//input[@id='invoiceNoTo']";
		public static String SOsearchbutton="//button[@id='buttonSearch']";//search order page
		public static String SOclearbutton="//button[@id='buttonClear']";
		public static String Basketunitcost="//div[@class='form-control-static ng-binding ng-scope']";
		public static String Baskettaxcost="//div[@class='form-control-static  ng-binding']";
		public static String Basketaddedqty="//input[@class='form-control text-center quantitySize ng-pristine ng-untouched ng-valid']";
		public static String Salestotalitem="//div[@class='col-sm-8 form-control-static amount text-right']//small[@id='itemsTotal']";
		public static String Saletotaltax="//div[@class='col-sm-8 form-control-static amount text-right']//small[@id='taxTotal']";
		public static String Saleduebalance="//p[@id='dueAmount']";
		public static String Saletotalbalance="//p[@id='balanceAmount']";
		public static String Tendered="//input[@id='tenderedAmount']";
		public static String verifyDiscountpervalue="//div[@class='form-control-static text-right ng-binding']";
		public static String discountunitcost="(//div[@class='form-control-static ng-binding'])[2]";
		public static String discounttaxcost="(//div[@class='form-control-static  ng-binding'])[2]";
		public static String homeicon="//li//a[@id='home']";
		
		
	}
	public static class manualreturn{
		public static String configurationtab="//a[.='Configuration']";
		public static String systemsetting="//a[.='System Settings']";
		public static String systemsettingheader="//h1[.='System Settings']";
		public static String sales="(//li//a[.='Sales'])[2]";
		public static String desc="//th[.='Description']";
		
		public static String countryname="//td[.='Country Name']";//Scroll Use
		public static String presentcountryname="((//td[.='Country Name']/..//td)[7]//div)[1]";
		public static String countrynameediticon="(//td[.='Country Name']/..//td//a)[1]";//pencil icon				
		public static String editcountrynametextbox="(//td[.='Country Name']/..//td)[7]//input";//edit
		public static String saveiconcountryname="(//td[.='Country Name']/..//td//a)[2]";//save icon
		public static String undoiconcountryname="(//td[.='Country Name']/..//td//a)[3]";//undo icon
		
		public static String currencysymbolname="//td[.='Curreny Symbol for print']";//Scroll USe
		public static String presentcurrency="((//td[.='Curreny Symbol for print']/..//td)[7]//div)[1]";
		public static String currencysymbolediticon="(//td[.='Curreny Symbol for print']/..//td//a)[1]";//pencil icon
		public static String editcurrencysymbol="(//td[.='Curreny Symbol for print']/..//td)[7]//input";//edit
		public static String saveiconcurrency="(//td[.='Curreny Symbol for print']/..//td//a)[2]";
		public static String undoiconcurrency="(//td[.='Curreny Symbol for print']/..//td//a)[3]";
		
		public static String companytaxnumber="//td[.='Company Tax Number']";
		public static String presenttaxnumber="((//td[.='Company Tax Number']/..//td)[7]//div)[1]";
		public static String taxnumberediticon="(//td[.='Company Tax Number']/..//td//a)[1]";//pencil icon
		public static String edittaxnumber="(//td[.='Company Tax Number']/..//td)[7]//textarea";//edit
		public static String saveicontaxnumber="(//td[.='Company Tax Number']/..//td//a)[2]";
		public static String undoicontaxnumber="(//td[.='Company Tax Number']/..//td//a)[3]";
		
		public static String Taxname="//td[.='Tax Name']";
		public static String presenttaxname="((//td[.='Tax Name']/..//td)[7]//div)[1]";
		public static String taxnameediticon="(//td[.='Tax Name']/..//td//a)[1]";//pencil icon
		public static String edittaxname="(//td[.='Tax Name']/..//td)[7]//input";//edit
		public static String saveicontaxname="(//td[.='Tax Name']/..//td//a)[2]";
		public static String undoicontaxname="(//td[.='Tax Name']/..//td//a)[3]";
		
		public static String returnreason="//td[.='Return/Exchange Reason']";
		public static String presentreturnreason="((//td[.='Return/Exchange Reason']/..//td)[7]//div)//li";
		public static String returnediticon="(//td[.='Return/Exchange Reason']/..//td//a)[1]";//pencil icon
		public static String editreturnreason="(//td[.='Return/Exchange Reason']/..//td)[7]//textarea";
		public static String firstreason="(((//td[.='Return/Exchange Reason']/..//td)[7]//div)//li)[1]";
		public static String saveiconreturnreason="(//td[.='Return/Exchange Reason']/..//td//a)[2]";
		public static String undoiconreturnreason="(//td[.='Return/Exchange Reason']/..//td//a)[3]";
			
		
		public static String dutyfree="//td[.='Is Duty Free Sale Allowed']";
		public static String presentdutyfreesales="((//td[.='Is Duty Free Sale Allowed']/..//td)[7]//div)[1]";
		public static String dutyfreeediticon="(//td[.='Is Duty Free Sale Allowed']/..//td//a)[1]";//pencil icon
		public static String editdutyfree="(//td[.='Is Duty Free Sale Allowed']/..//td)[7]//input";//edit click
		public static String saveicondutyfree="(//td[.='Is Duty Free Sale Allowed']/..//td//a)[2]";
		public static String undoicondutyfree="(//td[.='Is Duty Free Sale Allowed']/..//td//a)[3]";
		
		public static String soldbydroparrow="//i[@class='glyphicons play']";
		
		public static String manualreturnbutton="//button[contains(.,'Manual Return')]";
		public static String returnicon="//span[@id='retItemBtnMi8']";
		public static String reasondroparrow="(//i[@class='glyphicons play'])[1]";
		public static String reasonselecttext="//div[@class='list-search ng-scope']//input[@type='text']";
		public static String reasonselectlist="//div[@class='list-item-container ng-scope']//div";
		public static String reasonselectlistfirstname="(//div[@class='list-item-container ng-scope']//div)[1]";
		public static String authorizemanualreturn="//button[contains(.,'Authorise Manual Return')]";
		public static String dutyfreecheckbox="//label[@class='checkbox-inline ng-scope']";
		public static String taxfreecheckbox="//label[@class='checkbox-inline']";
		
		public static String user="(//div[@class='col-lg-8']//input)[1]";
		public static String pwd="(//div[@class='col-lg-8']//input)[2]";
		public static String authorise="(//div[@class='form-group']//button)[1]";
			
}
	public static class Exchangerate
	{
		
		public static String pointofsalesbut="//li//a[.='Point of Sale']";
		public static String exchangeratetab="//a[.='Exchange Rate']";
		public static String paymenttab="(//li//a[contains(.,'Payments')])[1]";
		public static String verifyheader="//div//h1";
		public static String addicon="//span[@class='glyphicons plus click glyph-btn ng-scope']";
		public static String currencydroparrow2="(//i[@class='glyphicons play'])[2]";
		public static String currencydroptextbox2="//div[@class='list-search ng-scope']//input";
		public static String currencydropselect2="(//div[@class='list-item-container ng-scope']//div)[1]";
		public static String rateinput="(//div//input[@type='text'])[2]";
		public static String datefrom="(//input[@type='date'])[2]";
		public static String saveicon="//span[@class='glyphicons floppy_disk click glyph-btn ng-scope']";
		public static String undoicon="//span[@class='glyphicons undo click glyph-btn ng-scope']";
		public static String currencydroparrow1="//i[@class='glyphicons play']";
		public static String currencytextbox1="//div[@class='list-search ng-scope']//input";
		public static String currencyselect1="(//div[@class='list-item-container ng-scope']//div)[1]";
		public static String effdate="//input[@id='effectiveDateInput']";
		public static String searchbutton="//button[@id='buttonSearchExchangeRate']";
		public static String currencydisplayed="((//tr[@class='ng-scope'])[1]//td)[2]//div";
		public static String Ratedisplayed="((//tr[@class='ng-scope'])[1]//td)[3]//div";
		public static String datedisplayed="((//tr[@class='ng-scope'])[1]//td)[4]//div";
		public static String verifyconversionpos="//div[@class='col-md-8 col-lg-offset-4 ng-binding ng-scope']";
		public static String foriengcashPOS="(//div[@class='col-md-3 no-margin ng-scope']//button)[2]";
		public static String currencydroparrowPOS="(//div[@class='list-arrow']//div)[1]";
		public static String currencytextboxPOS="//div[@class='list-search ng-scope']//input";
		public static String currencyselectPOS="(//div[@class='list-item-container ng-scope']//div)[1]";
		public static String Tenderedvalue="//div//input[@id='tenderedAmount']";
		public static String salesbut="//div[@class='nav-collapse navbar-inverse-collapse ng-scope']//li/a[.='Sales']";
		public static String POSsearchtextbox="//input[@id='searchString']"; 
		public static String selectproductPOS="//div//h4//span";
		public static String paymentbuttonPOS="(//div[@class='col-lg-3 col-md-3 no-margin no-pad']//button)[3]";
		public static String menubutton="//div[@class='col-lg-1 col-md-1 ']//button";
		public static String homeicon="//li//a[@id='home']";
	}
public static class discountlimit{
		
		public static String pointofsalesbut="//li//a[.='Point of Sale']";
		public static String salesbut="//div[@class='nav-collapse navbar-inverse-collapse ng-scope']//li/a[.='Sales']";
		public static String discountlimitsetupbutton="//li//a[.='Discount Limit Setup']";
		public static String addicon="//span[@class='glyphicons plus click glyph-btn ng-scope']";
		public static String brachdroparrow2="(//div//i[@class='glyphicons play'])[4]";
		public static String branchdroptextbox2="//div[@class='list-search ng-scope']//input";
		public static String branchdropselect2="(//div[@class='list-item-container ng-scope']//div)[1]";
		public static String limitpercentage="//input[@type='number']";
		public static String saveicon="//span[@title='Save']";
		public static String tablesearch="//tbody//tr//td";
		public static String deleteicon="(//span[@title='Delete'])[1]";
		public static String adminauthority="//div[@class='modal-header']//h3";
		public static String user="(//div[@class='col-lg-8']//input)[1]";
		public static String pwd="(//div[@class='col-lg-8']//input)[2]";
		public static String authorise="(//div[@class='form-group']//button)[1]";
		public static String deletepopup="(//div[@class='pull-right']//button)[1]";
		public static String purchasetextname1="h3[class='ng-binding']";
		public static String purchasetextname="//div[.='Purchasing']";
		public static String adminauthority1="h3[class='ng-binding']";
		public static String POSsearchtextbox="//input[@id='searchString']";
		public static String basketbutton="//div[@class='col-lg-3 col-md-3 no-margin no-pad basket-button']";
		public static String basketicon="//div//h4//span[@class='glyphicons cart_in']";
		public static String downarrow="//span[@class='glyphicons click bordered input-group-addon basket-btn col-lg-1 ng-scope down_arrow']";
		public static String discountdropdownarrow="//i[@class='glyphicons play']";
		public static String discounttextbox="//div[@class='list-search ng-scope']//input";
		public static String discounttextselectlist="(//div//div[@class='list-item-container ng-scope']//div)[1]";
		public static String discountpercentagetextbox="//div[@class='col-lg-2 col-md-2 has-error']//input";
		public static String discountaddicon="//span[@class='input-group-addon glyphicons bordered plus click']";
		public static String menubutton="//div[@class='col-lg-1 col-md-1 ']//button";
		public static String homeicon="//li//a[@id='home']";
		
		
	}
public static class paymentmethod
{
	public static String salesbut="//div[@class='nav-collapse navbar-inverse-collapse ng-scope']//li/a[.='Sales']";
	public static String pointofsalesbut="//li//a[.='Point of Sale']";
	public static String paymenttab="(//li//a[contains(.,'Payments')])[1]";
	public static String paymentnxttab="(//li[@class='dropdown ng-scope'])[5]";
	public static String paymentsetup="//li//a[.='Payment Methods Setup']";
	public static String verifypaymentsetuppage="//div[@class='col-md-8 ng-scope']//h1";
	public static String tablelist="//div[@class='col-md-8 ng-scope']//table//tbody//tr";
	//public static String tablelistselected="//td[@class='ng-binding']";
	//public static String tdd="//td/../td[2]";//checkbox list
	public static String tdd="//div[@class='col-md-8 ng-scope']//table//tbody//tr//td/../td[2]//input";
	public static String tddp="//td/../td[1]";//method name list
	public static String paymentoption="//div[@class='col-md-3 no-margin ng-scope']//button";
	//public static String cashcheckbox1="((//div[@class='col-md-8 ng-scope']//table//tbody//tr)[1]//input)[1]";
	public static String cashPOS="(//div[@id='payment-methods']//button)[1]";
	public static String POSsearchtextbox="//input[@id='searchString']";
	public static String selectproductPOS="//div//h4//span";
	public static String paymentbuttonPOS="(//div[@class='col-lg-3 col-md-3 no-margin no-pad']//button)[3]";
	public static String POScash="//div[@id='payment-methods']";
	public static String homeicon="//li//a[@id='home']";
	public static String menubutton="//div[@class='col-lg-1 col-md-1 ']//button";
	
}

	//***************VIVEK*************
	public static class toastMassage
{
 public static String Message_catch="//div[@id='growlcontainer']";
}

	public static class BuyerSalesHistoryReport
	{
		public static String Reports="(//a[contains(text(),'Reports')])[position()=5]";
		public static String BuyerSalesHistory="//a[contains(text(),'Buyer Sales History')]";
		public static String verifyBuyerSalesPage="//h2[@id='page-heading']";
		public static String searchWarehouse="//input[@class='ng-pristine ng-valid']";
		public static String KPI="//span[contains(text(),'Select a KPI')]";
		public static String searchKPI="//div[@class='list-search ng-scope']//input[@type='text']";
		public static String selectKPI="//div[@class='list-item ng-scope ng-binding']";
		public static String Location="//span[contains(text(),'Select a location')]";
		public static String searchLocation="//div[@class='list-search ng-scope']//input[@type='text']";
		public static String selectLocation="//div[@class='list-item ng-scope ng-binding']";
		public static String Division="(//span[contains(text(),'Any')])[position()=2]";
		public static String searchDivision="//div[@class='list-search ng-scope']//input[@type='text']";
		public static String selectDivision="//div[@class='list-item ng-scope ng-binding']";
		public static String search="//button[@id='buttonSearch']";
		public static String resultCount="//div[@class='alert alert-info ng-binding']";
		public static String hideShowButton="//button[contains(text(),'Hide/Show Columns')]";
		public static String reportColumn="//th[@class='hidable-col ng-scope ng-binding']";
		public static String cashPrice="(//label[@class='ng-binding'])[position()=9]//input";
		public static String popUpOk="//div[@class='modal-footer']//button[@class='btn btn-primary']";
		public static String skuNumber="(//a[@class='ng-binding'])[position()=1]";
		public static String print="//button[@id='buttonPrint']";
		public static String verifyPrint="//div[@class='row bottom header-info pb-report']/table/tbody";
	}
	
	public static class LocalProduct
	{
		public static String SearchSubMenu = "(//a[contains(text(),'Merchandising')]/..//a)[20]";
		public static String SrchProdEnquiry = "//a[contains(text(),'Product Enquiry')]";
		public static String VerifyProdEnquiry = "//h2[contains(text(),'Product Enquiry')]";
		public static String ProdStatus = "//ul[@class='facet-field list-unstyled']//li[@data-value='Non Active']";
		public static String ProdType = "//ul[@class='facet-field list-unstyled']//li[@data-value='RegularStock']";
		public static String firstProduct="(//div[@class='panel-heading']//span[@class='panel-title'])[position()=1]";
		public static String verifyLocalProduct="//div[@id='center']//h2";
		public static String PrintPriceTkt = "//div[@class='row']//div[@class='col-md-1']/input[@ng-model='vm.product.priceTicket']";
		public static String RequiresLabel = "//div[@class='row']//div[@class='col-md-1']/input[@ng-model='vm.product.labelRequired']";
		public static String AvlOnline = "//select[@class='form-control ng-pristine ng-valid']";
		public static String VendorCost = "//div[@class='col-md-4 currency']/input[@name='supplierCost']";
		public static String LandedCost = "//div[@class='col-md-4  currency']/input[@name='landedCost']";
		public static String Currency = "//div[@class='col-md-4']/select[@name='type']";
		public static String selectCurrency="//option[contains(text(),'USD')]";
		public static String costPriceSave="//input[@class='btn btn-primary']";
		public static String RtlPriceAdd = "//tr[@class='ng-pristine ng-invalid ng-invalid-required']//span[@class='glyphicons glyph-btn plus']";
		public static String clickEffDate = "//td[@class='currency has-error']//input[@name='effectiveDate']";
		public static String selectEffDate = "(//td[@data-handler='selectDay'])[position()=1]";
		public static String CashPrice = "//td[@class='currency has-error']/input[@ng-model='cashPriceInclusive']";
		public static String RegularPrice = "//td[@class='currency has-error']/input[@ng-model='regularPriceInclusive']";
		public static String DutyFreePrice = "//td[@class='currency long has-error']/input[@ng-model='dutyFreePriceInclusive']";
		public static String saveRetailPricing = "(//span[@class='glyphicons glyph-btn floppy_disk'])[2]";
	    public static String PTOverrideAdd = "//td[@class='col-btn']//span[@class='glyphicons glyph-btn plus']";
		public static String PTOName="//input[@name='name']";
		public static String PTORate="//input[@name='rate']";
		public static String PTOEffectDate="//input[@class='form-control text-center effectiveDate ng-pristine ng-valid ng-valid-required']";
		public static String PTOSave="(//span[@class='glyphicons glyph-btn floppy_disk'])[position()=1]";
		public static String status="(//div[contains(text(),'Status')]/..//select)[position()=1]";
			
	}
	public static class ServRqustFinancialReport
	{
		//public static String merchandising="//a[contains(text(),'Merchandising')]/..";
		//public static String merchandising="//a[text()='Service']/..";
		public static String Service ="//a[text()='Service']/..";
		public static String reports="(//a[text()='Reports'])[2]";
		public static String ServReqFinancial="//a[contains(text(),'Service Request Financial')]";
		public static String SRLabel="//div[@id='center']//h2";
		public static String fromDate="//input[@ng-model='filterParameters.dateFrom']";
		public static String fromMonth="//select[@class='ui-datepicker-month']";
		public static String fromYear="//select[@class='ui-datepicker-year']";
		public static String fromDay="(//a[contains(@class,'ui-state-default')])[1]";
		public static String ToDate="//input[@ng-model='filterParameters.dateTo'][1]";
		public static String ToMonth="//select[@class='ui-datepicker-month']";
		public static String ToYear="//select[@class='ui-datepicker-year']";
		public static String ToDay="(//a[contains(@class,'ui-state-default')])[1]";
		public static String toDate="//input[@ng-model='filterParameters.dateTo']";
		public static String productDepart="//span[contains(text(),'Product Department')]";
		public static String searchproductDepart="//input[@class='ng-pristine ng-valid']";
		public static String selectproductDepart="//div[@class='list-item ng-scope ng-binding'][1]";
		public static String run="//button[@id='buttonSearch']";
		public static String SRDatalabel="//th[contains(text(),'Service Request Number')]";
		public static String resultCount="//tr[@ng-repeat='row in data.rows']";
		public static String firstAmount="((//tr[@ng-repeat='row in data.rows'])[1]//td)[12]";
		public static String firstSrNum="((//tr[@ng-repeat='row in data.rows'])[1]//td)[2]";
		public static String secondAmount="((//tr[@ng-repeat='row in data.rows'])[2]//td)[12]";
		public static String secondSrNum="((//tr[@ng-repeat='row in data.rows'])[2]//td)[2]";
	}
	
	public static class OutstandingSRPerProdDept
	{
		
		public static String Service ="//a[text()='Service']/..";
		public static String reports="(//a[text()='Reports'])[2]";
		public static String OutstandingSR="//a[contains(text(),'Outstanding SRs Per Product')]";
		public static String SRLabel="//div[@id='center']//h2";
		public static String select="//span[contains(text(),'Select Status')]";
		public static String searchSelect="//input[@class='ng-pristine ng-valid']";
		public static String selectSelect="//div[@class='list-item ng-scope ng-binding'][1]"; 
		public static String fromDate="//input[@ng-model='dateFrom']";
		public static String fromMonth="//select[@class='ui-datepicker-month']";
		public static String fromYear="//select[@class='ui-datepicker-year']";
		public static String fromDay="(//a[contains(@class,'ui-state-default')])[1]";
		public static String ToDate="//input[@ng-model='dateTo']";
		public static String ToMonth="//select[@class='ui-datepicker-month']";
		public static String ToYear="//select[@class='ui-datepicker-year']";
		public static String ToDay="(//a[contains(@class,'ui-state-default')])[1]";
		public static String toDate="//input[@ng-model='filterParameters.dateTo']";
		public static String run="//button[@id='buttonSearch']";
		public static String noOfRecords="//tr[@class='text-center ng-scope']";
	
	}
	
	
	
	//***********************SANTOSH************
	
	public static class CreatePurchaseOrder {
		public static String Merchandising = "//li/a[contains(text(),'Merchandising')]";
		public static String Create = "//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String PurchaseOrder = "(//li//a[contains(.,'Purchase Order')])[1]";

		public static String VerifyCreatePurchaseOrderPage = "//div//h2[contains(.,'Create Purchase Order')]";
		public static String ReceivingLocation = "//list [@name='receivingLocation']//div[@class='list-arrow']";
		public static String RecevingLocationSearch = "//list [@name='receivingLocation']//div//input[@ng-model='search']";
		public static String RecevingLocationList = "//list [@name='receivingLocation']//div//div[@class='list-item-container ng-scope']//div";

		public static String Vendor = "//list [@name='vendor']//div[@class='list-arrow']";
		public static String VendorSearch = "//list [@name='vendor']//div[@class='list-options ng-scope']//input";
		public static String VendorList = "//list [@name='vendor']//div[@class='list-item-container ng-scope']//div";

		public static String RequestedDelivery = "//label[@for='requestedDeliveryDate']/..//input[@id='requestedDeliveryDate']";
		public static String RequestedDeliveryDate = "//label[@for='requestedDeliveryDate']/..//input[@id='requestedDeliveryDate']";

		public static String PaymentTerms = "//textarea[@name='paymentTerms']";
		public static String PaymentTermsText = "//textarea[@name='paymentTerms']";

		public static String AddProduct = "//div[@id='productsContainer']//tr[@class='addNew']//span[@class='glyphicons glyph-btn plus']";
		public static String ProductCode = "//div[@id='productsContainer']//tr//td[@class='sku']//span";
		public static String SKUSearch = "//div[@id='select2-drop']//input[@class='select2-input select2-focused']";
		public static String SKUList = "//ul[@class='select2-results']//div[@class='select2-result-label']";
		public static String ProductReciving = "(//input[@name='requestedDeliveryDate'])[2]";
		public static String ProductRecevingDate = "(//input[@name='requestedDeliveryDate'])[2]";

		public static String Quantity = "//td[@class='quantity']//input[@name='quantityOrdered']";
		public static String RequireLabel = "(//tr[@ng-form='productForm']//td//input[@ng-model='product.labelRequired'])[1]";
		public static String ProductComments = "//input[@name='comments']";

		public static String SavePO = "(//div[@id='productsContainer']//span[@class='glyphicons glyph-btn ok_2'])[1]";

		public static String CreatePO = "//button[contains(.,'Create Order')]";
		public static String POPrint = "(//button[@ng-click='printAlternate()'])[1]";
		public static String POSuccessMsg = "//div[@id='growlcontainer']//div[@class='growlstatus']";
		public static String VerifyPONumber = "//div[@id='center']//h2";
		public static String VerifyPrintPON = "//div[@class='document-id']//div//div[@class='ref']";
		public static String VerifyPrintPOCost = "//div[@class='larger']";
		public static String VeriyPOTotalCost = "//div[@id='totalTableContainer']//tr//td[@ng-show='isCreateMode()']";

	}

	public static class SearchPurchaseOrder {
		public static String merchandising = "//li/a[contains(text(),'Merchandising')]";
		public static String Search = "(//a[contains(.,'Merchandising')]/..//a)[20]";
		public static String PurchaseOrderSearchBox = "//li//a[contains(.,'Purchase Orders')]";
		public static String VerifySearchPOPage = "//div//h2[contains(.,'Purchase Order Search')]";
		public static String Searchbox = "//div//input[@id='searchString']";
		public static String PONumber = "//div//input[@class='text-search form-control ng-pristine ng-valid']";
		public static String POStatus = "//div[@class='Booking-Columnn panel-heading']//span[contains(.,'New')]";
	}
	
	//Service Spare Parts Reports
		public static class SpareParts
		{
			public static String Services="(//li//a[contains(text(),'Service')])[1]";
			public static String Reports="(//li//a[contains(text(),'Reports')]/..)[2]";
			public static String Spareparts="//li//a[contains(text(),'Spare Parts')]";
			
			public static String DDF="//input[@id='dp1584361074307']";
			public static String DeliverdDateFrom="(//div//input[@ui-date='linkDatePicker'])[1]";
			public static String DeliverdDateTo="(//div//input[@ui-date='linkDatePicker'])[2]";
			public static String Branch="//list[@name='listBranch']//div[@class='list-arrow']";
			public static String BranchSearch="//list[@name='listBranch']//div//input[@ng-model='search']";
			public static String BranchList="//list[@name='listBranch']//div//div[@class='list-item-container ng-scope']//div";
			public static String SparePartUsage="//list[@scope='SparePartUsage']//div[@class='list-arrow']";
			public static String SparePartUsageSearch="//list[@scope='SparePartUsage']//div//input[@ng-model='search']";
			public static String SparePartUsageList="//list[@scope='SparePartUsage']//div//div[@class='list-item-container ng-scope']//div";
			public static String PartSource="//list[@scope='PartSource']//div[@class='list-arrow']";
			public static String PartSourceSearch="//list[@scope='PartSource']//div//input";
			public static String PartSourceList="//list[@scope='PartSource']//div//div[@class='list-item-container ng-scope']//div";
			
			public static String Run="//button[@id='buttonSearch']";
			public static String Clear="//button[@id='buttonClear']";
			public static String Export="//button[@ng-click='exportResults()']";
					
		}
	
	public static class RegularStock
	{
		public static String merchandising="//li/a[contains(text(),'Merchandising')]";
		public static String create="//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String regularstock="//li//a[contains(text(),'Regular Stock')]";
		public static String verifyRegularstockPage="//div//h2[contains(text(),'Create Regular Stock')]";
		public static String SKU="//input[@name='sku']";
		public static String POSDescription="//div//textarea[@name='posDescription']";
		public static String CorporateUPC="//div//input[@name='corporateUPC']";
		public static String VendorModelNumber="//div//input[@name='vendorStyleLong']";
		public static String VendorWarrenty="//div//input[@name='vendorWarranty']";
		public static String Brand="//div//select[@name='brand']";
		public static String NumberOfBoxes="//div//input[@name='boxCount']";
		public static String CorporateStatusCode="//div//select[@name='skuStatus']";
		public static String LongDescription="//div//textarea[@name='longDescription']";
		public static String VendorUPC="//div//input[@name='vendorUPC']";
		public static String CountryOfOrigin="//div//input[@name='countryOfOrigin']";
		public static String PreviousModel="//div//input[@name='replacingTo']";
		public static String PrimaryVendor="//div//list[@name='primaryVendor']";
		public static String PrimaryVendorSearch="//div[@class='list-search ng-scope']//input[@type='text']";
		public static String PrimaryVendorClick="//div[@class='list-item-container ng-scope']//div";
		public static String SaveBTN="//button[contains(text(),'Save')]";
		public static String DuplicateProductMsg="//div[@class='growlstatus']";
		public static String DuplicateMsgClose="//div[@class='growlstatus']//button";
		public static String SuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		
	}
	
	public static class ProductDetails
	{
		public static String VerifySKU="//div[@id='center']//h2[@id='page-heading']";
		
		public static String PrintPriceTicket="//input[@ng-model='vm.product.priceTicket']";
		public static String RequiresLabel="//input[@ng-model='vm.product.labelRequired']";
		public static String PriceTcktSuccesMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		public static String RequiresLabelSuccesMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		
		
		
		public static String Division="//list[@id='hierarchy-00Q']//div[@class='list-arrow']";
		public static String DivisionSearch="//div[@class='list-search ng-scope']/input[@ng-model='search']";
		public static String DivisionClick="//list[@id='hierarchy-00Q']//div[@class='list-item-container ng-scope']//div";
		public static String DivisionSuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		public static String DuplicateMsgClose="//div[@class='growlstatus']//button";
		public static String Department="//list[@id='hierarchy-00T']//div[@class='list-arrow']";
		public static String DepartmentSearch="//div[@class='list-search ng-scope']/input[@ng-model='search']";
		public static String DepartmentClick="//list[@id='hierarchy-00T']//div[@class='list-item-container ng-scope']//div";
		public static String DepartmentSuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		
		public static String Class="//list[@id='hierarchy-00W']//div[@class='list-arrow']";
		public static String ClassSearch="//div[@class='list-search ng-scope']/input[@ng-model='search']";
		public static String ClassClick="//list[@id='hierarchy-00W']//div[@class='list-item-container ng-scope']//div";
		public static String ClassSuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		public static String SaveHirarchy="//div[@id='accordion']/../..//div[@class='row buffer top']//button[@ng-click='saveProduct()']";
		
		//New
		public static String ScrollFasia="(//tr//th[contains(.,'Fascia')])[1]";
		public static String AddTax="//pb-tax-rate-grid//td//span[@class='glyphicons glyph-btn plus']";
		public static String TaxName="//pb-tax-rate-grid//td//input[@ng-model='newRate.name']";
		public static String TaxRate="//pb-tax-rate-grid//td//input[@ng-model='newRate.rate']";
		public static String TaxEffectiveDate="//pb-tax-rate-grid//td//input[@ng-model='newRate.effectiveDate']";
		
		public static String SaveTax="//tr[@ng-form='taxRateForm']//td//span[@class='glyphicons glyph-btn floppy_disk']";
		public static String NewTaxSuccesMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		
		public static String ScrollAWC="(//div[contains(text(),'JMD')])[2]";
		
		public static String VendorCostClick="//div//input[@name='supplierCost']";
		public static String VendorCost="//div//input[@name='supplierCost']";
		public static String CurrencyClick="//select[@ng-model='costPrice.supplierCurrency']";
		public static String CurrencySelect="//select[@ng-model='costPrice.supplierCurrency']";
		public static String LastLandedCostClick="//div//input[@name='landedCost']";
		public static String LastLandedCost="//div//input[@name='landedCost']";
		public static String CostPricingSave="//ng-form[@name='costsForm']//div//input[@type='button']";
		public static String CostPriceSuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		
		
		public static String RetailpricingAddIcon="//tr[@ng-form='retailPriceForm']//span[@class='glyphicons glyph-btn plus']";
		
		public static String Location="//td[@class='location']//div[@class='list-container ng-scope']";
		public static String LocationSearch="//div[@class='list-search ng-scope']/input[@ng-model='search']";
		public static String LocationList="//list[@name='location']//div[@class='list-item-container ng-scope']//div";
		
		public static String Fasia="//list[@name='fascia']//div[@class='list-arrow']";
		public static String FasiaSearch="//list[@name='fascia']//div//input[@ng-model='search']";
		public static String FasiaList="//list[@name='fascia']//div//div[@class='list-item-container ng-scope']";
		
		
		public static String EffectivedateClick="//td[@class='currency has-error']//input[@name='effectiveDate']";
		public static String EDP="(//table[@class='ui-datepicker-calendar']//a)[1]";
		public static String EffectivedateCalenderDatePicker="(//table[@class='ui-datepicker-calendar']//td)[17]";
		
		public static String CashPriceClick="//td//input[@name='cashPriceInclusive']";
		public static String CashPrice="//td//input[@name='cashPriceInclusive']";
		public static String RegularPriceClick="//td//input[@name='regularPriceInclusive']";
		public static String RegularPrice="//td//input[@name='regularPriceInclusive']";
		public static String DutyPriceClick="//td//input[@name='dutyFreePriceInclusive']";
		public static String DutyPrice="//td//input[@name='dutyFreePriceInclusive']";
		public static String SaveRetailPricing="//tr[@ng-form='retailPriceForm']//td//span[@class='glyphicons glyph-btn floppy_disk']";
	
	    public static String RetailPriceMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		
	}
	public static class ProductEnquiry
	{
		public static String merchandising="//li/a[contains(text(),'Merchandising')]";
		public static String Search="(//a[contains(.,'Merchandising')]/..//a)[20]";
		public static String ProductEnquiry="//li//a[contains(.,'Product Enquiry')]";
		public static String VerifyProductEnquiryPage="//div//h2[contains(.,'Product Enquiry')]";
		public static String ProductSearch="//div//input[@id='searchString']";
		public static String SaveBTN="//div//h4[contains(.,'Stock')]";
		
		public static String ProductStatus="//div//label[contains(.,'Product Status')]//..//div//p[contains(.,'Non Active')]";	
	}
	public static class ServiceClaim
	{
		public static String Services="(//li//a[contains(text(),'Service')])[1]";
		public static String Reports="(//li//a[contains(text(),'Reports')]/..)[2]";
		public static String ServiceClaims="//li//a[contains(text(),'Service Claims')]";
		
		public static String DateLoggedFrom="//div//label[@for='dateLoggedFrom']/..//div//input";
		public static String DateLoggedTo="//div//label[@for='dateLoggedTo']/..//div//input";
		public static String DateResolvedFrom="//div//label[@for='dateResolvedFrom']/..//div//input";
		public static String DateResolvedTo="//div//label[@for='dateResolvedTo']/..//div//input";
		public static String PrimaryCharge="//label[@for='primaryCharge']/..//div//b";
		public static String PrimaryChargeSearch="//div[@class='select2-drop select2-with-searchbox select2-drop-active']//input";
		public static String PrimaryChargeList="//div[@class='select2-drop select2-with-searchbox select2-drop-active']//ul//li";
		public static String FYWCharged="//input[@id='fywCharged']";
		public static String SupplierCharged="//input[@id='supplierCharged']";
		public static String EWCharged="//input[@id='ewCharged']";
		public static String IncludeTechnicianReport="//input[@id='technicianReport']";
		public static String Run="//button[@id='buttonSearch']";
		public static String Export="//button[@ng-click='exportFile()']";
		public static String Clear="//button[@id='buttonClear']";
		public static String ReportEW="//div[@id='divResults']//table//tr";
		
	}
	
	//LOGISTICS 
	public static class Logistics
	{
		public static String Logistics="//li/a[contains(text(),'Logistics')]";
		public static String SearchShipments="//ul//li//a[contains(.,'Search Shipments')]";
		public static String Picking="//ul//li//a[contains(.,'Picking')]";
		public static String SearchPicklist="//ul//li//a[contains(.,'Search Pick Lists ')]";
		public static String Scheduling="//ul//li//a[contains(.,'Scheduling')]";
		public static String SearchDeliverySchedule="//ul//li//a[contains(.,'Search Delivery Schedules')]";
		public static String CustomerPickup="//ul//li//a[contains(.,'Customer Pick Up')]";
		
	}
	public static class SearchShipments
	{
		public static String ShipmentSearchBox="//input[@id='searchString']";
		public static String SearchShimpmentStatus="//span[@class='BookingStatus ng-binding']";
		public static String MoreResult="//span[@class='glyphicons more']";
		public static String StatusTable="//table[@class='table table-striped']";

		
		
	}
	public static class Picking
	{
		public static String SendingLocationClick="//div[@id='deliveryBranch_chzn']//div//b";
		public static String SendingLocationSearch="//div[@id='deliveryBranch_chzn']//div[@class='chzn-search']//input";
		public static String SendingLocationList="//div[@id='deliveryBranch_chzn']//ul//li";
		public static String TypeClick="//div[@id='type_chzn']//div//b";
		public static String TypeSearch="//div[@id='type_chzn']//div[@class='chzn-search']//input";
		public static String TypeList="//div[@id='type_chzn']//ul//li";
		public static String RecevingLocation="//div[@id='receivingLocation_chzn']//div//b";
		public static String RecevingLocationSearch="//div[@id='receivingLocation_chzn']//div//input";
		public static String RecevingLocationList="//div[@id='receivingLocation_chzn']//div//ul//li";
		public static String search="//div//button[contains(.,'Search')]";
		public static String ScrollToShipment="//div//label[contains(.,'Stock On Hand')]";
		public static String ShipmentPick="//tr//td//span[@class='glyphicons chevron-right']";
		public static String Driver="//div[@id='trucks_chzn']//div//b";
		public static String DriverSearch="//div[@id='trucks_chzn']//div//input";
		public static String DriverList="//div[@id='trucks_chzn']//div//ul//li";
		public static String PrintByTruck="//button[@id='printByTruck']";
		public static String PickingSuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		public static String ExternalLink="//a[@class='external-link']";
		public static String PickListNumber="//div[@class='document-id']//div//div[@class='ref']";
		public static String Ok="//button[@class='ok btn btn-primary']";
		
	}
	public static class SearchPickList
	{
		public static String SearchPicklistTxtbox="//div//input[@id='searchString']";
		public static String PickListNumberLink="//div//a[@class='refLink ng-binding']";
		public static String PickedOnDate="//input[@id='pickedOn']";
		public static String pickeddroparrow="//div[@id='s2id_pickedBy']//b";
		public static String pickedtextbox="(//div[@class='select2-search']//input)[2]";
		public static String pickedselect="(//ul//li//div)[1]";
		public static String checkedby="//div[@id='s2id_checkedBy']//b";
		public static String checkedtextbox="(//div[@class='select2-search']//input)[2]";
		public static String checkedselect="(//ul//li//div)[1]";
		public static String ShipmentComment="//textarea[@id='ItemNotes']";
		public static String Save="//button[@id='save']";
		public static String PickingRejectionStaus="(//table[@id='pickingItems']//td//div)[24]";
		

	}
	
	public static class Scheduling
	{
		public static String DeliveryBranch="//div[@id='deliveryBranch_chzn']//div//b";
		public static String DeliveryBranchSearch="//div[@id='deliveryBranch_chzn']//div[@class='chzn-search']//input";
		public static String DeliveryBranchList="//div[@id='deliveryBranch_chzn']//ul//li";
		public static String Truck="//div[@id='trucks_chzn']//div//b";
		public static String TruckSearch="//*[@id=\"trucks_chzn\"]/div/div/input";
		public static String TruckList="//*[@id=\"trucks_chzn\"]/div//ul//li";
		public static String Type="//select[@id='type']";
		public static String CreateDeliverySchedule="//button[@id='createDeliverySchedule']";
		public static String Comment="//textarea[@class='itemNotes']";
		public static String Save="//a[@id='saveDeliverySchedule']";
		public static String DeliveryScheduleLink="//a[@class='external-link']";
		public static String Ok="//button[@class='ok btn btn-primary']";
		public static String ReceiptDeliveryScheduleNumber="//div[@class='ref']";
		//Regection
		public static String Rejection="//div[@class='rejectItem']//div//b";
		public static String RejectionSearch="//div[@class='rejectItem']//div//input";
		public static String RejectionList="//div[@class='rejectItem']//div//ul//li";
		public static String RejectionOK="//button[@class='ok btn btn-primary']";
		
	}
	
	public static class SearchDeliverySchedules
	{
		public static String SearchBox="//input[@id='searchString']";
		public static String DeliveryStatus="//div[@class='status ng-binding']";
		public static String ScheduleNumberLink="//div[@class='Booking-Columnn panel-heading']//a[@class='refLink ng-binding']";
		public static String ConfirmationDate="(//input[@class='form-control date date-picker hasDatepicker'])[1]";
		public static String ConfirmDate="//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']//a";
		public static String Confirm="//button[@class='btn btn-default confirm-delivery single-click']";
	}
	public static class Exception
	{
		public static String ExceptionLink="//td[@class='childLink']//a";
		public static String ResolveException="//button[@class='btn btn-danger btn-block showException']";
		public static String DateClick="//input[@class='resolveDate form-control hasDatepicker']";
		public static String SelectDate="//td[@class='  ui-datepicker-today']//a";
		public static String Time="(//select[@title='Select time'])[1]";
		public static String Resolve="(//button[@class='btn btn-primary btnResolve'])[1]";
		public static String Scroll="//button[@class='btn btn-danger btn-block showException']";
		public static String NM="(//div[@class='noCases']//b)[2]";
		
	}
	public static class TechnicanDairy
	{
		public static String Services="//li/a[contains(text(),'Service')]";
		public static String TechnicianDairy="//li//a[contains(.,'Technician Diary')]";
		public static String TechnicianName="//div[@id='s2id_autogen1']//div//b";
		public static String TechnicianNameSearch="//div[@id='select2-drop']//div//input";
		public static String TechnicianList="//div[@id='select2-drop']//ul//li";
		public static String Date="//div[@class='col-lg-4 DateStartSelection']//input";
		public static String TD="//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']//a";
		public static String VisibleWeeks="//div[@class='col-lg-4 WeeksNumberSelection']//input";
		public static String AvailbleFromDate="(//input[@class='form-control ng-pristine ng-valid hasDatepicker'])[1]";
		public static String AvailbleToDate="(//input[@class='form-control ng-pristine ng-valid hasDatepicker'])[1]";
		public static String ASubmit="//div[@class='col-lg-2 text-right']//button";
		public static String color="(//tr[@ng-repeat='slot in day.slots']//td[@class='fixed holidayApproved click'])[1]";
		
	}
	public static class Suppliers
	{
		public static String Services="//li/a[contains(text(),'Service')]";
		public static String Suppliers="//li//a[contains(.,'Suppliers')]";
		public static String Add="//td[@class='actions']//a[@class='glyphicons glyph-btn action-new plus']";
		public static String SupplierTextbox="//input[@id='Supplier']";
		public static String SupplierSave="//td//a[@class='glyphicons glyph-btn action-update floppy_disk']";
		public static String SupplierSuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
		public static String SupplierSearchtbox="//div//input[@id='s_Supplier']";
		public static String Search="//div//button[@type='submit']";
		public static String VerifyCmpnyName="//tbody//td[contains(.,'Godrej')]";
		public static String Edit="//a[@class='glyphicons glyph-btn action-edit pencil']";
		public static String Delete="(//tbody//td//a[@class='glyphicons glyph-btn action-delete bin'])[2]";
		public static String DeleteBtn="//button[contains(.,'Delete')]";
		
	}
	
	public static class SupplierContractualCost
	{
		public static String Services="//li/a[contains(text(),'Service')]";
		public static String SupplierContractualCost="//li//a[contains(.,'Supplier Contractual Costs')]";
		public static String Supplier="//div[@id='s2id_autogen1']//div//b";
		public static String SupplierSearch="//div[@class='select2-search']//input";
		public static String SupplierList="//div[@id='select2-drop']//ul//li";
		public static String RowNumbers="//div//input[@class='form-control ng-pristine ng-valid ng-valid-number']";
		public static String Addrow="//div//button[contains(.,'Add Rows')]";
		public static String Save="//div//button[contains(.,'Save')]";
		public static String Product="//td//input[@ng-model='cost.product']";
		public static String PartType="//td//input[@ng-model='cost.partType']";
		public static String PartPercent="//td//input[@ng-model='cost.partPcent']";
		public static String PartValue="//td//input[@ng-model='cost.partVal']";
		public static String LabourPercent="//td//input[@ng-model='cost.labourPcent']";
		public static String LabourValue="//td//input[@ng-model='cost.labourVal']";
		public static String AddPercent="//td//input[@ng-model='cost.additionalPcent']";
		public static String AddtionalValue="//td//input[@ng-model='cost.additionalVal']";
		public static String Delete="//td//a[@class='action-delete-date halflings trash']";
		public static String SupplierSuccessMsg="//div[@id='growlcontainer']//div[@class='growlstatus']";
	}
	
	
	
	
	
	//***********Vincy****************
	public static class StockAllocation
	{
		public static String stockAllocation ="//a[contains(text(),'Combo')]//../..//a[contains(text(),'Stock Allocation')]";
		public static String verifyStockAllocPage ="//h2[contains(text(),'Create Stock Allocation')]";
		public static String WarehouseDrpDwn ="//div[@class='list-container ng-scope']//div[@class='list-arrow']";
		public static String WarehouseSrch ="//input[@class='ng-pristine ng-valid']";
		public static String WarehousenName ="//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String WarehouseCmnts ="//textarea[@id='comments']";
		public static String AddBtn ="//span[@class='glyphicons glyph-btn plus']";
		public static String ReceivingLocDrpDwn = "//div[@class='list-container ng-scope']//div[@class='list-arrow']";
		public static String ReceivingLocSrch = "//div[@class='list-search ng-scope']//input[@class='ng-pristine ng-valid']";
		public static String ReceivingLocName = "//div[@class='list-item ng-scope ng-binding']";
		public static String ProductcodeDrpDwn = "//div[@id='s2id_productSku']";
		public static String ProductCodeSrch = "//div[@class='select2-search']/input";
		public static String ProductCodeName = "//ul[@class='select2-results']//div[@class='select2-result-label']/table/tbody/tr/td/b";
		public static String ProductDesc = "//tr[@class='ng-scope ng-invalid ng-invalid-required ng-dirty']/td[5]";
		public static String QuantityAvl = "//tr[@class='ng-scope ng-invalid ng-invalid-required ng-dirty']/td[6]";
		public static String AvgWeighCost = "//tr[@class='ng-scope ng-dirty ng-valid ng-valid-required']//td[8]";
		public static String LineCost = "//tr[@class='ng-scope ng-dirty ng-valid ng-valid-required']//td[9]";
		public static String SuccMessage = "//div[@id='growlcontainer']";
		public static String ShipmentID = "//td[@class='text-right']";
		public static String Quantity = "//input[@id='quantity']";
		public static String SaveAllocProd = "//span[@class='glyphicons glyph-btn ok_2']";
		public static String SaveButton = "//button[@class='btn btn-primary']";
		public static String Search = "//li[@class='dropdown-submenu'][2]//a[contains(text(),'Search')]";
		public static String SrchStckAllocs = "//a[contains(text(), 'Stock Allocations')]";
		public static String CreatedForm = "//input[@name='createdFrom']";
		public static String ProdSrchBtn = "//div[@class='pull-right']//button[@class='btn btn-primary']";
		
	}
	
	public static class StockRequisitionProcess
	{
		public static String stockRequisition ="//a[contains(text(),'Combo')]//../..//a[contains(text(),'Stock Requisition')]";
		public static String verifyStockRequisition ="//h2[contains(text(),'Create Stock Requisition')]";
		public static String RecLocDrpDown ="//list[@name='receivingLocations']//div[@class='list-container ng-scope']//div[@class='list-arrow']";
		public static String RecLocSrch ="//input[@class='ng-pristine ng-valid']";
		public static String RecLocName ="//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String WarehouseDro = "//list[@name='warehouses']//div[@class='list-container ng-scope']//div[@class='list-arrow']";
		public static String WarehouseSearch = "//div[@class='list-search ng-scope']//input[@class='ng-pristine ng-valid']";
		public static String WarehouseName = "//div[contains(text(),'LUCKY DOLLAR MAY PEN')]";
		public static String DescSRP = "//tr[@class='ng-scope']//td[3][@class='ng-binding']";
		public static String ProductDrp = "//div[@class='select2-container ng-pristine ng-valid']//b";
		public static String CommentsSRP = "//div[@class='form-control-static']//span[@class='ng-binding']";
		public static String AvgWeighCostSRP = "//tr[@class='ng-scope']//td[5][@class='ng-binding']";
		public static String LineCostSRP = "//tr[@class='ng-scope']//td[7]";
		public static String SuccMsgSRP = "//div[@id='growlcontainer']";
		public static String ShipmentIdSRP = "//td[@class='text-right']";
		public static String ProductSrch = "//div[@class='select2-search']/input";
		public static String Productname = "//ul[@class='select2-results']//div[@class='select2-result-label']/table/tbody/tr/td/b";
		public static String ProductQty = "//input[@id='quantity']";
		public static String ProductCmnts = "//input[@id='productComments']";
		public static String AddButton = "//span[@class='glyphicons btn-icon plus']";
		public static String SKUnumb = "//tr[@class='ng-scope']//td[2]//a[@class='ng-binding']";
		public static String SaveBtn = "//div[@class='pull-right']//button[@class='btn btn-primary']";
		public static String SrchStockRequisitions = "//a[contains(text(), 'Stock Requisitions')]";
		public static String StockReqCreatedForm = "//input[@name='createdFrom']";
		public static String StockReqSrchbtn = "//div[@class='pull-right']//button[@class='btn btn-primary']";
	}
	
	public static class VendorReturns
	{
		public static String SrchBtn = "//li[@class='ng-scope dropdown-submenu'][2]//a[contains(text(),'Search')]";
		public static String CreateGoodsReceipt = "//a[contains(text(),'Goods Receipts')]";
		public static String VerifyGoodsReceipt = "//h2[contains(text(),'Goods Receipt Search')]";
		public static String SrchTextBox = "//input[@id='searchString']";
		public static String GoodsReceiptLink = "//div[@class='col-lg-6'][2]//a[@class='refLink ng-binding']";
		public static String GoodsTitle = "//h2[@id='page-heading']";
		public static String CreateVendorBtn = "//button[contains(text(),'Create Vendor Return')]";
		public static String CreateVendorPage = "//h2[contains(text(),'Create Vendor Return')]";
		public static String DocRefNum = "(//div[@class='col-lg-3']//input[@type='text'])[1]";
		public static String SuccMsgVenReturn = "//div[@id='growlcontainer']";
		public static String SuccMsgApp = "//div[@id='growlcontainer']";
		public static String TitleNumb = "//h2[@id='page-heading']";
		public static String VendorID = "//div[@class='form-group']//input[@name='minVendorReturnId']";
		public static String QtyReturned = "//input[@name='quantityReturned']";
		public static String Comments = "//input[@name='comments']";
		public static String CreateBtn = "//div[@class='pull-right']/button[@class='btn btn-primary']";
		public static String VendorReturnPage = "//h2[@id='page-heading']";
		public static String ApproveBtn = "//button[@class='btn btn-default'][3]";
		public static String PrintWithCost = "//button[@class='btn btn-default'][2]";
		public static String VendorSrchId = "//a[@class='ng-binding'][2]";
		public static String SrchVendReturns = "//a[contains(text(),'Vendor Returns')]";
		public static String VendorSrch = "//div[@class='pull-right']//button[text()='Search']";
		public static String StatusVR = "//tr[@class='ng-scope']/child::td[2]";
		public static String CreatedDateVR = "//tr[@class='ng-scope']/child::td[3]";
		public static String StandardVR = "//tr[@class='ng-scope']/child::td[6]";
		public static String TotCostVR = "//tr[@class='ng-scope']/child::td[8]";
		public static String VendorVR = "//tr[@class='ng-scope']/child::td[4]";
		public static String SendingLocVR = "//tr[@class='ng-scope']/child::td[5]";
		public static String GoodsReceiptID = "//tr[@class='ng-scope']/child::td[7]";
		public static String GoodsLink = "//div[@class='col-lg-6'][2]//a[@class='refLink ng-binding']";
		
	}
	
	public static class SparePartsCreation
	{
		public static String SparePart="//a[contains(@href,'/Cosacs/Merchandising/SparePart')]";
		public static String verifySparePartpage="//div[@id='center']//h2";
		public static String POSDescription="//div[@class='col-md-8']//textarea[@name='posDescription']";
		public static String LongDescription="//div[@class='col-md-8']//textarea[@name='longDescription']";
		public static String PartNumber="//div[@class='col-md-8']//input[@name='corporateUPC']";
		public static String VendorModelNumber="//div[@class='col-md-8']//input[@name='vendorStyleLong']";
		public static String CountryOfOrigin="//div[@class='col-md-8']//input[@name='countryOfOrigin']";
		public static String PrimaryVendor="//div[@class='col-md-8']//span[contains(text(),'Select a Vendor')]";
		public static String searchPrimaryVendor="//div[@class='list-search ng-scope']//input";
		public static String PrimaryVendorselect="//div[@class='list-item-container ng-scope']//div[@class='list-item ng-scope ng-binding']";
		public static String saveSparePart="//button[@class='btn btn-primary']";
		public static String SKU="(//div[@class='col-md-8']//p[@class='form-control-static ng-binding'])[position()=1]";
		public static String SearchSubMenu = "(//a[contains(text(),'Merchandising')]/..//a)[20]";
		public static String SrchProdEnquiry = "//a[contains(text(),'Product Enquiry')]";
		public static String searchFields="//input[@id='searchString']";
		public static String verifyProduct="//a[@class='ng-binding']";
		public static String productStatus="(//p[@class='ng-binding'])[position()=2]";
		}

	public static class SetProduct
	{
		public static String setProduct ="//a[contains(text(),'Combo')]//../..//a[contains(text(),'Set')]";
		public static String verifySetProduct = "//h2[contains(text(),'Create Set')]";
		public static String SetProdDesc = "//input[@name='longDescription']";
		public static String CheckBox = "//input[@name='priceTicket']";
		public static String SaveBtn = "//div[@class='col-lg-4']/button[@class='btn btn-primary pull-right']";
		public static String HierDiv = "//list[@id='hierarchy-00A']//div[@class='list-arrow']";
		public static String HierDept = "//list[@id='hierarchy-00D']//div[@class='list-arrow']";
		public static String HierClasss = "//list[@id='hierarchy-00G']//div[@class='list-arrow']";
		public static String AddTags = "//div[@class='input-group']/input[@name='tag_']";
		public static String AddButton = "//button[@class='btn btn-default btn-fixed taglist']";
		public static String AddProdBtn = "//td[@class='component-controls']//span[@class='glyphicons glyph-btn plus']";
		public static String SetProdDrpDown = "//a[@class='select2-choice select2-default']/div/b";
		public static String SetProdSrch = "//div[@class='select2-search']/input";
		public static String SetProdName = "//ul[@class='select2-results']//div[@class='select2-result-label']/table/tbody/tr/td/b";
		public static String EffecDate = "//input[@id='effectiveDate']";
		public static String AddBtnClick = "//button[@name='addLocation']";
		public static String FasciaDrpDwn = "//list[@name='fascia']/div[@class='list-container ng-scope']/div[@class='list-arrow']";
		public static String FasciaNameVal = "(//div[contains(text(),'Courts')])[1]";
		public static String SaveBtnSet = "//button[@class='btn btn-primary pull-right']";
		public static String AddProd2 = "//div[@id='s2id_autogen5']//div/b";
		public static String AddProdSrch2 = "(//div[@class='select2-search']/input)[3]";
		public static String SetProdName2 = "//ul[@class='select2-results']//div[@class='select2-result-label']/table/tbody/tr/td/b";
		public static String ProdEditIcon = "(//span[@class='glyphicons glyph-btn pencil'])[3]";
		public static String ProdsAddBtn = "//span[@class='glyphicons glyph-btn ok_2']";
		
		
	}
	
	public static class ServiceRepairs
	{
		public static String Service = "(//ul[@class='nav navbar-nav'])/li[7]";
		public static String NewServReq = "//a[contains(text(),'New Service Request')]";
		public static String ServReqTitle = "//h2[@id='service-heading']";
		public static String StockRepairRB = "//input[@id='s']";
		public static String ServReqCreateBtn = "//button[@class='btn btn-primary ng-binding']";
		public static String SRhierDiv = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[1]";
		public static String SRhierDept = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[2]";
		public static String SRhierClass = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[3]";
		public static String ItemNumb = "//input[@id='ItemNumber']";
		public static String ItemNumSrch = "//div[@class='col-lg-1 halflings search click']";
		public static String MatchingStck = "//div[@class='glyphicons check click']";
		public static String Manufacture = "//div[@id='s2id_Manufacturer']//div/b";
		public static String SaveBtn = "//button[@class='btn btn-primary save']";
		public static String StrSecCol = "(//span[@class='ng-binding'])[1]";
		public static String Date = "(//div[@class='col-lg-6'])[45]";
		public static String DateReceiPic = "//table[@class='ui-datepicker-calendar']//tbody/tr[4]/td/a[contains(text(),'26')]";
		public static String DatePart = "//input[@id='AllocationPartExpectOn']";
		public static String DateRecSchd = "//input[@id='dp1584449484146']";
		public static String Category = "//div[@id='s2id_autogen14']//div/b";
		public static String TechDrpDwn = "//div[@id='s2id_techy']//div/b";
		public static String TimeSlot1 = "(//td[@class='text-center ng-scope']//td[@class='fixed click'])[1]";
		public static String TimeSlot2 = "(//td[@class='text-center ng-scope']//td[@class='fixed click'])[2]";
		public static String SerialNumb = "//input[@id='ItemSerialNumber']";
		public static String RepairType = "//div[@id='s2id_RepairType']//div/b";
		public static String Resolution = "//div[@id='s2id_Resolution']//div/b";
		public static String AddPart = "//a[@id='addPart']";
		public static String APitemTxt = "//input[@id='itemNo']";
		public static String APitemSrchIcon = "//div[@class='halflings search click']";
		public static String APMatchStck = "//div[@class='glyphicons check click']";
		public static String APQuantity = "//input[@id='part-quantity']";
		public static String AddPartButton = "(//button[@class='btn btn-primary'])[3]";
		public static String ReplacementIssueChkBox = "(//input[@id='replacementIssued'])";
		public static String ReasonForExchange = "(//div[@id='s2id_ReasonForExchange'])//div/b";
		public static String ReasonForExchangeVal = "//div[contains(text(),'Exchange  - Item delivered damaged')]";
		public static String ReasonForFailure = "(//div[@id='s2id_FinalisedFailure'])//div/b";
		public static String ReasonForFailureVal = "//div[contains(text(),'Damage On Delivery')]";
		public static String ReturnDate = "(//input[@id='FinaliseReturnDate'])";
		public static String ReturnDatePick = "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td/a[contains(text(),'26')]";
		public static String CommentsServRepairs = "//textarea[@id='Comment']";
		public static String SaveCmntBtn = "(//button[@class='btn btn-primary'])[4]";
		
	}
	public static class WarrantySimulator
	{
		public static String WarrantyLink = "(//a[contains(text(),'Warranty')])[1]";
		public static String WarrantySimulator = "//a[contains(text(),'Warranty Simulator')]";
		public static String WarntySimulatorTitle = "//h2[contains(text(),'Warranty Simulator')]";
		public static String WrntyItem = "//input[@id='product']";
		public static String WrntyLocation = "(//div[@class='list-container ng-scope'])[3]/div[@class='list-arrow']";
		public static String WarrantyLocName = "//div[contains(text(),'202 LUCKY DOLLAR RED')]";
		public static String WarrantySrchButton = "//button[@class='btn btn-primary']";
		public static String ProdNum1 = "(//tr[@class='ng-scope'])[1]/td[1]";
		public static String ProdDesc1 = "(//tr[@class='ng-scope'])[1]/td[2]";
		public static String ProdRetailPrice1 = "(//tr[@class='ng-scope'])[1]/td[3]";
		public static String WarrantyProdPrice1 = "(//tr[@class='ng-scope'])[1]/td[4]";
		public static String Link1 = "(//tr[@class='ng-scope'])[1]/td[5]/a[@class='ng-binding']";
		public static String Warranty1 = "(//tr[@class='ng-scope'])[1]/td[6]";
		public static String WarrantyLength1 = "(//tr[@class='ng-scope'])[1]/td[7]";
		public static String WarrantyTax1 =	"(//tr[@class='ng-scope'])[1]/td[8]";
		public static String WarrantyPrice = "(//tr[@class='ng-scope'])[1]/td[9]";
		public static String Free1 = "(//tr[@class='ng-scope'])[1]/td[10]";
		public static String ProotionLink1 = "(//tr[@class='ng-scope'])[1]/td[11]";
		public static String PromotionPrice = "(//tr[@class='ng-scope'])[1]/td[12]";
		public static String PromotionMatchType = "(//tr[@class='ng-scope'])[1]/td[13]";
				
	}
	
	public static class WarrantyPromotions
	{
		public static String WarrantyLink = "(//a[contains(text(),'Warranty')])[1]";
		public static String WarrantyPromotions = "//a[contains(text(),'Warranty Promotions')]";
		public static String WarntyPromotionsTitle = "//h2[contains(text(),'Warranty Promotions')]";
		public static String WarrantyPromotionName = "//input[@id='searchName']";
		public static String StoreTypeVal = "(//div[contains(text(),'Courts Store')])[1]";
		public static String StoreLocation = "(//div[@class='select2-container ng-valid ng-dirty'])[2]//div/b";
		public static String LocationVal = "//div[contains(text(),'121 TROPIGAS BZE')]";
		public static String FromEffDate = "//input[@id='filterEffectiveDateStart']";
		public static String FromEffDateVal = "//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td/a[contains(text(),'14')]";
		public static String ToEffDate = "//input[@id='filterEffectiveDateEnd']";
		public static String ToEffDateVal = "//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td/a[contains(text(),'14')]";
		public static String SearchButton = "//button[@class='btn btn-primary']";
		public static String AddButton = "//a[@class='glyphicons glyph-btn action-new plus']";
		public static String WarrantyDrpDwn = "//div[@class='select2-container ng-pristine ng-valid']//div/b";
		public static String WarrantySrchName = "//div[@id='select2-drop']/div/input[@type='text']";
		public static String WarrantyName = "(//table[@class='warrantyResults'])[1]//tr/td/b";
		public static String CourtsStore = "(//div[@class='select2-container ng-valid ng-dirty'])[3]//div/b";
		public static String CourtsStoreVal = "//div[contains(text(),'Courts Store')]";
		public static String StartDate = "//input[@id='promotionStartDate']";
		public static String StartDatePick = "//div[@id='ui-datepicker-div']//tbody/tr/td/a[contains(text(),'14')]";
		public static String EndDate = "//input[@id='promotionEndDate']";
		public static String EndDatePick = "//div[@id='ui-datepicker-div']//tbody/tr/td/a[contains(text(),'14')]";
		public static String PromotionDrpDwn = "//div[@class='select2-container ng-invalid ng-invalid-required ng-dirty']//div/b";
		public static String Promotionval = "//div[contains(text(),'Percentage Discount')]";
		public static String DiscountTextBox = "//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-number percentage']";
		public static String SaveBtnWarranty = "//a[@class='glyphicons glyph-btn action save floppy_disk click']";
		public static String SuccMsgWarrantyPromo = "//div[@id='growlcontainer']";
		public static String Filters = "(//td[@class='filters'])[1]";
		public static String StartDatePromo = "(//td[@class='date ng-binding'])[1]";
		public static String EndDatePromo = "(//td[@class='date ng-binding'])[2]";
		public static String PromotionPriceValue = "(//td[@class='price ng-binding'])[1]";
		
		
		
	}
	
	
	public static class WarrantyProductLink
	{
		public static String WarrantyLink = "(//a[contains(text(),'Warranty')])[1]";
		public static String WarrantyProductLink = "//a[contains(text(),'Warranty/Product Link')]";
		public static String WarntyProdTitle = "//h2[contains(text(),'Warranty/Product Link')]";
		public static String AddNewBtn = "//button[@id='new']";
		public static String NameTextBox = "//div[@class='col-lg-3 has-error']/input[@type='text']";
		public static String Effdate = "//div[@class='col-lg-3 has-error']";
		public static String EffDatePic = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(text(),'14')]";
		public static String ProdAddBtn = "(//span[@class='ui-widget click glyphicons action-new plus'])[1]";
		public static String Division = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[1]";
		public static String DivName = "//div[contains(text(),'AFFINITY')]";
		public static String Department = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[2]";
		public static String DeptName = "//div[contains(text(),'ADMIN CHARGES')]";
		public static String Class = "(//div[@class='list-container ng-scope']//div[@class='list-arrow'])[3]";
		public static String ClassName = "//div[contains(text(),'10 PORC PROCESSING FEE')]";
		public static String StoreType = "(//a[@class='select2-choice select2-default']//div/b)[1]";
		public static String StoreTypeName = "(//div[contains(text(),'Courts Store')])[1]";
		public static String Location = "(//div[@class='select2-container picklist ng-valid ng-dirty'])[2]//div/b";
		public static String LocationName = "//div[contains(text(),'92 LUCKY DOLLAR MAY INK')]";
		public static String ProdSaveBtn = "(//div[@class='form-control-static text-center']/span[@class='action click save glyph-btn glyphicons floppy_save text-danger'])[1]";
		public static String AssocWrntyAddBtn = "(//span[@class='ui-widget glyphicons click action-new plus'])[1]";
		public static String WarrantyDrpdwn = "(//div[@class='select2-container picklist ng-pristine ng-valid ng-valid-required'])[1]//div/b";
		public static String WarrantySrchname = "//div[@id='select2-drop']/div/input[@type='text']";
		public static String WarrantyValue = "(//table[@class='warrantyResults'])[1]/tbody/tr/td";
		public static String MinVal = "(//div[@class='has-error'])[1]/input[@type='number']";
		public static String MaxVal = "(//div[@class='has-error'])[2]/input[@type='number']";
		public static String AssocSaveBtn = "(//span[@class='action click save glyph-btn glyphicons floppy_save text-danger'])[2]";
		public static String DetailSaveBtn = "(//div[@class='form-horizontal']//span[@title='Save Details'])[1]";
	}
	public static class WarrantyCodeInstantReplacement
	{
		public static String Warranty = "(//a[contains(text(),'Warranty')])[1]";
		public static String CreateWarranty = "//a[contains(text(),'Create Warranty')]";
		public static String PageTitle = "//h2[@id='page-heading']";
		public static String ItemNum = "//input[@id='Number']";
		public static String Description = "//input[@id='Description']";
		public static String LengthMonths = "//input[@id='Length']";
		public static String InstantReplacement = "//input[@id='InstantReplacement']";
		public static String Department = "//div[@class='list-container ng-scope']//div[@class='list-arrow']";
		public static String DeptName = "//div[contains(text(),'Electrical')]";
		public static String SaveContinueBtn = "(//button[@class='btn btn-primary'])[2]";
		public static String SuccMessageWarranty = "//div[@id='growlcontainer']";
		public static String SearchWarranty = "//a[contains(text(),'Search Warranties')]";
		public static String PageTitleSearch = "//h2[contains(text(),'Search Warranty')]";
		public static String SrchString = "//input[@id='searchString']";
		public static String WarrantyLink = "//div[@class='col-lg-2']/a[@class='warranty-id refLink ng-binding']";
		public static String ItemNumFree = "//input[@id='Number']";
		public static String DescriptionFree = "//input[@id='Description']";
		public static String LengthMonthsFree = "//input[@id='Length']";
		public static String DepartmentFree = "//div[@class='list-container ng-scope']//div[@class='list-arrow']";
		public static String DeptNameFree = "//div[contains(text(),'Electrical')]";
		public static String Free = "//input[@id='Free']";
	}
	
	public static class InternalInstallation
	{
		public static String Service = "(//ul[@class='nav navbar-nav'])/li[7]";
		public static String NewServReq = "//a[contains(text(),'New Service Request')]";
		public static String ServReqTitle = "//h2[@id='service-heading']";
		public static String InternalInstallRB = "//input[@id='ii']";
		public static String SrchParameter = "//div[@id='s2id_autogen1']//div/b";
		public static String ParameterVal = "//div[contains(text(),'Customer Number')]";
		public static String ParamaterValTxtBox = "//input[@id='customerSearch']";
		public static String ServReqCreateBtn = "//button[@class='btn btn-primary ng-binding']";
		public static String SelectBtn = "//btn[@id='0_Select']";
		public static String AddressLine2 = "//input[@id='CustomerAddressLine2']";
		public static String Manufacturer = "//div[@class='select2-container picklist ng-invalid ng-invalid-required ng-dirty']//div/b";
		public static String ManufactureVal = "//div[contains(text(),'Acer')]";
		public static String SaveBtn = "//button[@class='btn btn-primary save']";
		public static String DateRecived = "//input[@id='AllocationItemReceivedOn']";
		public static String DateReceivedPick = "//table[@class='ui-datepicker-calendar']//tbody/tr/td/a[contains(text(),'4')]";
		public static String DateExpected = "//input[@id='AllocationPartExpectOn']";
		public static String DateExpectedPick = "//table[@class='ui-datepicker-calendar']//tbody/tr/td/a[contains(text(),'4')]";
		public static String DateServSchedule = "(//input[@class='form-control ng-pristine ng-valid hasDatepicker'])[4]";
		public static String DateServSchdPick = "//table[@class='ui-datepicker-calendar']//tbody/tr/td/a[contains(text(),'4')]";
		public static String CategoryInterInsta = "(//div[@class='select2-container picklist ng-valid ng-dirty'])[5]//div/b";
		public static String CategoryVal = "//div[contains(text(),'BROWN GOODS')]";
		public static String TechnicianDrpDown = "(//div[@class='select2-container picklist ng-valid ng-dirty'])[6]//div/b";
		public static String TechnicianVal = "//div[contains(text(),'AYON  WARREN (3804)')]";
		public static String Time1 = "(//tr[@class='ng-scope'])[13]/td[@class='fixed click']";
		public static String Time2 = "(//tr[@class='ng-scope'])[14]/td[@class='fixed click']";
		public static String Res_SerialNum = "//input[@id='ItemSerialNumber']";
		public static String Res_RepairType = "//div[@id='s2id_RepairType']//div/b";
		public static String Res_RepairTypeVal = "//div[contains(text(),'In branch assessmen')]";
		public static String ResolutionDrpDown = "//div[@id='s2id_Resolution']//div/b";
		public static String ResolutionVal = "//div[contains(text(),'Damage On Delivery')]";
		public static String DateResolved = "//input[@id='ResolutionDate']";
		public static String DateResolvedPick = "//table[@class='ui-datepicker-calendar']//tbody/tr/td/a[contains(text(),'4')]";
		public static String AddPartBtn = "//a[@id='addPart']";
		public static String SrchIcon = "//span[@class='input-group-addon halflings search click']";
		public static String MatchStockItemVal = "//input[@id='itemNo']";
		public static String MatchStckSrchIcon = "//div[@class='halflings search click']";
			
	}
	
	//************************VENKAT******
	


	public static class SalesComparison
	{
		public static String merchandising="//a[text()='Merchandising']";
		public static String Reports="//*[@id=\"mainMenu\"]/li[10]/ul/li[4]/a";
		public static String SalesComparison="//a[text()='Sales Comparison']";
		public static String PeriodEnd="//list[@name='periodId']//div[@class='list-arrow']";
		public static String PeriodSearch="//list[@name='periodId']//input[@class='ng-pristine ng-valid']";
		public static String PeriodData="//div[contains(text(),'Period 10, 31 Jan 2020')]";
		public static String Location="//list[@name='locationId']//div[@class='list-arrow']";
		public static String LocationSearch="//list[@name='locationId']//input[@class='ng-pristine ng-valid']";
		public static String LocationData="//div[text()='LUCKY DOLLAR MAY PEN']";

		public static String Brand="//list[@name='brand']//div[@class='list-arrow']";
		public static String BrandSearch="//list[@name='brand']//input[@class='ng-pristine ng-valid']";
		public static String BrandData="//div[text()='Absolute Distributors']";

		public static String Divison="list[@name='hierarchy']//div[@class='list-arrow']";
		public static String DivisonSearch="list[@name='hierarchy']//div[@class='ng-pristine ng-valid']";
		public static String DivisonData="//div[text()='AFFINITY']";
		public static String FinancialYear="//input[@name='financialYear']";
		public static String ProductTags="//input[@name='tag_']";

		public static String Search="//button[text()='Search']";
		public static String Print="//button[text()='Print']";
		public static String Export="//button[text()='Export']";
	}


	public static class NewNonStockCreation
	{
		public static String NonStocks="//a[contains(text(),'Non Stocks')]";
		public static String NewNonStocks="//a[contains(text(),'New Non-Stock')]";
		public static String VerifyNonStoctDetailspage="//h1[contains(text(),'Non-Stock Details')]";
		public static String SKU="//input[@id='SKU']";
		public static String Type="//list[@id='type']//div[@class='list-arrow']";
		public static String TypeSearch="//*[@id=\"type\"]/div[3]/div[1]/input";
		public static String TypeData="//div[contains(text(),'Installation')]";
		public static String VendorUPC="//input[@name='VendorUPC']";
		public static String ShorDescription="//input[@name='ShortDescription']";
		public static String LongDescription="//input[@name='LongDescription']";
		public static String TaxRate="//input[@name='TaxRate']";
		public static String Divison="//list[@id='hierarchyLevel_0']//div[@class='list-arrow']";
		public static String DivisonSearch="//*[@id=\"hierarchyLevel_0\"]/div[3]/div[1]/input";
		public static String DivisonData="//div[contains(text(),'COMPUTER AND OFFICE')]";
		public static String Department="//list[@id='hierarchyLevel_1']//div[@class='list-arrow']";
		public static String DepartmentSearch="//*[@id=\"hierarchyLevel_1\"]/div[3]/div[1]/input";
		public static String DepartmentData="//div[contains(text(),'COMPUTER AND ACCESSORIES')]";
		public static String Class="//list[@id='hierarchyLevel_2']//div[@class='list-arrow']";
		public static String ClassSearch="//*[@id=\"hierarchyLevel_2\"]/div[3]/div[1]/input";
		public static String ClassData="//div[contains(text(),'PRINTER')]";
		public static String SaveButton="(//button[contains(text(),'Save')])[1]";
		//public static String SaveandContinueButton="//button[text()='Save and Continue']";
		public static String Logoutbutton="//a[@id='logoff']";
		
	}
	public static class SearchNonStocks
	{
		public static String NonStocks="//a[contains(text(),'Non Stocks')]";
		public static String SearchNonStocks="//a[contains(text(),'Search Non-Stocks')]";
		public static String SearchBox="//input[@id='searchString']";
		public static String ThreeDots="//*[@id=\"resultsContainer\"]/div/div/div[3]/span";
		public static String Plusbutton="(//div[@class='ui-widget glyphicons plus'])[1]";
		public static String Fascia="(//span[contains(text(),'Fascia')])[1]";
		public static String FasciaSearch="//*[@id=\"resultsContainer\"]/div/div/article/table[1]/tbody/tr[2]/td[2]/div/list/div[3]/div[1]/input";
		public static String FasciaData="//div[text()='Courts Store']";
		public static String Barnch="(//span[contains(text(),'Branch')])[1]";
		public static String BranchSearch="//*[@id=\"resultsContainer\"]/div/div/article/table[1]/tbody/tr[2]/td[3]/div/list/div[3]/div[1]/input";
		public static String BranchData="//div[contains(text(),'910 COURTS CROSS ROADS')]";
		public static String CostPrice="(//input[@type='number'])[1]";
		public static String RetailPrice="(//input[@type='number'])[2]";
		public static String SaveButton="(//span[@title='Save'])[1]";
		public static String Logoutbutton="//a[@id='logoff']";
		

	}

	public static class NonStockProductLink
	{
		public static String NonStock="//a[text()='Non Stocks']";
		public static String NonStockProductLinks="//a[text()='Non-Stocks/Product Link']";
		public static String AddNewButton="//button[contains(text(),'Add New')]";
		public static String Name="//div[@class='col-lg-3 has-error']//input[@type='text']";

		public static String Plusbutton1="(//span[@class='glyph-btn glyphicons plus'])[1]";
		public static String Divison="(//list[@name='newHierarchyLevel']//div[@class='list-arrow'])[1]";
		public static String DivisonSearch="//list[@name='newHierarchyLevel']//input[@type='text']";
		public static String DivisonData="//div[text()='COMPUTER AND OFFICE']";
		public static String Department="(//list[@name='newHierarchyLevel']//div[@class='list-arrow'])[2]";
		public static String DepartmentSearch="//list[@name='newHierarchyLevel']//input[@type='text']";
		public static String DepartmentData="//div[contains(text(),'COMPUTER AND ACCESSORIES')]";
		public static String Class="(//list[@name='newHierarchyLevel']//div[@class='list-arrow'])[3]";
		public static String ClassSearch="//list[@name='newHierarchyLevel']//input[@type='text']";
		public static String ClassData="//div[text()='PRINTER']";
		public static String SaveButton1="(//span[@class='glyph-btn glyphicons floppy_save'])[1]";

		public static String plusbutton2="(//span[@class='glyph-btn glyphicons plus'])[2]";
		public static String NonStockDropDown="(//list[@name='newNonStock']//div[@class='list-arrow'])[1]";
		public static String NonStockDropDownSearch="//*[@id=\"newNonStock\"]/div[3]/div[1]/input";
		public static String NonStockDropDownData="//div[text()='40209 - OPTIPLUS OP-225 SPORT COR PIXMA 3010 - CANON PIXMA 3010 AIO PRINTE']";
		public static String SaveButton2="(//span[@class='glyph-btn glyphicons floppy_save'])[2]";

		public static String SaveButtonDisble="(//span[@title='Save Details'])[1]";
		public static String Logoutbutton="//a[@id='logoff']";
	}



	public static class NonStockPromotions
	{
		public static String NonStocks="//a[text()='Non Stocks']";
		public static String NonStockProomotions="//a[contains(text(),'Non-Stock Promotions')]";
		public static String PlusButton="//a[@class='glyphicons glyph-btn plus']";
		public static String NonStock="//span[contains(text(),'Non Stock')]"; 
		public static String NonStockSearch="//*[@id=\"body\"]/div/article/div/div/section/ng-include/table/tfoot/tr[2]/td[2]/section[1]/div/div[2]/list/div[3]/div[1]/input";
		public static String NonStockData="//div[contains(text(),'40209 - OPTIPLUS OP-225 SPORT COR PIXMA 3010 - CANON PIXMA 3010 AIO PRINTE')]";
		public static String Fascia="(//span[contains(text(),'Fascia')])[2]"; 
		public static String FasciaSearch="//*[@id=\"body\"]/div/article/div/div/section/ng-include/table/tfoot/tr[2]/td[2]/section[2]/div[1]/list/div[3]/div[1]/input";
		public static String FasciaData="//div[contains(text(),'Courts Store')]";
		public static String Branch="(//span[contains(text(),'Branch')])[2]"; 
		public static String BranchSearch="//*[@id=\"body\"]/div/article/div/div/section/ng-include/table/tfoot/tr[2]/td[2]/section[2]/div[2]/list/div[3]/div[1]/input";
		public static String BranchData="//div[text()='910 COURTS CROSS ROADS']";
		public static String PromotionType="//span[contains(text(),'Promotion Type')]"; 
		public static String PromotionTypeSearch="//*[@id=\"body\"]/div/article/div/div/section/ng-include/table/tfoot/tr[2]/td[5]/div[1]/list/div[3]/div[1]/input";
		public static String PromotionData="//div[contains(text(),'Percentage Discount')]";
		public static String Discount="//input[@type='number']";
		public static String SaveButton="(//a[@title='Save'])[1]";
		public static String Logoutbutton="//a[@id='logoff']";

	}




	public static class NonStocksExports
	{
		public static String NonStock="//a[text()='Non Stocks']";
		public static String NonStocksExportLink="//a[contains(text(),'Non-Stocks Export')]";
		public static String VerifyNonStockExport="//h1[contains(text(),'Non-Stocks Export')]";
		public static String DownloadProductAssociationFile="//a[contains(text(),'Download Product Associations File')]";
		public static String Logoutbutton="//a[@id='logoff']";
	}



	public static class SearchMyJobs
	{
		public static String Service="//a[text()='Service']";
		public static String Searchmyjobslink="//a[contains(text(),'Search My Jobs')]";
		public static String VerifySearchMyJobsPage="//h2[contains(text(),'Search My Jobs')]";
		public static String FromDate="//input[@id='TechAllocatedDateSearchFrom']";
		public static String ToDate="//input[@id='TechAllocatedDateSearchTo']";
		public static String StatusValue="//li[contains(text(),'Awaiting repair')]";
		public static String TypeValue="//li[contains(text(),'Service Request Internal')]";
		public static String SearchTextBox="//input[@id='searchString']";      
		public static String RequestValue="//a[contains(text(),'2082203')]";
		public static String VerifyServiceRequest="//h2[contains(text(),'Service Request')]//span[text()='2082203']";
		public static String VerifyBranch="//p[contains(text(),'650 COURTS PORT ANTONIO')]";
		public static String VerifyRequestType="//p[contains(text(),'Internal Customer')]";
		public static String VerifyAccountNumber="//p[contains(text(),'650088363171')]";
		public static String Logoutbutton="//a[@id='logoff']";

	}

	public static class TechnicianPayments
	{
		public static String Service="//a[text()='Service']";
		public static String TechnicianPaymentslink="//a[contains(text(),'Technician Payments')]";
		public static String VerifyTechnicianPayments="//h2[contains(text(),'Technician Payments')]";
		public static String SelectButton="//a[contains(text(),'AUTOMATIC EXCHANGE')]//parent::td//preceding-sibling::td//button[text()='Select']";
		//public static String PaymentsFor="//input[@id='paymentsFrom']";
		public static String PaymentsTo="//input[@id='paymentsTo']";
		public static String StatusFilter="//span[contains(text(),'All')]";
		public static String StatusFilterSearch="(//div[@class='select2-search']//parent::div//input[@type='text'])[1]";
		public static String StatusFilterData="//span[contains(text(),'Pending')]";
		public static String SearchButton="//button[contains(text(),'Search')]";
		public static String Checkbox="(//input[@type='checkbox'])[3]";
		public static String PayButton="//button[contains(text(),'Pay')]";

		public static String ClearButton="//button[contains(text(),'Clear')]";
		public static String PaymentsTo2="//input[@id='paymentsTo']";
		public static String StatusFilter2="//span[contains(text(),'All')]";
		public static String StatusFilterSearch2="(//div[@class='select2-search']//parent::div//input[@type='text'])[1]";
		public static String StatusFilterData2="//span[contains(text(),'Paid')]";
		public static String SearchButton2="//button[contains(text(),'Search')]";

		public static String ClearButton3="//button[contains(text(),'Clear')]";
		public static String PaymentsTo3="//input[@id='paymentsTo']";
		public static String StatusFilter3="//span[contains(text(),'All')]";
		public static String StatusFilterSearch3="(//div[@class='select2-search']//parent::div//input[@type='text'])[1]";
		public static String StatusFilterData3="//span[contains(text(),'Deleted')]";
		public static String SearchButton3="//button[contains(text(),'Search')]";
		public static String Logoutbutton="//a[@id='logoff']";

	}


	public static class ServiceIncomeAnalysis
	{
		public static String Service="//a[text()='Service']";
        public static String Reportslink="(//a[text()='Reports'])[2]";
        public static String ServiceIncomeAnalysis="//a[text()='Service Income Analysis']";
        public static String VerifyServiceIncomeAnalysis="//h2[text()='Technical Service Income and Margin Analysis Report']";
        public static String Run="//button[text()='Run']";
        public static String Export="//button[text()='Export']";

        
	}
	
	public static class CustomerPickUp
	{
		public static String logistics = "//a[contains(text(),'Logistics')]";
		public static String customerPickup = "//li[@class='ng-scope']//a[contains(text(),'Customer Pick Up')] ";
		public static String ArrowdeliveryBranch = "(//div[@id='deliveryBranch_chzn']//div)[1]";
		public static String SearchdeliveryBranch = "//div[@class='chzn-search']/input";
		public static String SelectdeliveryBranch = "//ul[@class='chzn-results']/li";
		public static String printReturn = "(//div[@class='col-lg-2 pull-right']//button[contains(text(),'Print Return Note')] )[1] ";
		public static String newPickUpLink = "//a[@class='external-link']";
		public static String ReturnNote = "//div[@class='ref']";
		public static String confirmpickUpNote = "//div[@class='col-lg-2 pull-right']//button[text()='Confirm']";
		public static String searchShipment="//a[contains(text(),'Search Shipments')]";
		public static String okBTN =  "//button[@class= 'ok btn btn-primary']";
		public static String search =  "//input[@class='text-search form-control ng-pristine ng-valid']";
		public static String status ="//span[@class='label label-default status ng-binding']";
	}
	
	public static class Logo
	{
		public static String logo =  "//div[@class='logo']";
	}
	
	public static class PoisonPrevention
	{
		public static String merchandising="//a[contains(text(),'Merchandising')]/..";
		public static String create="//li[@class='ng-scope dropdown-submenu']//a[contains(text(),'Create')]";
		public static String regularStock="//a[contains(text(),'Combo')]//../..//a[contains(text(),'regularStock')]";
		
	}


	
	public static class WeeklyTradingReport
	{
		public static String Merchandsing="//a[text()='Merchandising']";
		public static String Reports="(//a[text()='Reports'])[5]";
		public static String WTR="//a[text()='Weekly Trading Report']";
		public static String VerifyWTR="//h2[text()='Weekly Trading Report']";
		public static String Date="//input[@name='exportDate']";
		public static String Export="//button[text()='Export']";
        
	}
	



}

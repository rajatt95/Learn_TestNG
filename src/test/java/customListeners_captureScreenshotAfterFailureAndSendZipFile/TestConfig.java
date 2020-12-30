package customListeners_captureScreenshotAfterFailureAndSendZipFile;

public class TestConfig {

	public static String server = "smtp.gmail.com";

	public static String from = "rajatvermaa80@gmail.com";
	public static String password = "febilmbsmmggmail80";

	public static String[] to = { "gautyverma@gmail.com", "rajatvermaa95@gmail.com", "rajatvermaa80@gmail.com" };
	/*
	 * public static String[] to = { "rajatvermaa95@gmail@gmail.com",
	 * "jyotivermaa96@gmail.com" };
	 */
	public static String subject = "Test Report";

	public static String messageBody = "TestMessage";
	public static String attachmentPath = System.getProperty("user.dir") + "//Reports.zip";
	/*
	 * public static String attachmentPath =
	 * "c:\\screenshot\\2017_10_3_14_49_9.jpg";
	 */
	/* public static String attachmentName = "error.jpg"; */
	public static String attachmentName = "reports.zip";
}
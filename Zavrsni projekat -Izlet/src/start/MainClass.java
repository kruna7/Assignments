package start;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.objects.HomePage;
import page.tests.DashboardTest;
import page.tests.HomePageTest;

public class MainClass {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		try {
			HomePage.openHomePage(driver);

			System.out.println("Izaberite opciju koju zelite (ukucajte redni broj opcije):");
			System.out.println("1. Login sa podacima koje unosite preko konzole.");
			System.out.println("2. Login sa podacima prve osobe iz tabele.");
			System.out.println("3. Test za login za sve osobe iz tabele. Daje podatke o broju uspesno ulogovanih.");
			System.out.println("4. Registracija sa podacima koje unosite preko konzole i automatski login.");
			System.out.println("5. Pokusaj registracije svih korisnika iz tabele, bez povratnih informacija o uspesnosti testa.");
			System.out.println("6. Test koji registruje, a zatim pokusava login za sve korisnike iz tabele.");
			System.out.println("7. Login sa kredencijalima prve osobe iz tabele i objavljivanje svih objava iz tabele.");
			System.out.println("8. Login sa kredencijalima prve osobe iz tabele i objavljivanje objave sa kustomizovanim podacima.");
			System.out.println("9. Brisanje poslednjih objava. Moguce izabrati koliko objava zelite da obrisete.");
			System.out.println("10. Menjanje poslednjeg posta koji je korisnik uneo.");
			Scanner sc = new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1:
				HomePageTest.fillLoginScanner(driver);
			case 2:
				HomePageTest.fillLoginForm(driver, 1); 
				break;
			case 3:
				HomePageTest.testWADLogin(driver);
				break;
			case 4:
				HomePageTest.fillRegistrationScanner(driver);
				break;
			case 5:
				HomePageTest.testWADRegistration(driver);
				break;
			case 6:
				HomePageTest.testWADRegLog(driver);
				break;
			case 7:
				HomePageTest.fillLoginForm(driver, 1); // neophodno je prvo da se ulogujemo kako bi objavljivali
				DashboardTest.postALL(driver); 
				break;
			case 8:
				HomePageTest.fillLoginForm(driver, 1); 
				DashboardTest.fillPostScanner(driver);
				break;
			case 9:
				HomePageTest.fillLoginForm(driver, 1);
				DashboardTest.deletePost(driver);
				break;
			case 10:
				HomePageTest.fillLoginForm(driver, 1);
				DashboardTest.editPost(driver);
				break;
			default:
				System.out.println("Uneli ste nevazeci broj.");
				break;
			}
			sc.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			Thread.sleep(10000);
			driver.close();
		}
	}

}

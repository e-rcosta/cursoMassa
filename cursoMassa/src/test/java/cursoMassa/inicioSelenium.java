package cursoMassa;

import org.openqa.selenium.chrome.ChromeDriver;

public class inicioSelenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4004864\\Rosangela\\Cursos\\GerenciadorMassa\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}
}

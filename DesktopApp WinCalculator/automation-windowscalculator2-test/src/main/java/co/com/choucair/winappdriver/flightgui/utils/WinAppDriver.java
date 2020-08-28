package co.com.choucair.winappdriver.flightgui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Logger;
/**
 * <h1>Open WinAppDriver</h1>
 * <p>Esta clase fue modificada</p>
 * @version: 1.0
 * @author: lvanegasm (Luis Angel Vanegas Martinez)
 * @version: 1.0
 * @since: 24/06/2020
 */


public class WinAppDriver {
    private static final String KILL = "taskkill /F /IM ";
    private static final String TASK_LIST = "tasklist";
    private static final String EXECUTABLE = "WinAppDriver";
    private static WebDriver driver = null;
    private static DesiredCapabilities capabilities;
    private static final ResourceBundle drivermanagerProperties = ResourceBundle.getBundle("winappdriver");

    private WinAppDriver() {
    }

    public static void openDriver() {
        if (isProcessRunning(EXECUTABLE)) {
            killProcess(EXECUTABLE);
        }

        try {
            String path = drivermanagerProperties.getString("rutaDriver");
            Desktop desktop;
            desktop = Desktop.getDesktop();
            File pathWinAppDriver = new File(path);
            desktop.open(pathWinAppDriver);
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }

    }

    public static WebDriver openApp() {
        try {
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", drivermanagerProperties.getString("appRoute"));
            capabilities.setCapability("platformName", drivermanagerProperties.getString("platformName"));
            driver = new RemoteWebDriver(new URL(drivermanagerProperties.getString("driverDomain")), capabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }



    public static void killProcess(String serviceName) {
        try {
            Runtime.getRuntime().exec(KILL + serviceName);
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }

    }

    public static boolean isProcessRunning(String serviceName) {

        try {
            Process process = Runtime.getRuntime().exec(TASK_LIST);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(serviceName)) {
                    return true;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }


        return false;
    }

}

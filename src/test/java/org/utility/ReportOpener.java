package org.utility;

import org.testng.IExecutionListener;
import org.testng.annotations.AfterSuite;
import java.awt.Desktop;
import java.io.File;
import java.net.URI;

public class ReportOpener implements IExecutionListener {

    @Override
    public void onExecutionStart() {
        System.out.println("execution starts ");
    }

    @Override
    public void onExecutionFinish() {

            try {
                File report = new File("test-output/emailable-report.html");
                if (!report.exists()) {
                    System.out.println("[ReportOpener] Report not found at: " + report.getAbsolutePath());
                    return;
                }

                URI uri = report.toURI();

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().browse(uri);
                    return;
                }

                // Fallback for environments without Desktop support
                String os = System.getProperty("os.name").toLowerCase();
                if (os.contains("mac")) {
                    new ProcessBuilder("open", uri.toString()).start();
                } else if (os.contains("nux")) {
                    new ProcessBuilder("xdg-open", uri.toString()).start();
                } else if (os.contains("win")) {
                    new ProcessBuilder("rundll32", "url.dll,FileProtocolHandler", uri.toString()).start();
                }
            } catch (Exception e) {
                System.out.println("[ReportOpener] Could not open report automatically: " + e.getMessage());
            }

    }

}

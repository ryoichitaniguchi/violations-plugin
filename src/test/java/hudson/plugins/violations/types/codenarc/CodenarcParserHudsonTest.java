package hudson.plugins.violations.types.codenarc;

import static hudson.plugins.violations.ViolationsReportBuilder.violationsReport;
import static hudson.plugins.violations.types.codenarc.CodenarcDescriptor.CODENARC;

import org.junit.Test;
import org.jvnet.hudson.test.HudsonTestCase;

public class CodenarcParserHudsonTest extends HudsonTestCase {
    @Test
    public void testThatCodenarcWithEmptyPathCanBeParsed() throws Exception {
        violationsReport(CODENARC).reportedIn("**/CodeNarcReportEmptyPath.xml").perform().assertThat("/Test.groovy")
                .wasReported().reportedViolation(192, "EmptyCatchBlock", "EmptyCatchBlock");
    }
}

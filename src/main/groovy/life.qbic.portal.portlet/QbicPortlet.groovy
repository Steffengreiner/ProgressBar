package life.qbic.portal.portlet

import com.vaadin.annotations.Theme
import com.vaadin.annotations.Widgetset
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Layout
import com.vaadin.ui.VerticalLayout
import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

/**
 * Entry point for portlet SampleViewer_ProgressBar. This class derives from {@link QBiCPortletUI}, which is found in the {@code portal-utils-lib} library.
 *
 * @see <a href=https://github.com/qbicsoftware/portal-utils-lib>portal-utils-lib</a>
 */
@Theme("mytheme")
@SuppressWarnings("serial")
@Widgetset("life.qbic.portal.portlet.AppWidgetSet")
@Log4j2
@CompileStatic
class QbicPortlet extends QBiCPortletUI {

    //Overview Layout
    VerticalLayout verticalLayout

    @Override
    protected Layout getPortletContent(final VaadinRequest request) {

        // Init Layout
        verticalLayout = new VerticalLayout()
        // Dummy Data
        int maximumSampleNumber = 100
        int finishedSampleNumber = 60
        float finishedRatio = finishedSampleNumber/maximumSampleNumber

        ExampleProgressBar progressBar = new ExampleProgressBar(finishedRatio)
        verticalLayout.addComponent(progressBar)
        return verticalLayout
    }
}


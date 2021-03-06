package life.qbic.portal.portlet

import com.vaadin.ui.ProgressBar

/**
 * Example Progressbar Component
 *
 * ExampleProgressBar component based on the vaadin ProgressBar showcasing styling possibilities.
 * Css styling can be defined in {@link /main/webapp/VAADIN/themes/mytheme/mytheme.scss}
 *
 * @since: 0.1.0
 *
 */

class ExampleProgressBar extends ProgressBar {

    ExampleProgressBar(float sampleRatio) {
        super()
        this.setStyleName("sample-progress-bar")
        this.setValue(sampleRatio)
        this.setDescription("SampleRatio: ${sampleRatio}")
    }
}

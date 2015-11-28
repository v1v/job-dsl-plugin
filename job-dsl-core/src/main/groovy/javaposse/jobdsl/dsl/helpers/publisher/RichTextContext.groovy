package javaposse.jobdsl.dsl.helpers.publisher

import javaposse.jobdsl.dsl.Context

class RichTextContext implements Context {
    String markupLanguage
    String textForStable
    String textForUnstable
    String textForFailed
    boolean sameTextForUnstable = true
    boolean sameTextForFailed = true

    /**
     * Specifies the markup language.
     */
    void markupLanguage(String markupLanguage) {
        this.markupLanguage = markupLanguage
    }

    /**
     * Specify rich text to be published on build and job summary pages for stable and (if corresponding checkboxes are
     * selected) for unstable and failed builds.
     */
    void textForStable(String textForStable) {
        this.textForStable = textForStable
    }

    /**
     * Specify rich text to be published on build anyd job summary pages for unstable builds.
     */
    void textForUnstable(String textForUnstable) {
        this.textForUnstable = textForUnstable
    }

    /**
     * Specify rich text to be published on build and job summary pages for failed builds.
     */
    void textForFailed(String textForFailed) {
        this.textForFailed = textForFailed
    }

    /**
     * If set, When selected, the same text block is used for stable and unstable builds. Defaults to {@code false}.
     */
    void sameTextForUnstable(boolean sameTextForUnstable = true) {
        this.sameTextForUnstable = sameTextForUnstable
    }

    /**
     * If set, When selected, the same text block is used for stable and failed builds. Defaults to {@code false}.
     */
    void sameTextForFailed(boolean sameTextForFailed = true) {
        this.sameTextForFailed = sameTextForFailed
    }
}

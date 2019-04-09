/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package hands.on.graalvm

import spock.lang.Specification

class HandsOnGraalTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new HandsOnGraal()
        app.message

        when:
        app.run()

        then:
        noExceptionThrown()
    }
}

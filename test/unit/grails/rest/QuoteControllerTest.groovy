package grails.rest

import grails.test.mixin.TestFor
import spock.lang.Specification
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(QuoteController)
class QuoteControllerTest {    

    void testsomething() {
		controller.home()
		assert "<h1>Quote bqck to home</h1>" == response.text
    }
}

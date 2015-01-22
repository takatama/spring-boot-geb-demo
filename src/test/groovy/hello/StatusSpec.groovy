package hello

import geb.spock.GebSpec

class StatusSpec extends GebSpec {
    def "寝る子を起こして眠らせる"() {
        setup:
            to StatusPage
        when:
            assert withAlert { getupButton.click() } == "Getting up!"
        then:
            status.text() == "Getting up!"
        when:
            assert withAlert { sleepButton.click() } == "Sleeping..."
        then:
            status.text() == "Sleeping..."
    }
}

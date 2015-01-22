package hello

import geb.spock.GebSpec

class StatusSpec extends GebSpec {
    def "寝ているのを起こす"() {
        setup:
            to StatusPage
        expect:
            status.text() == "Sleeping..."
        when:
            getupButton.click()
        then:
            status.text() == "Getting up!"
    }
}

package hello

import geb.Page

class StatusPage extends Page {
    static url = 'index.html'
    static at = { title == 'Status' }
    static content = {
        status { $('#status') }
        getupButton { $('#getup-button') }
        sleepButton { $('#sleep-button') }
    }
}

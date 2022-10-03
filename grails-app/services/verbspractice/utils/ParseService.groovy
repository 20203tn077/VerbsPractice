package verbspractice.utils

import org.codehaus.groovy.grails.web.json.JSONObject
import org.joda.time.LocalDate
import verbspractice.Week

class ParseService {
    def parseWeek(JSONObject data) {
        return new Week(
                number: data.number as String,
                startDate: LocalDate.parse(data.startDate as String)
        )
    }
}

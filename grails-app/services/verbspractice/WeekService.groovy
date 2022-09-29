package verbspractice

import grails.transaction.Transactional
import org.springframework.http.HttpStatus
import org.springframework.validation.Errors

@Transactional(readOnly = true)
class WeekService {
    // ADMIN CRUD
    def findAll() {
        return [success: true, weeks: Week.findAll()]
    }

    def findById(long id) {
        def week = Week.findById(id)
        if (!week) return [success: false, error: Error.NOT_FOUND]
        return [success: true, week: week]
    }

    @Transactional
    def create(Week week) {
        if (!week.validate()) return [success: false, error: Error.FAILED_VALIDATION]
        def createdWeek = week.save()
        if (!createdWeek) return [success: false, error: Error.INTERNAL_ERROR]
        return [success: true, created: createdWeek]
    }

    @Transactional
    def update(Week week) {
        if (!Week.findById(week.id)) return [success: false, error: Error.NOT_FOUND]
        if (!week.validate()) return [success: false, error: Error.FAILED_VALIDATION]
        def updatedWeek = week.save()
        if (!updatedWeek) return [success: false, error: Error.INTERNAL_ERROR]
        return [success: true, created: updated]
    }

    @Transactional
    def delete(long id) {
        def week = Week.findById(id)
        if (!week) return [success: false, error: Error.NOT_FOUND]
        week.delete()
        return [success: true]
    }
}

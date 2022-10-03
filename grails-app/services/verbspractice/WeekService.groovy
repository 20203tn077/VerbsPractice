package verbspractice

import grails.transaction.Transactional

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
        week.validate()
        println '\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n'
        week.errors.allErrors.each {
            println it
        }
        println '\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n'
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
        return [success: true, created: updatedWeek]
    }

    @Transactional
    def delete(long id) {
        def week = Week.findById(id)
        if (!week) return [success: false, error: Error.NOT_FOUND]
        week.delete()
        return [success: true]
    }
}

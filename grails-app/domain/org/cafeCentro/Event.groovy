package org.cafeCentro

class Event {

    static hasMany = [artists:Artist]

    Venue venue
    Date date

    static searchable = true

    static constraints = {

    }

    def getName() {
        return artists.sort{it.name}.name.join(", ");
    }
}

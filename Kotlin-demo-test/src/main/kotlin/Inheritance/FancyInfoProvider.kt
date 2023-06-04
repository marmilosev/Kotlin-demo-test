package Inheritance

import ClassesAndInterfaces.BasicInfoProvider
import ClassesAndInterfaces.Person

class FancyInfoProvider : BasicInfoProvider(){

    override val sessionIdPrefix: String
        get() = "Fancy session "
    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }


}
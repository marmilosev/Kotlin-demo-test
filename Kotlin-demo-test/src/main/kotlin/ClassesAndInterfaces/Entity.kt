package ClassesAndInterfaces

class Entity
    private constructor(val id: String){
        companion object Factory: IdProvider{
            const val id = "id"
//            fun create() = Entity(id)
            override fun getId(): String {
                return "123"
            }

            fun create() = Entity(getId())
        }
    }


fun main() {
    val entity = Entity.Factory.create()
    Entity.id
}

package Aquarium

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@ImAPlant class Plant {
    fun trim() {}
    fun fertilized() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections() {
    val classObj: KClass<Plant> = Plant::class
//    for (method: KFunction<*> in classObj.declaredMemberFunctions) {
//        println(method.name)
//    }

    // print all annotations
    for (annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }

    // find one annotation, or null
    val annotation = classObj.findAnnotation<ImAPlant>()

    annotation?.apply {
        println("Found a plant annotation!")
    }
}
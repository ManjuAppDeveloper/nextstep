package com.manju.CoreKotlin.OOPS.Factory

class ShapeFactory {
    fun getShape(shapeType:String):Shape?{
        return when(shapeType.lowercase()){
            "circle"-> Circle()
            "rectangle" -> Rectangle()
            else -> null
        }

    }
}

fun main() {
    val shapeFactory = ShapeFactory()

    val circle = shapeFactory.getShape("circle")
    circle?.draw()

    val rectangle = shapeFactory.getShape("rectangle")
    rectangle?.draw()

    val unknownShape = shapeFactory.getShape("triangle")
    unknownShape?.draw()
}

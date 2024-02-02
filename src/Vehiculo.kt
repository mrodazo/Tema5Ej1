open class Vehiculo (val marca: String, val modelo: String, val capCombustible: Int){

    override fun toString(): String {
        return "Vehículo marca $marca, modelo $modelo y capacidad de combustible $capCombustible litros"
    }

    open fun calcularAutonomia() : Int {
        val autonomia = capCombustible*10
        return autonomia
    }
}

class Automovil(marca: String, modelo: String, capCombustible: Int, val tipo: String) :Vehiculo(marca,modelo,capCombustible){

    override fun toString(): String {
        return "Automóvil marca $marca, modelo $modelo, de tipo $tipo, con capacidad de combustible $capCombustible litros"
    }

    override fun calcularAutonomia(): Int {
        return (super.calcularAutonomia()+100)
    }
}

class Motocicleta (marca: String, modelo: String, capCombustible: Int, val cilindrada: Int): Vehiculo(marca, modelo,capCombustible){

    override fun toString(): String {
        return "Motocileta marca $marca, modelo $modelo, de cilindrada $cilindrada, con capacidad de combustible $capCombustible litros"
    }

    override fun calcularAutonomia(): Int {
        return (super.calcularAutonomia()-40)
    }
}
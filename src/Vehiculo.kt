class Vehiculo (val marca: String, val modelo: String, var capCombustible: Int){

    fun mostrarInformacion() {
        println("Vehículo marca $marca, modelo $modelo y capacidad de combustible $capCombustible litros")
    }

    fun calcularAutonomia(capCombustible: Int) : Int {

    }
}
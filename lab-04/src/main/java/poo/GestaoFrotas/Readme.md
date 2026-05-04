# Diagrama de classes UML

````mermaid
classDiagram
    direction LR
    
    Empresa "1" *-- "0..*" Registro
    Empresa "1" *-- "0..*" Motorista
    Empresa "1" *-- "0..*" Veiculo
    Registro "0..*" o-- "1" Motorista
    Registro "0..*" o-- "1" Veiculo
    Motorista "1..*" o-- "1..*" Veiculo
    
    class Motorista{
        -veiculos: ArrayList~Veiculo~
        +addVeiculo(v: Veiculo)
    }
    class Veiculo{
        -modelo: String
        -placa: String
        -ano: localdate
        +Veiculo(m: String, p: String, a: LocalDate)
    }
    class Registro{
        -motorista: Motorista
        -veiculo: Veiculo
        -data: Localdate
        -distancia: int 
        +Registro(m: Motorista, v: Veiculo, d: LocalDate, dis: int)
    }
    class Empresa{
        -motoristas: ArrayList~Morotista~
        -veiculos: ArrayList~Veiculo~
        -registros: ArrayList~Registro~
        +addMotorista(m: Motorista)boolean
        +addVeiculo(v: Veiculo)boolean
        +addRegistro(r: Registro)boolean
    }
````
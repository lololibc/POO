# Diagrama de Classes UML

````mermaid
classDiagram
direction LR

    Passageiro "1" *-- "0..*" Passagem
    Passagem "0..* "o-- "1" Voo
    class Voo{
        -numero: int
        -destino: String
        -data: LocalDate
        +Voo(n: int, dest: String, d: LocalDate)
    }
    class Passageiro{
        -nome: String
        -email: String
        -tel: int
        +reservas = Hashmap~int, Passagem~
        +ReservarVoo(r: Passagem)boolean
    }
    class Passagem{
        +Passagem(p: Passageiro, v: Voo, assento: int)
    }
 
````
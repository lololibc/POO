# Diagrama de Classes UML

````mermaid
classDiagram
direction LR

    Passageiro "1" *-- "0..*" Passagem
    Passagem "0..* " o-- "1" Voo
    
    class Voo{
        -numero: int
        -destino: String
        -data: LocalDate
        -assentos: Hashmap~String, Passagem~
        +reservarPassagem(p: Passageiro, assento: String)Passagem
    }
    class Passageiro{
        -nome: String
        -email: String
        -tel: String
        -passagens = ArrayList<Passagens>
        +reservarPassagem(voo: Voo, assento: String)boolean
    }
    class Passagem{
        -voo: Voo
        -passageiro: Passageiro
        -assento: String
        +Passagem(v: Voo, p: Passageiro, a: String)
    }
 
````
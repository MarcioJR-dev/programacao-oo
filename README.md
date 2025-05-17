# Estudo Dirigido 02 - Programação Orientada a Objetos

Este projeto contém duas implementações:
1. Sistema Bancário
2. Jogo de RPG

## Estrutura do Projeto
```
src/
├── ed02/
│   ├── bancario/
│   │   ├── Conta.java
│   │   ├── ContaCorrente.java
│   │   ├── ContaPoupanca.java
│   │   ├── ContaSalario.java
│   │   └── Main.java
│   └── rpg/
│       ├── Personagem.java
│       ├── Guerreiro.java
│       ├── Mago.java
│       ├── Arqueiro.java
│       └── MainRpg.java
```

## Como Executar

### Sistema Bancário
```bash
# Compilar
javac src/ed02/bancario/*.java

# Executar
java -cp src ed02.bancario.Main
```

### Jogo de RPG
```bash
# Compilar
javac src/ed02/rpg/*.java

# Executar
java -cp src ed02.rpg.MainRpg
```

## Funcionalidades

### Sistema Bancário
- Depósito
- Saque
- Transferência
- Aplicação de juros diários
- Impressão de extrato

### Jogo de RPG
- Sistema de combate
- Habilidades especiais
- Diferentes tipos de personagens (Guerreiro, Mago, Arqueiro)

## Requisitos
- Java JDK 8 ou superior 
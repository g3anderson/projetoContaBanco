# Projeto de Conta Bancária

Este é um pequeno projeto desenvolvido em Java para simular operações de uma conta bancária. O sistema permite ao usuário realizar operações básicas como depósito, saque e consulta de saldo.

## Funcionalidades

- **Criar uma conta bancária**: O usuário pode criar uma conta com saldo inicial.
- **Depósito**: O usuário pode depositar um valor na conta.
- **Saque**: O usuário pode sacar um valor da conta, respeitando o limite de saldo.
- **Consultar Saldo**: O usuário pode visualizar o saldo atual da conta.

## Como Rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/g3anderson/projetoContaBanco.git
Abra o projeto no Eclipse (ou qualquer IDE Java de sua preferência).

Execute a classe principal (ContaBancaria.java ou o nome da sua classe principal).

Exemplo de Uso
Aqui está um exemplo simples de como usar o sistema de conta bancária:

java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        // Criar uma conta bancária com saldo inicial de 1000
        ContaBancaria minhaConta = new ContaBancaria("Gabriel", 1000);

        // Depósito de 500
        minhaConta.depositar(500);

        // Saque de 200
        minhaConta.sacar(200);

        // Consultar saldo
        System.out.println("Saldo atual: " + minhaConta.consultarSaldo());
    }
}
Estrutura do Projeto
ContaBancaria.java: Classe que contém as funcionalidades principais da conta bancária, como depósito, saque e consulta de saldo.
Main.java: Classe de exemplo para demonstrar como interagir com a classe ContaBancaria.
Tecnologias Utilizadas
Java: Linguagem de programação utilizada para desenvolver o projeto.
IDE: Eclipse 

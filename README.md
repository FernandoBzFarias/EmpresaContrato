# EmpresaContrato
Sistema de Gestão de Contratos de Funcionários 
Este projeto em Java implementa um sistema simples de gestão de funcionários, departamentos e contratos de trabalho por hora. O objetivo é simular o cálculo de renda mensal de um trabalhador, considerando seu salário base e os contratos firmados em determinado mês/ano.

A aplicação utiliza conceitos de Programação Orientada a Objetos (POO) como:
Classes e objetos
Enumerações
Associações entre entidades
Listas para composição de contratos
Manipulação de datas (SimpleDateFormat e Calendar)

 Estrutura do Projeto
 
O sistema é dividido em pacotes:
aplicacao
App.java → Classe principal que contém o fluxo da aplicação e interação com o usuário.

entidades
Trabalhador.java → Representa o funcionário, contendo nome, nível, salário base, departamento e contratos.
Departamento.java → Representa o departamento em que o funcionário trabalha.
ContratoHora.java → Representa um contrato de trabalho por hora, com data, valor por hora e duração.

entidades.enums
LevelFuncionario.java → Enumeração que define os níveis de funcionário (JUNIOR, NIVEL_MEDIO, SENIOR).

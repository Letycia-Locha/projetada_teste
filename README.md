# 📌 Projeto: Projedata Teste

## 📋 Descrição
Este projeto foi desenvolvido como parte de um teste prático para a vaga de Analista de Sistemas Júnior. O objetivo é implementar um sistema em Java que gerencie uma lista de funcionários, aplicando diversas operações como aumentos salariais, agrupamento por função e ordenação alfabética.

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **JDK Adoptium 21**
- **VSCode** como ambiente de desenvolvimento
- **Git e GitHub** para controle de versão

## 📂 Estrutura do Projeto
```
projedata_teste/
├── src/
│   ├── com/
│   │   ├── empresa/
│   │   │   ├── Pessoa.java
│   │   │   ├── Funcionario.java
│   │   │   ├── Main.java
│   ├── README.md
```

## 🚀 Como Executar o Projeto
1. **Clonar o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/projedata_teste.git
   ```
2. **Acessar o diretório do projeto:**
   ```sh
   cd projedata_teste
   ```
3. **Compilar os arquivos:**
   ```sh
   javac -d bin src/com/empresa/*.java
   ```
4. **Executar o programa:**
   ```sh
   java -cp bin com.empresa.Main
   ```

---

## 💡 Raciocínio por trás da execução do código

O código foi estruturado em três classes principais:

### **1️⃣ Classe `Pessoa`**
- Contém os atributos **nome** e **data de nascimento**.
- Inclui um método para formatar a data no padrão `dd/MM/yyyy`.

### **2️⃣ Classe `Funcionario`** *(herda de `Pessoa`)*
- Adiciona os atributos **salário** e **função**.
- Implementa um método para aumentar o salário em **10%**.
- Inclui um método para formatar o salário corretamente.

### **3️⃣ Classe `Main`** *(executa as operações principais)*
Nesta classe, realizamos as seguintes operações:
1. **Criei uma lista de funcionários** com os dados fornecidos.
2. **Removi o funcionário "João"** conforme exigido.
3. **Formatei e imprimi os funcionários**.
4. **Apliquei um aumento de 10% nos salários**.
5. **Agrupei os funcionários por função** e imprimimos a estrutura.
6. **Filtrei e listei os funcionários que fazem aniversário nos meses 10 e 12**.
7. **Identiffiquei e imprimi o funcionário mais velho** com base na data de nascimento.
8. **Ordenei e imprimi a lista de funcionários em ordem alfabética**.
9. **Calculei e imprimi o total dos salários**.
10. **Calculei quantos salários mínimos cada funcionário recebe** (base R$1212,00).

A abordagem utilizada foi baseada em **listas (`ArrayList`), streams (`Stream API`), e mapas (`Map`)**, garantindo eficiência nas operações exigidas.

Caso tenha dúvidas sobre o funcionamento do código, sinta-se à vontade para explorar cada classe e sua documentação interna! 🚀

---

## 📌 Contato
Para mais informações sobre o projeto, entre em contato pelo GitHub ou email.

---

📝 **Autor:** Letycia locha | 📅 **Data:** Fevereiro/2025


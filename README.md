# Localizador de Museus




## Descrição

O Localizador de Museus é um projeto que tem como objetivo fornecer uma plataforma para localizar museus próximos a uma determinada localidade. Ele permite que os usuários busquem museus em uma região específica, visualizem detalhes sobre cada museu encontrado e obtenham informações úteis, como horários de funcionamento, avaliações de visitantes, endereço e muito mais.

Este projeto foi desenvolvido em Java e utiliza Spring Boot, especificamente Spring Web e Spring Actuator . 

## Habilidades Aplicadas

1. **Criar classes de controle e suas rotas**: Foi necessário criar controladores que gerenciam as requisições e respostas HTTP relacionadas à busca e visualização dos museus. As rotas foram definidas para mapear as diferentes ações da aplicação.

2. **Criar classes de serviço**: Para separar a lógica de negócio da camada de controle, foram implementadas classes de serviço que lidam com as operações relacionadas à busca e obtenção de informações sobre os museus.

3. **Utilizar injeção de dependências**: A injeção de dependências foi aplicada para garantir a separação das responsabilidades e facilitar a manutenção do código, permitindo que as classes dependam de interfaces ao invés de implementações concretas.

4. **Trabalhar com exceções customizadas**: Foram criadas exceções personalizadas para lidar com situações específicas da aplicação, permitindo um tratamento mais adequado e consistente de erros.

5. **Tratar exceções da API através de gerenciadores de erros**: Os erros foram tratados de forma apropriada, fornecendo respostas HTTP adequadas e mensagens de erro informativas aos usuários.

6. **Implementar testes unitários para cobertura de código**: Para garantir a qualidade do código e o correto funcionamento das funcionalidades, foram criados testes unitários para verificar o comportamento das classes e funções.

7. **Criar uma configuração Docker para sua aplicação**: Uma configuração Docker foi desenvolvida para facilitar a implantação e execução da aplicação em diferentes ambientes.


## Funcionalidades

- [ ] Pesquisar museus por localidade.
- [ ] Visualizar detalhes sobre cada museu encontrado.
- [ ] Ver horários de funcionamento e informações adicionais.

## Instalaçao

1. Clone este repositório: `git clone https://github.com/pedroluizresende/localizador-de-museus.git`
2. Acesse o diretório do projeto: `cd localizador-de-museus`

## Uso
1. Rode o comando: `mvn spring-boot:run`
2. Faça uma requisição para alguma rota ex.(`http://localhost:8080/museums/1`)

## Agradecimentos

Gostaríamos de expressar minha sincera gratidão a todos os especialistas, instrutores e todo o time da Trybe. O apoio, conhecimento e dedicação de vocês foram fundamentais para o desenvolvimento deste projeto. Muito obrigado por compartilharem seu conhecimento comigo e tornarem possível o meu aprendizado e crescimento como desenvolvedor.



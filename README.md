# ds_20242_g8
### Nome do Projeto:
![logotipoChamaAí](https://github.com/user-attachments/assets/c858299b-cc4e-44c1-85b8-7a6dd80048d8)

### Descrição:
O **ChamaAí** é um aplicativo mobile desenvolvido para conectar prestadores de serviços gerais a clientes que necessitam desses serviços e não sabem como encontrar. Com uma interface intuitiva e um sistema de filtragem baseado na localização e nas especialidades dos prestadores, o aplicativo oferece uma experiência prática e acessível tanto para quem busca serviços como para os profissionais que desejam expandir sua base de clientes. O **ChamaAí** abrange uma ampla gama de serviços, como manutenção residencial, pequenos reparos, serviços de limpeza, entre outros.

### Problema
No cenário atual, muitas pessoas enfrentam dificuldades significativas para encontrar prestadores de serviços confiáveis, disponíveis e com a qualificação necessária para realizar tarefas no tempo desejado. Essa dificuldade é agravada pela fragmentação das opções de busca, que muitas vezes obriga o cliente a recorrer a diversos meios, como redes sociais, indicações informais, aplicativos especializados e sites de classificados.  Além disso, as informações disponíveis sobre os prestadores de serviço costumam ser limitadas ou desatualizadas, o que aumenta a incerteza na escolha.

Do outro lado, os prestadores de serviços enfrentam barreiras para alcançar um número maior de clientes de forma eficaz e sustentada. Muitos dependem exclusivamente de indicações locais ou de plataformas genéricas, o que restringe sua visibilidade no mercado.

### Objetivos da Solução
O **ChamaAí** busca solucionar esses problemas oferecendo uma plataforma única, que conecta de maneira eficiente e segura prestadores de serviços gerais a clientes. O aplicativo centraliza a busca por profissionais qualificados, utilizando filtros que permitem ao usuário encontrar prestadores disponíveis na sua localidade, de acordo com suas necessidades específicas, como especialidade, preço, avaliações de clientes e disponibilidade imediata. Com um processo de seleção transparente e baseado em feedback de outros usuários, o **ChamaAí** aumenta a confiança na escolha, reduzindo o tempo gasto em pesquisas dispersas e melhorando a experiência de contratação de serviços.

Para os prestadores, o **ChamaAí** oferece uma vitrine profissional, onde podem criar perfis detalhados, listar suas habilidades, horários de trabalho e receber avaliações dos clientes. Isso aumenta sua visibilidade e os conecta diretamente a uma base de usuários que já está à procura de seus serviços.  A solução também permite que os prestadores construam uma reputação baseada em avaliações, o que pode ajudar a atrair mais clientes e manter um fluxo de trabalho constante.

Ao fornecer um canal direto, seguro e eficiente entre clientes e prestadores de serviços, o **ChamaAí** resolve as dificuldades de comunicação, otimiza a procura por profissionais qualificados e estabelece um ambiente de confiança mútua, melhorando a eficiência e a qualidade dos serviços prestados.

### Grupo
Este projeto será desenvolvido pelos componentes do grupo 8:

|Matrícula|Nome| Usuário Git                                     |
|---|---|-------------------------------------------------|
|202201683|ARTHUR NUCADA FELIX DE SOUZA| [Arthurnucada](https://github.com/Arthurnucada) |
|202201699|JOSÉ ALVES DE OLIVEIRA NETO| [jntlvr](https://github.com/jntlvr)             |
|202201703|LUCAS GABRIEL NUNES ALVES| [Lnunnes](https://github.com/Lnunnes)           |
|202201713|SOPHIA FERNANDES MAGALHÃES ALMEIDA| [sophiafma](https://github.com/sophiafma)       |
|202204532|VICTOR MARTINS VIEIRA| [vmvuno](https://github.com/vmvuno)              |

### Backlog do Produto

1. RF001 - O sistema deve permitir que o prestador de serviços realize seu cadastro, fornecendo informações como nome completo, e-mail válido, senha, número de telefone válido, endereço, especialidades e disponibilidade de horários.
2. RF002 - O sistema deve permitir que o cliente realize seu cadastro, fornecendo informações como nome completo, e-mail válido, senha, endereço, número de telefone válido, e uma forma de pagamento válida. 
3. RF003 - O sistema deve permitir que tanto prestadores de serviços quanto clientes realizem login utilizando autenticação de dois fatores, sendo um deles a senha e o outro um código enviado via e-mail.
4. RF004 - O sistema deve permitir que o cliente pesquise prestadores de serviços com base na localidade e na especialidade desejada, retornando uma lista de profissionais disponíveis.
5. RF005 - O sistema deve permitir que o cliente agende um serviço com um prestador, escolhendo a data e horário desejados, conforme a disponibilidade apresentada pelo prestador de serviços.
6. RF006 - O sistema deve permitir que o cliente avalie o prestador de serviços após a conclusão do serviço, utilizando uma escala de 1 a 5 estrelas, e adicionando um comentário opcional.
7. RF007 - O sistema deve permitir que o prestador de serviços visualize a lista de serviços agendados, com informações sobre o cliente, data, horário e local do serviço.
8. RF008 - O sistema deve permitir que o prestador de serviços confirme ou cancele um serviço agendado.
9. RF009 - O sistema deverá permitir que o cliente confirme ou cancele um serviço agendado.
10. RF010 - O sistema deve permitir que o cliente escolha entre diferentes formas de pagamento, como cartão, dinheiro físico ou PIX.
11. RF011 - O sistema deve permitir que o cliente ao agendar uma visita adicione uma breve descrição sobre o serviço desejado.
12. RF012 - O sistema deve permitir que tanto prestadores de serviços quanto clientes criem um perfil, inserindo informações como foto de perfil, breve descrição sobre suas habilidades (no caso de prestadores) ou preferências de serviço (no caso de clientes), e atualizando dados fornecidos durante o cadastro, como telefone e endereço.
13. RF013 - O sistema deve permitir que tanto prestadores de serviços quanto clientes atualizem seus perfis a qualquer momento, alterando dados como nome, telefone, endereço, forma de pagamento (para clientes) ou especialidades e disponibilidade (para prestadores de serviços), além de adicionar ou remover uma foto de perfil.

### Requisitos Não Funcionais

1. RNF001 - Usabilidade: A interface da aplicação com o usuário deve ser intuitiva e de fácil uso, enquanto traz informações relevantes, a fim de prover uma boa experiência de usuário.
2. RNF002 - Segurança: A aplicação deve ser desenvolvida de forma a evitar vulnerabilidades conhecidas e resguardar adequadamente os dados dos seus usuários, conforme a legislação aplicável.
3. RNF003 - Desempenho: A aplicação deve apresentar respostas rápidas (em até 2 segundos), de forma a não desestimular o uso por parte dos usuários.
4. RNF004 - Confiabilidade: A aplicação deve ser disponibilizada de forma tal que permaneça ativa em 99% do tempo e garantir que as informações sejam adequadamente armazenadas e entregues aos respectivos usuários.
5. RNF005 - Manutenibilidade: A aplicação deve ser implementada de forma que sua manutenção seja viável, e a entrada de novos membros no projeto seja facilitada, principalmente em termos de documentação e boas práticas.
6. RNF006 - Portabilidade: A aplicação deve poder ser acessada a partir de dispositivos e localidades diversas.
7. RNF007 - Conectividade: A aplicação pode vir a disponibilizar endpoints de sua API para aplicações externas, de forma a possibilitar a integração com outros sistemas.

### Regras de Negócio
1. RN01 - O sistema deve restringir o registro a uma conta por usuário.
2. RN02 - Caso um usuário não consiga confirmar suas informações de cadastro, este não poderá acessar o sistema, e o cadastro deverá ser excluído após uma semana.
3. RN03 - Um prestador de serviços não poderá ter dois agendamentos para um único horário (overbooking).
4. RN04 - Caso um prestador não compareça ao local para prestar os serviços por três vezes, em dias diferentes, este deve ser suspenso da plataforma.
5. RN05 - O sistema deve validar a existência e a veracidade das informações de cadastro, como e-mail e endereço inseridos.
6. RN06 - O sistema deve permitir que o usuário altere sua senha a qualquer momento, seguindo políticas de segurança como a exigência de caracteres especiais, números e letras maiúsculas e minúsculas.
7. RN07 - O sistema deve permitir que o cliente avalie um serviço apenas uma vez.
8. RN08 - O sistema deve permitir que o cliente cancele um serviço agendado com antecedência mínima de 24 horas.
9. RN09 - O sistema deve validar a senha inserida no cadastro do usuário, verificando se a senha possui 6 caracteres no mínimo, com um número e um caractere especial no mínimo.
10. RN10 - O sistema deve permitir que o usuário oculte ou deixe sua senha visível enquanto faz login

### Modelo Arquitetural
O sistema consistirá em um client web que se comunicará com uma API REST que atuará como backend (arquitetura cliente-servidor);  
Internamente, o backend seguirá uma arquitetura MVC (Model, View, Controller)

### Modelo de Interfaces Gráficas
<Apresentar uma descrição sucinta do modelo de interfaces gráficas do Produto.>

### Tecnologia de Persistência de Dados
<Apresentar uma descrição sucinta do modelo de persistência do Produto.>

### Local do _Deploy_
O nosso planejamento inicial é hospedar nossa aplicação no Heroku ou no Firebase do Google, sendo crucial para nossa escolha a facilidade de configuração e também os recursos ofertados na versão gratuita.

### Cronograma de Desenvolvimento

|Iteração|Descrição|Data Início|Data Fim|Responsável|Situação|
|---|---|---|---|---|---|
|1|Concepção|30/08/2024|13/09/2024|Grupo|Concluída|
|2|Preparação|14/09/2024|27/09/2024|Grupo|Programada|
|3|Item(ns) do backlog <x,y,z>|28/09/2024|11/10/2024|Grupo|Programada|
|4|Item(ns) do backlog <x,y,z>|12/10/2024|25/10/2024|Grupo|Programada|
|5|Item(ns) do backlog <x,y,z>|26/10/2024|08/11/2024|Grupo|Programada|
|6|Item(ns) do backlog <x,y,z>|09/11/2024|22/11/2024|Grupo|Programada|
|7|Item(ns) do backlog <x,y,z>|23/11/2024|06/12/2024|Grupo|Programada|
|8|Apresentação do Projeto|07/12/2024|20/12/2024|Grupo|Programada|

### Iterações x Atividades
|Iteração| Tarefa                                                                |Data Início|Data Fim|Responsável| Situação   |
|---|-----------------------------------------------------------------------|---|---|---|------------|
|1| Definição do grupo de trabalho                                        |30/08/2024|30/08/2024|Grupo| Concluída  |
|1| Definição do Tema do Trabalho                                         |30/08/2024|13/09/2024|Grupo| Concluída  |
|2| Definição do Backlog do produto                                       |13/09/2024|27/09/2024|Grupo| Concluída  |
|2| Descrição dos itens do backlog do produto                             |14/09/2024|27/09/2024|Grupo| Concluída  |
|2| Distribuição dos itens do backlog entre as iterações                  |14/09/2024|27/09/2024|Grupo| Concluída  |
|2| Definição do modelo arquitetural                                      |14/09/2024|27/09/2024|Grupo| Concluída  |
|3| Especificação de estórias de usuários dos Item(ns) do backlog <x,y,z> |28/09/2024|11/10/2024|| Programada |
|3| Diagrama de classes dos Item(ns) do backlog                           |28/09/2024|11/10/2024|| Concluída  |
|3| Diagrama de interação/sequencia dos itens do backlog <x,y,z>          |28/09/2024|11/10/2024|| Programada |
|3| Projeto de Interfaces gráficas dos itens do backlog <x,y,z>           |28/09/2024|11/10/2024|| Programada |
|3| Projeto de persistência dos itens do backlog <x,y,z>                  |28/09/2024|11/10/2024|| Programada |
|3| Implementação dos itens do backlog <x,y,z>*                           |28/09/2024|11/10/2024|| Programada |
|4| Especificação de estórias de usuários dos Item(ns) do backlog <x,y,z> |12/10/2024|25/10/2024|| Programada |
|4| Diagrama de classes dos Item(ns) do backlog <x,y,z>                   |12/10/2024|25/10/2024|| Programada |
|4| Diagrama de interação/sequencia dos itens do backlog <x,y,z>          |12/10/2024|25/10/2024|| Programada |
|4| Projeto de Interfaces gráficas dos itens do backlog <x,y,z>           |12/10/2024|25/10/2024|| Programada |
|4| Projeto de persistência dos itens do backlog <x,y,z>                  |12/10/2024|25/10/2024|| Programada |
|4| Implementação dos itens do backlog <x,y,z>*                           |12/10/2024|25/10/2024|| Programada |
|5| Especificação de estórias de usuários dos Item(ns) do backlog <x,y,z> |26/10/2024|08/11/2024|| Programada |
|5| Diagrama de classes dos Item(ns) do backlog <x,y,z>                   |26/10/2024|08/11/2024|| Programada |
|5| Diagrama de interação/sequencia dos itens do backlog <x,y,z>          |26/10/2024|08/11/2024|| Programada |
|5| Projeto de Interfaces gráficas dos itens do backlog <x,y,z>           |26/10/2024|08/11/2024|| Programada |
|5| Projeto de persistência dos itens do backlog <x,y,z>                  |26/10/2024|08/11/2024|| Programada |
|5| Implementação dos itens do backlog <x,y,z>*                           |26/10/2024|08/11/2024|| Programada |
|6| Especificação de estórias de usuários dos Item(ns) do backlog <x,y,z> |09/11/2024|22/11/2024|| Programada |
|6| Diagrama de classes dos Item(ns) do backlog <x,y,z>                   |09/11/2024|22/11/2024|| Programada |
|6| Diagrama de interação/sequencia dos itens do backlog <x,y,z>          |09/11/2024|22/11/2024|| Programada |
|6| Projeto de Interfaces gráficas dos itens do backlog <x,y,z>           |09/11/2024|22/11/2024|| Programada |
|6| Projeto de persistência dos itens do backlog <x,y,z>                  |09/11/2024|22/11/2024|| Programada |
|6| Implementação dos itens do backlog <x,y,z>*                           |09/11/2024|22/11/2024|| Programada |
|7| Especificação de estórias de usuários dos Item(ns) do backlog <x,y,z> |23/11/2024|06/12/2024|| Programada |
|7| Diagrama de classes dos Item(ns) do backlog <x,y,z>                   |23/11/2024|06/12/2024|| Programada |
|7| Diagrama de interação/sequencia dos itens do backlog <x,y,z>          |23/11/2024|06/12/2024|| Programada |
|7| Projeto de Interfaces gráficas dos itens do backlog <x,y,z>           |23/11/2024|06/12/2024|| Programada |
|7| Projeto de persistência dos itens do backlog <x,y,z>                  |23/11/2024|06/12/2024|| Programada |
|7| Implementação dos itens do backlog <x,y,z>*                           |23/11/2024|06/12/2024|| Programada |
|8| Apresentação do Projeto                                               |07/12/2024|20/12/2024|Grupo| Programada |

* Implementação se aplicará, se os itens da iteração em andamento, forem eleitos para validação do projeto do trabalho.

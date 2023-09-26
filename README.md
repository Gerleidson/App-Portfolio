# Documentação do Aplicativo Portfolio Digital

![tela](https://github.com/Gerleidson/Portfolio/assets/88213553/57017cb7-7d1c-4d16-b1d1-6530fdac44fd)


## Introdução

O aplicativo "Portfolio Digital" permite aos usuários acessarem informações sobre o desenvolvedor Gerleidson Bomfim, incluindo detalhes de contato e links para suas redes sociais e projetos. Além disso, o aplicativo oferece acesso a seções específicas, como informações sobre o desenvolvedor, projetos, cursos e experiências.

## Requisitos do Sistema

- Dispositivo Android com versão mínima X.X.X (substituir com a versão mínima suportada).

## Instalação

1. Faça o download do arquivo APK do aplicativo.
2. Abra o arquivo APK no dispositivo Android.
3. Siga as instruções na tela para concluir a instalação.

## Funcionalidades Principais

### Tela Principal (MainActivity)

A tela principal do aplicativo apresenta os seguintes elementos:

- Botões de redes sociais:
  - GitHub: Ao clicar neste botão, o usuário é redirecionado para o perfil do desenvolvedor no GitHub.
  - WhatsApp: Ao clicar neste botão, o usuário é redirecionado para o WhatsApp do desenvolvedor para iniciar uma conversa.
  - LinkedIn: Ao clicar neste botão, o usuário é redirecionado para o perfil do desenvolvedor no LinkedIn.
  - Gmail: Ao clicar neste botão, o usuário pode enviar um e-mail para o endereço de e-mail do desenvolvedor.

- Botões de navegação:
  - Sobre Mim: Ao clicar neste botão, o usuário é levado para a seção "Sobre Mim" com informações detalhadas sobre o desenvolvedor.
  - Projetos: Ao clicar neste botão, o usuário é levado para a seção "Projetos" com informações sobre os projetos desenvolvidos.
  - Cursos: Ao clicar neste botão, o usuário é levado para a seção "Cursos" com informações sobre os cursos realizados.
  - Experiências: Ao clicar neste botão, o usuário é levado para a seção "Experiências" com informações sobre experiências profissionais anteriores.

## Classes Principais

### MainActivity

A classe `MainActivity` é a atividade principal do aplicativo. Ela é responsável por configurar a interface do usuário e gerenciar os cliques nos botões.

#### Métodos Principais:

- `onCreate(Bundle savedInstanceState)`: Método chamado quando a atividade é criada. Ele configura o layout e associa os cliques dos botões.

- `sobreMim(View view)`: Método associado ao botão "Sobre Mim" que inicia a atividade `sobreMim`.

- `projetos(View view)`: Método associado ao botão "Projetos" que inicia a atividade `Projetos`.

- `cursos(View view)`: Método associado ao botão "Cursos" que inicia a atividade `Cursos`.

- `experiencias(View view)`: Método associado ao botão "Experiências" que inicia a atividade `Experiencias`.

## Atividades Relacionadas

### SobreMim

A atividade `SobreMim` exibe informações detalhadas sobre o desenvolvedor.

### Projetos

A atividade `Projetos` apresenta uma lista de projetos desenvolvidos pelo desenvolvedor.

### Cursos

A atividade `Cursos` exibe uma lista de cursos realizados pelo desenvolvedor.

### Experiencias

A atividade `Experiencias` fornece informações sobre experiências profissionais anteriores do desenvolvedor.

## Considerações Finais

Esta documentação fornece uma visão geral do aplicativo "Portfolio Digital". Para obter informações mais detalhadas sobre implementações específicas, consulte o código fonte.

**Nota:** Este documento é uma representação genérica da documentação com base no código fornecido. Recomenda-se a inclusão de detalhes específicos, como permissões, configurações adicionais, entre outros, conforme necessário para o aplicativo real.

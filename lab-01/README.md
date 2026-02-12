# Sistema de Controle de Versão


## Configuração inicial para uso do git


### Configuração de nome de usuário e e-mail no Git
Configurar user.name e user.email no Git é essencial para identificar a autoria de cada commit, garantindo rastreabilidade, responsabilidade no código e organização em projetos colaborativos. Sem essa definição, o Git utiliza informações genéricas do sistema, dificultando a revisão e atribuição de alterações. 
```
git config –global user.name “nome”
git config –global user.email “@email”
```
### Criando Personal Access Token (PAT) no GitHub
Um Personal Access Token (PAT) é uma alternativa segura à senha utilizada para autenticar usuários em plataformas de desenvolvimento e serviços de nuvem (como GitHub, GitLab ou Azure DevOps) ao usar a linha de comando ou APIs. Ele funciona como uma string alfanumérica longa, garantindo acesso sem expor credenciais principais, sendo vital para segurança, automação e controle de permissões granulares. 
#### Passo a Passo para Criar um Token (Classic)
1. Acesse as Configurações: No canto superior direito do GitHub, clique na sua foto de perfil e selecione Settings.
1. Developer Settings: Role a barra lateral esquerda até o final e clique em Developer settings.
1. Tokens (classic): Na barra lateral esquerda, clique em Personal access tokens e escolha Tokens (classic).
1. Gerar Novo Token: Clique no botão Generate new token (escolha a opção classic).
1. Configurações do Token:
+ Note: Dê um nome descritivo (ex: "Acesso Terminal Notebook").
+ Expiration: Escolha uma data de validade. Por segurança, evite "No expiration".
+ Scopes: Selecione as permissões. Para uso comum no terminal (push/pull), marque a opção repo.
6. Finalizar e Copiar: Clique em Generate token no final da página.


#### Passo a Passo para Criar um Token (Classic)


### Salvar em cache as credenciais do PAT



## • Qual a diferença entre git merge e git rebase?
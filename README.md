# MenuTreino

Aplicativo de linha de comando em Java para gerenciar uma lista de nomes.  
Permite cadastrar, remover, listar, buscar e editar nomes com validações simples.

## Funcionalidades
- [1] Cadastrar: adiciona um nome (impede duplicatas, case-insensitive).
- [2] Remover: remove pelo nome informado (ignora maiúsc/minúsculas).
- [3] Listar: exibe todos os nomes com numeração.
- [4] Buscar: filtra nomes que contêm um trecho (case-insensitive).
- [5] Editar: altera um nome existente de acordo com índice (com verificação de duplicata).
- [6] Sair: encerra o programa.
- 
## Como funciona
- Estrutura de dados: `ArrayList<String>` (dinâmico, simples para inserir/remover).
- Comparação de nomes: `equalsIgnoreCase` (evita problemas com `==`).
- Validações de entrada: tratamento básico para número do menu e índices.
- Complexidade (média):
  - Cadastrar/Remover/Buscar/Editar: O(n) (varredura da lista).
  - Listar: O(n).

## Requisitos
- JDK 8+ (qualquer IDE; testado em terminal).
- Sem dependências externas.

## Execução
Assumindo a árvore de fontes em `src/`:

#Extra
- Possíveis melhorias e atualizações


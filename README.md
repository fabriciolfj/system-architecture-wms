# System Architecture Wms

- Serviços desenvolvidos em java 17
- Quarkus
- utilizando as boas praticas de programação e os padrões de microservices, como:
  - resiliência ( circuit breaker)
  - cloud native
  - reactive
  - messaging
- Serviços envolvidos:  
  - pedido
    - entrada de produtos 
  - remessa
    - armazem 
    - saida de produtos 
  - alocacao
    - controle de estoque
    - geração de palete
    - controle de endereços
    - mudança de endereços(pulmão, picking) 
    - doca



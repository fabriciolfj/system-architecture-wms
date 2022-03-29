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
  - movimentacao de mercadoria
    - saida de produtos 
    - entrada de produtos
  - armazem
    - controle de estoque
    - geração de palete
    - controle de endereços
    - mudança de endereços(pulmão, picking) 
    - doca



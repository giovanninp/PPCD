# Questão 3
## O Java oferece, embarcado na classe Object, um mecanismo de monitores capaz de oferecer tanto exclusão mútua como bloqueios. Explique a utilidade da palavra reservada synchronized e os métodos: wait, notify e notifyAll.

## Resposta: A classe citada é a Thread, e suas características descritas são:
### synchronized: Responsável por garantir a região crítica, ou seja, que irá seguir com a exclusão mútua.
### wait: responsável por colocar a thread atual que chamar o método, em um estado de espera.
### notify: Responsável por tirar a próxima thread do estado de "espera", ou seja, a que executou wait() irá continuar a sua execução.
### notifyAll: Possuí o mesmo efeito de notify, só que, ao invés de tirar apenas uma thread do estado de espera, tira todas que estão nesse estado;

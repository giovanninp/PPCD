Neste projeto, a classe Main utiliza de Busy-Wait para detectar a conclus�o. Quais as implica��es dessa implementa��o e quais as alternativas?

R: A técnica, Busy-Wait não pode ser dita como errada, mas de acordo com ocontexto atual, não é a mais adequada. Pois, como o próprio nome diz, "espera ocupada", a thread não é interrompida ou colocada para "dormir" e sim fica em uma rotina de execução contínua enquanto não pode executar o próximo trecho de código.
## Implicações: O busy-wait não aproveita de forma inteligente os recursos da cpu, assim, reduzindo o tempo de folga e colocando-a sempre em uso;
## Soluções:
### No contexto do java, temos trechos de códigos com synchronized, no caso, estamos definindo uma zona crítica na qual a thread terá de checkar a disponibilidade para executar;
### Além disso, o acréscimo da função wait e o uso de notify e/ou notifyAll, ajudará para que essa espera dessa ação consiga ser efetuada, mas deixando as demais threads que irão utilizar aquela informação em um estado de espera - equanto está requerindo os dados, e o notify/notifyAll para confirmar a disponibilidade;
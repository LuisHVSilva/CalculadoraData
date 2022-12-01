<h1>Seja bem vindo à calculadora de dia de semana Java! </h1>
Antes de qualquer coisa, para os iniciantes no GitHub, o projeto inteiro estará dentro da pasta 'scr'.
Este é um programa Java que foi feito com o intuito de calcular o dia da semana de qualquer dia, mês ou ano, onde um cáculo básico é efetuado com base de algumas constantes.

<h3>Cáculos</h3>
As etapas para efetuar o cálculo são:
 <ul>
  <li>x = dia + chave do mês + chave do ano</li>
  <li>y = maior múltimo de 7 de x</li>
  <li><b>dia da semana = x - y</b></li>        
</ul>
 Tanto a chave do mês quanto a chave do ano são fornecidas por uma tabela:
 <img src="https://mega.ibxk.com.br/2014/06/05/05130532559314.jpg?ims=610x">
 <br><br>
 A chave do mês é imutável, indiferente do ano que se deseja fazer o cálculo, as chaves dos meses irão se permanecer os mesmos.
 Já quanto ao ano, caso haja a necessidade de fazer cálculo para qualquer que fuja do escopo do século XIX irá ser necessário fazer um procedimento:
 <ul>
  <li>Sempre pegar a chave correspondente do ano do século XIX;</li>
    <ul>
      <li>Se for um século posterior, diminuir o valor da chave obtido pelo centésimo inteiro da diferença entre os séculos;</li>
      <li>Se for um século anterior, somar o valor da chave obtido pelo centésimo inteiro da diferença entre os séculos + 1.</li>
    </ul>
</ul>
Vamos ver um exemplo para cada:
<ul>
  <li>2022 -> 1922 tem a chave '6', então a chave do ano 2022 é 5.</li>
  <li>1822 -> 1922 tem a chave '6', então a chave do ano 2022 é 4.</li>
</ul>
Entendido como pegar a chave do ano, é só seguir o base de cáculo explicada anteriormente.

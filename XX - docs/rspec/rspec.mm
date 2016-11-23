<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1479347241416" ID="ID_1691875834" MODIFIED="1479347292130" TEXT="RSPEC">
<font NAME="Impact" SIZE="28"/>
<node CREATED="1479347341248" ID="ID_101446631" MODIFIED="1479718582958" POSITION="right" TEXT="o que &#xe9; TDD">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="help"/>
<node CREATED="1479347433266" ID="ID_862282363" MODIFIED="1479348249945" TEXT="(Test-Driven Development) Pr&#xe1;tica de desenvolvimento que envolve escrever os testes antes da escrita do c&#xf3;digo que ser&#xe1; testado">
<icon BUILTIN="idea"/>
</node>
<node CREATED="1479347610885" ID="ID_1812666010" MODIFIED="1479347741393" TEXT="Inicia-se escrevendo os testes para um c&#xf3;digo inexistente. Logo em seguida, se executa o teste com o objetivo de falhar, e logo depois, se escreve o mesmo c&#xf3;digo para que ele seja aprovado">
<icon BUILTIN="info"/>
</node>
<node CREATED="1479347781968" ID="ID_793393706" MODIFIED="1479347810657" TEXT="Com os testes aprovados, &#xe9; preciso estruturar o c&#xf3;digo e refator&#xe1;-lo na medida do poss&#xed;vel">
<icon BUILTIN="info"/>
</node>
<node CREATED="1479347860026" ID="ID_1815346617" MODIFIED="1479347872852" TEXT="Como deve ser executado o TDD">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="help"/>
<node CREATED="1479718406968" ID="ID_445213802" MODIFIED="1479718445150" TEXT="Escrever um teste que falhe">
<icon BUILTIN="full-1"/>
</node>
<node CREATED="1479718418077" ID="ID_1588638823" MODIFIED="1479718445821" TEXT="Escrever um c&#xf3;digo para passar no teste">
<icon BUILTIN="full-2"/>
</node>
<node CREATED="1479718435582" ID="ID_90826271" MODIFIED="1479718548885" TEXT="Eliminar as redund&#xe2;ncias refatorando-o">
<icon BUILTIN="full-3"/>
</node>
</node>
</node>
<node CREATED="1479347363185" ID="ID_166001084" MODIFIED="1479347373632" POSITION="left" TEXT="o que &#xe9; BDD">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="help"/>
<node CREATED="1479348168958" ID="ID_993222687" MODIFIED="1479348386023" TEXT="(Behaviour Driven-Development), tem como foco principal o comportamento em vez da estrutura do software">
<icon BUILTIN="idea"/>
</node>
<node CREATED="1479348343851" ID="ID_749804003" MODIFIED="1479348444575" TEXT="Preocupa-se mais com a intera&#xe7;&#xe3;o entre pessoas, sistemas ou objetos do que sobre a estrutura dos objetos, descrevendo cen&#xe1;rios e situa&#xe7;&#xf5;es em que o software ser&#xe1; aplicado">
<icon BUILTIN="info"/>
</node>
<node CREATED="1479348457098" ID="ID_981119843" MODIFIED="1479348467078" TEXT="Como deve ser executado o BDD">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="help"/>
<node CREATED="1479717769809" ID="ID_1439155362" MODIFIED="1479717876596" TEXT="&#xc9; preciso identificar o objetivo de neg&#xf3;cio">
<icon BUILTIN="full-1"/>
</node>
<node CREATED="1479717784024" ID="ID_1732933370" MODIFIED="1479717880628" TEXT="Identificar as caracter&#xed;sticas/recursos que ajudam a atingir o objetivo de neg&#xf3;cio">
<icon BUILTIN="full-2"/>
</node>
<node CREATED="1479717827728" ID="ID_1834497829" MODIFIED="1479717883100" TEXT="Identificar quais os recursos ser&#xe3;o utilizados como exemplos">
<icon BUILTIN="full-3"/>
</node>
<node CREATED="1479717848928" ID="ID_1444924161" MODIFIED="1479717885188" TEXT="Quais as especifica&#xe7;&#xf5;es ser&#xe3;o execut&#xe1;veis para guiar o desenvolvimento e os testes">
<icon BUILTIN="full-4"/>
</node>
</node>
<node CREATED="1479348526132" ID="ID_1415522488" MODIFIED="1479348541897" TEXT="o que &#xe9; GIVEN, WHEN e THEN">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="help"/>
<node CREATED="1479348567706" ID="ID_951847802" MODIFIED="1479348629355" TEXT="GIVEN">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1479717551285" ID="ID_396451074" MODIFIED="1479717561498" TEXT="Apresenta um contexto inicial"/>
</node>
<node CREATED="1479348577422" ID="ID_1622657804" MODIFIED="1479348629354" TEXT="WHEN">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1479717572069" ID="ID_1056118363" MODIFIED="1479717577164" TEXT="Um evento espec&#xed;fico ocorre"/>
</node>
<node CREATED="1479348580323" ID="ID_448006346" MODIFIED="1479348629347" TEXT="THEN">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1479717594683" ID="ID_890166368" MODIFIED="1479717610920" TEXT="Quais os resultados devem ser esperados"/>
</node>
<node CREATED="1479348583350" ID="ID_1616182805" MODIFIED="1479348656108" TEXT="Tr&#xed;ade essencial do BDD, procura fornecer a base para repassar o comportamento do aplicativo ou dos objetos, podendo ser facilmente compreendido pelos analistas de neg&#xf3;cios, testadores e desenvolvedores">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1479348737131" ID="ID_1504153466" MODIFIED="1479348762396" TEXT="como deve ser o ciclo BDD em RSPEC">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="13"/>
<icon BUILTIN="help"/>
<node CREATED="1479717261274" ID="ID_781844100" MODIFIED="1479717353288" TEXT="&#xc9; preciso verificar ambos os ciclos (RSPEC e Cucumber). Caso os cen&#xe1;rios n&#xe3;o estejam completamente desenvolvidos, &#xe9; preciso verific&#xe1;-los para que possa ser dado o pr&#xf3;ximo passo para desenvolvimento do ciclo RSpec"/>
</node>
<node CREATED="1479348775406" ID="ID_424289423" MODIFIED="1479348796262" TEXT="quais s&#xe3;o os passos/steps">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="help"/>
<node CREATED="1479716954493" ID="ID_262527750" MODIFIED="1479717152580" TEXT="Focar-se em um cen&#xe1;rio">
<icon BUILTIN="full-1"/>
</node>
<node CREATED="1479716977770" ID="ID_1049222056" MODIFIED="1479717157667" TEXT="Definir quais ser&#xe3;o as falhas">
<icon BUILTIN="full-2"/>
</node>
<node CREATED="1479716999879" ID="ID_1010240576" MODIFIED="1479717161610" TEXT="Escrever o exemplo falhando">
<icon BUILTIN="full-3"/>
</node>
<node CREATED="1479717008555" ID="ID_1620626703" MODIFIED="1479717163043" TEXT="Escrever o exemplo para passar">
<icon BUILTIN="full-4"/>
</node>
<node CREATED="1479717031401" ID="ID_991461370" MODIFIED="1479717164427" TEXT="Refatorar o c&#xf3;digo">
<icon BUILTIN="full-5"/>
</node>
<node CREATED="1479717093949" ID="ID_119219619" MODIFIED="1479717165686" TEXT="Caso uma das etapas falhar, refatore, ou escreva novas etapas at&#xe9; direcionar o foco para novos cen&#xe1;rios">
<icon BUILTIN="full-6"/>
</node>
</node>
</node>
<node CREATED="1479348675175" ID="ID_703646271" MODIFIED="1479348683804" POSITION="right" TEXT="o que &#xe9;">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="help"/>
<node CREATED="1479715855896" ID="ID_466864495" MODIFIED="1479716569393" TEXT="Framework de testes no qual tem como base o BDD, trata-se de uma biblioteca de testes voltada para Ruby">
<icon BUILTIN="idea"/>
</node>
<node CREATED="1479716086271" ID="ID_479580771" MODIFIED="1479716724113" TEXT="Possui uma linguagem espec&#xed;fica de dom&#xed;nimo (DSL) para desenvolvimento dos testes">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1479348688841" ID="ID_1711630820" MODIFIED="1479348701746" POSITION="left" TEXT="o que &#xe9; CUCUMBER">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="12"/>
<icon BUILTIN="help"/>
<node CREATED="1479716394195" ID="ID_723865916" MODIFIED="1479716694883" TEXT="Framework utilizado para escrita dos casos de testes referentes aos cen&#xe1;rios que ser&#xe3;o testados">
<icon BUILTIN="idea"/>
</node>
<node CREATED="1479716544723" ID="ID_982096896" MODIFIED="1479716732161" TEXT="Tamb&#xe9;m possui uma linguagem de dom&#xed;nio espec&#xed;fico (DSL) para aplica&#xe7;&#xe3;o dos testes">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1479718120617" ID="ID_432164248" MODIFIED="1479718137673" POSITION="right" TEXT="pontos importantes">
<font BOLD="true" ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="button_ok"/>
<node CREATED="1479718150843" ID="ID_626912526" MODIFIED="1479718151680" TEXT="CUCUMBER ser&#xe1; utilizado para descrever o comportamento do sistema e RSPEC para descrever o comportamento dos objetos"/>
<node CREATED="1479718157175" ID="ID_492385352" MODIFIED="1479718157827" TEXT="RSPEC e CUCUMBER ajuda-nos a identificar o comportamento do c&#xf3;digo-fonte"/>
<node CREATED="1479718219860" ID="ID_498232106" MODIFIED="1479718313441" TEXT="Ambas as ferramentas permitem executar pequenas etapas e observar os resultados retornados. Conforme apresenta&#xe7;&#xe3;o dos resultados, &#xe9; preciso seguir o ciclo de constru&#xe7;&#xe3;o de ambas"/>
</node>
</node>
</map>

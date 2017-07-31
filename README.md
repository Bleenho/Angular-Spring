<!DOCTYPE html><html><head><meta charset="utf-8"><title>README.md</title><style></style></head><body id="preview">
<h1><a id="Requisitos_0"></a>Requisitos</h1>
<ul>
<li>Java</li>
<li>Maven 3.0 &gt;</li>
<li>TomCat 8 ou 9</li>
</ul>
<h1><a id="Arquivo_ZIP_6"></a>Arquivo ZIP:</h1>
<ul>
<li>Api   (folder src .java)</li>
<li>Public  (folder web angularjs)</li>
<li>Api.war (artefato)</li>
</ul>
<h1><a id="Implantao_do_site_modo_1_11"></a>Implantação do site (modo 1)</h1>
<ul>
<li>Inicinar o servidor container TomCat (%TOMCAT_HOME%\bin\startup.bat )</li>
<li>Inserir arquivo Api.war na pasta de deploy (%TOMCAT_HOME%\webapp)</li>
<li>Fazer também o deploy da pasta public (%TOMCAT_HOME%\webapp)</li>
</ul>
<p>Aplicação salva em arquivo nomes.txt dentro do arquivo WAR. Para o sistem salvar em um arquivo local nomes.txt siga os seguintes passos:</p>
<h1><a id="Implantao_do_site_modo_2_18"></a>Implantação do site (modo 2)</h1>
<ul>
<li>Importar a pasta ‘Api’ para dentro da IDE Eclipse;</li>
<li>Na classe org.app.NameRepository.java, alterar a variável NOME_ARQUIVO_TXT_REPOSITORY para o caminho correto do repositorio local e setar variável LOCAL_REPOSITORY como true;</li>
<li>Salvar a classe e gerar o arquivo Api.war com direito no projeto-&gt; exportar -&gt; war;</li>
<li>Fazer deploy no servidor TomCat.</li>
</ul>
<h1><a id="Manual_de_uso_25"></a>Manual de uso</h1>
<ul>
<li>No brownser ao entrar na url <a href="http://127.0.0.1:8080/Api/">http://127.0.0.1:8080/Api/</a> a aplicação oferece em formato swagger os padrões de comunicação Rest (comunicação entre front e back);</li>
<li>Na url <a href="http://127.0.0.1:8080/public/">http://127.0.0.1:8080/public/</a> Uma aplicação com as funções de listagem e adiocionar usuario no menu</li>
<li>Lista mostra os usuarios inseridos no arquivo .txt</li>
<li>Adicionar possui um fomulário para a inserção do usuario.</li>
</ul>

</body></html>
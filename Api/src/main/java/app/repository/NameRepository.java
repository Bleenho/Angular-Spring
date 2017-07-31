package app.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.File;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import app.entidade.Usuario;

@Service
public class NameRepository implements INameRepository {
	private static final String NOME_ARQUIVO_TXT_REPOSITORY = "nomes.txt";   //C:\Users\Casa\Desktop\nomes.txt
	private static final boolean LOCAL_REPOSITORY = false; //true

	/*
	 * retorna uma lista de string onde cada string possui uma linha no txt
	 * */
	@Override
	public List<Usuario> findAllName() {
		
		List<Usuario> result = new ArrayList<Usuario>();
		Usuario user ;
		try {
			///List<String> lines = new ArrayList<String>();
			BufferedReader br;                       //getClass().getResource(NOME_ARQUIVO_TXT_REPOSITORY).getPath())
			if(LOCAL_REPOSITORY) {
				br = new BufferedReader(new FileReader(NOME_ARQUIVO_TXT_REPOSITORY));
			}else {
				br = new BufferedReader(new FileReader(new ClassPathResource(NOME_ARQUIVO_TXT_REPOSITORY).getPath()));
			}
			String line = br.readLine();
			while (line != null)
			{
				user = new Usuario(line);
				result.add(user);
			    line = br.readLine();
			    
			}
		} catch (FileNotFoundException e) {
			System.err.println("repositorio nao encontado "+e.getMessage());
		} catch (IOException e) {
			System.err.println("erro no arquivo "+e.getMessage());
		}
		return result;
	}

	
	//insere novo nome e pula uma linhano txt
	@Override
	public void insertName(String name) {
		
		try {
			BufferedWriter buffWrite ; 
			if(LOCAL_REPOSITORY) {
				buffWrite = new BufferedWriter(new FileWriter(NOME_ARQUIVO_TXT_REPOSITORY, true)); //TRUE PARA BUSCAR OS DADOS SEM APAGAR OQUE JÁ ESTA ESCRITO
			}else {
				buffWrite = new BufferedWriter(new FileWriter(new ClassPathResource(NOME_ARQUIVO_TXT_REPOSITORY).getPath(), true)); //TRUE PARA BUSCAR OS DADOS SEM APAGAR OQUE JÁ ESTA ESCRITO
			}
			buffWrite.append(name + " \r\n");
	        buffWrite.close();
	        
		} catch (IOException e) {
			System.err.println("arquivo de texto nao encontrado: [ERRO]: "+e.getMessage()
			);
		}
	}

}

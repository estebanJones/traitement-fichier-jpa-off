package dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import entities.Categorie;
import entities.Ingredient;
import entities.Magasin;
import entities.Marque;
import entities.Nutriment;
import entities.Produit;


public class ExctractFileDAO {
	private static ExctractFileDAO INSTANCE;
	private static final String PATH = "./file/openFoodFacts.csv";

	private ExctractFileDAO() {}
	
	/**
	 * Singleton de ExtractFileRepo
	 * @return
	 */
	public static ExctractFileDAO getInstance() {
		if(ExctractFileDAO.INSTANCE == null) {
			ExctractFileDAO.INSTANCE = new ExctractFileDAO();
		}
		return ExctractFileDAO.INSTANCE;
	}
	
	
	
	/**
	 * Recupere le fichier pour le lire
	 * @return BufferedReader
	 * @throws IOException
	 */
	public List<String> getFile() throws IOException {
		File file = new File(ExctractFileDAO.PATH);
		return FileUtils.readLines(file, "UTF-8");
	}
}

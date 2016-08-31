package kr.spring.recommend.controller;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MahoutRecommandController {
	@RequestMapping("/recommand.do")
	public String process() throws IOException, TasteException{
		DataModel model=new FileDataModel(new File(""));
		UserSimilarity similarity=new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood=new ThresholdUserNeighborhood(0.1, similarity, model);
		UserBasedRecommender recommander=new GenericUserBasedRecommender(model, neighborhood, similarity);
		
		
		return "recommand";
	}
}
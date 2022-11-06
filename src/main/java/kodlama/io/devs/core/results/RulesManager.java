package kodlama.io.devs.core.results;

import java.util.List;


public class RulesManager {
	

	public static Result checkRules(List<Result> results) {
		Result checkedRulesResult = new Result(true,"Doğrulamalar Başarılı");
		for (Result result : results) {
			if (!result.isSuccess()) {
				
				checkedRulesResult.setSuccess(false);
				checkedRulesResult.setMessage("Doğrulama Hatası");
				System.out.println(result.getMessage());
				
			}
		}
		
		return checkedRulesResult;
		
	}

}

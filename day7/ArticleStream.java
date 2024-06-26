package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleStream {

	
		public static List<Article> getArticles(){ 
		
			List<Article> lst = new ArrayList<>();
			lst.add(new Article(555,"AI",2023,5400));
			lst.add(new Article(666,"ML",2024,600));
			lst.add(new Article(777,"SQL",2020,400));
			lst.add(new Article(888,"AI",2019,1200));
			lst.add(new Article(999,"Java",2023,1300));
			return lst;
		}
		
		public static void main(String[] args) {
			List<Article> lst = new ArrayList<>();
			lst = getArticles();
			
			Stream<Article> astream = lst.stream();
			astream.forEach(System.out::println);
			
			System.out.println("***************** Article in 2023 ************************");
			
		    Predicate<Article> y2023 = (art) -> art.getYear()==2023;
		    astream = lst.stream();
		    astream.filter(y2023).forEach(System.out::println);
		    
		    System.out.println("***************** AI Article ************************");
			
		    Predicate<Article> subAI = (art) -> art.getSubject().equals("AI");
		    astream = lst.stream();
		    astream.filter(subAI).forEach(System.out::println);
		    
		    System.out.println("***************** Groupby Subject ************************");
		    astream = lst.stream();
		    Map<String, List<Article>> subart= astream.collect(Collectors.groupingBy(Article::getSubject));
		    System.out.println(subart);
		    
		    System.out.println("***************** SortBy Subject ************************");
		    astream = lst.stream();
		    Comparator <Article> sortbysub =  Comparator.comparing(Article::getSubject);
		    astream.sorted(sortbysub).forEach(System.out::println);
			
		    
		    System.out.println("***************** Count by Subject ************************");
		    astream = lst.stream();
		    Map<String,Long> cntsub= astream.collect(Collectors.groupingBy(Article::getSubject,Collectors.counting()));
		    System.out.println(cntsub);
		    
		    System.out.println("***************** Articles with >1k views ************************");
		    Predicate<Article> views = (art) -> art.getViews()>1000;
		    astream = lst.stream();
		    Map<String,Long> moreviews= astream.filter(views).collect(Collectors.groupingBy(Article::getSubject,Collectors.counting()));
		    System.out.println(moreviews);
		    
		    
		    System.out.println("***************** Group and with published year ************************");
		    astream = lst.stream();
		    Map<Integer,Long> pubyear= astream.collect(Collectors.groupingBy(Article::getYear,Collectors.counting()));
		    System.out.println(pubyear);
		    
		}

	

}

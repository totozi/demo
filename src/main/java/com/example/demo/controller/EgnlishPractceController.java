package com.example.demo.controller;

import java.util.ArrayList;

import javax.print.attribute.standard.JobName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.vo.WordVo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
@RequestMapping("/study")
public class EgnlishPractceController {
	
	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/plain; charset=UTF-8")
	public ModelAndView getPage() {
    	
		ModelAndView mv = new ModelAndView("EnglishPractice");
		
		logger.info("getPage..");
		
		return mv;

	}	
	
	@RequestMapping(value = "/english", method = RequestMethod.GET, produces = "text/plain; charset=UTF-8")
	public String getListOfContent() {
    	
		logger.info("getListOfContent..");
		

		ArrayList<WordVo> arrList = new ArrayList<WordVo>();
		
		arrList.add(new WordVo("Please come aboard the little ship.", "그 작은 배에 승선해 주세요."));
		arrList.add(new WordVo("All aboard!", "모두 탑승해 주세요!"));
		arrList.add(new WordVo("We are not putting anyone aboard this machine unless there is some sort of criminal protection.", "범죄 예방 조치가 있지 않으면 우리는 이 기계에 아무도 탑승시키지 않습니다."));
		arrList.add(new WordVo("They scrambled aboard the news chopper, with the rain pouring.", "그들은 비가 퍼붓는 가운데 그 언론사 헬리콥터에 기어 올라갔다."));
		arrList.add(new WordVo("I won't get aboard the raft.", "나는 그 뗏목에 오르지 않을 것이다."));
		arrList.add(new WordVo("What is it all about?", "도대체 이것이 전부 무엇에 관한 일이냐?"));
		arrList.add(new WordVo("People about us seem like aliens.", "우리 주위의 사람들이 외국인처럼 보인다."));
		arrList.add(new WordVo("How did it come about that she got divorced?", "그녀가 어쩌다 이혼하는 일이 생겼는가?"));
		arrList.add(new WordVo("He is walking about the room.", "그는 방을 서성거리고 있다."));
		arrList.add(new WordVo("Animals in zoos have no large space to run about.", "동물원의 동물들은 여기저기 뛰어다닐 넓은 공간이 없다."));
		arrList.add(new WordVo("Typhoons can come about in September.", "태풍들은 9월에 생길 수 있다."));
		arrList.add(new WordVo("I think I will go swimming about the end of July.", "나는 7월 말 경에 수영을 갈 것이라고 생각한다."));
		arrList.add(new WordVo("He is about my size.", "그는 대략 나만하다."));
		arrList.add(new WordVo("All the things he has about him are illegal.", "그가 소지하고 있는 모든 물건들은 불법이다."));
		arrList.add(new WordVo("Thre is something noble about him.", "그에게는 무엇인가 기품이 있다."));
		arrList.add(new WordVo("What is he about?", "그는 무엇에 착수하고 있지?"));
		arrList.add(new WordVo("He is about financing.", "그는 재정 담당입니다."));
		arrList.add(new WordVo("He knows what he is about.", "그는 자기가 무엇을 담당하고 있는지 안다."));
		arrList.add(new WordVo("How do you go about driving?", "운전하는 방법이 무엇입니까?"));
		arrList.add(new WordVo("His eyes seem about to pop out.", "그의 눈이 막 튀어나올 것처럼 보인다."));
		arrList.add(new WordVo("Shes was about to begin a new life when he came back.", "그가 돌아왔을 대 그녀는 막 새로운 삶을 시작하려고 했다."));
		arrList.add(new WordVo("It was a beautiful Friday afternoon and the weekend was about to begin, but Rob had a lot on his mind.", "아름다운 금요일 오후 주말이 막 시작할 무렵이었지만 Rob은 마음이 심란했다."));
		arrList.add(new WordVo("There is a bird above the tree.", "그 나무 위에 새 한마리가 있다."));
		arrList.add(new WordVo("You can find a small village above the river.", "당신은 강 상류에서 조그마한 마을을 찾을 수 있다."));
		arrList.add(new WordVo("He lives five doors above the school.", "그는 학교 위로 다섯 번째 집에 산다."));
		arrList.add(new WordVo("The statements above are true to the best of my knowledge.", "위의 진술은 틀림없습니다."));
		arrList.add(new WordVo("The peak rises above the clouds.", "그 봉우리는 구름 위에 솟아 있다."));
		arrList.add(new WordVo("We allow men above 20.", "우리는 20세 이상의 남자만 받습니다."));
		arrList.add(new WordVo("I value honor above life.", "나는 생명보다 명예를 중히 여긴다."));
		arrList.add(new WordVo("Don't live above your income.", "수입 이상의 생활을 하지 마라."));
		arrList.add(new WordVo("We will be above the freezing point all day today.", "오늘은 내내 영상에 있겠습니다."));
		arrList.add(new WordVo("The book is above my understanding.", "이 책은 내게는 너무 어려워서 이해할 수 없다."));
		arrList.add(new WordVo("He is above telling lies.", "그는 거짓말을 할 사람은 아니다."));
		arrList.add(new WordVo("I sat across the table from him.", "나는 그와 책상을 마주하고 앉았다."));
		arrList.add(new WordVo("He looked across at the painting on the wall.", "그는 맞은편 벽 위의 그 그림을 쳐다봤다."));
		arrList.add(new WordVo("Sunlight creeps across the ground.", "햇빛이 땅을 가로질러 드리운다."));
		arrList.add(new WordVo("A column of ants is threading its way across the floor.", "개미들 한 줄이 바닥을 가로질러 일렬로 가고 있다."));
		arrList.add(new WordVo("I have never come across one of these before.", "나는 이와 같은 것을 예전에 만나 본 적이 없다."));
		arrList.add(new WordVo("There were 3 rules that my boss tried to get across.", "내 보스가 이해시키려고 애썼던 세 가지 규칙이 있었다."));
		arrList.add(new WordVo("I couldn't put my ideas across successfully.", "나는 나의 생각을 성공적으로 전달시키지 못했다."));
		arrList.add(new WordVo("Shut the door after you.", "들어온 후 문을 닫으세요."));
		arrList.add(new WordVo("After you.", "먼저 하십시오."));
		arrList.add(new WordVo("It's 10 minutes after past six.", "여섯 시 10분입니다."));
		arrList.add(new WordVo("Day after day, I was out waiting for my husband to come back to me.", "매일 매일 나는 남편이 돌아오길 기다리면서 밖에 나가 있었다."));
		arrList.add(new WordVo("Time after time, he missed the target.", "매번 그는 과녁을 빗나갔다."));
		arrList.add(new WordVo("He read page after page to catch the point.", "그는 요점을 이해하려고 계속 읽었다."));
		arrList.add(new WordVo("He saw the pictures one after the other.", "그는 그 사진들을 번갈아서 보았다."));
		arrList.add(new WordVo("Money comes after health.", "돈보다 건강이 중요하다."));
		arrList.add(new WordVo("What is he after?", "그는 무엇을 추구하지?"));
		arrList.add(new WordVo("He never asks after me.", "그는 결코 나의 안부를 묻지 않는다."));
		arrList.add(new WordVo("He looked after the boys.", "그는 그 아이들을 보살폈다."));
		arrList.add(new WordVo("After what you have said, I shall be careful.", "그렇게 말씀하시니 조심하겠습니다."));
		arrList.add(new WordVo("After all my advice, you messed it up.", "내 모든 충고에도 불구하고 당신은 그것을 망쳤다."));
		arrList.add(new WordVo("After all, you were right.", "결국 당신이 옳았다."));
		arrList.add(new WordVo("The statues are modeled after the Greek gods.", "그 조각상들은 그리스신들을 따서 만들어졌다."));

		
		String result = new Gson().toJson(arrList);
		
		
		return result;

	}	
}



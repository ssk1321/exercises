
// エラーした際のコンソール確認用
// serviceImpl
System.out.println("serviceImpl 49line"  + resultUserList.get(1));

// AccountRepositoryの71~75行目までの出力確認
System.out.println((String) result.get("user_id"));
System.out.println((String) result.get("user_name"));
System.out.println((Integer) result.get("post_id"));
System.out.println((String) result.get("impressions"));

// controllerのエラー確認
System.out.println("controller loginpass User_name: " + sessionForm.getUser_name());
sessionForm.setUser_name(result);

//loninresultに値が入っているか
System.out.println("controller loninresult User_name: " + sessionForm.getPassword());

// getmapping("/main")で取得できているか確認
		// Listの０番目のuser_idを取得
System.out.println(cinemasPostsList.get(0).getUser_id());
System.out.println(cinemasPostsList.get(0).getTitle());
		//		<p>[[${cinemasPost.user_name}]] : [[${cinemasPost.title}]]</p>

	<div th:each="retentionUser : ${resultUserList}">
	<p>[[${retentionUser.user_name}]]さん,Cinemasにようこそ。</p>
	</div>
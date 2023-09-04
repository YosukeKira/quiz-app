package com.example.quiz.service;

import java.util.Optional;

import com.example.quiz.entity.Quiz;

/** Quizサービス処理：Service */
public interface QuizService {
	/** クイズ情報を全件取得する */
	Iterable<Quiz> selectAll();
	/** クイズ情報を、IDをキーに1件取得する */
	Optional<Quiz> selectOneById(Integer id);
	/** クイズ情報をランダムで1件取得する */
	Optional<Quiz> selectOneRandomQuiz();
	/** クイズ情報の正解/不正解を判定する */
	Boolean checkQuiz(Integer id, Boolean myAnswer);
	/** クイズを登録する */
	void insertQuiz(Quiz quiz);
	/** クイズを更新する */
	void updateQuiz(Quiz quiz);
	/** クイズを削除する */
	void deleteQuizById(Integer id);
}

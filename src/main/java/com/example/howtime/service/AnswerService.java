package com.example.howtime.service;

import com.example.howtime.domain.Answer;
import com.example.howtime.domain.AnswerCreation;
import com.example.howtime.domain.Board;
import com.example.howtime.domain.BoardCreation;
import com.example.howtime.repository.AnswerCreationRepository;
import com.example.howtime.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    private final AnswerCreationRepository answerCreationRepository;

    public AnswerCreation create(AnswerCreation answerCreation) {
        return answerCreationRepository.save(answerCreation);
    }

    public List<Answer> getAnswer(int boardId){
        return this.answerRepository.findByBoardId(boardId);
    }
}

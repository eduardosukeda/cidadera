package com.cidadera.trabalhofinal.adapters.configuration;

import com.cidadera.trabalhofinal.business.entities.Comment;
import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.entities.User;
import com.cidadera.trabalhofinal.business.entities.enums.IssueCategoryEnum;
import com.cidadera.trabalhofinal.business.entities.enums.IssueStatusEnum;
import com.cidadera.trabalhofinal.business.entities.enums.UserTypeEnum;
import com.cidadera.trabalhofinal.business.repositories.CommentRepository;
import com.cidadera.trabalhofinal.business.repositories.IssueRepository;
import com.cidadera.trabalhofinal.business.repositories.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class TestDataRunner implements ApplicationRunner {
    private final IssueRepository issueRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;

    public TestDataRunner(IssueRepository issueRepository, CommentRepository commentRepository, UserRepository userRepository) {
        this.issueRepository = issueRepository;
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User francisco = userRepository.save(new User("Francisco", UserTypeEnum.NORMAL));
        User douglas = userRepository.save(new User("Douglas", UserTypeEnum.ADMINISTRADOR));
        User fernanda = userRepository.save(new User("Fernanda", UserTypeEnum.OFICIAL));

        Issue issue1 = issueRepository.save(new Issue("Probemas na via", "Vias com buraco", LocalDate.now(), "Partenon", "Bento", IssueCategoryEnum.BURACO_NA_VIA, IssueStatusEnum.ABERTA, francisco));
        Issue issue2 = issueRepository.save(new Issue("Probemas na via", "Vias escuras", LocalDate.of(2021, 5, 15), "Vila Joao Pessoa", "Ipiranga", IssueCategoryEnum.ILUMINACAO, IssueStatusEnum.ABERTA, fernanda));
        Issue issue3 = issueRepository.save(new Issue("Probemas na via", "Vias escuras", LocalDate.now(), "Partenon", "Bento", IssueCategoryEnum.ILUMINACAO, IssueStatusEnum.ABERTA, douglas));
        Issue issue4 = issueRepository.save(new Issue("Probemas na via", "Vias escuras", LocalDate.now(), "Partenon", "Bento", IssueCategoryEnum.ILUMINACAO, IssueStatusEnum.ABERTA, douglas));

        commentRepository.save(new Comment("Concordo", issue1, douglas));
        commentRepository.save(new Comment("Concordo tambem", issue1, fernanda));
        commentRepository.save(new Comment("Concordo tambem", issue3, francisco));

    }
}

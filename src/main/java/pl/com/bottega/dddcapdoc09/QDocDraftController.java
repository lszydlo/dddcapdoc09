package pl.com.bottega.dddcapdoc09;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bottega.dddcapdoc09.preparation.CreateQDocDraft;
import pl.com.bottega.dddcapdoc09.publication.PublicationService;

@RestController
public class QDocDraftController {

	PublicationService service;

	ResponseEntity<Void> create(@Validated CreateQDocDraft command)
	{
		service.handle(command);
		return ResponseEntity.ok().build();
	}
}

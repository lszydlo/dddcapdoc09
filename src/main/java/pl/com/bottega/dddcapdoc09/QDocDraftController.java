package pl.com.bottega.dddcapdoc09;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bottega.dddcapdoc09.preparation.DoCreateQDocDraft;
import pl.com.bottega.dddcapdoc09.preparation.PreparationService;

@RestController
public class QDocDraftController {

	PreparationService service;

	ResponseEntity<Void> create(@Validated DoCreateQDocDraft command)
	{
		service.handle(command);
		return ResponseEntity.ok().build();
	}
}

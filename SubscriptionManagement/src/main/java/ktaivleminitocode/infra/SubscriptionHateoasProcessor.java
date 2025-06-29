package ktaivleminitocode.infra;

import ktaivleminitocode.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Subscription>> {

    @Override
    public EntityModel<Subscription> process(EntityModel<Subscription> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/activatesubscription"
                )
                .withRel("activatesubscription")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/requestsubscription"
                )
                .withRel("requestsubscription")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/cancelsubscription"
                )
                .withRel("cancelsubscription")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/unablesubscription"
                )
                .withRel("unablesubscription")
        );

        return model;
    }
}

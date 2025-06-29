package ktaivleminitocode.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import ktaivleminitocode.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/subscriptions")
@Transactional
public class SubscriptionController {

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @RequestMapping(
        value = "/subscriptionsactivatesubscription",
        method = RequestMethod.PATCH,
        produces = "application/json;charset=UTF-8"
    )
    public Subscription activateSubscription(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody ActivateSubscriptionCommand activateSubscriptionCommand
    ) throws Exception {
        System.out.println(
            "##### /subscription/activateSubscription  called #####"
        );
        Subscription subscription = new Subscription();
        subscription.activateSubscription(activateSubscriptionCommand);
        subscriptionRepository.save(subscription);
        return subscription;
    }

    @RequestMapping(
        value = "/subscriptions/requestsubscription",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Subscription requestSubscription(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody RequestSubscriptionCommand requestSubscriptionCommand
    ) throws Exception {
        System.out.println(
            "##### /subscription/requestSubscription  called #####"
        );
        Subscription subscription = new Subscription();
        subscription.requestSubscription(requestSubscriptionCommand);
        subscriptionRepository.save(subscription);
        return subscription;
    }

    @RequestMapping(
        value = "/subscriptionscancelsubscription",
        method = RequestMethod.PATCH,
        produces = "application/json;charset=UTF-8"
    )
    public Subscription cancelSubscription(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody CancelSubscriptionCommand cancelSubscriptionCommand
    ) throws Exception {
        System.out.println(
            "##### /subscription/cancelSubscription  called #####"
        );
        Subscription subscription = new Subscription();
        subscription.cancelSubscription(cancelSubscriptionCommand);
        subscriptionRepository.save(subscription);
        return subscription;
    }

    @RequestMapping(
        value = "/subscriptions/unablesubscription",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Subscription unableSubscription(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody UnableSubscriptionCommand unableSubscriptionCommand
    ) throws Exception {
        System.out.println(
            "##### /subscription/unableSubscription  called #####"
        );
        Subscription subscription = new Subscription();
        subscription.unableSubscription(unableSubscriptionCommand);
        subscriptionRepository.save(subscription);
        return subscription;
    }
}
//>>> Clean Arch / Inbound Adaptor

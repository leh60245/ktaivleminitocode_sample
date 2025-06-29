package ktaivleminitocode.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktaivleminitocode.SubscriptionManagementApplication;
import ktaivleminitocode.domain.SubscriptionChecked;
import lombok.Data;

@Entity
@Table(name = "Subscription_table")
@Data
//<<< DDD / Aggregate Root
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subscriptionId;

    private SubscriptionPlanType planType;

    private Date startDate;

    private Date endDate;

    private SubscriptionStatus status;

    private Long subscriberId;

    private SubscriptionStatus subscriptionStatus;

    public static SubscriptionRepository repository() {
        SubscriptionRepository subscriptionRepository = SubscriptionManagementApplication.applicationContext.getBean(
            SubscriptionRepository.class
        );
        return subscriptionRepository;
    }

    //<<< Clean Arch / Port Method
    public void activateSubscription(
        ActivateSubscriptionCommand activateSubscriptionCommand
    ) {
        //implement business logic here:

        SubscriptionActivated subscriptionActivated = new SubscriptionActivated(
            this
        );
        subscriptionActivated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void requestSubscription(
        RequestSubscriptionCommand requestSubscriptionCommand
    ) {
        //implement business logic here:

        SubscriptionRequested subscriptionRequested = new SubscriptionRequested(
            this
        );
        subscriptionRequested.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void cancelSubscription(
        CancelSubscriptionCommand cancelSubscriptionCommand
    ) {
        //implement business logic here:

        SubscriptionCancelled subscriptionCancelled = new SubscriptionCancelled(
            this
        );
        subscriptionCancelled.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void unableSubscription(
        UnableSubscriptionCommand unableSubscriptionCommand
    ) {
        //implement business logic here:

        SubscriptionDeactivated subscriptionDeactivated = new SubscriptionDeactivated(
            this
        );
        subscriptionDeactivated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void checkSubscription(ReadBookPlaced readBookPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Subscription subscription = new Subscription();
        repository().save(subscription);

        SubscriptionChecked subscriptionChecked = new SubscriptionChecked(subscription);
        subscriptionChecked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(readBookPlaced.get???()).ifPresent(subscription->{
            
            subscription // do something
            repository().save(subscription);

            SubscriptionChecked subscriptionChecked = new SubscriptionChecked(subscription);
            subscriptionChecked.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

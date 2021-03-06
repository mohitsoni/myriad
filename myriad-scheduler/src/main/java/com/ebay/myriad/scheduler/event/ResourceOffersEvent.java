/**
 * Copyright 2015 PayPal
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ebay.myriad.scheduler.event;

import org.apache.mesos.Protos;
import org.apache.mesos.SchedulerDriver;

import java.util.List;

/**
 * resource offer event
 */
public class ResourceOffersEvent {
    private SchedulerDriver driver;
    private List<Protos.Offer> offers;

    public SchedulerDriver getDriver() {
        return driver;
    }

    public void setDriver(SchedulerDriver driver) {
        this.driver = driver;
    }

    public List<Protos.Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Protos.Offer> offers) {
        this.offers = offers;
    }
}

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
package com.ebay.myriad.scheduler.event.handlers;

import com.ebay.myriad.scheduler.event.SlaveLostEvent;
import com.lmax.disruptor.EventHandler;
import org.apache.mesos.Protos.SlaveID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * handles and logs mesos slave lost events
 */
public class SlaveLostEventHandler implements EventHandler<SlaveLostEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SlaveLostEventHandler.class);

    @Override
    public void onEvent(SlaveLostEvent event, long sequence, boolean endOfBatch) throws Exception {
        SlaveID slaveId = event.getSlaveId();
        LOGGER.info("Slave {} lost!", slaveId);
    }

}

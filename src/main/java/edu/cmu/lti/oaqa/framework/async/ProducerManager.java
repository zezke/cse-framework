/*
 *  Copyright 2012 Carnegie Mellon University
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package edu.cmu.lti.oaqa.framework.async;

import java.io.Closeable;
import java.util.Set;

import javax.jms.JMSException;

public interface ProducerManager extends Closeable {

  public static final String COMPLETION_QUEUE_SUFFIX = "-completion";
  
  void notifyCloseCollectionReaders() throws Exception;

  void waitForReaderCompletion() throws JMSException;
  
  void notifyNextConfigurationIsReady() throws JMSException;

  void waitForProcessCompletion() throws InterruptedException;
  
}

/**
 * Copyright 2012 Impetus Infotech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.impetus.kundera.browser.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.impetus.kundera.browser.common.Utilities;
import com.impetus.kundera.browser.dto.Book;
import com.impetus.kundera.browser.dto.Song;


/**
 * <Prove description of functionality provided by this Type>
 * 
 * @author amresh.singh
 */
public class StartupListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent context)
    {
         Utilities.clazzMap.put(Book.class.getSimpleName(), Book.class);
         Utilities.clazzMap.put(Song.class.getSimpleName(), Song.class);
         
         Utilities.tableClazzMap.put("BOOK", "Book");
         Utilities.tableClazzMap.put("SONG", "Song");

    }

    public void contextDestroyed(ServletContextEvent context)
    {
        // Nothing to do as of now
    }    

}

package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * This code is licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * ==Overview==
 * <p>
 * This class allows to define a simple Submission Type. The default types are: COMPLETE, PARTIAL, RAW, PRIDE, other submission types can be defined in the
 * database / solr indexes.
 *
 * <p>
 * Created by ypriverol (ypriverol@gmail.com) on 27/02/2018.
 */
@Deprecated
public interface SubmissionType extends EntityProvider {

    //Get name of the Submission Type
    String getName();

}

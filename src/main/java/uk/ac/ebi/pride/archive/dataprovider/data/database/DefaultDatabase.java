package uk.ac.ebi.pride.archive.dataprovider.data.database;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This code is licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * ==Overview==
 * <p>
 * This class
 * <p>
 * Created by ypriverol (ypriverol@gmail.com) on 22/05/2018.
 */
public class DefaultDatabase implements DatabaseProvider{

    private String name;
    private String version;
    private String accession;
    private List<CvParamProvider> attributes;

    /**
     * Default Constructor
     */
    public DefaultDatabase() { }

    /**
     * Constructor of the Database Entity.
     * @param name name of the database
     * @param version version of the database
     */
    public DefaultDatabase(String name, String version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public String genaName() {
        return this.name;
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public Comparable getId() {
        return accession;
    }

    @Override
    public Collection<? extends String> getAdditionalAttributesStrings() {
        List<String> attributes = Collections.EMPTY_LIST;
        if(this.attributes != null && !this.attributes.isEmpty())
            attributes = this.attributes.stream().map(CvParamProvider::getName).collect(Collectors.toList());
        return attributes;
    }
}

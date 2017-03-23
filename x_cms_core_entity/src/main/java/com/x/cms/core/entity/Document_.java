/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.cms.core.entity.Document.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 13:46:13 CST 2017")
public class Document_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Document,String> appId;
    public static volatile SingularAttribute<Document,String> appName;
    public static volatile ListAttribute<Document,String> attachmentList;
    public static volatile SingularAttribute<Document,String> categoryAlias;
    public static volatile SingularAttribute<Document,String> categoryId;
    public static volatile SingularAttribute<Document,String> categoryName;
    public static volatile SingularAttribute<Document,Date> createTime;
    public static volatile SingularAttribute<Document,String> creatorCompany;
    public static volatile SingularAttribute<Document,String> creatorDepartment;
    public static volatile SingularAttribute<Document,String> creatorIdentity;
    public static volatile SingularAttribute<Document,String> creatorPerson;
    public static volatile SingularAttribute<Document,String> docStatus;
    public static volatile SingularAttribute<Document,String> form;
    public static volatile SingularAttribute<Document,String> formName;
    public static volatile SingularAttribute<Document,String> id;
    public static volatile SingularAttribute<Document,Date> publishTime;
    public static volatile SingularAttribute<Document,String> readFormId;
    public static volatile SingularAttribute<Document,String> readFormName;
    public static volatile SingularAttribute<Document,String> sequence;
    public static volatile SingularAttribute<Document,String> title;
    public static volatile SingularAttribute<Document,Date> updateTime;
    public static volatile SingularAttribute<Document,Long> viewCount;
}
package com.diary.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDaily is a Querydsl query type for Daily
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDaily extends EntityPathBase<Daily> {

    private static final long serialVersionUID = -1284924846L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDaily daily = new QDaily("daily");

    public final StringPath content_d = createString("content_d");

    public final StringPath image_d = createString("image_d");

    public final StringPath map_d = createString("map_d");

    public final StringPath memo_d = createString("memo_d");

    public final DateTimePath<java.sql.Date> regdate_d = createDateTime("regdate_d", java.sql.Date.class);

    public final NumberPath<Integer> seq_d = createNumber("seq_d", Integer.class);

    public final QUsers user;

    public QDaily(String variable) {
        this(Daily.class, forVariable(variable), INITS);
    }

    public QDaily(Path<? extends Daily> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDaily(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDaily(PathMetadata metadata, PathInits inits) {
        this(Daily.class, metadata, inits);
    }

    public QDaily(Class<? extends Daily> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUsers(forProperty("user")) : null;
    }

}


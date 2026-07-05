package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q26  reason: default package */
/* loaded from: classes.dex */
public enum q26 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf((float) nae.e)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(c31.class, c31.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    
    public final Object a;

    q26(Class cls, Serializable serializable) {
        this.a = serializable;
    }
}

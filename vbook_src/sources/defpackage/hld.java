package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hld  reason: default package */
/* loaded from: classes.dex */
public enum hld {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf((float) nae.e)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c31.c),
    ENUM(null),
    MESSAGE(null);
    
    public final Object a;

    hld(Serializable serializable) {
        this.a = serializable;
    }
}

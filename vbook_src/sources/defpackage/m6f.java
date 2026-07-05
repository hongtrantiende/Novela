package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m6f  reason: default package */
/* loaded from: classes.dex */
public abstract class m6f implements Serializable {
    public static q6f c(Object obj) {
        obj.getClass();
        return new q6f(obj);
    }

    public static m6f d(Object obj) {
        if (obj == null) {
            return c6f.a;
        }
        return new q6f(obj);
    }

    public abstract Object a();

    public abstract m6f b(h6f h6fVar);

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}

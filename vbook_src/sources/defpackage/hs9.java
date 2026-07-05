package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hs9  reason: default package */
/* loaded from: classes3.dex */
public final class hs9 implements Serializable {
    public final Object a;

    public /* synthetic */ hs9(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof gs9) {
            return ((gs9) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hs9) {
            if (!c16.i(this.a, ((hs9) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof gs9) {
            return ((gs9) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}

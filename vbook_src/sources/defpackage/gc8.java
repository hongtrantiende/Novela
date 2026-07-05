package defpackage;

import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gc8  reason: default package */
/* loaded from: classes.dex */
public final class gc8 {
    public static final gc8 b = new gc8();
    public final gl8 a;

    public gc8() {
        gl8.a.getClass();
        this.a = hq7.N;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gc8) && c16.i(this.a, ((gc8) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ((jw2) this.a).getClass();
        return Context.VERSION_ES6;
    }

    public final String toString() {
        return "OneFingerScaleSpec(panToScaleTransformer=" + this.a + ')';
    }
}

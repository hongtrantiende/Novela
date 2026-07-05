package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv3  reason: default package */
/* loaded from: classes.dex */
public final class yv3 {
    public final List a;

    public yv3(jq6 jq6Var) {
        jq6Var.getClass();
        this.a = jq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yv3) && c16.i(this.a, ((yv3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EpubTableOfContent(references=" + this.a + ")";
    }
}

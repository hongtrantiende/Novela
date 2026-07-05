package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ta5  reason: default package */
/* loaded from: classes.dex */
public final class ta5 {
    public final List a;
    public final List b;

    public ta5(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ta5) {
                ta5 ta5Var = (ta5) obj;
                if (!this.a.equals(ta5Var.a) || !this.b.equals(ta5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HtmlDecodeResult(blocks=" + this.a + ", warnings=" + this.b + ")";
    }
}

package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hc5  reason: default package */
/* loaded from: classes.dex */
public final class hc5 {
    public final ArrayList a;
    public final ArrayList b;

    public hc5(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hc5) {
                hc5 hc5Var = (hc5) obj;
                if (!this.a.equals(hc5Var.a) || !this.b.equals(hc5Var.b)) {
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
        return "HtmlParseResult(nodes=" + this.a + ", warnings=" + this.b + ")";
    }
}

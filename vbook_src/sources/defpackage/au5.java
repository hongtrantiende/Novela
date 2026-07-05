package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: au5  reason: default package */
/* loaded from: classes.dex */
public final class au5 {
    public final int a;
    public final ArrayList b;

    public au5(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof au5) {
                au5 au5Var = (au5) obj;
                if (this.a != au5Var.a || !this.b.equals(au5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "IndexTag(tagId=" + this.a + ", tagValues=" + this.b + ")";
    }
}

package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hq1  reason: default package */
/* loaded from: classes3.dex */
public final class hq1 {
    public final ArrayList a;
    public final String b;

    public hq1(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hq1) {
                hq1 hq1Var = (hq1) obj;
                if (!this.a.equals(hq1Var.a) || !this.b.equals(hq1Var.b)) {
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
        return "CommentPage(comments=" + this.a + ", data2=" + this.b + ")";
    }
}

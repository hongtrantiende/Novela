package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: sa8  reason: default package */
/* loaded from: classes3.dex */
public final class sa8 {
    public static final ra8 Companion = new Object();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ sa8(int i, String str, String str2, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa8)) {
            return false;
        }
        sa8 sa8Var = (sa8) obj;
        if (c16.i(this.a, sa8Var.a) && c16.i(this.b, sa8Var.b) && this.c == sa8Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("OldSyncName(name=", this.a, ", replace=", this.b, ", ignoreCase="), this.c);
    }
}

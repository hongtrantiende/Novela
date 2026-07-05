package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: hb8  reason: default package */
/* loaded from: classes3.dex */
public final class hb8 {
    public static final gb8 Companion = new Object();
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ hb8(int i, String str, boolean z, boolean z2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb8)) {
            return false;
        }
        hb8 hb8Var = (hb8) obj;
        if (c16.i(this.a, hb8Var.a) && this.b == hb8Var.b && this.c == hb8Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldSyncTrash(findWhat=");
        sb.append(this.a);
        sb.append(", regexp=");
        sb.append(this.b);
        sb.append(", enable=");
        return rs8.m(")", sb, this.c);
    }
}

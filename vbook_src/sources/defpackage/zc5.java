package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zc5  reason: default package */
/* loaded from: classes3.dex */
public final class zc5 implements bd5 {
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final int d;
    public final int e;

    public zc5(String str, ArrayList arrayList, boolean z, int i, int i2) {
        this.a = str;
        this.b = arrayList;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zc5) {
                zc5 zc5Var = (zc5) obj;
                if (!this.a.equals(zc5Var.a) || !this.b.equals(zc5Var.b) || this.c != zc5Var.c || this.d != zc5Var.d || this.e != zc5Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + hl5.a(this.d, eub.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenTag(name=");
        sb.append(this.a);
        sb.append(", attributes=");
        sb.append(this.b);
        sb.append(", selfClosing=");
        sb.append(this.c);
        sb.append(", sourceStart=");
        sb.append(this.d);
        sb.append(", sourceEndExclusive=");
        return rs8.g(this.e, ")", sb);
    }
}

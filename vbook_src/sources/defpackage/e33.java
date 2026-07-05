package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e33  reason: default package */
/* loaded from: classes3.dex */
public final class e33 {
    public final long a;
    public final int b;
    public final bzc c;
    public final int d;
    public final f33 e;
    public final int f;
    public final boolean g;
    public final long h;
    public final long i;
    public final List j;
    public final String k;

    public e33(long j, int i, bzc bzcVar, int i2, f33 f33Var, int i3, boolean z, long j2, long j3, List list, String str) {
        str.getClass();
        this.a = j;
        this.b = i;
        this.c = bzcVar;
        this.d = i2;
        this.e = f33Var;
        this.f = i3;
        this.g = z;
        this.h = j2;
        this.i = j3;
        this.j = list;
        this.k = str;
    }

    public static e33 a(e33 e33Var, int i, boolean z, List list, int i2) {
        int i3;
        int i4;
        boolean z2;
        List list2;
        long j = e33Var.a;
        int i5 = e33Var.b;
        bzc bzcVar = e33Var.c;
        if ((i2 & 8) != 0) {
            i3 = e33Var.d;
        } else {
            i3 = 2;
        }
        f33 f33Var = e33Var.e;
        if ((i2 & 32) != 0) {
            i4 = e33Var.f;
        } else {
            i4 = i;
        }
        if ((i2 & 64) != 0) {
            z2 = e33Var.g;
        } else {
            z2 = z;
        }
        long j2 = e33Var.h;
        boolean z3 = z2;
        long j3 = e33Var.i;
        if ((i2 & 512) != 0) {
            list2 = e33Var.j;
        } else {
            list2 = list;
        }
        String str = e33Var.k;
        str.getClass();
        return new e33(j, i5, bzcVar, i3, f33Var, i4, z3, j2, j3, list2, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e33) {
                e33 e33Var = (e33) obj;
                if (this.a != e33Var.a || this.b != e33Var.b || !this.c.equals(e33Var.c) || this.d != e33Var.d || !c16.i(this.e, e33Var.e) || this.f != e33Var.f || this.g != e33Var.g || this.h != e33Var.h || this.i != e33Var.i || !this.j.equals(e33Var.j) || !c16.i(this.k, e33Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = hl5.a(this.b, Long.hashCode(this.a) * 31, 31);
        int a2 = hl5.a(this.d, (this.c.hashCode() + a) * 31, 31);
        f33 f33Var = this.e;
        if (f33Var == null) {
            hashCode = 0;
        } else {
            hashCode = f33Var.hashCode();
        }
        return this.k.hashCode() + eub.l(hl5.c(hl5.c(eub.k(hl5.a(this.f, (a2 + hashCode) * 31, 31), 31, this.g), this.h, 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailPost(id=");
        sb.append(this.a);
        sb.append(", topicId=");
        sb.append(this.b);
        sb.append(", user=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", likes=");
        sb.append(this.f);
        sb.append(", liked=");
        sb.append(this.g);
        sb.append(", updatedAt=");
        sb.append(this.h);
        rs8.x(sb, ", createdAt=", this.i, ", blocks=");
        sb.append(this.j);
        sb.append(", content=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}

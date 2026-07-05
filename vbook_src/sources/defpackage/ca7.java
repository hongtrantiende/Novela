package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ca7  reason: default package */
/* loaded from: classes3.dex */
public final class ca7 extends fa7 {
    public final long a;
    public final String b;
    public final int c;
    public final bzc d;
    public final fa7 e;
    public final long f;
    public final long g;

    public ca7(long j, String str, int i, bzc bzcVar, fa7 fa7Var, long j2, long j3) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = bzcVar;
        this.e = fa7Var;
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.fa7
    public final long a() {
        return this.g;
    }

    @Override // defpackage.fa7
    public final long b() {
        return this.a;
    }

    @Override // defpackage.fa7
    public final bzc c() {
        return this.d;
    }

    public final ArrayList d() {
        List<String> z0 = k4b.z0(this.b, new String[]{","});
        ArrayList arrayList = new ArrayList(tl1.s(z0, 10));
        for (String str : z0) {
            arrayList.add(k4b.N0(str).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ca7) {
                ca7 ca7Var = (ca7) obj;
                if (this.a != ca7Var.a || !c16.i(this.b, ca7Var.b) || this.c != ca7Var.c || !this.d.equals(ca7Var.d) || !c16.i(this.e, ca7Var.e) || this.f != ca7Var.f || this.g != ca7Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.fa7
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + hl5.a(this.c, eub.j(Long.hashCode(this.a) * 31, 31, this.b), 31)) * 31;
        fa7 fa7Var = this.e;
        if (fa7Var == null) {
            hashCode = 0;
        } else {
            hashCode = fa7Var.hashCode();
        }
        return Long.hashCode(this.g) + hl5.c((hashCode2 + hashCode) * 31, this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("System(id=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", user=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", updatedAt=");
        sb.append(this.f);
        return a82.n(sb, ", createdAt=", this.g, ")");
    }
}

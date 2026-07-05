package defpackage;

import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n7f  reason: default package */
/* loaded from: classes.dex */
public final class n7f {
    public final boolean a;
    public final List b;
    public final szd c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final q2f k;

    public n7f(boolean z, qs5 qs5Var, szd szdVar, String str, String str2, qs5 qs5Var2, qs5 qs5Var3, boolean z2, boolean z3, boolean z4, q2f q2fVar) {
        qs5Var.getClass();
        szdVar.getClass();
        str.getClass();
        str2.getClass();
        qs5Var2.getClass();
        qs5Var3.getClass();
        q2fVar.getClass();
        this.a = z;
        this.b = qs5Var;
        this.c = szdVar;
        this.d = str;
        this.e = str2;
        this.f = qs5Var2;
        this.g = qs5Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = q2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7f)) {
            return false;
        }
        n7f n7fVar = (n7f) obj;
        if (this.a == n7fVar.a && c16.i(this.b, n7fVar.b) && c16.i(this.c, n7fVar.c) && c16.i(this.d, n7fVar.d) && c16.i(this.e, n7fVar.e) && c16.i(this.f, n7fVar.f) && c16.i(this.g, n7fVar.g) && this.h == n7fVar.h && this.i == n7fVar.i && this.j == n7fVar.j && c16.i(this.k, n7fVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        szd szdVar = this.c;
        int length3 = String.valueOf(szdVar).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        q2f q2fVar = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(q2fVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(szdVar);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(q2fVar);
        sb.append(")");
        return sb.toString();
    }
}

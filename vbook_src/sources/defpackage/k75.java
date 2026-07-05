package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k75  reason: default package */
/* loaded from: classes.dex */
public final class k75 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final qs5 l;
    public final qs5 m;
    public final mm9 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public k75(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        boolean z3;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z3 = false;
        } else {
            z3 = true;
        }
        wq9.s(z3);
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = qs5.l(arrayList2);
        this.m = qs5.l(arrayList3);
        this.n = qs5.v(new uk(18), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k75) {
                k75 k75Var = (k75) obj;
                if (this.d == k75Var.d && this.e == k75Var.e && this.f == k75Var.f && this.g == k75Var.g && this.i == k75Var.i && this.j == k75Var.j && this.k == k75Var.k && this.o == k75Var.o && this.r == k75Var.r && this.s == k75Var.s && Objects.equals(this.a, k75Var.a) && Objects.equals(this.b, k75Var.b) && Objects.equals(this.c, k75Var.c) && Objects.equals(this.h, k75Var.h) && Objects.equals(this.l, k75Var.l) && Objects.equals(this.m, k75Var.m) && Objects.equals(this.n, k75Var.n) && Objects.equals(this.p, k75Var.p) && Objects.equals(this.q, k75Var.q) && Objects.equals(this.t, k75Var.t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}

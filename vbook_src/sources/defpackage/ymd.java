package defpackage;

import androidx.work.OverwritingInputMerger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ymd  reason: default package */
/* loaded from: classes.dex */
public final class ymd {
    public final String a;
    public jmd b;
    public final String c;
    public final String d;
    public tf2 e;
    public final tf2 f;
    public long g;
    public long h;
    public long i;
    public w02 j;
    public final int k;
    public final ng0 l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final mf8 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;
    public static final String z = r95.r("WorkSpec");
    public static final hfd A = new Object();

    public /* synthetic */ ymd(String str, jmd jmdVar, String str2, String str3, tf2 tf2Var, tf2 tf2Var2, long j, long j2, long j3, w02 w02Var, int i, ng0 ng0Var, long j4, long j5, long j6, long j7, boolean z2, mf8 mf8Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? jmd.a : jmdVar, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? tf2.b : tf2Var, (i5 & 32) != 0 ? tf2.b : tf2Var2, (i5 & 64) != 0 ? 0L : j, (i5 & Token.CASE) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? w02.j : w02Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? ng0.a : ng0Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? mf8.a : mf8Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static ymd b(ymd ymdVar, String str, jmd jmdVar, String str2, tf2 tf2Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3;
        jmd jmdVar2;
        String str4;
        tf2 tf2Var2;
        int i6;
        long j3;
        int i7;
        int i8;
        long j4;
        int i9;
        if ((i5 & 1) != 0) {
            str3 = ymdVar.a;
        } else {
            str3 = str;
        }
        if ((i5 & 2) != 0) {
            jmdVar2 = ymdVar.b;
        } else {
            jmdVar2 = jmdVar;
        }
        if ((i5 & 4) != 0) {
            str4 = ymdVar.c;
        } else {
            str4 = str2;
        }
        String str5 = ymdVar.d;
        if ((i5 & 16) != 0) {
            tf2Var2 = ymdVar.e;
        } else {
            tf2Var2 = tf2Var;
        }
        tf2 tf2Var3 = ymdVar.f;
        long j5 = ymdVar.g;
        long j6 = ymdVar.h;
        long j7 = ymdVar.i;
        w02 w02Var = ymdVar.j;
        if ((i5 & 1024) != 0) {
            i6 = ymdVar.k;
        } else {
            i6 = i;
        }
        ng0 ng0Var = ymdVar.l;
        long j8 = ymdVar.m;
        if ((i5 & 8192) != 0) {
            j3 = ymdVar.n;
        } else {
            j3 = j;
        }
        long j9 = ymdVar.o;
        long j10 = ymdVar.p;
        boolean z2 = ymdVar.q;
        mf8 mf8Var = ymdVar.r;
        if ((i5 & 262144) != 0) {
            i7 = ymdVar.s;
        } else {
            i7 = i2;
        }
        if ((i5 & 524288) != 0) {
            i8 = ymdVar.t;
        } else {
            i8 = i3;
        }
        if ((i5 & 1048576) != 0) {
            j4 = ymdVar.u;
        } else {
            j4 = j2;
        }
        if ((i5 & 2097152) != 0) {
            i9 = ymdVar.v;
        } else {
            i9 = i4;
        }
        int i10 = ymdVar.w;
        String str6 = ymdVar.x;
        Boolean bool = ymdVar.y;
        ymdVar.getClass();
        str3.getClass();
        jmdVar2.getClass();
        str4.getClass();
        str5.getClass();
        tf2Var2.getClass();
        tf2Var3.getClass();
        w02Var.getClass();
        ng0Var.getClass();
        mf8Var.getClass();
        return new ymd(str3, jmdVar2, str4, str5, tf2Var2, tf2Var3, j5, j6, j7, w02Var, i6, ng0Var, j8, j3, j9, j10, z2, mf8Var, i7, i8, j4, i9, i10, str6, bool);
    }

    public final long a() {
        boolean z2;
        if (this.b == jmd.a && this.k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return axe.e(z2, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymd)) {
            return false;
        }
        ymd ymdVar = (ymd) obj;
        if (c16.i(this.a, ymdVar.a) && this.b == ymdVar.b && c16.i(this.c, ymdVar.c) && c16.i(this.d, ymdVar.d) && c16.i(this.e, ymdVar.e) && c16.i(this.f, ymdVar.f) && this.g == ymdVar.g && this.h == ymdVar.h && this.i == ymdVar.i && c16.i(this.j, ymdVar.j) && this.k == ymdVar.k && this.l == ymdVar.l && this.m == ymdVar.m && this.n == ymdVar.n && this.o == ymdVar.o && this.p == ymdVar.p && this.q == ymdVar.q && this.r == ymdVar.r && this.s == ymdVar.s && this.t == ymdVar.t && this.u == ymdVar.u && this.v == ymdVar.v && this.w == ymdVar.w && c16.i(this.x, ymdVar.x) && c16.i(this.y, ymdVar.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = hl5.a(this.w, hl5.a(this.v, hl5.c(hl5.a(this.t, hl5.a(this.s, (this.r.hashCode() + eub.k(hl5.c(hl5.c(hl5.c(hl5.c((this.l.hashCode() + hl5.a(this.k, (this.j.hashCode() + hl5.c(hl5.c(hl5.c((this.f.hashCode() + ((this.e.hashCode() + eub.j(eub.j((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, this.g, 31), this.h, 31), this.i, 31)) * 31, 31)) * 31, this.m, 31), this.n, 31), this.o, 31), this.p, 31), 31, this.q)) * 31, 31), 31), this.u, 31), 31), 31);
        String str = this.x;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Boolean bool = this.y;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return s21.p(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public ymd(String str, jmd jmdVar, String str2, String str3, tf2 tf2Var, tf2 tf2Var2, long j, long j2, long j3, w02 w02Var, int i, ng0 ng0Var, long j4, long j5, long j6, long j7, boolean z2, mf8 mf8Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        jmdVar.getClass();
        str2.getClass();
        str3.getClass();
        tf2Var.getClass();
        tf2Var2.getClass();
        w02Var.getClass();
        ng0Var.getClass();
        mf8Var.getClass();
        this.a = str;
        this.b = jmdVar;
        this.c = str2;
        this.d = str3;
        this.e = tf2Var;
        this.f = tf2Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = w02Var;
        this.k = i;
        this.l = ng0Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = mf8Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}

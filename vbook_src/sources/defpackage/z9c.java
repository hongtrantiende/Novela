package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z9c  reason: default package */
/* loaded from: classes.dex */
public final class z9c {
    public static final Object p = new Object();
    public static final f57 q;
    public Object a = p;
    public f57 b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public b57 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    /* JADX WARN: Type inference failed for: r10v0, types: [z47, y47] */
    static {
        c57 c57Var;
        fr2 fr2Var = new fr2();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        List list = Collections.EMPTY_LIST;
        mm9 mm9Var2 = mm9.e;
        a57 a57Var = new a57();
        d57 d57Var = d57.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            c57Var = new c57(uri, null, null, list, mm9Var2, -9223372036854775807L);
        } else {
            c57Var = null;
        }
        q = new f57("androidx.media3.common.Timeline", new y47(fr2Var), c57Var, new b57(a57Var), j57.B, d57Var);
        a82.s(1, 2, 3, 4, 5);
        a82.s(6, 7, 8, 9, 10);
        a2d.K(11);
        a2d.K(12);
        a2d.K(13);
    }

    public final boolean a() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public final void b(f57 f57Var, Object obj, long j, long j2, long j3, boolean z, boolean z2, b57 b57Var, long j4, long j5, int i, long j6) {
        f57 f57Var2;
        this.a = p;
        if (f57Var != null) {
            f57Var2 = f57Var;
        } else {
            f57Var2 = q;
        }
        this.b = f57Var2;
        if (f57Var != null) {
            c57 c57Var = f57Var.b;
        }
        this.c = obj;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = b57Var;
        this.k = j4;
        this.l = j5;
        this.m = 0;
        this.n = i;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z9c.class.equals(obj.getClass())) {
                z9c z9cVar = (z9c) obj;
                if (Objects.equals(this.a, z9cVar.a) && Objects.equals(this.b, z9cVar.b) && Objects.equals(this.c, z9cVar.c) && Objects.equals(this.i, z9cVar.i) && this.d == z9cVar.d && this.e == z9cVar.e && this.f == z9cVar.f && this.g == z9cVar.g && this.h == z9cVar.h && this.j == z9cVar.j && this.k == z9cVar.k && this.l == z9cVar.l && this.m == z9cVar.m && this.n == z9cVar.n && this.o == z9cVar.o) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.c;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        b57 b57Var = this.i;
        if (b57Var != null) {
            i = b57Var.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.k;
        long j5 = this.l;
        long j6 = this.o;
        return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}

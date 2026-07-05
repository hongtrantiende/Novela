package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv2  reason: default package */
/* loaded from: classes.dex */
public final class pv2 implements d67 {
    public final ov2 a;
    public final gg2 b;
    public abf c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public pv2(gg2 gg2Var, ut2 ut2Var) {
        abf abfVar = new abf(22);
        this.b = gg2Var;
        this.c = abfVar;
        ov2 ov2Var = new ov2(ut2Var, abfVar);
        this.a = ov2Var;
        if (gg2Var != ((gg2) ov2Var.f)) {
            ov2Var.f = gg2Var;
            ((HashMap) ov2Var.d).clear();
            ((HashMap) ov2Var.e).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static d67 e(Class cls, gg2 gg2Var) {
        try {
            return (d67) cls.getConstructor(gg2.class).newInstance(gg2Var);
        } catch (Exception e) {
            p1a.n(e);
            return null;
        }
    }

    @Override // defpackage.d67
    public final void a(abf abfVar) {
        this.c = abfVar;
        ov2 ov2Var = this.a;
        ov2Var.g = abfVar;
        ut2 ut2Var = (ut2) ov2Var.c;
        synchronized (ut2Var) {
            ut2Var.c = abfVar;
        }
        for (d67 d67Var : ((HashMap) ov2Var.e).values()) {
            d67Var.a(abfVar);
        }
    }

    @Override // defpackage.d67
    public final void b(boolean z) {
        this.i = z;
        ov2 ov2Var = this.a;
        ov2Var.a = z;
        ut2 ut2Var = (ut2) ov2Var.c;
        synchronized (ut2Var) {
            ut2Var.b = z;
        }
        for (d67 d67Var : ((HashMap) ov2Var.e).values()) {
            d67Var.b(z);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [fr2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [z47, y47] */
    @Override // defpackage.d67
    public final ci0 c(f57 f57Var) {
        f57 f57Var2;
        Uri uri;
        String str;
        List list;
        long j;
        c57 c57Var;
        f57Var.b.getClass();
        String scheme = f57Var.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(f57Var.b.b, "application/x-image-uri");
        c57 c57Var2 = f57Var.b;
        if (!equals) {
            int I = a2d.I(c57Var2.a, c57Var2.b);
            if (f57Var.b.e != -9223372036854775807L) {
                ut2 ut2Var = (ut2) this.a.c;
                synchronized (ut2Var) {
                    ut2Var.e = 1;
                }
                ut2 ut2Var2 = (ut2) this.a.c;
                synchronized (ut2Var2) {
                    ut2Var2.f = 1;
                }
            }
            try {
                d67 c = this.a.c(I);
                a57 a = f57Var.c.a();
                b57 b57Var = f57Var.c;
                if (b57Var.a == -9223372036854775807L) {
                    a.a = this.d;
                }
                if (b57Var.d == -3.4028235E38f) {
                    a.d = this.g;
                }
                if (b57Var.e == -3.4028235E38f) {
                    a.e = this.h;
                }
                if (b57Var.b == -9223372036854775807L) {
                    a.b = this.e;
                }
                if (b57Var.c == -9223372036854775807L) {
                    a.c = this.f;
                }
                b57 b57Var2 = new b57(a);
                if (!b57Var2.equals(f57Var.c)) {
                    new xkf();
                    List list2 = Collections.EMPTY_LIST;
                    qs5 qs5Var = mm9.e;
                    d57 d57Var = d57.a;
                    z47 z47Var = f57Var.e;
                    ?? obj = new Object();
                    obj.a = z47Var.a;
                    String str2 = f57Var.a;
                    j57 j57Var = f57Var.d;
                    f57Var.c.a();
                    d57 d57Var2 = f57Var.f;
                    c57 c57Var3 = f57Var.b;
                    if (c57Var3 != null) {
                        String str3 = c57Var3.b;
                        Uri uri2 = c57Var3.a;
                        List list3 = c57Var3.c;
                        qs5Var = c57Var3.d;
                        new xkf();
                        str = str3;
                        uri = uri2;
                        list = list3;
                        j = c57Var3.e;
                    } else {
                        uri = null;
                        str = null;
                        list = list2;
                        j = -9223372036854775807L;
                    }
                    qs5 qs5Var2 = qs5Var;
                    a57 a2 = b57Var2.a();
                    if (uri != null) {
                        c57Var = new c57(uri, str, null, list, qs5Var2, j);
                    } else {
                        c57Var = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = str2;
                    ?? y47Var = new y47(obj);
                    b57 b57Var3 = new b57(a2);
                    if (j57Var == null) {
                        j57Var = j57.B;
                    }
                    f57Var2 = new f57(str4, y47Var, c57Var, b57Var3, j57Var, d57Var2);
                } else {
                    f57Var2 = f57Var;
                }
                ci0 c2 = c.c(f57Var2);
                qs5 qs5Var3 = f57Var2.b.d;
                if (!qs5Var3.isEmpty()) {
                    ci0[] ci0VarArr = new ci0[qs5Var3.size() + 1];
                    ci0VarArr[0] = c2;
                    if (qs5Var3.size() > 0) {
                        if (this.i) {
                            uq4 uq4Var = new uq4();
                            uq4Var.n = lc7.p(((e57) qs5Var3.get(0)).a);
                            ((e57) qs5Var3.get(0)).getClass();
                            uq4Var.d = null;
                            ((e57) qs5Var3.get(0)).getClass();
                            uq4Var.e = 0;
                            ((e57) qs5Var3.get(0)).getClass();
                            uq4Var.f = 0;
                            ((e57) qs5Var3.get(0)).getClass();
                            uq4Var.b = null;
                            ((e57) qs5Var3.get(0)).getClass();
                            uq4Var.a = null;
                            vq4 vq4Var = new vq4(uq4Var);
                            if (this.c.c(vq4Var)) {
                                uq4 a3 = vq4Var.a();
                                a3.n = lc7.p("application/x-media3-cues");
                                a3.j = vq4Var.o;
                                a3.L = this.c.h(vq4Var);
                                new vq4(a3);
                            }
                            ((e57) qs5Var3.get(0)).getClass();
                            throw null;
                        }
                        this.b.getClass();
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        ms5 ms5Var = qs5.b;
                        mm9 mm9Var = mm9.e;
                        List list4 = Collections.EMPTY_LIST;
                        mm9 mm9Var2 = mm9.e;
                        d57 d57Var3 = d57.a;
                        Uri uri3 = Uri.EMPTY;
                        ((e57) qs5Var3.get(0)).getClass();
                        throw null;
                    }
                    c2 = new y97(false, false, ci0VarArr);
                }
                z47 z47Var2 = f57Var2.e;
                if (z47Var2.a != Long.MIN_VALUE) {
                    tj1 tj1Var = new tj1(c2);
                    wq9.D(!tj1Var.d);
                    long j2 = z47Var2.a;
                    wq9.D(!tj1Var.d);
                    tj1Var.b = j2;
                    wq9.D(!tj1Var.d);
                    tj1Var.c = true;
                    wq9.D(!tj1Var.d);
                    wq9.D(!tj1Var.d);
                    wq9.D(!tj1Var.d);
                    wq9.D(!tj1Var.d);
                    tj1Var.d = true;
                    c2 = new wj1(tj1Var);
                }
                f57Var2.b.getClass();
                f57Var2.b.getClass();
                return c2;
            } catch (ClassNotFoundException e) {
                p1a.n(e);
                return null;
            }
        }
        long j3 = c57Var2.e;
        String str5 = a2d.a;
        throw null;
    }

    @Override // defpackage.d67
    public final void d(int i) {
        ov2 ov2Var = this.a;
        ov2Var.b = i;
        ut2 ut2Var = (ut2) ov2Var.c;
        synchronized (ut2Var) {
            ut2Var.d = i;
        }
    }

    public pv2(gg2 gg2Var) {
        this(gg2Var, new ut2());
    }
}

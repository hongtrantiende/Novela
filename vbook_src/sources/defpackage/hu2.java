package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hu2  reason: default package */
/* loaded from: classes.dex */
public final class hu2 implements es6 {
    public static final ls2 P = new ls2(12);
    public ij1 C;
    public Handler D;
    public r75 E;
    public u75 F;
    public xm8 G;
    public qs5 H;
    public qs5 I;
    public qs5 J;
    public qs5 K;
    public Uri L;
    public q75 M;
    public boolean N;
    public final fz4 a;
    public final y75 b;
    public final ox9 c;
    public cl3 f;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long O = -9223372036854775807L;

    public hu2(fz4 fz4Var, ox9 ox9Var, y75 y75Var) {
        this.a = fz4Var;
        this.b = y75Var;
        this.c = ox9Var;
    }

    public final void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            b85 b85Var = (b85) list.get(i);
            gu2 gu2Var = new gu2(this, b85Var);
            jwc it = ts5.j(b85Var.b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), gu2Var);
            }
        }
    }

    public final q75 b(boolean z, Uri uri) {
        HashMap hashMap = this.d;
        gu2 gu2Var = (gu2) hashMap.get(uri);
        if (gu2Var == null) {
            return null;
        }
        q75 a = gu2.a(gu2Var, uri);
        if (a != null && z) {
            h(uri);
            gu2 gu2Var2 = (gu2) hashMap.get(uri);
            gu2Var2.getClass();
            HashMap hashMap2 = gu2Var2.b;
            fu2 fu2Var = (fu2) nk2.r(hashMap2, uri, uri);
            fu2Var.getClass();
            if (!fu2Var.H) {
                fu2 fu2Var2 = (fu2) nk2.r(hashMap2, uri, uri);
                fu2Var2.getClass();
                fu2Var2.H = true;
                q75 a2 = gu2.a(gu2Var2, uri);
                if (a2 != null && !a2.o) {
                    gu2.b(gu2Var2, uri, true);
                }
            }
        }
        return a;
    }

    public final qs5 c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.K;
                }
                return this.J;
            }
            return this.I;
        }
        return this.H;
    }

    public final Uri d(Uri uri) {
        m75 m75Var;
        q75 q75Var = this.M;
        if (q75Var != null && q75Var.v.e && (m75Var = (m75) q75Var.t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(m75Var.b));
            int i = m75Var.c;
            if (i != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(b85 b85Var, long j) {
        boolean z;
        gu2 gu2Var = (gu2) this.d.get(b85Var.c());
        if (gu2Var == null) {
            return false;
        }
        Iterator it = gu2Var.b.values().iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            if (j <= ((fu2) it.next()).E) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return z2;
    }

    @Override // defpackage.es6
    public final void f(gs6 gs6Var, long j, long j2, boolean z) {
        bn8 bn8Var = (bn8) gs6Var;
        long j3 = bn8Var.a;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.c.getClass();
        this.f.c(cs6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final boolean g(Uri uri) {
        int i;
        gu2 gu2Var = (gu2) this.d.get(uri);
        if (gu2Var != null) {
            fu2 fu2Var = (fu2) nk2.r(gu2Var.b, uri, uri);
            fu2Var.getClass();
            if (fu2Var.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, a2d.e0(fu2Var.e.u));
                q75 q75Var = fu2Var.e;
                if (q75Var.o || (i = q75Var.d) == 2 || i == 1 || fu2Var.f + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void h(Uri uri) {
        if (!uri.equals(this.L)) {
            List list = this.F.e;
            for (int i = 0; i < list.size(); i++) {
                if (uri.equals(((t75) list.get(i)).a)) {
                    q75 q75Var = this.M;
                    if (q75Var == null || !q75Var.o) {
                        this.L = uri;
                        gu2 gu2Var = (gu2) this.d.get(uri);
                        gu2Var.getClass();
                        q75 a = gu2.a(gu2Var, uri);
                        if (a != null && a.o) {
                            this.M = a;
                            this.E.u(a);
                            return;
                        }
                        Uri d = d(uri);
                        fu2 fu2Var = (fu2) nk2.r(gu2Var.b, uri, uri);
                        fu2Var.getClass();
                        fu2Var.c(d);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.es6
    public final void i(gs6 gs6Var, long j, long j2) {
        u75 u75Var;
        bn8 bn8Var = (bn8) gs6Var;
        v75 v75Var = (v75) bn8Var.f;
        boolean z = v75Var instanceof q75;
        if (z) {
            String str = v75Var.a;
            u75 u75Var2 = u75.n;
            Uri parse = Uri.parse(str);
            uq4 uq4Var = new uq4();
            uq4Var.a = "0";
            uq4Var.m = lc7.p("application/x-mpegURL");
            List singletonList = Collections.singletonList(new t75(parse, new vq4(uq4Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            u75Var = new u75("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            u75Var = (u75) v75Var;
        }
        this.F = u75Var;
        try {
            this.H = b85.b(u75Var.e);
            this.I = b85.a(u75Var.f);
            this.J = b85.a(u75Var.g);
            this.K = b85.a(u75Var.h);
            this.L = ((b85) this.H.get(0)).c();
            this.e.add(new eu2(this));
            a(this.H);
            a(this.I);
            a(this.J);
            a(this.K);
            mg2 mg2Var = bn8Var.b;
            h0b h0bVar = bn8Var.d;
            cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
            gu2 gu2Var = (gu2) this.d.get(this.L);
            gu2Var.getClass();
            if (z) {
                Uri uri = bn8Var.d.c;
                fu2 fu2Var = (fu2) nk2.r(gu2Var.b, uri, uri);
                fu2Var.getClass();
                fu2Var.d((q75) v75Var, cs6Var);
            } else {
                gu2.b(gu2Var, this.L, false);
            }
            this.c.getClass();
            this.f.d(cs6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (xm8 e) {
            this.G = e;
        }
    }

    public final void j(Uri uri) {
        gu2 gu2Var = (gu2) this.d.get(uri);
        if (gu2Var != null) {
            fu2 fu2Var = (fu2) nk2.r(gu2Var.b, uri, uri);
            fu2Var.getClass();
            fu2Var.c.b();
            IOException iOException = fu2Var.G;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.es6
    public final void o(gs6 gs6Var, long j, long j2, int i) {
        cs6 cs6Var;
        bn8 bn8Var = (bn8) gs6Var;
        if (i == 0) {
            long j3 = bn8Var.a;
            cs6Var = new cs6(bn8Var.b, j);
        } else {
            long j4 = bn8Var.a;
            mg2 mg2Var = bn8Var.b;
            h0b h0bVar = bn8Var.d;
            cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        }
        this.f.g(cs6Var, bn8Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.es6
    public final cy5 w(gs6 gs6Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        long min;
        bn8 bn8Var = (bn8) gs6Var;
        long j3 = bn8Var.a;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        int i2 = bn8Var.c;
        this.c.getClass();
        Throwable th = iOException;
        while (true) {
            z = true;
            if (th != null) {
                if ((th instanceof xm8) || (th instanceof FileNotFoundException) || (th instanceof mf5) || (th instanceof is6) || ((th instanceof kg2) && ((kg2) th).a == 2008)) {
                    break;
                }
                th = th.getCause();
            } else {
                min = Math.min((i - 1) * 1000, 5000);
                break;
            }
        }
        min = -9223372036854775807L;
        if (min != -9223372036854775807L) {
            z = false;
        }
        this.f.f(cs6Var, i2, iOException, z);
        if (z) {
            return ij1.H;
        }
        return new cy5(min, 0, false);
    }
}

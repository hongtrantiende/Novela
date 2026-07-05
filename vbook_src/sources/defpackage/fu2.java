package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fu2  reason: default package */
/* loaded from: classes.dex */
public final class fu2 implements es6 {
    public long C;
    public long D;
    public long E;
    public boolean F;
    public IOException G;
    public boolean H;
    public final /* synthetic */ hu2 I;
    public final Uri a;
    public final String b;
    public final ij1 c = new ij1("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final jg2 d;
    public q75 e;
    public long f;

    public fu2(hu2 hu2Var, Uri uri, String str) {
        this.I = hu2Var;
        this.a = uri;
        this.b = str;
        this.d = ((gg2) hu2Var.a.a).h();
    }

    public final Uri a() {
        String str;
        q75 q75Var = this.e;
        Uri uri = this.a;
        if (q75Var != null) {
            p75 p75Var = q75Var.v;
            if (p75Var.a != -9223372036854775807L || p75Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                q75 q75Var2 = this.e;
                if (q75Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(q75Var2.k + q75Var2.r.size()));
                    q75 q75Var3 = this.e;
                    if (q75Var3.n != -9223372036854775807L) {
                        qs5 qs5Var = q75Var3.s;
                        int size = qs5Var.size();
                        if (!qs5Var.isEmpty() && ((l75) yf2.t(qs5Var)).I) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                p75 p75Var2 = this.e.v;
                if (p75Var2.a != -9223372036854775807L) {
                    if (p75Var2.b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        hu2 hu2Var = this.I;
        an8 h = hu2Var.b.h(hu2Var.F, this.e);
        Map map = Collections.EMPTY_MAP;
        wq9.z(uri, "The uri must be set.");
        bn8 bn8Var = new bn8(this.d, new mg2(uri, 1, null, map, 0L, -1L, null, 1), 4, h);
        this.c.Z(bn8Var, this, hu2Var.c.r(bn8Var.c));
    }

    public final void c(Uri uri) {
        this.E = 0L;
        if (!this.F) {
            ij1 ij1Var = this.c;
            if (!ij1Var.O() && !ij1Var.K()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.D;
                if (elapsedRealtime < j) {
                    this.F = true;
                    this.I.D.postDelayed(new b9(29, this, uri), j - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.q75 r73, defpackage.cs6 r74) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.d(q75, cs6):void");
    }

    @Override // defpackage.es6
    public final void f(gs6 gs6Var, long j, long j2, boolean z) {
        bn8 bn8Var = (bn8) gs6Var;
        long j3 = bn8Var.a;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        hu2 hu2Var = this.I;
        hu2Var.c.getClass();
        hu2Var.f.c(cs6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.es6
    public final void i(gs6 gs6Var, long j, long j2) {
        bn8 bn8Var = (bn8) gs6Var;
        v75 v75Var = (v75) bn8Var.f;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        if (v75Var instanceof q75) {
            d((q75) v75Var, cs6Var);
            this.I.f.d(cs6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            xm8 b = xm8.b("Loaded playlist has unexpected type.", null);
            this.G = b;
            this.I.f.f(cs6Var, 4, b, true);
        }
        this.I.c.getClass();
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
        this.I.f.g(cs6Var, bn8Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.es6
    public final cy5 w(gs6 gs6Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        int i2;
        cy5 cy5Var;
        cy5 cy5Var2 = ij1.G;
        bn8 bn8Var = (bn8) gs6Var;
        long j3 = bn8Var.a;
        int i3 = bn8Var.c;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        Uri uri = h0bVar.c;
        cs6 cs6Var = new cs6(mg2Var, uri, h0bVar.d, j, j2, h0bVar.b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = iOException instanceof w75;
        Uri uri2 = this.a;
        hu2 hu2Var = this.I;
        if (z || z2) {
            if (iOException instanceof pf5) {
                i2 = ((pf5) iOException).c;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (z2 || i2 == 400 || i2 == 503) {
                this.D = SystemClock.elapsedRealtime();
                c(uri2);
                cl3 cl3Var = hu2Var.f;
                String str = a2d.a;
                cl3Var.f(cs6Var, i3, iOException, true);
                return cy5Var2;
            }
        }
        jt1 jt1Var = new jt1(iOException, i, 3);
        Iterator it = hu2Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((z75) it.next()).b(uri2, jt1Var, false);
        }
        ox9 ox9Var = hu2Var.c;
        if (z3) {
            ox9Var.getClass();
            long u = ox9.u(jt1Var);
            if (u != -9223372036854775807L) {
                cy5Var = new cy5(u, 0, false);
            } else {
                cy5Var = ij1.H;
            }
            cy5Var2 = cy5Var;
        }
        boolean a = cy5Var2.a();
        hu2Var.f.f(cs6Var, i3, iOException, !a);
        if (!a) {
            ox9Var.getClass();
        }
        return cy5Var2;
    }
}

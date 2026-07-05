package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y91  reason: default package */
/* loaded from: classes.dex */
public final class y91 implements gnc {
    public final n07 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final xj1 e;
    public final xj1 f;
    public final int g;

    public y91(Context context, xj1 xj1Var, xj1 xj1Var2) {
        f46 f46Var = new f46();
        s70 s70Var = s70.a;
        f46Var.b(tj0.class, s70Var);
        f46Var.b(ta0.class, s70Var);
        z70 z70Var = z70.a;
        f46Var.b(fw6.class, z70Var);
        f46Var.b(vc0.class, z70Var);
        t70 t70Var = t70.a;
        f46Var.b(fj1.class, t70Var);
        f46Var.b(ua0.class, t70Var);
        r70 r70Var = r70.a;
        f46Var.b(vf.class, r70Var);
        f46Var.b(ra0.class, r70Var);
        y70 y70Var = y70.a;
        f46Var.b(bw6.class, y70Var);
        f46Var.b(uc0.class, y70Var);
        u70 u70Var = u70.a;
        f46Var.b(lt1.class, u70Var);
        f46Var.b(va0.class, u70Var);
        x70 x70Var = x70.a;
        f46Var.b(y84.class, x70Var);
        f46Var.b(nc0.class, x70Var);
        w70 w70Var = w70.a;
        f46Var.b(x84.class, w70Var);
        f46Var.b(mc0.class, w70Var);
        a80 a80Var = a80.a;
        f46Var.b(j18.class, a80Var);
        f46Var.b(xc0.class, a80Var);
        v70 v70Var = v70.a;
        f46Var.b(f14.class, v70Var);
        f46Var.b(lc0.class, v70Var);
        f46Var.d = true;
        this.a = new n07(f46Var, 20);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(d41.c);
        this.e = xj1Var2;
        this.f = xj1Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(s21.m("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
        if (((defpackage.h18) defpackage.h18.a.get(r0)) != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jc0 a(defpackage.jc0 r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y91.a(jc0):jc0");
    }
}

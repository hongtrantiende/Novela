package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n8f  reason: default package */
/* loaded from: classes.dex */
public final class n8f {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final c9b b;
    public final c9b c;
    public final c9b d;
    public final c9b e;
    public final c9b f;
    public final Uri g;
    public volatile t2f h;
    public final Uri i;

    public n8f(Context context, c9b c9bVar, c9b c9bVar2, c9b c9bVar3) {
        this.a = context;
        this.c = c9bVar;
        this.b = c9bVar3;
        this.d = c9bVar2;
        Pattern pattern = p9f.a;
        yv yvVar = new yv(context);
        yvVar.O("phenotype_storage_info");
        yvVar.R("storage-info.pb");
        this.g = yvVar.S();
        yv yvVar2 = new yv(context);
        yvVar2.O("phenotype_storage_info");
        yvVar2.R("device-encrypted-storage-info.pb");
        Set set = p9f.d;
        q1d.v(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        yvVar2.b = "directboot-files";
        this.i = yvVar2.S();
        this.e = kte.j(new e0f(this, 1));
        this.f = kte.j(new k0f(c9bVar, 1));
    }

    public final void a() {
        zl4 gr4Var;
        if (eze.y(this.a) && c().x() + 86400000 < System.currentTimeMillis()) {
            hr7 hr7Var = (hr7) this.c.get();
            hr7Var.getClass();
            ListenableFuture d = dv4.d((ListenableFuture) this.f.get());
            int i = zl4.D;
            if (d instanceof zl4) {
                gr4Var = (zl4) d;
            } else {
                gr4Var = new gr4(d);
            }
            dv4.f(gr4Var, new e5f(this, 2), hr7Var);
            return;
        }
        fs5 fs5Var = fs5.b;
    }

    public final n7f b() {
        String str;
        t2f c = c();
        boolean v = c.v();
        qs5 l = qs5.l(c.A());
        szd u = c.u();
        String w = c.w();
        qs5 l2 = qs5.l(c.y());
        qs5 l3 = qs5.l(c.z());
        if (c.B() && c.C().u() == Build.VERSION.SDK_INT) {
            str = c.C().t();
        } else {
            str = "";
        }
        return new n7f(v, l, u, w, str, l2, l3, c.t(), c.E(), c.D(), c.F());
    }

    public final t2f c() {
        t2f t2fVar;
        t2f t2fVar2 = this.h;
        if (t2fVar2 == null) {
            synchronized (j) {
                t2fVar = this.h;
                if (t2fVar == null) {
                    t2fVar = t2f.H();
                    if (eze.y(this.a)) {
                        f2e f2eVar = (f2e) t2fVar.s(7);
                        h0e h0eVar = h0e.a;
                        int i = kzd.a;
                        h0e h0eVar2 = h0e.b;
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            InputStream u = r1d.u(((b9f) this.d.get()).b(this.g));
                            try {
                                o0e a = ((n0e) f2eVar).a(u, h0eVar2);
                                if (u != null) {
                                    u.close();
                                }
                                t2fVar = (t2f) a;
                            } catch (Throwable th) {
                                if (u != null) {
                                    try {
                                        u.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        this.h = t2fVar;
                    }
                }
            }
            return t2fVar;
        }
        return t2fVar2;
    }
}

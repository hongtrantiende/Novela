package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gt2  reason: default package */
/* loaded from: classes.dex */
public final class gt2 implements jg2 {
    public jg2 C;
    public juc D;
    public fg2 E;
    public gh9 F;
    public jg2 G;
    public final Context a;
    public final ArrayList b;
    public final jg2 c;
    public kc4 d;
    public l00 e;
    public y12 f;

    public gt2(Context context, jg2 jg2Var) {
        this.a = context.getApplicationContext();
        jg2Var.getClass();
        this.c = jg2Var;
        this.b = new ArrayList();
    }

    public static void c(jg2 jg2Var, ys2 ys2Var) {
        if (jg2Var != null) {
            jg2Var.u(ys2Var);
        }
    }

    public final void b(jg2 jg2Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                jg2Var.u((ys2) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.jg2
    public final void close() {
        jg2 jg2Var = this.G;
        if (jg2Var != null) {
            try {
                jg2Var.close();
            } finally {
                this.G = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [ih0, fg2, jg2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ih0, jg2, kc4] */
    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        boolean z;
        if (this.G == null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        Uri uri = mg2Var.a;
        String scheme = uri.getScheme();
        String str = a2d.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.e == null) {
                    l00 l00Var = new l00(context);
                    this.e = l00Var;
                    b(l00Var);
                }
                this.G = this.e;
            } else if ("content".equals(scheme)) {
                if (this.f == null) {
                    y12 y12Var = new y12(context);
                    this.f = y12Var;
                    b(y12Var);
                }
                this.G = this.f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                jg2 jg2Var = this.c;
                if (equals) {
                    if (this.C == null) {
                        try {
                            jg2 jg2Var2 = (jg2) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.C = jg2Var2;
                            b(jg2Var2);
                        } catch (ClassNotFoundException unused) {
                            st0.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            cp8.p("Error instantiating RTMP extension", e);
                            return 0L;
                        }
                        if (this.C == null) {
                            this.C = jg2Var;
                        }
                    }
                    this.G = this.C;
                } else if ("udp".equals(scheme)) {
                    if (this.D == null) {
                        juc jucVar = new juc();
                        this.D = jucVar;
                        b(jucVar);
                    }
                    this.G = this.D;
                } else if ("data".equals(scheme)) {
                    if (this.E == null) {
                        ?? ih0Var = new ih0(false);
                        this.E = ih0Var;
                        b(ih0Var);
                    }
                    this.G = this.E;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.G = jg2Var;
                } else {
                    if (this.F == null) {
                        gh9 gh9Var = new gh9(context);
                        this.F = gh9Var;
                        b(gh9Var);
                    }
                    this.G = this.F;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    l00 l00Var2 = new l00(context);
                    this.e = l00Var2;
                    b(l00Var2);
                }
                this.G = this.e;
            } else {
                if (this.d == null) {
                    ?? ih0Var2 = new ih0(false);
                    this.d = ih0Var2;
                    b(ih0Var2);
                }
                this.G = this.d;
            }
        }
        return this.G.d(mg2Var);
    }

    @Override // defpackage.jg2
    public final Map o() {
        jg2 jg2Var = this.G;
        if (jg2Var == null) {
            return Collections.EMPTY_MAP;
        }
        return jg2Var.o();
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        jg2 jg2Var = this.G;
        jg2Var.getClass();
        return jg2Var.read(bArr, i, i2);
    }

    @Override // defpackage.jg2
    public final Uri t() {
        jg2 jg2Var = this.G;
        if (jg2Var == null) {
            return null;
        }
        return jg2Var.t();
    }

    @Override // defpackage.jg2
    public final void u(ys2 ys2Var) {
        ys2Var.getClass();
        this.c.u(ys2Var);
        this.b.add(ys2Var);
        c(this.d, ys2Var);
        c(this.e, ys2Var);
        c(this.f, ys2Var);
        c(this.C, ys2Var);
        c(this.D, ys2Var);
        c(this.E, ys2Var);
        c(this.F, ys2Var);
    }
}

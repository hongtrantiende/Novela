package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h0b  reason: default package */
/* loaded from: classes.dex */
public final class h0b implements jg2 {
    public final jg2 a;
    public long b;
    public Uri c;
    public Map d;

    public h0b(jg2 jg2Var) {
        jg2Var.getClass();
        this.a = jg2Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.jg2
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        jg2 jg2Var = this.a;
        this.c = mg2Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return jg2Var.d(mg2Var);
        } finally {
            Uri t = jg2Var.t();
            if (t != null) {
                this.c = t;
            }
            this.d = jg2Var.o();
        }
    }

    @Override // defpackage.jg2
    public final Map o() {
        return this.a.o();
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // defpackage.jg2
    public final Uri t() {
        return this.a.t();
    }

    @Override // defpackage.jg2
    public final void u(ys2 ys2Var) {
        ys2Var.getClass();
        this.a.u(ys2Var);
    }
}

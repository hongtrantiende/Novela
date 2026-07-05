package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nt4  reason: default package */
/* loaded from: classes.dex */
public final class nt4 implements l9b {
    public boolean C;
    public final Context a;
    public final String b;
    public final ny0 c;
    public final boolean d;
    public final boolean e;
    public final mfb f;

    public nt4(Context context, String str, ny0 ny0Var, boolean z, boolean z2) {
        context.getClass();
        ny0Var.getClass();
        this.a = context;
        this.b = str;
        this.c = ny0Var;
        this.d = z;
        this.e = z2;
        this.f = new mfb(new t42(this, 21));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mfb mfbVar = this.f;
        if (mfbVar.d()) {
            ((mt4) mfbVar.getValue()).close();
        }
    }

    @Override // defpackage.l9b
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.l9b
    public final it4 k0() {
        return ((mt4) this.f.getValue()).o(true);
    }

    @Override // defpackage.l9b
    public final void setWriteAheadLoggingEnabled(boolean z) {
        mfb mfbVar = this.f;
        if (mfbVar.d()) {
            ((mt4) mfbVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.C = z;
    }
}

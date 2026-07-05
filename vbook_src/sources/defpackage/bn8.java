package defpackage;

import android.net.Uri;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bn8  reason: default package */
/* loaded from: classes.dex */
public final class bn8 implements gs6 {
    public final long a = cs6.b.getAndIncrement();
    public final mg2 b;
    public final int c;
    public final h0b d;
    public final an8 e;
    public volatile Object f;

    public bn8(jg2 jg2Var, mg2 mg2Var, int i, an8 an8Var) {
        this.d = new h0b(jg2Var);
        this.b = mg2Var;
        this.c = i;
        this.e = an8Var;
    }

    @Override // defpackage.gs6
    public final void b() {
        this.d.b = 0L;
        lg2 lg2Var = new lg2(this.d, this.b);
        try {
            lg2Var.o();
            Uri t = this.d.a.t();
            t.getClass();
            this.f = this.e.l(t, lg2Var);
            try {
                lg2Var.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = a2d.a;
            try {
                lg2Var.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // defpackage.gs6
    public final void c() {
    }
}

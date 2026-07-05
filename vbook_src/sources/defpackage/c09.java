package defpackage;

import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c09  reason: default package */
/* loaded from: classes.dex */
public final class c09 {
    public final b09 a;
    public final q04 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public c09(q04 q04Var, b09 b09Var, aac aacVar, int i, Looper looper) {
        this.b = q04Var;
        this.a = b09Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        wq9.D(!this.f);
        this.f = true;
        q04 q04Var = this.b;
        if (!q04Var.f0 && q04Var.F.getThread().isAlive()) {
            q04Var.D.b(14, this).b();
            return;
        }
        st0.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
    }
}

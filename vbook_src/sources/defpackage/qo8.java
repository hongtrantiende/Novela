package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qo8  reason: default package */
/* loaded from: classes.dex */
public final class qo8 {
    public final ux1 a;
    public final px1 b;
    public final rv4 c;
    public final lu4 d;
    public final boolean e;
    public final f0 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(so8.c);
    public long i = hc2.i();
    public uv7 j;
    public final zm9 k;
    public final zg4 l;

    public qo8(ux1 ux1Var, px1 px1Var, rv4 rv4Var, wv7 wv7Var, lu4 lu4Var, boolean z, f0 f0Var, Object obj) {
        this.a = ux1Var;
        this.b = px1Var;
        this.c = rv4Var;
        this.d = lu4Var;
        this.e = z;
        this.f = f0Var;
        this.g = obj;
        uv7 uv7Var = uz9.a;
        uv7Var.getClass();
        this.j = uv7Var;
        zm9 zm9Var = new zm9();
        zm9Var.i(wv7Var, rv4Var.C());
        this.k = zm9Var;
        this.l = new zg4(f0Var.b);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (((so8) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    so8 so8Var = so8.f;
                    so8 so8Var2 = so8.C;
                    while (!atomicReference.compareAndSet(so8Var, so8Var2)) {
                        if (atomicReference.get() != so8Var) {
                            e39.b("Unexpected state change from: " + so8Var + " to: " + so8Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new gt1(7);
            }
        } catch (Exception e) {
            atomicReference.set(so8.a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.c0(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.M = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        if (((so8) this.h.get()).compareTo(so8.f) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        so8 so8Var;
        so8 so8Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            so8Var = so8.d;
            so8Var2 = so8.f;
            if (atomicReference.compareAndSet(so8Var, so8Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != so8Var) {
                z = false;
                break;
            }
        }
        if (!z) {
            e39.b("Unexpected state change from: " + so8Var + " to: " + so8Var2 + ".");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e(rka rkaVar) {
        so8 so8Var = so8.e;
        AtomicReference atomicReference = this.h;
        try {
            int ordinal = ((so8) atomicReference.get()).ordinal();
            so8 so8Var2 = so8.d;
            ux1 ux1Var = this.a;
            px1 px1Var = this.b;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    rv4 rv4Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        rv4Var.z = 0;
                        rv4Var.y = true;
                    }
                    this.j = px1Var.b(ux1Var, rkaVar, this.d);
                    if (z) {
                        if (rv4Var.F || rv4Var.z != 0) {
                            e39.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        rv4Var.z = -1;
                        rv4Var.y = false;
                    }
                    so8 so8Var3 = so8.c;
                    while (true) {
                        if (!atomicReference.compareAndSet(so8Var3, so8Var2)) {
                            if (atomicReference.get() != so8Var3) {
                                e39.b("Unexpected state change from: " + so8Var3 + " to: " + so8Var2 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                        break;
                    }
                    break;
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(so8Var2, so8Var)) {
                            if (atomicReference.get() != so8Var2) {
                                e39.b("Unexpected state change from: " + so8Var2 + " to: " + so8Var + ".");
                            }
                        }
                    }
                    long j = this.i;
                    this.i = hc2.i();
                    this.j = px1Var.q(ux1Var, rkaVar, this.j);
                    this.i = j;
                    while (true) {
                        if (!atomicReference.compareAndSet(so8Var, so8Var2)) {
                            if (atomicReference.get() != so8Var) {
                                e39.b("Unexpected state change from: " + so8Var + " to: " + so8Var2 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                        break;
                    }
                    break;
                case 4:
                    ex1.b("Recursive call to resume()");
                    throw new gt1(6);
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new gt1(7);
            }
            return c();
        } catch (Exception e) {
            atomicReference.set(so8.a);
            throw e;
        }
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sxe  reason: default package */
/* loaded from: classes.dex */
public final class sxe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ yze c;

    public sxe(yze yzeVar, AtomicReference atomicReference, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = atomicReference;
                Objects.requireNonNull(yzeVar);
                this.c = yzeVar;
                return;
            case 2:
                this.b = atomicReference;
                Objects.requireNonNull(yzeVar);
                this.c = yzeVar;
                return;
            case 3:
                this.b = atomicReference;
                Objects.requireNonNull(yzeVar);
                this.c = yzeVar;
                return;
            case 4:
                this.b = atomicReference;
                Objects.requireNonNull(yzeVar);
                this.c = yzeVar;
                return;
            default:
                this.b = atomicReference;
                Objects.requireNonNull(yzeVar);
                this.c = yzeVar;
                return;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.b;
        synchronized (atomicReference) {
            try {
                lte lteVar = (lte) this.c.a;
                atomicReference.set(Double.valueOf(lteVar.d.h0(lteVar.r().d0(), yme.e0)));
                this.b.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        lte lteVar = (lte) this.c.a;
                        atomicReference.set(Boolean.valueOf(lteVar.d.i0(lteVar.r().d0(), yme.a0)));
                        this.b.notify();
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        lte lteVar2 = (lte) this.c.a;
                        atomicReference2.set(lteVar2.d.e0(lteVar2.r().d0(), yme.b0));
                        this.b.notify();
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.b;
                synchronized (atomicReference3) {
                    try {
                        lte lteVar3 = (lte) this.c.a;
                        atomicReference3.set(Long.valueOf(lteVar3.d.f0(lteVar3.r().d0(), yme.c0)));
                        this.b.notify();
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.b;
                synchronized (atomicReference4) {
                    try {
                        lte lteVar4 = (lte) this.c.a;
                        atomicReference4.set(Integer.valueOf(lteVar4.d.g0(lteVar4.r().d0(), yme.d0)));
                        this.b.notify();
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                yze yzeVar = this.c;
                dre dreVar = ((lte) yzeVar.a).e;
                lte.k(dreVar);
                Bundle b = dreVar.J.b();
                w2f p = ((lte) yzeVar.a).p();
                AtomicReference atomicReference5 = this.b;
                p.W();
                p.Y();
                p.l0(new sid(p, atomicReference5, p.n0(false), b, 10));
                return;
            default:
                w2f p2 = ((lte) this.c.a).p();
                a5f c = a5f.c(p0f.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.b;
                p2.W();
                p2.Y();
                p2.l0(new sid(p2, atomicReference6, p2.n0(false), c, 11));
                return;
        }
    }

    public /* synthetic */ sxe(yze yzeVar, AtomicReference atomicReference, int i, boolean z) {
        this.a = i;
        this.c = yzeVar;
        this.b = atomicReference;
    }
}

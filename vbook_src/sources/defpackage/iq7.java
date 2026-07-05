package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iq7  reason: default package */
/* loaded from: classes.dex */
public final class iq7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public iq7(mve mveVar, ibe ibeVar, String str) {
        this.a = 2;
        this.b = mveVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                c30 c30Var = (c30) this.b;
                c30Var.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    c30Var.e.d();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 1:
                return new mxe(((lse) this.b).H);
            case 2:
                mve mveVar = (mve) this.b;
                mveVar.a.W();
                dqe dqeVar = mveVar.a.D;
                a6f.U(dqeVar);
                dqeVar.W();
                throw new IllegalStateException("Unexpected call on client side");
            case 3:
                return gn6.c.a(((xze) this.b).g);
            case 4:
                return gn6.c.a(((z9f) this.b).a);
            default:
                hvc hvcVar = (hvc) this.b;
                synchronized (((bcf) hvcVar.c).g) {
                    hvcVar.b = null;
                }
                return null;
        }
    }

    public /* synthetic */ iq7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}

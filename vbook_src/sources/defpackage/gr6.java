package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gr6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ p51 c;
    public final /* synthetic */ vt4 d;

    public /* synthetic */ gr6(AtomicBoolean atomicBoolean, p51 p51Var, vt4 vt4Var, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = p51Var;
        this.d = vt4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vt4 vt4Var = this.d;
        p51 p51Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        p51Var.a(vt4Var.invoke());
                        return;
                    } catch (Throwable th) {
                        p51Var.b(th);
                        return;
                    }
                }
                return;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        p51Var.a(vt4Var.invoke());
                        return;
                    } catch (Throwable th2) {
                        p51Var.b(th2);
                        return;
                    }
                }
                return;
        }
    }
}

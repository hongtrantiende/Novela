package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cf5  reason: default package */
/* loaded from: classes3.dex */
public abstract class cf5 implements af5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(cf5.class, "closed");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(cf5.class, "clientRefCount$internal");
    private volatile /* synthetic */ int closed = 0;
    public volatile /* synthetic */ int clientRefCount$internal = 0;
    public final mfb a = new mfb(new vt4(this) { // from class: bf5
        public final /* synthetic */ cf5 b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i = r2;
            cf5 cf5Var = this.b;
            switch (i) {
                case 0:
                    ((b98) cf5Var).e.getClass();
                    sw2 sw2Var = ab3.a;
                    return ru2.c;
                default:
                    return nq2.C(new y26(null), new t82(p40.d, 0)).plus((f82) cf5Var.a.getValue()).plus(new i82("ktor-okhttp-context"));
            }
        }
    });
    public final mfb b = new mfb(new vt4(this) { // from class: bf5
        public final /* synthetic */ cf5 b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i = r2;
            cf5 cf5Var = this.b;
            switch (i) {
                case 0:
                    ((b98) cf5Var).e.getClass();
                    sw2 sw2Var = ab3.a;
                    return ru2.c;
                default:
                    return nq2.C(new y26(null), new t82(p40.d, 0)).plus((f82) cf5Var.a.getValue()).plus(new i82("ktor-okhttp-context"));
            }
        }
    });

    public void close() {
        y26 y26Var;
        if (c.compareAndSet(this, 0, 1)) {
            b82 b82Var = q().get(r0f.I);
            if (b82Var instanceof y26) {
                y26Var = (y26) b82Var;
            } else {
                y26Var = null;
            }
            if (y26Var == null) {
                return;
            }
            y26Var.o0();
        }
    }

    @Override // defpackage.m82
    public d82 q() {
        return (d82) this.b.getValue();
    }
}

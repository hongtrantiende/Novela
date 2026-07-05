package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eq3  reason: default package */
/* loaded from: classes.dex */
public final class eq3 extends axe {
    public final /* synthetic */ axe d;
    public final /* synthetic */ ThreadPoolExecutor e;

    public eq3(axe axeVar, ThreadPoolExecutor threadPoolExecutor) {
        this.d = axeVar;
        this.e = threadPoolExecutor;
    }

    @Override // defpackage.axe
    public final void n(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.n(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.axe
    public final void o(oaa oaaVar) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.o(oaaVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

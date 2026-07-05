package defpackage;

import java.nio.channels.CompletionHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i66  reason: default package */
/* loaded from: classes3.dex */
public final class i66 implements CompletionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl9 b;
    public final /* synthetic */ f61 c;

    public /* synthetic */ i66(vl9 vl9Var, f61 f61Var, int i) {
        this.a = i;
        this.b = vl9Var;
        this.c = f61Var;
    }

    @Override // java.nio.channels.CompletionHandler
    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pvc pvcVar = (pvc) obj2;
                if (!this.b.a) {
                    this.c.resumeWith(obj);
                    return;
                }
                return;
            default:
                pvc pvcVar2 = (pvc) obj2;
                if (!this.b.a) {
                    this.c.resumeWith(obj);
                    return;
                }
                return;
        }
    }

    @Override // java.nio.channels.CompletionHandler
    public final void failed(Throwable th, Object obj) {
        switch (this.a) {
            case 0:
                pvc pvcVar = (pvc) obj;
                th.getClass();
                if (!this.b.a) {
                    this.c.resumeWith(new gs9(th));
                    return;
                }
                return;
            default:
                pvc pvcVar2 = (pvc) obj;
                th.getClass();
                if (!this.b.a) {
                    this.c.resumeWith(new gs9(th));
                    return;
                }
                return;
        }
    }
}

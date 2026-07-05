package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k0f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k0f implements c9b {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9b b;

    public /* synthetic */ k0f(c9b c9bVar, int i) {
        this.a = i;
        this.b = c9bVar;
    }

    @Override // defpackage.c9b
    public final Object get() {
        int i = this.a;
        c9b c9bVar = this.b;
        switch (i) {
            case 0:
                Object obj = a0f.j;
                return (l7f) ((se8) c9bVar.get()).c();
            default:
                hr7 hr7Var = (hr7) c9bVar.get();
                hr7Var.getClass();
                qoc qocVar = new qoc(zie.c);
                return new fr7(qocVar, hr7Var.b.schedule(qocVar, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mg0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6f b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mg0(t6f t6fVar, Object obj, int i) {
        this.a = i;
        this.b = t6fVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        t6f t6fVar = this.b;
        switch (i) {
            case 0:
                if (t6fVar.b == 0) {
                    t6fVar.o(obj);
                    return;
                }
                return;
            default:
                int i2 = t6fVar.b - 1;
                t6fVar.b = i2;
                if (i2 == 0) {
                    t6fVar.o(obj);
                    return;
                }
                return;
        }
    }
}

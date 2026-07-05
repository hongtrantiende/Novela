package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vdd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vdd implements AutoCloseable {
    public final /* synthetic */ wdd a;
    public final /* synthetic */ ydd b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vdd(wdd wddVar, ydd yddVar, Object obj) {
        this.a = wddVar;
        this.b = yddVar;
        this.c = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        wdd wddVar = this.a;
        int i = wddVar.c - 1;
        wddVar.c = i;
        if (wddVar.d && i <= 0) {
            this.b.a().e(this.c);
        }
    }
}

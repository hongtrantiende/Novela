package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xye  reason: default package */
/* loaded from: classes.dex */
public final class xye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hwe b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yze e;

    public /* synthetic */ xye(yze yzeVar, hwe hweVar, long j, boolean z, int i) {
        this.a = i;
        this.b = hweVar;
        this.c = j;
        this.d = z;
        this.e = yzeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.d;
        hwe hweVar = this.b;
        yze yzeVar = this.e;
        switch (i) {
            case 0:
                yzeVar.x0(hweVar);
                yzeVar.n0(hweVar, j, z);
                return;
            default:
                yzeVar.x0(hweVar);
                yzeVar.n0(hweVar, j, z);
                return;
        }
    }
}

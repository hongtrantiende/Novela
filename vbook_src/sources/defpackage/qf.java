package defpackage;

import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qf  reason: default package */
/* loaded from: classes3.dex */
public final class qf implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidBookUpdateWorker b;

    public /* synthetic */ qf(AndroidBookUpdateWorker androidBookUpdateWorker, int i) {
        this.a = i;
        this.b = androidBookUpdateWorker;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        AndroidBookUpdateWorker androidBookUpdateWorker = this.b;
        switch (i) {
            case 0:
                q0a q0aVar = (q0a) androidBookUpdateWorker.getKoin().c.e;
                gi1 a = cm9.a(io5.class);
                q0aVar.getClass();
                return q0aVar.e(a, null, null);
            case 1:
                q0a q0aVar2 = (q0a) androidBookUpdateWorker.getKoin().c.e;
                gi1 a2 = cm9.a(zr0.class);
                q0aVar2.getClass();
                return q0aVar2.e(a2, null, null);
            default:
                q0a q0aVar3 = (q0a) androidBookUpdateWorker.getKoin().c.e;
                gi1 a3 = cm9.a(klc.class);
                q0aVar3.getClass();
                return q0aVar3.e(a3, null, null);
        }
    }
}

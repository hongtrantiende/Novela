package defpackage;

import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ AndroidBookUpdateWorker c;

    public /* synthetic */ mf(m82 m82Var, AndroidBookUpdateWorker androidBookUpdateWorker, int i) {
        this.a = i;
        this.b = m82Var;
        this.c = androidBookUpdateWorker;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = this.b;
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new nf(this.c, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), null, 1), 3);
                return pvcVar;
            default:
                int intValue = ((Integer) obj2).intValue();
                z87.v(m82Var, null, null, new pf(this.c, (hk2) obj, intValue, (m42) null, 0), 3);
                return pvcVar;
        }
    }
}

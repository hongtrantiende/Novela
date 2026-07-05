package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jp  reason: default package */
/* loaded from: classes.dex */
public final class jp extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wcd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp(wcd wcdVar, int i) {
        super(0);
        this.a = i;
        this.b = wcdVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        yg8 snapshotObserver;
        int i = this.a;
        pvc pvcVar = pvc.a;
        wcd wcdVar = this.b;
        switch (i) {
            case 0:
                wcdVar.getLayoutNode().D();
                return pvcVar;
            case 1:
                if (wcdVar.e && wcdVar.isAttachedToWindow() && wcdVar.getView().getParent() == wcdVar) {
                    snapshotObserver = wcdVar.getSnapshotObserver();
                    snapshotObserver.a.d(wcdVar, kg.G, wcdVar.getUpdate());
                }
                return pvcVar;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                wcdVar.W.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                wcdVar.getReleaseBlock().invoke(wcdVar.W);
                wcd.o(wcdVar);
                return pvcVar;
            case 4:
                wcdVar.getResetBlock().invoke(wcdVar.W);
                return pvcVar;
            default:
                wcdVar.getUpdateBlock().invoke(wcdVar.W);
                return pvcVar;
        }
    }
}

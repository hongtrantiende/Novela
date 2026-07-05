package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vg  reason: default package */
/* loaded from: classes.dex */
public final class vg extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg(wg wgVar, int i) {
        super(1);
        this.a = i;
        this.b = wgVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        wg wgVar = this.b;
        switch (i) {
            case 0:
                View view = wgVar.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                f2a f2aVar = (f2a) obj;
                if (f2aVar.b.contains(f2aVar)) {
                    yg8 snapshotObserver = wgVar.d.getSnapshotObserver();
                    snapshotObserver.a.d(f2aVar, wgVar.k0, new hg(2, f2aVar, wgVar));
                }
                return pvc.a;
        }
    }
}

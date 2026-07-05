package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d86  reason: default package */
/* loaded from: classes.dex */
public final class d86 extends mq7 {
    @Override // defpackage.mq7
    public final void A1() {
        boolean z;
        rg rgVar = (rg) voe.w(this);
        rgVar.d1--;
        View view = rgVar.getView();
        if (rgVar.d1 > 0) {
            z = true;
        } else {
            z = false;
        }
        view.setKeepScreenOn(z);
    }

    @Override // defpackage.mq7
    public final void z1() {
        rg rgVar = (rg) voe.w(this);
        boolean z = true;
        rgVar.d1++;
        View view = rgVar.getView();
        if (rgVar.d1 <= 0) {
            z = false;
        }
        view.setKeepScreenOn(z);
    }
}

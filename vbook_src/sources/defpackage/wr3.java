package defpackage;

import android.text.InputFilter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wr3  reason: default package */
/* loaded from: classes.dex */
public final class wr3 extends hxe {
    public final vr3 j;

    public wr3(lw lwVar) {
        this.j = new vr3(lwVar);
    }

    @Override // defpackage.hxe
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        if (!cq3.d()) {
            return inputFilterArr;
        }
        return this.j.l(inputFilterArr);
    }

    @Override // defpackage.hxe
    public final void w(boolean z) {
        if (!cq3.d()) {
            return;
        }
        this.j.w(z);
    }

    @Override // defpackage.hxe
    public final void x(boolean z) {
        boolean d = cq3.d();
        vr3 vr3Var = this.j;
        if (!d) {
            vr3Var.l = z;
        } else {
            vr3Var.x(z);
        }
    }
}

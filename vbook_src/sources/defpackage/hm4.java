package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hm4  reason: default package */
/* loaded from: classes.dex */
public final class hm4 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ im4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm4(im4 im4Var, int i) {
        super(1);
        this.a = i;
        this.b = im4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        rk9 rk9Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        im4 im4Var = this.b;
        switch (i) {
            case 0:
                b61 b61Var = (b61) obj;
                View i2 = w9e.i(im4Var);
                if (!i2.isFocused() && !i2.hasFocus()) {
                    pm4 focusOwner = ((rg) voe.w(im4Var)).getFocusOwner();
                    View o = xoe.o(im4Var);
                    Integer c = lm4.c(b61Var.a);
                    int[] iArr = new int[2];
                    o.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    i2.getLocationOnScreen(iArr2);
                    hn4 j = dae.j(((rm4) focusOwner).c);
                    Rect rect = null;
                    if (j != null) {
                        rk9Var = dae.m(j);
                    } else {
                        rk9Var = null;
                    }
                    if (rk9Var != null) {
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = iArr[1];
                        int i6 = iArr2[1];
                        rect = new Rect((((int) rk9Var.a) + i3) - i4, (((int) rk9Var.b) + i5) - i6, (((int) rk9Var.c) + i3) - i4, (((int) rk9Var.d) + i5) - i6);
                    }
                    if (!lm4.b(i2, c, rect)) {
                        b61Var.b = true;
                    }
                }
                return pvcVar;
            default:
                b61 b61Var2 = (b61) obj;
                w9e.i(im4Var);
                return pvcVar;
        }
    }
}

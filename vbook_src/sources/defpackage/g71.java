package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g71  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g71 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g71(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int height;
        int i10;
        int height2;
        boolean z;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new x0(carouselLayoutManager, 8));
                    return;
                }
                return;
            case 1:
                qz8 qz8Var = (qz8) obj;
                int i12 = qz8Var.O;
                PopupWindow popupWindow = qz8Var.N;
                int i13 = i4 - i2;
                int i14 = i8 - i6;
                if ((i3 - i != i7 - i5 || i13 != i14) && popupWindow.isShowing()) {
                    qz8Var.u();
                    popupWindow.update(view, (qz8Var.getWidth() - popupWindow.getWidth()) - i12, (-popupWindow.getHeight()) - i12, -1, -1);
                    return;
                }
                return;
            default:
                vz8 vz8Var = (vz8) obj;
                qz8 qz8Var2 = vz8Var.a;
                int width = (qz8Var2.getWidth() - qz8Var2.getPaddingLeft()) - qz8Var2.getPaddingRight();
                int height3 = (qz8Var2.getHeight() - qz8Var2.getPaddingBottom()) - qz8Var2.getPaddingTop();
                ViewGroup viewGroup = vz8Var.d;
                int c = vz8.c(viewGroup);
                boolean z2 = false;
                if (viewGroup != null) {
                    i9 = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
                } else {
                    i9 = 0;
                }
                int i15 = c - i9;
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                if (viewGroup != null) {
                    i10 = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
                } else {
                    i10 = 0;
                }
                int i16 = height - i10;
                int max = Math.max(i15, vz8.c(vz8Var.l) + vz8.c(vz8Var.j));
                ViewGroup viewGroup2 = vz8Var.e;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i17 = (height2 * 2) + i16;
                if (width > max && height3 > i17) {
                    z = false;
                } else {
                    z = true;
                }
                if (vz8Var.B != z) {
                    vz8Var.B = z;
                    view.post(new rz8(vz8Var, 1));
                }
                if (i3 - i != i7 - i5) {
                    z2 = true;
                }
                if (!vz8Var.B && z2) {
                    view.post(new rz8(vz8Var, 2));
                    return;
                }
                return;
        }
    }
}

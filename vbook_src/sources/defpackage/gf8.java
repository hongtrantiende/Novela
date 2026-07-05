package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gf8  reason: default package */
/* loaded from: classes.dex */
public final class gf8 extends yp3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf8(el9 el9Var, int i) {
        super(el9Var);
        this.d = i;
    }

    @Override // defpackage.yp3
    public final int d(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((el9) obj).getClass();
                right = view.getRight() + ((fl9) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((el9) obj).getClass();
                right = view.getBottom() + ((fl9) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.yp3
    public final int e(View view) {
        int measuredWidth;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                fl9 fl9Var = (fl9) view.getLayoutParams();
                ((el9) obj).getClass();
                Rect rect = ((fl9) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) fl9Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) fl9Var).rightMargin;
                break;
            default:
                fl9 fl9Var2 = (fl9) view.getLayoutParams();
                ((el9) obj).getClass();
                Rect rect2 = ((fl9) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) fl9Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) fl9Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // defpackage.yp3
    public final int f(View view) {
        int measuredHeight;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                fl9 fl9Var = (fl9) view.getLayoutParams();
                ((el9) obj).getClass();
                Rect rect = ((fl9) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) fl9Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) fl9Var).bottomMargin;
                break;
            default:
                fl9 fl9Var2 = (fl9) view.getLayoutParams();
                ((el9) obj).getClass();
                Rect rect2 = ((fl9) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) fl9Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) fl9Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.yp3
    public final int g(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((el9) obj).getClass();
                left = view.getLeft() - ((fl9) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((el9) obj).getClass();
                left = view.getTop() - ((fl9) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ((fl9) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.yp3
    public final int h() {
        switch (this.d) {
            case 0:
                return ((el9) this.b).m;
            default:
                return ((el9) this.b).n;
        }
    }

    @Override // defpackage.yp3
    public final int i() {
        int i;
        int C;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                el9 el9Var = (el9) obj;
                i = el9Var.m;
                C = el9Var.C();
                break;
            default:
                el9 el9Var2 = (el9) obj;
                i = el9Var2.n;
                C = el9Var2.A();
                break;
        }
        return i - C;
    }

    @Override // defpackage.yp3
    public final int j() {
        switch (this.d) {
            case 0:
                return ((el9) this.b).C();
            default:
                return ((el9) this.b).A();
        }
    }

    @Override // defpackage.yp3
    public final int k() {
        switch (this.d) {
            case 0:
                return ((el9) this.b).k;
            default:
                return ((el9) this.b).l;
        }
    }

    @Override // defpackage.yp3
    public final int l() {
        switch (this.d) {
            case 0:
                return ((el9) this.b).l;
            default:
                return ((el9) this.b).k;
        }
    }

    @Override // defpackage.yp3
    public final int m() {
        switch (this.d) {
            case 0:
                return ((el9) this.b).B();
            default:
                return ((el9) this.b).D();
        }
    }

    @Override // defpackage.yp3
    public final int n() {
        int B;
        int C;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                el9 el9Var = (el9) obj;
                B = el9Var.m - el9Var.B();
                C = el9Var.C();
                break;
            default:
                el9 el9Var2 = (el9) obj;
                B = el9Var2.n - el9Var2.D();
                C = el9Var2.A();
                break;
        }
        return B - C;
    }

    @Override // defpackage.yp3
    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((el9) obj2).H(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((el9) obj2).H(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.yp3
    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((el9) obj2).H(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((el9) obj2).H(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.yp3
    public final void q(int i) {
        switch (this.d) {
            case 0:
                ((el9) this.b).L(i);
                return;
            default:
                ((el9) this.b).M(i);
                return;
        }
    }
}

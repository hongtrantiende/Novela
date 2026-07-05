package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public final class fp implements b37 {
    public final /* synthetic */ wcd a;
    public final /* synthetic */ od6 b;

    public fp(wcd wcdVar, od6 od6Var) {
        this.a = wcdVar;
        this.b = od6Var;
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        wcd wcdVar = this.a;
        ViewGroup.LayoutParams layoutParams = wcdVar.getLayoutParams();
        layoutParams.getClass();
        wcdVar.measure(makeMeasureSpec, kp.l(wcdVar, 0, i, layoutParams.height));
        return wcdVar.getMeasuredWidth();
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        wcd wcdVar = this.a;
        int childCount = wcdVar.getChildCount();
        ls3 ls3Var = ls3.a;
        if (childCount == 0) {
            return e37Var.q0(x02.k(j), x02.j(j), ls3Var, kg.H);
        }
        if (x02.k(j) != 0) {
            wcdVar.getChildAt(0).setMinimumWidth(x02.k(j));
        }
        if (x02.j(j) != 0) {
            wcdVar.getChildAt(0).setMinimumHeight(x02.j(j));
        }
        int k = x02.k(j);
        int i = x02.i(j);
        ViewGroup.LayoutParams layoutParams = wcdVar.getLayoutParams();
        layoutParams.getClass();
        int l = kp.l(wcdVar, k, i, layoutParams.width);
        int j2 = x02.j(j);
        int h = x02.h(j);
        ViewGroup.LayoutParams layoutParams2 = wcdVar.getLayoutParams();
        layoutParams2.getClass();
        wcdVar.measure(l, kp.l(wcdVar, j2, h, layoutParams2.height));
        return e37Var.q0(wcdVar.getMeasuredWidth(), wcdVar.getMeasuredHeight(), ls3Var, new dp(wcdVar, this.b, 1));
    }

    @Override // defpackage.b37
    public final int f(u06 u06Var, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        wcd wcdVar = this.a;
        ViewGroup.LayoutParams layoutParams = wcdVar.getLayoutParams();
        layoutParams.getClass();
        wcdVar.measure(makeMeasureSpec, kp.l(wcdVar, 0, i, layoutParams.height));
        return wcdVar.getMeasuredWidth();
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
        wcd wcdVar = this.a;
        ViewGroup.LayoutParams layoutParams = wcdVar.getLayoutParams();
        layoutParams.getClass();
        wcdVar.measure(kp.l(wcdVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return wcdVar.getMeasuredHeight();
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
        wcd wcdVar = this.a;
        ViewGroup.LayoutParams layoutParams = wcdVar.getLayoutParams();
        layoutParams.getClass();
        wcdVar.measure(kp.l(wcdVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return wcdVar.getMeasuredHeight();
    }
}

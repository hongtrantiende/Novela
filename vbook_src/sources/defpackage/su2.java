package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: su2  reason: default package */
/* loaded from: classes.dex */
public final class su2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ yu2 c;

    public /* synthetic */ su2(yu2 yu2Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = yu2Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        char c;
        int i = this.a;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    yu2 yu2Var = this.c;
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        xu2 xu2Var = (xu2) obj;
                        rl9 rl9Var = xu2Var.a;
                        int i3 = xu2Var.b;
                        int i4 = xu2Var.c;
                        int i5 = xu2Var.d;
                        int i6 = xu2Var.e;
                        yu2Var.getClass();
                        View view2 = rl9Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view2.animate().translationX(nae.e);
                        }
                        if (i8 != 0) {
                            view2.animate().translationY(nae.e);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        yu2Var.p.add(rl9Var);
                        animate.setDuration(yu2Var.e).setListener(new uu2(yu2Var, rl9Var, i7, view2, i8, animate)).start();
                    } else {
                        arrayList.clear();
                        yu2Var.m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    yu2 yu2Var2 = this.c;
                    if (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        wu2 wu2Var = (wu2) obj2;
                        ArrayList arrayList2 = yu2Var2.r;
                        long j = yu2Var2.f;
                        rl9 rl9Var2 = wu2Var.a;
                        View view3 = null;
                        if (rl9Var2 == null) {
                            view = null;
                        } else {
                            view = rl9Var2.a;
                        }
                        rl9 rl9Var3 = wu2Var.b;
                        if (rl9Var3 != null) {
                            view3 = rl9Var3.a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList2.add(wu2Var.a);
                            duration.translationX(wu2Var.e - wu2Var.c);
                            duration.translationY(wu2Var.f - wu2Var.d);
                            duration.alpha(nae.e).setListener(new vu2(yu2Var2, wu2Var, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList2.add(wu2Var.b);
                            c = 0;
                            animate2.translationX(nae.e).translationY(nae.e).setDuration(j).alpha(1.0f).setListener(new vu2(yu2Var2, wu2Var, animate2, view4, 1)).start();
                        } else {
                            c = 0;
                        }
                    } else {
                        arrayList.clear();
                        yu2Var2.n.remove(arrayList);
                        return;
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    yu2 yu2Var3 = this.c;
                    if (i2 < size3) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        rl9 rl9Var4 = (rl9) obj3;
                        yu2Var3.getClass();
                        View view5 = rl9Var4.a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        yu2Var3.o.add(rl9Var4);
                        animate3.alpha(1.0f).setDuration(yu2Var3.c).setListener(new tu2(yu2Var3, rl9Var4, view5, animate3)).start();
                    } else {
                        arrayList.clear();
                        yu2Var3.l.remove(arrayList);
                        return;
                    }
                }
        }
    }
}

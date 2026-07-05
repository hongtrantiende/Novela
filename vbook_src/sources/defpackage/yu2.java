package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yu2  reason: default package */
/* loaded from: classes.dex */
public final class yu2 extends cl9 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((rl9) arrayList.get(size)).a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [wu2, java.lang.Object] */
    @Override // defpackage.cl9
    public final boolean a(rl9 rl9Var, rl9 rl9Var2, vf9 vf9Var, vf9 vf9Var2) {
        int i;
        int i2;
        int i3 = vf9Var.b;
        int i4 = vf9Var.c;
        if (rl9Var2.n()) {
            int i5 = vf9Var.b;
            i2 = vf9Var.c;
            i = i5;
        } else {
            i = vf9Var2.b;
            i2 = vf9Var2.c;
        }
        if (rl9Var == rl9Var2) {
            return g(rl9Var, i3, i4, i, i2);
        }
        View view = rl9Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(rl9Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = rl9Var2.a;
        l(rl9Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(nae.e);
        ArrayList arrayList = this.k;
        ?? obj = new Object();
        obj.a = rl9Var;
        obj.b = rl9Var2;
        obj.c = i3;
        obj.d = i4;
        obj.e = i;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // defpackage.cl9
    public final void d(rl9 rl9Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = rl9Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((xu2) arrayList4.get(size)).a == rl9Var) {
                view.setTranslationY(nae.e);
                view.setTranslationX(nae.e);
                c(rl9Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, rl9Var);
        if (this.h.remove(rl9Var)) {
            view.setAlpha(1.0f);
            c(rl9Var);
        }
        if (this.i.remove(rl9Var)) {
            view.setAlpha(1.0f);
            c(rl9Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, rl9Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((xu2) arrayList6.get(size4)).a == rl9Var) {
                    view.setTranslationY(nae.e);
                    view.setTranslationX(nae.e);
                    c(rl9Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(rl9Var)) {
                view.setAlpha(1.0f);
                c(rl9Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(rl9Var);
        this.o.remove(rl9Var);
        this.r.remove(rl9Var);
        this.p.remove(rl9Var);
        i();
    }

    @Override // defpackage.cl9
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            xu2 xu2Var = (xu2) arrayList7.get(size);
            View view = xu2Var.a.a;
            view.setTranslationY(nae.e);
            view.setTranslationX(nae.e);
            c(xu2Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((rl9) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            rl9 rl9Var = (rl9) arrayList5.get(size3);
            rl9Var.a.setAlpha(1.0f);
            c(rl9Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            wu2 wu2Var = (wu2) arrayList.get(size4);
            rl9 rl9Var2 = wu2Var.a;
            if (rl9Var2 != null) {
                k(wu2Var, rl9Var2);
            }
            rl9 rl9Var3 = wu2Var.b;
            if (rl9Var3 != null) {
                k(wu2Var, rl9Var3);
            }
        }
        arrayList.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                xu2 xu2Var2 = (xu2) arrayList8.get(size6);
                View view2 = xu2Var2.a.a;
                view2.setTranslationY(nae.e);
                view2.setTranslationX(nae.e);
                c(xu2Var2.a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList4.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                rl9 rl9Var4 = (rl9) arrayList9.get(size8);
                rl9Var4.a.setAlpha(1.0f);
                c(rl9Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList3.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                wu2 wu2Var2 = (wu2) arrayList10.get(size10);
                rl9 rl9Var5 = wu2Var2.a;
                if (rl9Var5 != null) {
                    k(wu2Var2, rl9Var5);
                }
                rl9 rl9Var6 = wu2Var2.b;
                if (rl9Var6 != null) {
                    k(wu2Var2, rl9Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList2.remove(arrayList10);
                }
            }
        }
        h(this.q);
        h(this.p);
        h(this.o);
        h(this.r);
        ArrayList arrayList11 = this.b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
            return;
        }
        arrayList11.get(0).getClass();
        vm1.h();
    }

    @Override // defpackage.cl9
    public final boolean f() {
        if (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xu2, java.lang.Object] */
    public final boolean g(rl9 rl9Var, int i, int i2, int i3, int i4) {
        View view = rl9Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) rl9Var.a.getTranslationY());
        l(rl9Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(rl9Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.a = rl9Var;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
                return;
            }
            arrayList.get(0).getClass();
            vm1.h();
        }
    }

    public final void j(ArrayList arrayList, rl9 rl9Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wu2 wu2Var = (wu2) arrayList.get(size);
            if (k(wu2Var, rl9Var) && wu2Var.a == null && wu2Var.b == null) {
                arrayList.remove(wu2Var);
            }
        }
    }

    public final boolean k(wu2 wu2Var, rl9 rl9Var) {
        if (wu2Var.b == rl9Var) {
            wu2Var.b = null;
        } else if (wu2Var.a == rl9Var) {
            wu2Var.a = null;
        } else {
            return false;
        }
        View view = rl9Var.a;
        View view2 = rl9Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(nae.e);
        view2.setTranslationY(nae.e);
        c(rl9Var);
        return true;
    }

    public final void l(rl9 rl9Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        rl9Var.a.animate().setInterpolator(s);
        d(rl9Var);
    }
}
